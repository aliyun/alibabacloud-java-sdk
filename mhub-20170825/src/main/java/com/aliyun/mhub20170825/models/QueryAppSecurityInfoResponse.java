// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppSecurityInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppSecurityInfo")
    @Validation(required = true)
    public QueryAppSecurityInfoResponseAppSecurityInfo appSecurityInfo;

    public static QueryAppSecurityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppSecurityInfoResponse self = new QueryAppSecurityInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppSecurityInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppSecurityInfoResponse setAppSecurityInfo(QueryAppSecurityInfoResponseAppSecurityInfo appSecurityInfo) {
        this.appSecurityInfo = appSecurityInfo;
        return this;
    }
    public QueryAppSecurityInfoResponseAppSecurityInfo getAppSecurityInfo() {
        return this.appSecurityInfo;
    }

    public static class QueryAppSecurityInfoResponseAppSecurityInfo extends TeaModel {
        @NameInMap("AppKey")
        @Validation(required = true)
        public String appKey;

        @NameInMap("AppSecret")
        @Validation(required = true)
        public String appSecret;

        public static QueryAppSecurityInfoResponseAppSecurityInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAppSecurityInfoResponseAppSecurityInfo self = new QueryAppSecurityInfoResponseAppSecurityInfo();
            return TeaModel.build(map, self);
        }

        public QueryAppSecurityInfoResponseAppSecurityInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryAppSecurityInfoResponseAppSecurityInfo setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

    }

}
