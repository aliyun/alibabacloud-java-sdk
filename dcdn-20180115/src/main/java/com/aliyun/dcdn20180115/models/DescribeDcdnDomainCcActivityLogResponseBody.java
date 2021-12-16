// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCcActivityLogResponseBody extends TeaModel {
    @NameInMap("ActivityLog")
    public java.util.List<DescribeDcdnDomainCcActivityLogResponseBodyActivityLog> activityLog;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeDcdnDomainCcActivityLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCcActivityLogResponseBody self = new DescribeDcdnDomainCcActivityLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCcActivityLogResponseBody setActivityLog(java.util.List<DescribeDcdnDomainCcActivityLogResponseBodyActivityLog> activityLog) {
        this.activityLog = activityLog;
        return this;
    }
    public java.util.List<DescribeDcdnDomainCcActivityLogResponseBodyActivityLog> getActivityLog() {
        return this.activityLog;
    }

    public DescribeDcdnDomainCcActivityLogResponseBody setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public DescribeDcdnDomainCcActivityLogResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnDomainCcActivityLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainCcActivityLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeDcdnDomainCcActivityLogResponseBodyActivityLog extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("TriggerObject")
        public String triggerObject;

        @NameInMap("Ttl")
        public Long ttl;

        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDomainCcActivityLogResponseBodyActivityLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainCcActivityLogResponseBodyActivityLog self = new DescribeDcdnDomainCcActivityLogResponseBodyActivityLog();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainCcActivityLogResponseBodyActivityLog setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeDcdnDomainCcActivityLogResponseBodyActivityLog setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnDomainCcActivityLogResponseBodyActivityLog setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDcdnDomainCcActivityLogResponseBodyActivityLog setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainCcActivityLogResponseBodyActivityLog setTriggerObject(String triggerObject) {
            this.triggerObject = triggerObject;
            return this;
        }
        public String getTriggerObject() {
            return this.triggerObject;
        }

        public DescribeDcdnDomainCcActivityLogResponseBodyActivityLog setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public DescribeDcdnDomainCcActivityLogResponseBodyActivityLog setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
