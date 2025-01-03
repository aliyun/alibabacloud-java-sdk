// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentPlansRequest extends TeaModel {
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
    public java.util.List<String> planTaskStatus;

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
    public java.util.List<String> resourceName;

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

    public static ListExperimentPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlansRequest self = new ListExperimentPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlansRequest setCreatTimeOrder(String creatTimeOrder) {
        this.creatTimeOrder = creatTimeOrder;
        return this;
    }
    public String getCreatTimeOrder() {
        return this.creatTimeOrder;
    }

    public ListExperimentPlansRequest setEndTimeOrder(String endTimeOrder) {
        this.endTimeOrder = endTimeOrder;
        return this;
    }
    public String getEndTimeOrder() {
        return this.endTimeOrder;
    }

    public ListExperimentPlansRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListExperimentPlansRequest setPlanTaskStatus(java.util.List<String> planTaskStatus) {
        this.planTaskStatus = planTaskStatus;
        return this;
    }
    public java.util.List<String> getPlanTaskStatus() {
        return this.planTaskStatus;
    }

    public ListExperimentPlansRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListExperimentPlansRequest setResourceName(java.util.List<String> resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public java.util.List<String> getResourceName() {
        return this.resourceName;
    }

    public ListExperimentPlansRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListExperimentPlansRequest setStartTimeOrder(String startTimeOrder) {
        this.startTimeOrder = startTimeOrder;
        return this;
    }
    public String getStartTimeOrder() {
        return this.startTimeOrder;
    }

}
