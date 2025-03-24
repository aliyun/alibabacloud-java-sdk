// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppInfoResponseBody extends TeaModel {
    @NameInMap("AppInfo")
    public QueryAppInfoResponseBodyAppInfo appInfo;

    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929BFB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInfoResponseBody self = new QueryAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppInfoResponseBody setAppInfo(QueryAppInfoResponseBodyAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public QueryAppInfoResponseBodyAppInfo getAppInfo() {
        return this.appInfo;
    }

    public QueryAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAppInfoResponseBodyAppInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>com.test.ios</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CertDevelopAvail")
        public Boolean certDevelopAvail;

        /**
         * <strong>example:</strong>
         * <p>2020-12-16T06:25:52Z</p>
         */
        @NameInMap("CertDevelopExpiration")
        public String certDevelopExpiration;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CertProductAvail")
        public Boolean certProductAvail;

        /**
         * <strong>example:</strong>
         * <p>2020-12-16T06:25:52Z</p>
         */
        @NameInMap("CertProductExpiration")
        public String certProductExpiration;

        /**
         * <strong>example:</strong>
         * <p>2020-12-16T06:25:52Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EncodedIcon")
        public String encodedIcon;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndustryId")
        public Integer industryId;

        /**
         * <strong>example:</strong>
         * <p>com.test.android</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Readonly")
        public Boolean readonly;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static QueryAppInfoResponseBodyAppInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAppInfoResponseBodyAppInfo self = new QueryAppInfoResponseBodyAppInfo();
            return TeaModel.build(map, self);
        }

        public QueryAppInfoResponseBodyAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryAppInfoResponseBodyAppInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryAppInfoResponseBodyAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public QueryAppInfoResponseBodyAppInfo setCertDevelopAvail(Boolean certDevelopAvail) {
            this.certDevelopAvail = certDevelopAvail;
            return this;
        }
        public Boolean getCertDevelopAvail() {
            return this.certDevelopAvail;
        }

        public QueryAppInfoResponseBodyAppInfo setCertDevelopExpiration(String certDevelopExpiration) {
            this.certDevelopExpiration = certDevelopExpiration;
            return this;
        }
        public String getCertDevelopExpiration() {
            return this.certDevelopExpiration;
        }

        public QueryAppInfoResponseBodyAppInfo setCertProductAvail(Boolean certProductAvail) {
            this.certProductAvail = certProductAvail;
            return this;
        }
        public Boolean getCertProductAvail() {
            return this.certProductAvail;
        }

        public QueryAppInfoResponseBodyAppInfo setCertProductExpiration(String certProductExpiration) {
            this.certProductExpiration = certProductExpiration;
            return this;
        }
        public String getCertProductExpiration() {
            return this.certProductExpiration;
        }

        public QueryAppInfoResponseBodyAppInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAppInfoResponseBodyAppInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
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

        public QueryAppInfoResponseBodyAppInfo setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public QueryAppInfoResponseBodyAppInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public QueryAppInfoResponseBodyAppInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAppInfoResponseBodyAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
