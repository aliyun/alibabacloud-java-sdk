// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6E427B10-30FC-1873-922F-FC176D3398D4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListFlowControlTaskResponseBodyResult> result;

    public static ListFlowControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskResponseBody self = new ListFlowControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowControlTaskResponseBody setResult(java.util.List<ListFlowControlTaskResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListFlowControlTaskResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListFlowControlTaskResponseBodyResultMetaSelectionParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectType</p>
         */
        @NameInMap("selectType")
        public String selectType;

        /**
         * <strong>example:</strong>
         * <p>selectValue</p>
         */
        @NameInMap("selectValue")
        public String selectValue;

        /**
         * <strong>example:</strong>
         * <p>selectionOperation</p>
         */
        @NameInMap("selectionOperation")
        public String selectionOperation;

        public static ListFlowControlTaskResponseBodyResultMetaSelectionParams build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskResponseBodyResultMetaSelectionParams self = new ListFlowControlTaskResponseBodyResultMetaSelectionParams();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskResponseBodyResultMetaSelectionParams setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public ListFlowControlTaskResponseBodyResultMetaSelectionParams setSelectValue(String selectValue) {
            this.selectValue = selectValue;
            return this;
        }
        public String getSelectValue() {
            return this.selectValue;
        }

        public ListFlowControlTaskResponseBodyResultMetaSelectionParams setSelectionOperation(String selectionOperation) {
            this.selectionOperation = selectionOperation;
            return this;
        }
        public String getSelectionOperation() {
            return this.selectionOperation;
        }

    }

    public static class ListFlowControlTaskResponseBodyResultMetaTarget extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>EXPOSE_PERCENT</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("value")
        public Long value;

        public static ListFlowControlTaskResponseBodyResultMetaTarget build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskResponseBodyResultMetaTarget self = new ListFlowControlTaskResponseBodyResultMetaTarget();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskResponseBodyResultMetaTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowControlTaskResponseBodyResultMetaTarget setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class ListFlowControlTaskResponseBodyResultMeta extends TeaModel {
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1621267200</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>metaType</p>
         */
        @NameInMap("metaType")
        public String metaType;

        /**
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("sceneIds")
        public String sceneIds;

        @NameInMap("selectionParams")
        public java.util.List<ListFlowControlTaskResponseBodyResultMetaSelectionParams> selectionParams;

        /**
         * <strong>example:</strong>
         * <p>1621267200</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("target")
        public ListFlowControlTaskResponseBodyResultMetaTarget target;

        /**
         * <strong>example:</strong>
         * <p>testtaskname</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static ListFlowControlTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskResponseBodyResultMeta self = new ListFlowControlTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskResponseBodyResultMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowControlTaskResponseBodyResultMeta setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListFlowControlTaskResponseBodyResultMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public ListFlowControlTaskResponseBodyResultMeta setSceneIds(String sceneIds) {
            this.sceneIds = sceneIds;
            return this;
        }
        public String getSceneIds() {
            return this.sceneIds;
        }

        public ListFlowControlTaskResponseBodyResultMeta setSelectionParams(java.util.List<ListFlowControlTaskResponseBodyResultMetaSelectionParams> selectionParams) {
            this.selectionParams = selectionParams;
            return this;
        }
        public java.util.List<ListFlowControlTaskResponseBodyResultMetaSelectionParams> getSelectionParams() {
            return this.selectionParams;
        }

        public ListFlowControlTaskResponseBodyResultMeta setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListFlowControlTaskResponseBodyResultMeta setTarget(ListFlowControlTaskResponseBodyResultMetaTarget target) {
            this.target = target;
            return this;
        }
        public ListFlowControlTaskResponseBodyResultMetaTarget getTarget() {
            return this.target;
        }

        public ListFlowControlTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ListFlowControlTaskResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1661506482</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2022-08-06T06:14:01.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-08-06T06:14:01.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("meta")
        public ListFlowControlTaskResponseBodyResultMeta meta;

        /**
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("status")
        public String status;

        public static ListFlowControlTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskResponseBodyResult self = new ListFlowControlTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListFlowControlTaskResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowControlTaskResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowControlTaskResponseBodyResult setMeta(ListFlowControlTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListFlowControlTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ListFlowControlTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
