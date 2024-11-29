// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCertificateQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Quota")
    public Long quota;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("QuotaUsage")
    public Long quotaUsage;

    /**
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SiteCount")
    public Long siteCount;

    @NameInMap("SiteUsage")
    public java.util.List<GetCertificateQuotaResponseBodySiteUsage> siteUsage;

    /**
     * <strong>example:</strong>
     * <p>free</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetCertificateQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateQuotaResponseBody self = new GetCertificateQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificateQuotaResponseBody setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public GetCertificateQuotaResponseBody setQuotaUsage(Long quotaUsage) {
        this.quotaUsage = quotaUsage;
        return this;
    }
    public Long getQuotaUsage() {
        return this.quotaUsage;
    }

    public GetCertificateQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCertificateQuotaResponseBody setSiteCount(Long siteCount) {
        this.siteCount = siteCount;
        return this;
    }
    public Long getSiteCount() {
        return this.siteCount;
    }

    public GetCertificateQuotaResponseBody setSiteUsage(java.util.List<GetCertificateQuotaResponseBodySiteUsage> siteUsage) {
        this.siteUsage = siteUsage;
        return this;
    }
    public java.util.List<GetCertificateQuotaResponseBodySiteUsage> getSiteUsage() {
        return this.siteUsage;
    }

    public GetCertificateQuotaResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class GetCertificateQuotaResponseBodySiteUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>165929521496928</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SiteUsage")
        public Long siteUsage;

        public static GetCertificateQuotaResponseBodySiteUsage build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateQuotaResponseBodySiteUsage self = new GetCertificateQuotaResponseBodySiteUsage();
            return TeaModel.build(map, self);
        }

        public GetCertificateQuotaResponseBodySiteUsage setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public GetCertificateQuotaResponseBodySiteUsage setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public GetCertificateQuotaResponseBodySiteUsage setSiteUsage(Long siteUsage) {
            this.siteUsage = siteUsage;
            return this;
        }
        public Long getSiteUsage() {
            return this.siteUsage;
        }

    }

}
