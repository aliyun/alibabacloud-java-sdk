// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorQuotaResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The value 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The quota information.</p>
     */
    @NameInMap("Data")
    public DescribeSiteMonitorQuotaResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Request succeeded.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>26860260-76C6-404E-AB7A-EB98D36A6885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The operation was successful.</p>
     * </li>
     * <li><p>false: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSiteMonitorQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorQuotaResponseBody self = new DescribeSiteMonitorQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSiteMonitorQuotaResponseBody setData(DescribeSiteMonitorQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSiteMonitorQuotaResponseBodyData getData() {
        return this.data;
    }

    public DescribeSiteMonitorQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSiteMonitorQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteMonitorQuotaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSiteMonitorQuotaResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether second-level monitoring is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: enabled.</p>
         * </li>
         * <li><p>false: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SecondMonitor")
        public Boolean secondMonitor;

        /**
         * <p>The quota of Alibaba detection points. The free quota is 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SiteMonitorIdcQuota")
        public Integer siteMonitorIdcQuota;

        /**
         * <p>The quota of non-Alibaba detection points. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SiteMonitorOperatorQuotaQuota")
        public Integer siteMonitorOperatorQuotaQuota;

        /**
         * <p>The number of used site monitoring detection task quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SiteMonitorQuotaTaskUsed")
        public Integer siteMonitorQuotaTaskUsed;

        /**
         * <p>The quota of site monitoring detection tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SiteMonitorTaskQuota")
        public Integer siteMonitorTaskQuota;

        /**
         * <p>The version of site monitoring. Valid values:</p>
         * <ul>
         * <li><p>V1: the old version.</p>
         * </li>
         * <li><p>V2: the new version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("SiteMonitorVersion")
        public String siteMonitorVersion;

        public static DescribeSiteMonitorQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorQuotaResponseBodyData self = new DescribeSiteMonitorQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteMonitorQuotaResponseBodyData setSecondMonitor(Boolean secondMonitor) {
            this.secondMonitor = secondMonitor;
            return this;
        }
        public Boolean getSecondMonitor() {
            return this.secondMonitor;
        }

        public DescribeSiteMonitorQuotaResponseBodyData setSiteMonitorIdcQuota(Integer siteMonitorIdcQuota) {
            this.siteMonitorIdcQuota = siteMonitorIdcQuota;
            return this;
        }
        public Integer getSiteMonitorIdcQuota() {
            return this.siteMonitorIdcQuota;
        }

        public DescribeSiteMonitorQuotaResponseBodyData setSiteMonitorOperatorQuotaQuota(Integer siteMonitorOperatorQuotaQuota) {
            this.siteMonitorOperatorQuotaQuota = siteMonitorOperatorQuotaQuota;
            return this;
        }
        public Integer getSiteMonitorOperatorQuotaQuota() {
            return this.siteMonitorOperatorQuotaQuota;
        }

        public DescribeSiteMonitorQuotaResponseBodyData setSiteMonitorQuotaTaskUsed(Integer siteMonitorQuotaTaskUsed) {
            this.siteMonitorQuotaTaskUsed = siteMonitorQuotaTaskUsed;
            return this;
        }
        public Integer getSiteMonitorQuotaTaskUsed() {
            return this.siteMonitorQuotaTaskUsed;
        }

        public DescribeSiteMonitorQuotaResponseBodyData setSiteMonitorTaskQuota(Integer siteMonitorTaskQuota) {
            this.siteMonitorTaskQuota = siteMonitorTaskQuota;
            return this;
        }
        public Integer getSiteMonitorTaskQuota() {
            return this.siteMonitorTaskQuota;
        }

        public DescribeSiteMonitorQuotaResponseBodyData setSiteMonitorVersion(String siteMonitorVersion) {
            this.siteMonitorVersion = siteMonitorVersion;
            return this;
        }
        public String getSiteMonitorVersion() {
            return this.siteMonitorVersion;
        }

    }

}
