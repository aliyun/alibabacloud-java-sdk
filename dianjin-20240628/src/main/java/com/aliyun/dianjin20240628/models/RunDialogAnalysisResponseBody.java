// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunDialogAnalysisResponseBody extends TeaModel {
    /**
     * <p>The time consumed, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public RunDialogAnalysisResponseBodyData data;

    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>02CD4454-3F2C-57D0-9060-68DEAA1F6993</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static RunDialogAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDialogAnalysisResponseBody self = new RunDialogAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDialogAnalysisResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public RunDialogAnalysisResponseBody setData(RunDialogAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunDialogAnalysisResponseBodyData getData() {
        return this.data;
    }

    public RunDialogAnalysisResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public RunDialogAnalysisResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public RunDialogAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunDialogAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunDialogAnalysisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RunDialogAnalysisResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels extends TeaModel {
        /**
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>二级标签</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>协商还款</p>
         */
        @NameInMap("value")
        public String value;

        public static RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels build(java.util.Map<String, ?> map) throws Exception {
            RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels self = new RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels();
            return TeaModel.build(map, self);
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp extends TeaModel {
        /**
         * <p>The session execution plan.</p>
         * 
         * <strong>example:</strong>
         * <ol>
         * <li>核实客户账户信息，确认还款情况。\\n2. 若未收到还款，联系财务部门确认是否到账延迟。\\n3. 若已还款，更新客户记录并致歉。\\n4. 跟进客户，确保问题解决。</li>
         * </ol>
         */
        @NameInMap("dialogExecPlan")
        public String dialogExecPlan;

        /**
         * <p>The list of session labels.</p>
         */
        @NameInMap("dialogLabels")
        public java.util.List<RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> dialogLabels;

        /**
         * <p>The session open analysis.</p>
         */
        @NameInMap("dialogOpenAnalysis")
        public java.util.Map<String, ?> dialogOpenAnalysis;

        /**
         * <p>The session process analysis.</p>
         */
        @NameInMap("dialogProcessAnalysis")
        public java.util.Map<String, ?> dialogProcessAnalysis;

        /**
         * <p>The session SOP.</p>
         * 
         * <strong>example:</strong>
         * <p>营销</p>
         */
        @NameInMap("dialogSop")
        public String dialogSop;

        /**
         * <p>The session summary.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>是否有资金需求：否\\n- 是否有意向：否，客户认为自己已经解决，对当前状态表示不解\\n- 是否可营销：否，对话中未表现出对营销信息的兴趣或接受度\\n- 待满足需求：客户希望在三天内解决问题</li>
         * </ul>
         */
        @NameInMap("dialogSummary")
        public String dialogSummary;

        public static RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp build(java.util.Map<String, ?> map) throws Exception {
            RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp self = new RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp();
            return TeaModel.build(map, self);
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogExecPlan(String dialogExecPlan) {
            this.dialogExecPlan = dialogExecPlan;
            return this;
        }
        public String getDialogExecPlan() {
            return this.dialogExecPlan;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogLabels(java.util.List<RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> dialogLabels) {
            this.dialogLabels = dialogLabels;
            return this;
        }
        public java.util.List<RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> getDialogLabels() {
            return this.dialogLabels;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogOpenAnalysis(java.util.Map<String, ?> dialogOpenAnalysis) {
            this.dialogOpenAnalysis = dialogOpenAnalysis;
            return this;
        }
        public java.util.Map<String, ?> getDialogOpenAnalysis() {
            return this.dialogOpenAnalysis;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogProcessAnalysis(java.util.Map<String, ?> dialogProcessAnalysis) {
            this.dialogProcessAnalysis = dialogProcessAnalysis;
            return this;
        }
        public java.util.Map<String, ?> getDialogProcessAnalysis() {
            return this.dialogProcessAnalysis;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogSop(String dialogSop) {
            this.dialogSop = dialogSop;
            return this;
        }
        public String getDialogSop() {
            return this.dialogSop;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogSummary(String dialogSummary) {
            this.dialogSummary = dialogSummary;
            return this;
        }
        public String getDialogSummary() {
            return this.dialogSummary;
        }

    }

    public static class RunDialogAnalysisResponseBodyDataDialogAnalysisRespList extends TeaModel {
        /**
         * <p>The result of the session analysis.</p>
         */
        @NameInMap("analysisResp")
        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp analysisResp;

        /**
         * <p>The list of failed nodes.</p>
         */
        @NameInMap("failNode")
        public java.util.List<String> failNode;

        /**
         * <p>The time when the session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1759457905S001vejpvd6vej</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The execution status of the session analysis task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("status")
        public String status;

        public static RunDialogAnalysisResponseBodyDataDialogAnalysisRespList build(java.util.Map<String, ?> map) throws Exception {
            RunDialogAnalysisResponseBodyDataDialogAnalysisRespList self = new RunDialogAnalysisResponseBodyDataDialogAnalysisRespList();
            return TeaModel.build(map, self);
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespList setAnalysisResp(RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp analysisResp) {
            this.analysisResp = analysisResp;
            return this;
        }
        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp getAnalysisResp() {
            return this.analysisResp;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespList setFailNode(java.util.List<String> failNode) {
            this.failNode = failNode;
            return this;
        }
        public java.util.List<String> getFailNode() {
            return this.failNode;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class RunDialogAnalysisResponseBodyData extends TeaModel {
        /**
         * <p>The list of session analysis results.</p>
         */
        @NameInMap("dialogAnalysisRespList")
        public java.util.List<RunDialogAnalysisResponseBodyDataDialogAnalysisRespList> dialogAnalysisRespList;

        public static RunDialogAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunDialogAnalysisResponseBodyData self = new RunDialogAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunDialogAnalysisResponseBodyData setDialogAnalysisRespList(java.util.List<RunDialogAnalysisResponseBodyDataDialogAnalysisRespList> dialogAnalysisRespList) {
            this.dialogAnalysisRespList = dialogAnalysisRespList;
            return this;
        }
        public java.util.List<RunDialogAnalysisResponseBodyDataDialogAnalysisRespList> getDialogAnalysisRespList() {
            return this.dialogAnalysisRespList;
        }

    }

}
