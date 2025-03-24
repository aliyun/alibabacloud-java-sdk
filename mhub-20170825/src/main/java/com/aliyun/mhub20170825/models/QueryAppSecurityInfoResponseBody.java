// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppSecurityInfoResponseBody extends TeaModel {
    @NameInMap("AppSecurityInfo")
    public QueryAppSecurityInfoResponseBodyAppSecurityInfo appSecurityInfo;

    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929BFB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryAppSecurityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppSecurityInfoResponseBody self = new QueryAppSecurityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppSecurityInfoResponseBody setAppSecurityInfo(QueryAppSecurityInfoResponseBodyAppSecurityInfo appSecurityInfo) {
        this.appSecurityInfo = appSecurityInfo;
        return this;
    }
    public QueryAppSecurityInfoResponseBodyAppSecurityInfo getAppSecurityInfo() {
        return this.appSecurityInfo;
    }

    public QueryAppSecurityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAppSecurityInfoResponseBodyAppSecurityInfoExtConfig extends TeaModel {
        @NameInMap("TlogRsaSecret")
        public String tlogRsaSecret;

        public static QueryAppSecurityInfoResponseBodyAppSecurityInfoExtConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAppSecurityInfoResponseBodyAppSecurityInfoExtConfig self = new QueryAppSecurityInfoResponseBodyAppSecurityInfoExtConfig();
            return TeaModel.build(map, self);
        }

        public QueryAppSecurityInfoResponseBodyAppSecurityInfoExtConfig setTlogRsaSecret(String tlogRsaSecret) {
            this.tlogRsaSecret = tlogRsaSecret;
            return this;
        }
        public String getTlogRsaSecret() {
            return this.tlogRsaSecret;
        }

    }

    public static class QueryAppSecurityInfoResponseBodyAppSecurityInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>abc123abc123</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("ExtConfig")
        public QueryAppSecurityInfoResponseBodyAppSecurityInfoExtConfig extConfig;

        public static QueryAppSecurityInfoResponseBodyAppSecurityInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAppSecurityInfoResponseBodyAppSecurityInfo self = new QueryAppSecurityInfoResponseBodyAppSecurityInfo();
            return TeaModel.build(map, self);
        }

        public QueryAppSecurityInfoResponseBodyAppSecurityInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryAppSecurityInfoResponseBodyAppSecurityInfo setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public QueryAppSecurityInfoResponseBodyAppSecurityInfo setExtConfig(QueryAppSecurityInfoResponseBodyAppSecurityInfoExtConfig extConfig) {
            this.extConfig = extConfig;
            return this;
        }
        public QueryAppSecurityInfoResponseBodyAppSecurityInfoExtConfig getExtConfig() {
            return this.extConfig;
        }

    }

}
