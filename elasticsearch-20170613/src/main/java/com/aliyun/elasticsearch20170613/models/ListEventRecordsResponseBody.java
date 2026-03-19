// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListEventRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7F40EAA1-6F1D-4DD9-8DB8-C5F00C4E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListEventRecordsResponseBodyResult result;

    public static ListEventRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventRecordsResponseBody self = new ListEventRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventRecordsResponseBody setResult(ListEventRecordsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListEventRecordsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListEventRecordsResponseBodyResultResultShowContentActionSuggest extends TeaModel {
        @NameInMap("suggestActions")
        public java.util.List<String> suggestActions;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("suggestText")
        public String suggestText;

        /**
         * <strong>example:</strong>
         * <p>promptText</p>
         */
        @NameInMap("suggestType")
        public String suggestType;

        public static ListEventRecordsResponseBodyResultResultShowContentActionSuggest build(java.util.Map<String, ?> map) throws Exception {
            ListEventRecordsResponseBodyResultResultShowContentActionSuggest self = new ListEventRecordsResponseBodyResultResultShowContentActionSuggest();
            return TeaModel.build(map, self);
        }

        public ListEventRecordsResponseBodyResultResultShowContentActionSuggest setSuggestActions(java.util.List<String> suggestActions) {
            this.suggestActions = suggestActions;
            return this;
        }
        public java.util.List<String> getSuggestActions() {
            return this.suggestActions;
        }

        public ListEventRecordsResponseBodyResultResultShowContentActionSuggest setSuggestText(String suggestText) {
            this.suggestText = suggestText;
            return this;
        }
        public String getSuggestText() {
            return this.suggestText;
        }

        public ListEventRecordsResponseBodyResultResultShowContentActionSuggest setSuggestType(String suggestType) {
            this.suggestType = suggestType;
            return this;
        }
        public String getSuggestType() {
            return this.suggestType;
        }

    }

    public static class ListEventRecordsResponseBodyResultResultShowContent extends TeaModel {
        @NameInMap("actionSuggest")
        public ListEventRecordsResponseBodyResultResultShowContentActionSuggest actionSuggest;

        /**
         * <strong>example:</strong>
         * <p>Instance.SpecModify</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>Executed</p>
         */
        @NameInMap("eventStatus")
        public String eventStatus;

        /**
         * <strong>example:</strong>
         * <p>2025-05-08 18:31:01</p>
         */
        @NameInMap("eventTime")
        public String eventTime;

        /**
         * <strong>example:</strong>
         * <p>2025-05-08 18:41:01</p>
         */
        @NameInMap("executeFinishTime")
        public String executeFinishTime;

        /**
         * <strong>example:</strong>
         * <p>2025-05-08 18:31:00</p>
         */
        @NameInMap("executeStartTime")
        public String executeStartTime;

        /**
         * <strong>example:</strong>
         * <p>es-cn-a5cb2dece****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>f183728022a1c769e97b4*****</p>
         */
        @NameInMap("opsChangeId")
        public String opsChangeId;

        public static ListEventRecordsResponseBodyResultResultShowContent build(java.util.Map<String, ?> map) throws Exception {
            ListEventRecordsResponseBodyResultResultShowContent self = new ListEventRecordsResponseBodyResultResultShowContent();
            return TeaModel.build(map, self);
        }

        public ListEventRecordsResponseBodyResultResultShowContent setActionSuggest(ListEventRecordsResponseBodyResultResultShowContentActionSuggest actionSuggest) {
            this.actionSuggest = actionSuggest;
            return this;
        }
        public ListEventRecordsResponseBodyResultResultShowContentActionSuggest getActionSuggest() {
            return this.actionSuggest;
        }

        public ListEventRecordsResponseBodyResultResultShowContent setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListEventRecordsResponseBodyResultResultShowContent setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public ListEventRecordsResponseBodyResultResultShowContent setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public ListEventRecordsResponseBodyResultResultShowContent setExecuteFinishTime(String executeFinishTime) {
            this.executeFinishTime = executeFinishTime;
            return this;
        }
        public String getExecuteFinishTime() {
            return this.executeFinishTime;
        }

        public ListEventRecordsResponseBodyResultResultShowContent setExecuteStartTime(String executeStartTime) {
            this.executeStartTime = executeStartTime;
            return this;
        }
        public String getExecuteStartTime() {
            return this.executeStartTime;
        }

        public ListEventRecordsResponseBodyResultResultShowContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEventRecordsResponseBodyResultResultShowContent setOpsChangeId(String opsChangeId) {
            this.opsChangeId = opsChangeId;
            return this;
        }
        public String getOpsChangeId() {
            return this.opsChangeId;
        }

    }

    public static class ListEventRecordsResponseBodyResultResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoAlarm")
        public Boolean autoAlarm;

        /**
         * <strong>example:</strong>
         * <p>Instance.SpecModify</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <strong>example:</strong>
         * <p>Info</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("mustOps")
        public Boolean mustOps;

        /**
         * <strong>example:</strong>
         * <p>elasticsearch</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>2025-05-08 18:41:01</p>
         */
        @NameInMap("scheduleExecuteTime")
        public String scheduleExecuteTime;

        /**
         * <strong>example:</strong>
         * <p>2025-05-08 18:41:01</p>
         */
        @NameInMap("scheduleFinishTime")
        public String scheduleFinishTime;

        @NameInMap("showContent")
        public ListEventRecordsResponseBodyResultResultShowContent showContent;

        /**
         * <strong>example:</strong>
         * <p>webConsole</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>Executed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>UserOperator</p>
         */
        @NameInMap("type")
        public String type;

        public static ListEventRecordsResponseBodyResultResult build(java.util.Map<String, ?> map) throws Exception {
            ListEventRecordsResponseBodyResultResult self = new ListEventRecordsResponseBodyResultResult();
            return TeaModel.build(map, self);
        }

        public ListEventRecordsResponseBodyResultResult setAutoAlarm(Boolean autoAlarm) {
            this.autoAlarm = autoAlarm;
            return this;
        }
        public Boolean getAutoAlarm() {
            return this.autoAlarm;
        }

        public ListEventRecordsResponseBodyResultResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEventRecordsResponseBodyResultResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListEventRecordsResponseBodyResultResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListEventRecordsResponseBodyResultResult setMustOps(Boolean mustOps) {
            this.mustOps = mustOps;
            return this;
        }
        public Boolean getMustOps() {
            return this.mustOps;
        }

        public ListEventRecordsResponseBodyResultResult setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListEventRecordsResponseBodyResultResult setScheduleExecuteTime(String scheduleExecuteTime) {
            this.scheduleExecuteTime = scheduleExecuteTime;
            return this;
        }
        public String getScheduleExecuteTime() {
            return this.scheduleExecuteTime;
        }

        public ListEventRecordsResponseBodyResultResult setScheduleFinishTime(String scheduleFinishTime) {
            this.scheduleFinishTime = scheduleFinishTime;
            return this;
        }
        public String getScheduleFinishTime() {
            return this.scheduleFinishTime;
        }

        public ListEventRecordsResponseBodyResultResult setShowContent(ListEventRecordsResponseBodyResultResultShowContent showContent) {
            this.showContent = showContent;
            return this;
        }
        public ListEventRecordsResponseBodyResultResultShowContent getShowContent() {
            return this.showContent;
        }

        public ListEventRecordsResponseBodyResultResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListEventRecordsResponseBodyResultResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEventRecordsResponseBodyResultResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListEventRecordsResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public java.util.List<ListEventRecordsResponseBodyResultResult> result;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("total")
        public String total;

        public static ListEventRecordsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListEventRecordsResponseBodyResult self = new ListEventRecordsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListEventRecordsResponseBodyResult setResult(java.util.List<ListEventRecordsResponseBodyResultResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListEventRecordsResponseBodyResultResult> getResult() {
            return this.result;
        }

        public ListEventRecordsResponseBodyResult setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
