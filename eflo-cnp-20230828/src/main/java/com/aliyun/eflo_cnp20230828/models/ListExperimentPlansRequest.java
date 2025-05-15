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
     * <p>Resource ID</p>
     * 
     * <strong>example:</strong>
     * <p>189</p>
     */
    @NameInMap("ResourceId")
    public Long resourceId;

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

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListExperimentPlansRequestTag> tag;

    /**
     * <p>Template Id</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

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

    public ListExperimentPlansRequest setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
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

    public ListExperimentPlansRequest setTag(java.util.List<ListExperimentPlansRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListExperimentPlansRequestTag> getTag() {
        return this.tag;
    }

    public ListExperimentPlansRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public static class ListExperimentPlansRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListExperimentPlansRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentPlansRequestTag self = new ListExperimentPlansRequestTag();
            return TeaModel.build(map, self);
        }

        public ListExperimentPlansRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListExperimentPlansRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
