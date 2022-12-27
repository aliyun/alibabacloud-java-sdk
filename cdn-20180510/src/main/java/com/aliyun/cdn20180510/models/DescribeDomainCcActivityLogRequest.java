// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCcActivityLogRequest extends TeaModel {
    // The accelerated domain name. You can specify multiple domain names and separate them with commas (,).
    // 
    // If you do not specify a domain name, data of all domain names is queried.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    // 
    // The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Default value: **1**.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries to return on each page. Default value: **30**.
    @NameInMap("PageSize")
    public Long pageSize;

    // A custom rule name. Valid values:
    // 
    // *   Default mode: default_normal.
    // *   Emergency mode: default_attack.
    // 
    // If you do not set this parameter, all events that triggered rate limiting are queried.
    @NameInMap("RuleName")
    public String ruleName;

    // The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    // 
    // Data is collected every 5 minutes.
    // 
    // If you do not set this parameter, data within the last 24 hours is queried.
    @NameInMap("StartTime")
    public String startTime;

    // The object that triggered rate limiting.
    // 
    // If you do not set this parameter, all events that triggered rate limiting are queried.
    @NameInMap("TriggerObject")
    public String triggerObject;

    // The value of the object that triggered rate limiting.
    // 
    // If you do not set this parameter, the values of all events that triggered rate limiting are queried.
    @NameInMap("Value")
    public String value;

    public static DescribeDomainCcActivityLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcActivityLogRequest self = new DescribeDomainCcActivityLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcActivityLogRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainCcActivityLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainCcActivityLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainCcActivityLogRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainCcActivityLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainCcActivityLogRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeDomainCcActivityLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainCcActivityLogRequest setTriggerObject(String triggerObject) {
        this.triggerObject = triggerObject;
        return this;
    }
    public String getTriggerObject() {
        return this.triggerObject;
    }

    public DescribeDomainCcActivityLogRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
