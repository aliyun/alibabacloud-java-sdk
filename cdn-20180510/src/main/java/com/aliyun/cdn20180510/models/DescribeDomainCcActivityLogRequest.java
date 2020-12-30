// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCcActivityLogRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("TriggerObject")
    public String triggerObject;

    @NameInMap("Value")
    public String value;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeDomainCcActivityLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcActivityLogRequest self = new DescribeDomainCcActivityLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcActivityLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainCcActivityLogRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainCcActivityLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainCcActivityLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public DescribeDomainCcActivityLogRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeDomainCcActivityLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainCcActivityLogRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

}
