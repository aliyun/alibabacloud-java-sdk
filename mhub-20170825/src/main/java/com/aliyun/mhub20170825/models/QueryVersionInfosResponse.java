// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryVersionInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VersionInfos")
    @Validation(required = true)
    public QueryVersionInfosResponseVersionInfos versionInfos;

    public static QueryVersionInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVersionInfosResponse self = new QueryVersionInfosResponse();
        return TeaModel.build(map, self);
    }

    public QueryVersionInfosResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVersionInfosResponse setVersionInfos(QueryVersionInfosResponseVersionInfos versionInfos) {
        this.versionInfos = versionInfos;
        return this;
    }
    public QueryVersionInfosResponseVersionInfos getVersionInfos() {
        return this.versionInfos;
    }

    public static class QueryVersionInfosResponseVersionInfosVersionInfo extends TeaModel {
        @NameInMap("OS")
        @Validation(required = true)
        public String OS;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("ProductID")
        @Validation(required = true)
        public String productID;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static QueryVersionInfosResponseVersionInfosVersionInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryVersionInfosResponseVersionInfosVersionInfo self = new QueryVersionInfosResponseVersionInfosVersionInfo();
            return TeaModel.build(map, self);
        }

        public QueryVersionInfosResponseVersionInfosVersionInfo setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public QueryVersionInfosResponseVersionInfosVersionInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryVersionInfosResponseVersionInfosVersionInfo setProductID(String productID) {
            this.productID = productID;
            return this;
        }
        public String getProductID() {
            return this.productID;
        }

        public QueryVersionInfosResponseVersionInfosVersionInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryVersionInfosResponseVersionInfosVersionInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryVersionInfosResponseVersionInfos extends TeaModel {
        @NameInMap("VersionInfo")
        @Validation(required = true)
        public java.util.List<QueryVersionInfosResponseVersionInfosVersionInfo> versionInfo;

        public static QueryVersionInfosResponseVersionInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryVersionInfosResponseVersionInfos self = new QueryVersionInfosResponseVersionInfos();
            return TeaModel.build(map, self);
        }

        public QueryVersionInfosResponseVersionInfos setVersionInfo(java.util.List<QueryVersionInfosResponseVersionInfosVersionInfo> versionInfo) {
            this.versionInfo = versionInfo;
            return this;
        }
        public java.util.List<QueryVersionInfosResponseVersionInfosVersionInfo> getVersionInfo() {
            return this.versionInfo;
        }

    }

}
