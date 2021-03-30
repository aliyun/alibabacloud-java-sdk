// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppInfo")
    public QueryAppInfoResponseBodyAppInfo appInfo;

    public static QueryAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInfoResponseBody self = new QueryAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppInfoResponseBody setAppInfo(QueryAppInfoResponseBodyAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public QueryAppInfoResponseBodyAppInfo getAppInfo() {
        return this.appInfo;
    }

    public static class QueryAppInfoResponseBodyAppInfo extends TeaModel {
        @NameInMap("CertDevelopExpiration")
        public String certDevelopExpiration;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("IndustryId")
        public Integer industryId;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Readonly")
        public Boolean readonly;

        @NameInMap("CertProductExpiration")
        public String certProductExpiration;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("EncodedIcon")
        public String encodedIcon;

        @NameInMap("CertDevelopAvail")
        public Boolean certDevelopAvail;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("CertProductAvail")
        public Boolean certProductAvail;

        public static QueryAppInfoResponseBodyAppInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAppInfoResponseBodyAppInfo self = new QueryAppInfoResponseBodyAppInfo();
            return TeaModel.build(map, self);
        }

        public QueryAppInfoResponseBodyAppInfo setCertDevelopExpiration(String certDevelopExpiration) {
            this.certDevelopExpiration = certDevelopExpiration;
            return this;
        }
        public String getCertDevelopExpiration() {
            return this.certDevelopExpiration;
        }

        public QueryAppInfoResponseBodyAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryAppInfoResponseBodyAppInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAppInfoResponseBodyAppInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public QueryAppInfoResponseBodyAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public QueryAppInfoResponseBodyAppInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAppInfoResponseBodyAppInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public QueryAppInfoResponseBodyAppInfo setCertProductExpiration(String certProductExpiration) {
            this.certProductExpiration = certProductExpiration;
            return this;
        }
        public String getCertProductExpiration() {
            return this.certProductExpiration;
        }

        public QueryAppInfoResponseBodyAppInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryAppInfoResponseBodyAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryAppInfoResponseBodyAppInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public QueryAppInfoResponseBodyAppInfo setCertDevelopAvail(Boolean certDevelopAvail) {
            this.certDevelopAvail = certDevelopAvail;
            return this;
        }
        public Boolean getCertDevelopAvail() {
            return this.certDevelopAvail;
        }

        public QueryAppInfoResponseBodyAppInfo setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public QueryAppInfoResponseBodyAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public QueryAppInfoResponseBodyAppInfo setCertProductAvail(Boolean certProductAvail) {
            this.certProductAvail = certProductAvail;
            return this;
        }
        public Boolean getCertProductAvail() {
            return this.certProductAvail;
        }

    }

}
