// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorQuotaResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeSiteMonitorQuotaResponseData data;

    public static DescribeSiteMonitorQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorQuotaResponse self = new DescribeSiteMonitorQuotaResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSiteMonitorQuotaResponseData extends TeaModel {
        @NameInMap("SiteMonitorIdcQuota")
        @Validation(required = true)
        public Integer siteMonitorIdcQuota;

        @NameInMap("SiteMonitorOperatorQuotaQuota")
        @Validation(required = true)
        public Integer siteMonitorOperatorQuotaQuota;

        @NameInMap("SiteMonitorTaskQuota")
        @Validation(required = true)
        public Integer siteMonitorTaskQuota;

        @NameInMap("SiteMonitorQuotaTaskUsed")
        @Validation(required = true)
        public Integer siteMonitorQuotaTaskUsed;

        @NameInMap("SiteMonitorVersion")
        @Validation(required = true)
        public String siteMonitorVersion;

        public static DescribeSiteMonitorQuotaResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorQuotaResponseData self = new DescribeSiteMonitorQuotaResponseData();
            return TeaModel.build(map, self);
        }

    }

}
