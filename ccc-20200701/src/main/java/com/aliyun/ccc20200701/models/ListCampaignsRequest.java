// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignsRequest extends TeaModel {
    /**
     * <p>The actual start time of the campaign. This parameter is optional. By default, all time ranges are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1780329600000</p>
     */
    @NameInMap("ActualStartTimeFrom")
    public String actualStartTimeFrom;

    /**
     * <p>The actual end time of the campaign. This parameter is optional. By default, all time ranges are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1781625600000</p>
     */
    @NameInMap("ActualStartTimeTo")
    public String actualStartTimeTo;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Filters campaigns by predictive dialing campaign name. Fuzzy match is not supported. This parameter is optional and defaults to empty, which indicates no filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>test-campaign</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The planned start time of the campaign. This parameter is optional. By default, all time ranges are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1780243200000</p>
     */
    @NameInMap("PlanedStartTimeFrom")
    public String planedStartTimeFrom;

    /**
     * <p>The planned end time of the campaign. This parameter is optional. By default, all time ranges are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1781798399000</p>
     */
    @NameInMap("PlanedStartTimeTo")
    public String planedStartTimeTo;

    /**
     * <p>Filters campaigns by skill group ID. This parameter is optional and defaults to empty, which indicates no filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <p>Filters campaigns by predictive dialing campaign state. This parameter is optional and defaults to empty.</p>
     * 
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
