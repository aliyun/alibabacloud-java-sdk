// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCcActivityLogResponseBody extends TeaModel {
    /**
     * <p>The log entry of the event that triggered rate limiting.</p>
     */
    @NameInMap("ActivityLog")
    public java.util.List<DescribeDomainCcActivityLogResponseBodyActivityLog> activityLog;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeDomainCcActivityLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcActivityLogResponseBody self = new DescribeDomainCcActivityLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcActivityLogResponseBody setActivityLog(java.util.List<DescribeDomainCcActivityLogResponseBodyActivityLog> activityLog) {
        this.activityLog = activityLog;
        return this;
    }
    public java.util.List<DescribeDomainCcActivityLogResponseBodyActivityLog> getActivityLog() {
        return this.activityLog;
    }

    public DescribeDomainCcActivityLogResponseBody setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public DescribeDomainCcActivityLogResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainCcActivityLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainCcActivityLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeDomainCcActivityLogResponseBodyActivityLog extends TeaModel {
        /**
         * <p>The action that was triggered.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The name of the rule that was triggered</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The timestamp of the data.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The object that triggered rate limiting.</p>
         */
        @NameInMap("TriggerObject")
        public String triggerObject;

        /**
         * <p>The period of time that rate limiting remains effective.</p>
         */
        @NameInMap("Ttl")
        public Long ttl;

        /**
         * <p>The value of the object that triggered rate limiting.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDomainCcActivityLogResponseBodyActivityLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainCcActivityLogResponseBodyActivityLog self = new DescribeDomainCcActivityLogResponseBodyActivityLog();
            return TeaModel.build(map, self);
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
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

        public DescribeDomainCcActivityLogResponseBodyActivityLog setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setTriggerObject(String triggerObject) {
            this.triggerObject = triggerObject;
            return this;
        }
        public String getTriggerObject() {
            return this.triggerObject;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public DescribeDomainCcActivityLogResponseBodyActivityLog setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
