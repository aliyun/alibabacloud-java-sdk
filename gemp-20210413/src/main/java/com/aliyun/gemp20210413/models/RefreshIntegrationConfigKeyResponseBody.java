// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RefreshIntegrationConfigKeyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public RefreshIntegrationConfigKeyResponseBodyData data;

    public static RefreshIntegrationConfigKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshIntegrationConfigKeyResponseBody self = new RefreshIntegrationConfigKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshIntegrationConfigKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshIntegrationConfigKeyResponseBody setData(RefreshIntegrationConfigKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshIntegrationConfigKeyResponseBodyData getData() {
        return this.data;
    }

    public static class RefreshIntegrationConfigKeyResponseBodyData extends TeaModel {
        // 集成秘钥
        @NameInMap("key")
        public String key;

        public static RefreshIntegrationConfigKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshIntegrationConfigKeyResponseBodyData self = new RefreshIntegrationConfigKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshIntegrationConfigKeyResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
