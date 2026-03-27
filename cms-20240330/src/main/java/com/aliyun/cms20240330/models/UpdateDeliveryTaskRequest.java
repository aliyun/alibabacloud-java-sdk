// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDeliveryTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rw-5f2b4sc7es4d66</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    @NameInMap("externalLabels")
    public java.util.Map<String, String> externalLabels;

    @NameInMap("labelFilters")
    public java.util.Map<String, String> labelFilters;

    /**
     * <strong>example:</strong>
     * <p>Deny</p>
     */
    @NameInMap("labelFiltersType")
    public String labelFiltersType;

    /**
     * <strong>example:</strong>
     * <p>rg-aekzoiafjtr7zyq</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("sinkList")
    public java.util.List<UpdateDeliveryTaskRequestSinkList> sinkList;

    /**
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>updated desc</p>
     */
    @NameInMap("taskDescription")
    public String taskDescription;

    /**
     * <strong>example:</strong>
     * <p>new-task-name</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static UpdateDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryTaskRequest self = new UpdateDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryTaskRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDeliveryTaskRequest setExternalLabels(java.util.Map<String, String> externalLabels) {
        this.externalLabels = externalLabels;
        return this;
    }
    public java.util.Map<String, String> getExternalLabels() {
        return this.externalLabels;
    }

    public UpdateDeliveryTaskRequest setLabelFilters(java.util.Map<String, String> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.Map<String, String> getLabelFilters() {
        return this.labelFilters;
    }

    public UpdateDeliveryTaskRequest setLabelFiltersType(String labelFiltersType) {
        this.labelFiltersType = labelFiltersType;
        return this;
    }
    public String getLabelFiltersType() {
        return this.labelFiltersType;
    }

    public UpdateDeliveryTaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateDeliveryTaskRequest setSinkList(java.util.List<UpdateDeliveryTaskRequestSinkList> sinkList) {
        this.sinkList = sinkList;
        return this;
    }
    public java.util.List<UpdateDeliveryTaskRequestSinkList> getSinkList() {
        return this.sinkList;
    }

    public UpdateDeliveryTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateDeliveryTaskRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public UpdateDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class UpdateDeliveryTaskRequestSinkList extends TeaModel {
        @NameInMap("sinkConfigs")
        public java.util.Map<String, String> sinkConfigs;

        /**
         * <strong>example:</strong>
         * <p>Prometheus</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("sinkType")
        public String sinkType;

        public static UpdateDeliveryTaskRequestSinkList build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeliveryTaskRequestSinkList self = new UpdateDeliveryTaskRequestSinkList();
            return TeaModel.build(map, self);
        }

        public UpdateDeliveryTaskRequestSinkList setSinkConfigs(java.util.Map<String, String> sinkConfigs) {
            this.sinkConfigs = sinkConfigs;
            return this;
        }
        public java.util.Map<String, String> getSinkConfigs() {
            return this.sinkConfigs;
        }

        public UpdateDeliveryTaskRequestSinkList setSinkType(String sinkType) {
            this.sinkType = sinkType;
            return this;
        }
        public String getSinkType() {
            return this.sinkType;
        }

    }

}
