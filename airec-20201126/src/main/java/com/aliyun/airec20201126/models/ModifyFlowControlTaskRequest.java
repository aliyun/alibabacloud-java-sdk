// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyFlowControlTaskRequest extends TeaModel {
    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The description of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The end time. The value is a timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1639519200</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The type of the metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>FlowControlTask</p>
     */
    @NameInMap("metaType")
    public String metaType;

    /**
     * <p>The ID of the scene.</p>
     * 
     * <strong>example:</strong>
     * <p>all,sy101</p>
     */
    @NameInMap("sceneIds")
    public String sceneIds;

    /**
     * <p>The parameters specified for the item selection rule.</p>
     */
    @NameInMap("selectionParams")
    public java.util.List<ModifyFlowControlTaskRequestSelectionParams> selectionParams;

    /**
     * <p>The start time. The value is a timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1638460800</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The settings for item exposure.</p>
     */
    @NameInMap("target")
    public ModifyFlowControlTaskRequestTarget target;

    public static ModifyFlowControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowControlTaskRequest self = new ModifyFlowControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowControlTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifyFlowControlTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowControlTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModifyFlowControlTaskRequest setMetaType(String metaType) {
        this.metaType = metaType;
        return this;
    }
    public String getMetaType() {
        return this.metaType;
    }

    public ModifyFlowControlTaskRequest setSceneIds(String sceneIds) {
        this.sceneIds = sceneIds;
        return this;
    }
    public String getSceneIds() {
        return this.sceneIds;
    }

    public ModifyFlowControlTaskRequest setSelectionParams(java.util.List<ModifyFlowControlTaskRequestSelectionParams> selectionParams) {
        this.selectionParams = selectionParams;
        return this;
    }
    public java.util.List<ModifyFlowControlTaskRequestSelectionParams> getSelectionParams() {
        return this.selectionParams;
    }

    public ModifyFlowControlTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ModifyFlowControlTaskRequest setTarget(ModifyFlowControlTaskRequestTarget target) {
        this.target = target;
        return this;
    }
    public ModifyFlowControlTaskRequestTarget getTarget() {
        return this.target;
    }

    public static class ModifyFlowControlTaskRequestSelectionParams extends TeaModel {
        /**
         * <p>The type of the filtering condition for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>invalidItem</p>
         */
        @NameInMap("selectType")
        public String selectType;

        /**
         * <p>The number of filtering conditions for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("selectValue")
        public String selectValue;

        /**
         * <p>The operation on the filtering condition for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OPERATOR_HIGHER</p>
         */
        @NameInMap("selectionOperation")
        public String selectionOperation;

        public static ModifyFlowControlTaskRequestSelectionParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowControlTaskRequestSelectionParams self = new ModifyFlowControlTaskRequestSelectionParams();
            return TeaModel.build(map, self);
        }

        public ModifyFlowControlTaskRequestSelectionParams setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public ModifyFlowControlTaskRequestSelectionParams setSelectValue(String selectValue) {
            this.selectValue = selectValue;
            return this;
        }
        public String getSelectValue() {
            return this.selectValue;
        }

        public ModifyFlowControlTaskRequestSelectionParams setSelectionOperation(String selectionOperation) {
            this.selectionOperation = selectionOperation;
            return this;
        }
        public String getSelectionOperation() {
            return this.selectionOperation;
        }

    }

    public static class ModifyFlowControlTaskRequestTarget extends TeaModel {
        /**
         * <p>The type of the exposure.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPOSE_PERCENT</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The number of exposures.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("value")
        public Long value;

        public static ModifyFlowControlTaskRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowControlTaskRequestTarget self = new ModifyFlowControlTaskRequestTarget();
            return TeaModel.build(map, self);
        }

        public ModifyFlowControlTaskRequestTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyFlowControlTaskRequestTarget setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
