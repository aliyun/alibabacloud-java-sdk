// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyFlowControlTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public ModifyFlowControlTaskResponseBodyResult result;

    public static ModifyFlowControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowControlTaskResponseBody self = new ModifyFlowControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFlowControlTaskResponseBody setResult(ModifyFlowControlTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyFlowControlTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyFlowControlTaskResponseBodyResultMetaSelectionParams extends TeaModel {
        /**
         * <p>The type of the filtering condition for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>QUERY_PUB_TIME</p>
         */
        @NameInMap("selectType")
        public String selectType;

        /**
         * <p>The number of filtering conditions for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
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

        public static ModifyFlowControlTaskResponseBodyResultMetaSelectionParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowControlTaskResponseBodyResultMetaSelectionParams self = new ModifyFlowControlTaskResponseBodyResultMetaSelectionParams();
            return TeaModel.build(map, self);
        }

        public ModifyFlowControlTaskResponseBodyResultMetaSelectionParams setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public ModifyFlowControlTaskResponseBodyResultMetaSelectionParams setSelectValue(String selectValue) {
            this.selectValue = selectValue;
            return this;
        }
        public String getSelectValue() {
            return this.selectValue;
        }

        public ModifyFlowControlTaskResponseBodyResultMetaSelectionParams setSelectionOperation(String selectionOperation) {
            this.selectionOperation = selectionOperation;
            return this;
        }
        public String getSelectionOperation() {
            return this.selectionOperation;
        }

    }

    public static class ModifyFlowControlTaskResponseBodyResultMetaTarget extends TeaModel {
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
         * <p>20</p>
         */
        @NameInMap("value")
        public Long value;

        public static ModifyFlowControlTaskResponseBodyResultMetaTarget build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowControlTaskResponseBodyResultMetaTarget self = new ModifyFlowControlTaskResponseBodyResultMetaTarget();
            return TeaModel.build(map, self);
        }

        public ModifyFlowControlTaskResponseBodyResultMetaTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyFlowControlTaskResponseBodyResultMetaTarget setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class ModifyFlowControlTaskResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>tst</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The end time. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1656518399</p>
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
         * <p>The IDs of scenes.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("sceneIds")
        public String sceneIds;

        /**
         * <p>The parameters specified for the item selection rule.</p>
         */
        @NameInMap("selectionParams")
        public java.util.List<ModifyFlowControlTaskResponseBodyResultMetaSelectionParams> selectionParams;

        /**
         * <p>The start time. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640739600</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The settings for item exposure.</p>
         */
        @NameInMap("target")
        public ModifyFlowControlTaskResponseBodyResultMetaTarget target;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Active user test</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static ModifyFlowControlTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowControlTaskResponseBodyResultMeta self = new ModifyFlowControlTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ModifyFlowControlTaskResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyFlowControlTaskResponseBodyResultMeta setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ModifyFlowControlTaskResponseBodyResultMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public ModifyFlowControlTaskResponseBodyResultMeta setSceneIds(String sceneIds) {
            this.sceneIds = sceneIds;
            return this;
        }
        public String getSceneIds() {
            return this.sceneIds;
        }

        public ModifyFlowControlTaskResponseBodyResultMeta setSelectionParams(java.util.List<ModifyFlowControlTaskResponseBodyResultMetaSelectionParams> selectionParams) {
            this.selectionParams = selectionParams;
            return this;
        }
        public java.util.List<ModifyFlowControlTaskResponseBodyResultMetaSelectionParams> getSelectionParams() {
            return this.selectionParams;
        }

        public ModifyFlowControlTaskResponseBodyResultMeta setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ModifyFlowControlTaskResponseBodyResultMeta setTarget(ModifyFlowControlTaskResponseBodyResultMetaTarget target) {
            this.target = target;
            return this;
        }
        public ModifyFlowControlTaskResponseBodyResultMetaTarget getTarget() {
            return this.target;
        }

        public ModifyFlowControlTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ModifyFlowControlTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1661506482</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-11T09:47:43.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The metadata.</p>
         */
        @NameInMap("meta")
        public ModifyFlowControlTaskResponseBodyResultMeta meta;

        /**
         * <p>The state of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("status")
        public String status;

        public static ModifyFlowControlTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowControlTaskResponseBodyResult self = new ModifyFlowControlTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyFlowControlTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ModifyFlowControlTaskResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyFlowControlTaskResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyFlowControlTaskResponseBodyResult setMeta(ModifyFlowControlTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ModifyFlowControlTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ModifyFlowControlTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
