// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainOverviewRequest extends TeaModel {
    /**
     * <p>The domain name of the website that you want to query. If you leave this parameter unspecified, the statistics on all domain names are queried.</p>
     * <br>
     * <p>> The domain name must be added to Anti-DDoS Pro or Anti-DDoS Premium. You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all the domain names that are added to Anti-DDoS Pro or Anti-DDoS Premium.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you leave this parameter unspecified, the current system time is used as the end time.</p>
     * <br>
     * <p>> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](https://help.aliyun.com/document_detail/94485.html).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDomainOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainOverviewRequest self = new DescribeDomainOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainOverviewRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainOverviewRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDomainOverviewRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainOverviewRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
