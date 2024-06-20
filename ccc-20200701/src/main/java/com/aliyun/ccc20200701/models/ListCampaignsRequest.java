// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-10-14 20:59:59</p>
     */
    @NameInMap("ActualStartTimeFrom")
    public String actualStartTimeFrom;

    /**
     * <strong>example:</strong>
     * <p>2021-10-14 20:59:59</p>
     */
    @NameInMap("ActualStartTimeTo")
    public String actualStartTimeTo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>test-campaign</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>2021-10-14 00:00:00</p>
     */
    @NameInMap("PlanedStartTimeFrom")
    public String planedStartTimeFrom;

    /**
     * <strong>example:</strong>
     * <p>2021-10-14 20:59:59</p>
     */
    @NameInMap("PlanedStartTimeTo")
    public String planedStartTimeTo;

    /**
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <strong>example:</strong>
     * <p>Draft</p>
     */
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
