// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppInfo")
    @Validation(required = true)
    public QueryAppInfoResponseAppInfo appInfo;

    public static QueryAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInfoResponse self = new QueryAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppInfoResponse setAppInfo(QueryAppInfoResponseAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public QueryAppInfoResponseAppInfo getAppInfo() {
        return this.appInfo;
    }

    public static class QueryAppInfoResponseAppInfo extends TeaModel {
        @NameInMap("AppKey")
        @Validation(required = true)
        public String appKey;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("Readonly")
        @Validation(required = true)
        public Boolean readonly;

        @NameInMap("BundleId")
        @Validation(required = true)
        public String bundleId;

        @NameInMap("PackageName")
        @Validation(required = true)
        public String packageName;

        @NameInMap("CertDevelopAvail")
        @Validation(required = true)
        public Boolean certDevelopAvail;

        @NameInMap("CertDevelopExpiration")
        @Validation(required = true)
        public String certDevelopExpiration;

        @NameInMap("CertProductAvail")
        @Validation(required = true)
        public Boolean certProductAvail;

        @NameInMap("CertProductExpiration")
        @Validation(required = true)
        public String certProductExpiration;

        @NameInMap("EncodedIcon")
        @Validation(required = true)
        public String encodedIcon;

        @NameInMap("IndustryId")
        @Validation(required = true)
        public Integer industryId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ProductId")
        @Validation(required = true)
        public Long productId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static QueryAppInfoResponseAppInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAppInfoResponseAppInfo self = new QueryAppInfoResponseAppInfo();
            return TeaModel.build(map, self);
        }

        public QueryAppInfoResponseAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryAppInfoResponseAppInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryAppInfoResponseAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryAppInfoResponseAppInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public QueryAppInfoResponseAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public QueryAppInfoResponseAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public QueryAppInfoResponseAppInfo setCertDevelopAvail(Boolean certDevelopAvail) {
            this.certDevelopAvail = certDevelopAvail;
            return this;
        }
        public Boolean getCertDevelopAvail() {
            return this.certDevelopAvail;
        }

        public QueryAppInfoResponseAppInfo setCertDevelopExpiration(String certDevelopExpiration) {
            this.certDevelopExpiration = certDevelopExpiration;
            return this;
        }
        public String getCertDevelopExpiration() {
            return this.certDevelopExpiration;
        }

        public QueryAppInfoResponseAppInfo setCertProductAvail(Boolean certProductAvail) {
            this.certProductAvail = certProductAvail;
            return this;
        }
        public Boolean getCertProductAvail() {
            return this.certProductAvail;
        }

        public QueryAppInfoResponseAppInfo setCertProductExpiration(String certProductExpiration) {
            this.certProductExpiration = certProductExpiration;
            return this;
        }
        public String getCertProductExpiration() {
            return this.certProductExpiration;
        }

        public QueryAppInfoResponseAppInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public QueryAppInfoResponseAppInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public QueryAppInfoResponseAppInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAppInfoResponseAppInfo setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public QueryAppInfoResponseAppInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
