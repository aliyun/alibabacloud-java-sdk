// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("DomainLogs")
    @Validation(required = true)
    public DescribeDomainLogsResponseDomainLogs domainLogs;

    public static DescribeDomainLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainLogsResponse self = new DescribeDomainLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDomainLogsResponseDomainLogsDomainLog extends TeaModel {
        @NameInMap("ActionTime")
        @Validation(required = true)
        public String actionTime;

        @NameInMap("ActionTimestamp")
        @Validation(required = true)
        public Long actionTimestamp;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("ClientIp")
        @Validation(required = true)
        public String clientIp;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeDomainLogsResponseDomainLogsDomainLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainLogsResponseDomainLogsDomainLog self = new DescribeDomainLogsResponseDomainLogsDomainLog();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainLogsResponseDomainLogs extends TeaModel {
        @NameInMap("DomainLog")
        @Validation(required = true)
        public java.util.List<DescribeDomainLogsResponseDomainLogsDomainLog> domainLog;

        public static DescribeDomainLogsResponseDomainLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainLogsResponseDomainLogs self = new DescribeDomainLogsResponseDomainLogs();
            return TeaModel.build(map, self);
        }

    }

}
