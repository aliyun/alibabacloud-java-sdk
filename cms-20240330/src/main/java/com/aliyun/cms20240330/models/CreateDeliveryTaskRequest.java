// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDeliveryTaskRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance that serves as the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-xxxxxx</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>A map of key-value pairs to attach as additional labels to all delivered metrics.</p>
     */
    @NameInMap("externalLabels")
    public java.util.Map<String, String> externalLabels;

    /**
     * <p>The label conditions for filtering metrics. The key is the label name and the value is the value to match. The filtering behavior is controlled by <code>labelFiltersType</code>.</p>
     */
    @NameInMap("labelFilters")
    public java.util.Map<String, String> labelFilters;

    /**
     * <p>The mode for applying the label filters.</p>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("labelFiltersType")
    public String labelFiltersType;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>An array of delivery destination objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sinkList")
    public java.util.List<CreateDeliveryTaskRequestSinkList> sinkList;

    /**
     * <p>An array of resource tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreateDeliveryTaskRequestTags> tags;

    /**
     * <p>The task description.</p>
     * 
     * <strong>example:</strong>
     * <p>my delivery task</p>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    /**
     * <p>The name of the task. The name can contain Chinese characters, English letters, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-task</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static CreateDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryTaskRequest self = new CreateDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryTaskRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDeliveryTaskRequest setExternalLabels(java.util.Map<String, String> externalLabels) {
        this.externalLabels = externalLabels;
        return this;
    }
    public java.util.Map<String, String> getExternalLabels() {
        return this.externalLabels;
    }

    public CreateDeliveryTaskRequest setLabelFilters(java.util.Map<String, String> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.Map<String, String> getLabelFilters() {
        return this.labelFilters;
    }

    public CreateDeliveryTaskRequest setLabelFiltersType(String labelFiltersType) {
        this.labelFiltersType = labelFiltersType;
        return this;
    }
    public String getLabelFiltersType() {
        return this.labelFiltersType;
    }

    public CreateDeliveryTaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDeliveryTaskRequest setSinkList(java.util.List<CreateDeliveryTaskRequestSinkList> sinkList) {
        this.sinkList = sinkList;
        return this;
    }
    public java.util.List<CreateDeliveryTaskRequestSinkList> getSinkList() {
        return this.sinkList;
    }

    public CreateDeliveryTaskRequest setTags(java.util.List<CreateDeliveryTaskRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateDeliveryTaskRequestTags> getTags() {
        return this.tags;
    }

    public CreateDeliveryTaskRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public CreateDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class CreateDeliveryTaskRequestSinkList extends TeaModel {
        /**
         * <p>The configuration for the sink, specified as key-value pairs. The valid keys and values depend on the value of <code>sinkType</code>.</p>
         */
        @NameInMap("sinkConfigs")
        public java.util.Map<String, String> sinkConfigs;

        /**
         * <p>The type of the delivery destination (sink).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("sinkType")
        public String sinkType;

        public static CreateDeliveryTaskRequestSinkList build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryTaskRequestSinkList self = new CreateDeliveryTaskRequestSinkList();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryTaskRequestSinkList setSinkConfigs(java.util.Map<String, String> sinkConfigs) {
            this.sinkConfigs = sinkConfigs;
            return this;
        }
        public java.util.Map<String, String> getSinkConfigs() {
            return this.sinkConfigs;
        }

        public CreateDeliveryTaskRequestSinkList setSinkType(String sinkType) {
            this.sinkType = sinkType;
            return this;
        }
        public String getSinkType() {
            return this.sinkType;
        }

    }

    public static class CreateDeliveryTaskRequestTags extends TeaModel {
        /**
         * <p>The key of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>_cms_workspace</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateDeliveryTaskRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryTaskRequestTags self = new CreateDeliveryTaskRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryTaskRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDeliveryTaskRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
