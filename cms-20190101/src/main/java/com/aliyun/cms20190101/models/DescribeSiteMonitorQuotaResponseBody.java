// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorQuotaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSiteMonitorQuotaResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("SecondMonitor")
        public Boolean secondMonitor;

        @NameInMap("SiteMonitorIdcQuota")
        public Integer siteMonitorIdcQuota;

        @NameInMap("SiteMonitorOperatorQuotaQuota")
        public Integer siteMonitorOperatorQuotaQuota;

        @NameInMap("SiteMonitorQuotaTaskUsed")
        public Integer siteMonitorQuotaTaskUsed;

        @NameInMap("SiteMonitorTaskQuota")
        public Integer siteMonitorTaskQuota;

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
