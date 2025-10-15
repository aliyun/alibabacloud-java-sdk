// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunDialogAnalysisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public RunDialogAnalysisResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>02CD4454-3F2C-57D0-9060-68DEAA1F6993</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
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
        @NameInMap("name")
        public String name;

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
        @NameInMap("dialogExecPlan")
        public String dialogExecPlan;

        @NameInMap("dialogLabels")
        public java.util.List<RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> dialogLabels;

        @NameInMap("dialogOpenAnalysis")
        public java.util.Map<String, ?> dialogOpenAnalysis;

        @NameInMap("dialogProcessAnalysis")
        public java.util.Map<String, ?> dialogProcessAnalysis;

        @NameInMap("dialogSop")
        public String dialogSop;

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
        @NameInMap("analysisResp")
        public RunDialogAnalysisResponseBodyDataDialogAnalysisRespListAnalysisResp analysisResp;

        @NameInMap("failNode")
        public java.util.List<String> failNode;

        /**
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1759457905S001vejpvd6vej</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
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
