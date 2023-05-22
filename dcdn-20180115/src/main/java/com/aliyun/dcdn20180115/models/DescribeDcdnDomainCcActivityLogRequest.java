// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCcActivityLogRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
     * <br>
     * <p>If you leave this parameter empty, the data of all domain names is queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number of the returned page. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the rule.</p>
     * <br>
     * <p>*   default_normal in normal mode</p>
     * <p>*   default_attack in emergency mode</p>
     * <p>*   A custom rule name in custom mode. Example: test2.</p>
     * <br>
     * <p>If you leave this parameter empty, all events that triggered rate limiting are queried.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>The minimum data granularity is 5 minutes.</p>
     * <br>
     * <p>If you leave this parameter empty, the data collected over the last 24 hours is queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The object that triggered rate limiting.</p>
     * <br>
     * <p>If you leave this parameter empty, all events that triggered rate limiting are queried.</p>
     */
    @NameInMap("TriggerObject")
    public String triggerObject;

    /**
     * <p>The value of the object that triggered rate limiting.</p>
     * <br>
     * <p>If you leave this parameter empty, all events that triggered rate limiting are queried.</p>
     */
    @NameInMap("Value")
    public String value;

    public static DescribeDcdnDomainCcActivityLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCcActivityLogRequest self = new DescribeDcdnDomainCcActivityLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCcActivityLogRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainCcActivityLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainCcActivityLogRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnDomainCcActivityLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnDomainCcActivityLogRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeDcdnDomainCcActivityLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainCcActivityLogRequest setTriggerObject(String triggerObject) {
        this.triggerObject = triggerObject;
        return this;
    }
    public String getTriggerObject() {
        return this.triggerObject;
    }

    public DescribeDcdnDomainCcActivityLogRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
