// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignsRequest extends TeaModel {
    @NameInMap("ActualStartTimeFrom")
    public String actualStartTimeFrom;

    @NameInMap("ActualStartTimeTo")
    public String actualStartTimeTo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PlanedStartTimeFrom")
    public String planedStartTimeFrom;

    @NameInMap("PlanedStartTimeTo")
    public String planedStartTimeTo;

    @NameInMap("QueueId")
    public String queueId;

    @NameInMap("State")
    public String state;

    public static ListCampaignsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignsRequest self = new ListCampaignsRequest();
        return TeaModel.build(map, self);
    }

    public ListCampaignsRequest setActualStartTimeFrom(String actualStartTimeFrom) {
        this.actualStartTimeFrom = actualStartTimeFrom;
        return this;
    }
    public String getActualStartTimeFrom() {
        return this.actualStartTimeFrom;
    }

    public ListCampaignsRequest setActualStartTimeTo(String actualStartTimeTo) {
        this.actualStartTimeTo = actualStartTimeTo;
        return this;
    }
    public String getActualStartTimeTo() {
        return this.actualStartTimeTo;
    }

    public ListCampaignsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCampaignsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCampaignsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCampaignsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCampaignsRequest setPlanedStartTimeFrom(String planedStartTimeFrom) {
        this.planedStartTimeFrom = planedStartTimeFrom;
        return this;
    }
    public String getPlanedStartTimeFrom() {
        return this.planedStartTimeFrom;
    }

    public ListCampaignsRequest setPlanedStartTimeTo(String planedStartTimeTo) {
        this.planedStartTimeTo = planedStartTimeTo;
        return this;
    }
    public String getPlanedStartTimeTo() {
        return this.planedStartTimeTo;
    }

    public ListCampaignsRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public ListCampaignsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
