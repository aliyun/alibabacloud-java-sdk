// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ConfigVerifySceneAppInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ConfigVerifySceneAppInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2E7CA885-8D97-C497-A02C-2D31214D3285</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigVerifySceneAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigVerifySceneAppInfoResponseBody self = new ConfigVerifySceneAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigVerifySceneAppInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfigVerifySceneAppInfoResponseBody setData(ConfigVerifySceneAppInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfigVerifySceneAppInfoResponseBodyData getData() {
        return this.data;
    }

    public ConfigVerifySceneAppInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfigVerifySceneAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ConfigVerifySceneAppInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>2E7CA885-8D97-C497-A02C-2D31214D3285</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static ConfigVerifySceneAppInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfigVerifySceneAppInfoResponseBodyData self = new ConfigVerifySceneAppInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfigVerifySceneAppInfoResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ConfigVerifySceneAppInfoResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ConfigVerifySceneAppInfoResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
