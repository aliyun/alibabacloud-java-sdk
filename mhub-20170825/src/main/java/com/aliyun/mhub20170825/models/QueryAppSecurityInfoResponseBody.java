// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppSecurityInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppSecurityInfo")
    public QueryAppSecurityInfoResponseBodyAppSecurityInfo appSecurityInfo;

    public static QueryAppSecurityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppSecurityInfoResponseBody self = new QueryAppSecurityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppSecurityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppSecurityInfoResponseBody setAppSecurityInfo(QueryAppSecurityInfoResponseBodyAppSecurityInfo appSecurityInfo) {
        this.appSecurityInfo = appSecurityInfo;
        return this;
    }
    public QueryAppSecurityInfoResponseBodyAppSecurityInfo getAppSecurityInfo() {
        return this.appSecurityInfo;
    }

    public static class QueryAppSecurityInfoResponseBodyAppSecurityInfo extends TeaModel {
        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("AppKey")
        public String appKey;

        public static QueryAppSecurityInfoResponseBodyAppSecurityInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAppSecurityInfoResponseBodyAppSecurityInfo self = new QueryAppSecurityInfoResponseBodyAppSecurityInfo();
            return TeaModel.build(map, self);
        }

        public QueryAppSecurityInfoResponseBodyAppSecurityInfo setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public QueryAppSecurityInfoResponseBodyAppSecurityInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

    }

}
