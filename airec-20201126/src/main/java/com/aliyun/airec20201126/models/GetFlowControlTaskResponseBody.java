// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetFlowControlTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<GetFlowControlTaskResponseBodyResult> result;

    public static GetFlowControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowControlTaskResponseBody self = new GetFlowControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlowControlTaskResponseBody setResult(java.util.List<GetFlowControlTaskResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetFlowControlTaskResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetFlowControlTaskResponseBodyResultMetaSelectionParams extends TeaModel {
        /**
         * <p>The type of the filtering condition for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>QUERY_PUB_TIME</p>
         */
        @NameInMap("selectType")
        public String selectType;

        /**
         * <p>The value of the filtering condition for the item selection rule.</p>
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

        public static GetFlowControlTaskResponseBodyResultMetaSelectionParams build(java.util.Map<String, ?> map) throws Exception {
            GetFlowControlTaskResponseBodyResultMetaSelectionParams self = new GetFlowControlTaskResponseBodyResultMetaSelectionParams();
            return TeaModel.build(map, self);
        }

        public GetFlowControlTaskResponseBodyResultMetaSelectionParams setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public GetFlowControlTaskResponseBodyResultMetaSelectionParams setSelectValue(String selectValue) {
            this.selectValue = selectValue;
            return this;
        }
        public String getSelectValue() {
            return this.selectValue;
        }

        public GetFlowControlTaskResponseBodyResultMetaSelectionParams setSelectionOperation(String selectionOperation) {
            this.selectionOperation = selectionOperation;
            return this;
        }
        public String getSelectionOperation() {
            return this.selectionOperation;
        }

    }

    public static class GetFlowControlTaskResponseBodyResultMetaTarget extends TeaModel {
        /**
         * <p>EXPOSE_PERCENT: daily exposure percentage. EXPOSE_COUNT: total number of exposures.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPOSE_PERCENT</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The exposure value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("value")
        public Long value;

        public static GetFlowControlTaskResponseBodyResultMetaTarget build(java.util.Map<String, ?> map) throws Exception {
            GetFlowControlTaskResponseBodyResultMetaTarget self = new GetFlowControlTaskResponseBodyResultMetaTarget();
            return TeaModel.build(map, self);
        }

        public GetFlowControlTaskResponseBodyResultMetaTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetFlowControlTaskResponseBodyResultMetaTarget setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class GetFlowControlTaskResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
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
         * <p>The metadata type.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowControlTask</p>
         */
        @NameInMap("metaType")
        public String metaType;

        /**
         * <p>The scene IDs.</p>
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
        public java.util.List<GetFlowControlTaskResponseBodyResultMetaSelectionParams> selectionParams;

        /**
         * <p>The start time. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640739600</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The exposure settings.</p>
         */
        @NameInMap("target")
        public GetFlowControlTaskResponseBodyResultMetaTarget target;

        /**
         * <p>The task name.</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static GetFlowControlTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            GetFlowControlTaskResponseBodyResultMeta self = new GetFlowControlTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public GetFlowControlTaskResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFlowControlTaskResponseBodyResultMeta setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetFlowControlTaskResponseBodyResultMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public GetFlowControlTaskResponseBodyResultMeta setSceneIds(String sceneIds) {
            this.sceneIds = sceneIds;
            return this;
        }
        public String getSceneIds() {
            return this.sceneIds;
        }

        public GetFlowControlTaskResponseBodyResultMeta setSelectionParams(java.util.List<GetFlowControlTaskResponseBodyResultMetaSelectionParams> selectionParams) {
            this.selectionParams = selectionParams;
            return this;
        }
        public java.util.List<GetFlowControlTaskResponseBodyResultMetaSelectionParams> getSelectionParams() {
            return this.selectionParams;
        }

        public GetFlowControlTaskResponseBodyResultMeta setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetFlowControlTaskResponseBodyResultMeta setTarget(GetFlowControlTaskResponseBodyResultMetaTarget target) {
            this.target = target;
            return this;
        }
        public GetFlowControlTaskResponseBodyResultMetaTarget getTarget() {
            return this.target;
        }

        public GetFlowControlTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class GetFlowControlTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the data source was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-23T06:08:48.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The metadata of the task.</p>
         */
        @NameInMap("meta")
        public GetFlowControlTaskResponseBodyResultMeta meta;

        /**
         * <p>The task state. Valid values: DRAFT, READY, RUNNING, ENDED, and AUTO_END. The value AUTO_END is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1666854602398</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static GetFlowControlTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFlowControlTaskResponseBodyResult self = new GetFlowControlTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFlowControlTaskResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetFlowControlTaskResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetFlowControlTaskResponseBodyResult setMeta(GetFlowControlTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public GetFlowControlTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public GetFlowControlTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFlowControlTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
