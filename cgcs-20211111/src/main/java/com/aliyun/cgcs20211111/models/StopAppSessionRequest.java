// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionRequest extends TeaModel {
    // 自定义会话id
    @NameInMap("CustomSessionId")
    public String customSessionId;

    // 自定义用户id
    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    @NameInMap("StopParam")
    public java.util.List<StopAppSessionRequestStopParam> stopParam;

    public static StopAppSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionRequest self = new StopAppSessionRequest();
        return TeaModel.build(map, self);
    }

    public StopAppSessionRequest setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public StopAppSessionRequest setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public StopAppSessionRequest setStopParam(java.util.List<StopAppSessionRequestStopParam> stopParam) {
        this.stopParam = stopParam;
        return this;
    }
    public java.util.List<StopAppSessionRequestStopParam> getStopParam() {
        return this.stopParam;
    }

    public static class StopAppSessionRequestStopParam extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static StopAppSessionRequestStopParam build(java.util.Map<String, ?> map) throws Exception {
            StopAppSessionRequestStopParam self = new StopAppSessionRequestStopParam();
            return TeaModel.build(map, self);
        }

        public StopAppSessionRequestStopParam setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StopAppSessionRequestStopParam setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
