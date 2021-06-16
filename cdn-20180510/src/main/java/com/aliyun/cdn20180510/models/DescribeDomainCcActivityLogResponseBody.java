// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCcActivityLogResponseBody extends TeaModel {
    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Total")
    public Long total;

    @NameInMap("ActivityLog")
    public java.util.List<DescribeDomainCcActivityLogResponseBodyActivityLog> activityLog;

    public static DescribeDomainCcActivityLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcActivityLogResponseBody self = new DescribeDomainCcActivityLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcActivityLogResponseBody setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public DescribeDomainCcActivityLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainCcActivityLogResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainCcActivityLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeDomainCcActivityLogResponseBody setActivityLog(java.util.List<DescribeDomainCcActivityLogResponseBodyActivityLog> activityLog) {
        this.activityLog = activityLog;
        return this;
    }
    public java.util.List<DescribeDomainCcActivityLogResponseBodyActivityLog> getActivityLog() {
        return this.activityLog;
    }

    public static class DescribeDomainCcActivityLogResponseBodyActivityLog extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Ttl")
        public Long ttl;

        @NameInMap("Action")
        public String action;

        @NameInMap("TriggerObject")
        public String triggerObject;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeDomainCcActivityLogResponseBodyActivityLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainCcActivityLogResponseBodyActivityLog self = new DescribeDomainCcActivityLogResponseBodyActivityLog();
            return TeaModel.build(map, self);
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setTriggerObject(String triggerObject) {
            this.triggerObject = triggerObject;
            return this;
        }
        public String getTriggerObject() {
            return this.triggerObject;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
