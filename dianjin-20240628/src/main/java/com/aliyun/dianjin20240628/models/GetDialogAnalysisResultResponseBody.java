// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogAnalysisResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetDialogAnalysisResultResponseBodyData data;

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
     * <p>88A006F0-B565-53BA-B38A-DBDF9D0B2935</p>
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

    public static GetDialogAnalysisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDialogAnalysisResultResponseBody self = new GetDialogAnalysisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDialogAnalysisResultResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetDialogAnalysisResultResponseBody setData(GetDialogAnalysisResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDialogAnalysisResultResponseBodyData getData() {
        return this.data;
    }

    public GetDialogAnalysisResultResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDialogAnalysisResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDialogAnalysisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDialogAnalysisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDialogAnalysisResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDialogAnalysisResultResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels extends TeaModel {
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("value")
        public String value;

        public static GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels build(java.util.Map<String, ?> map) throws Exception {
            GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels self = new GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels();
            return TeaModel.build(map, self);
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp extends TeaModel {
        @NameInMap("dialogExecPlan")
        public String dialogExecPlan;

        @NameInMap("dialogLabels")
        public java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> dialogLabels;

        @NameInMap("dialogSummary")
        public String dialogSummary;

        public static GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp build(java.util.Map<String, ?> map) throws Exception {
            GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp self = new GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp();
            return TeaModel.build(map, self);
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogExecPlan(String dialogExecPlan) {
            this.dialogExecPlan = dialogExecPlan;
            return this;
        }
        public String getDialogExecPlan() {
            return this.dialogExecPlan;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogLabels(java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> dialogLabels) {
            this.dialogLabels = dialogLabels;
            return this;
        }
        public java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisRespDialogLabels> getDialogLabels() {
            return this.dialogLabels;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp setDialogSummary(String dialogSummary) {
            this.dialogSummary = dialogSummary;
            return this;
        }
        public String getDialogSummary() {
            return this.dialogSummary;
        }

    }

    public static class GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList extends TeaModel {
        @NameInMap("analysisResp")
        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp analysisResp;

        /**
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx.oss-cn-beijing.aliyuncs.com/dialog-analysis/2024-12-30/2/1826661605606129665">https://xxx.oss-cn-beijing.aliyuncs.com/dialog-analysis/2024-12-30/2/1826661605606129665</a></p>
         */
        @NameInMap("ossUrl")
        public String ossUrl;

        /**
         * <strong>example:</strong>
         * <p>183764873624</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        public static GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList build(java.util.Map<String, ?> map) throws Exception {
            GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList self = new GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList();
            return TeaModel.build(map, self);
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setAnalysisResp(GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp analysisResp) {
            this.analysisResp = analysisResp;
            return this;
        }
        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespListAnalysisResp getAnalysisResp() {
            return this.analysisResp;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDialogAnalysisResultResponseBodyData extends TeaModel {
        @NameInMap("dialogAnalysisRespList")
        public java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList> dialogAnalysisRespList;

        public static GetDialogAnalysisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDialogAnalysisResultResponseBodyData self = new GetDialogAnalysisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDialogAnalysisResultResponseBodyData setDialogAnalysisRespList(java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList> dialogAnalysisRespList) {
            this.dialogAnalysisRespList = dialogAnalysisRespList;
            return this;
        }
        public java.util.List<GetDialogAnalysisResultResponseBodyDataDialogAnalysisRespList> getDialogAnalysisRespList() {
            return this.dialogAnalysisRespList;
        }

    }

}
