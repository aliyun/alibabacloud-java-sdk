// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentPlansShrinkRequest extends TeaModel {
    /**
     * <p>Creation Time Sorting Rule</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("CreatTimeOrder")
    public String creatTimeOrder;

    /**
     * <p>End Time Sorting Rule</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("EndTimeOrder")
    public String endTimeOrder;

    /**
     * <p>Page Number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>Execution Status</p>
     */
    @NameInMap("PlanTaskStatus")
    public String planTaskStatusShrink;

    /**
     * <p>Resource Group ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzij65sf2rr5i</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource</p>
     */
    @NameInMap("ResourceName")
    public String resourceNameShrink;

    /**
     * <p>Number of Items</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Start Time Sorting Rule</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("StartTimeOrder")
    public String startTimeOrder;

    public static ListExperimentPlansShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlansShrinkRequest self = new ListExperimentPlansShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlansShrinkRequest setCreatTimeOrder(String creatTimeOrder) {
        this.creatTimeOrder = creatTimeOrder;
        return this;
    }
    public String getCreatTimeOrder() {
        return this.creatTimeOrder;
    }

    public ListExperimentPlansShrinkRequest setEndTimeOrder(String endTimeOrder) {
        this.endTimeOrder = endTimeOrder;
        return this;
    }
    public String getEndTimeOrder() {
        return this.endTimeOrder;
    }

    public ListExperimentPlansShrinkRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListExperimentPlansShrinkRequest setPlanTaskStatusShrink(String planTaskStatusShrink) {
        this.planTaskStatusShrink = planTaskStatusShrink;
        return this;
    }
    public String getPlanTaskStatusShrink() {
        return this.planTaskStatusShrink;
    }

    public ListExperimentPlansShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListExperimentPlansShrinkRequest setResourceNameShrink(String resourceNameShrink) {
        this.resourceNameShrink = resourceNameShrink;
        return this;
    }
    public String getResourceNameShrink() {
        return this.resourceNameShrink;
    }

    public ListExperimentPlansShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListExperimentPlansShrinkRequest setStartTimeOrder(String startTimeOrder) {
        this.startTimeOrder = startTimeOrder;
        return this;
    }
    public String getStartTimeOrder() {
        return this.startTimeOrder;
    }

}
