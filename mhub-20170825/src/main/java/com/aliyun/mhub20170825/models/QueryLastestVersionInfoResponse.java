// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryLastestVersionInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VersionInfos")
    @Validation(required = true)
    public QueryLastestVersionInfoResponseVersionInfos versionInfos;

    public static QueryLastestVersionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLastestVersionInfoResponse self = new QueryLastestVersionInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLastestVersionInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLastestVersionInfoResponse setVersionInfos(QueryLastestVersionInfoResponseVersionInfos versionInfos) {
        this.versionInfos = versionInfos;
        return this;
    }
    public QueryLastestVersionInfoResponseVersionInfos getVersionInfos() {
        return this.versionInfos;
    }

    public static class QueryLastestVersionInfoResponseVersionInfosVersionInfo extends TeaModel {
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

        public static QueryLastestVersionInfoResponseVersionInfosVersionInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryLastestVersionInfoResponseVersionInfosVersionInfo self = new QueryLastestVersionInfoResponseVersionInfosVersionInfo();
            return TeaModel.build(map, self);
        }

        public QueryLastestVersionInfoResponseVersionInfosVersionInfo setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public QueryLastestVersionInfoResponseVersionInfosVersionInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryLastestVersionInfoResponseVersionInfosVersionInfo setProductID(String productID) {
            this.productID = productID;
            return this;
        }
        public String getProductID() {
            return this.productID;
        }

        public QueryLastestVersionInfoResponseVersionInfosVersionInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryLastestVersionInfoResponseVersionInfosVersionInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryLastestVersionInfoResponseVersionInfos extends TeaModel {
        @NameInMap("VersionInfo")
        @Validation(required = true)
        public java.util.List<QueryLastestVersionInfoResponseVersionInfosVersionInfo> versionInfo;

        public static QueryLastestVersionInfoResponseVersionInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryLastestVersionInfoResponseVersionInfos self = new QueryLastestVersionInfoResponseVersionInfos();
            return TeaModel.build(map, self);
        }

        public QueryLastestVersionInfoResponseVersionInfos setVersionInfo(java.util.List<QueryLastestVersionInfoResponseVersionInfosVersionInfo> versionInfo) {
            this.versionInfo = versionInfo;
            return this;
        }
        public java.util.List<QueryLastestVersionInfoResponseVersionInfosVersionInfo> getVersionInfo() {
            return this.versionInfo;
        }

    }

}
