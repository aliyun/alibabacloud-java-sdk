// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetDialogLogResponseBodyData data;

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
     * <p>051EEB18-049A-17FF-A5E0-14A5B127C798</p>
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
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static GetDialogLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDialogLogResponseBody self = new GetDialogLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDialogLogResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetDialogLogResponseBody setData(GetDialogLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDialogLogResponseBodyData getData() {
        return this.data;
    }

    public GetDialogLogResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDialogLogResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDialogLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDialogLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDialogLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDialogLogResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetDialogLogResponseBodyDataHitIntentionList extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("intentionName")
        public String intentionName;

        @NameInMap("intentionScript")
        public String intentionScript;

        public static GetDialogLogResponseBodyDataHitIntentionList build(java.util.Map<String, ?> map) throws Exception {
            GetDialogLogResponseBodyDataHitIntentionList self = new GetDialogLogResponseBodyDataHitIntentionList();
            return TeaModel.build(map, self);
        }

        public GetDialogLogResponseBodyDataHitIntentionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDialogLogResponseBodyDataHitIntentionList setIntentionName(String intentionName) {
            this.intentionName = intentionName;
            return this;
        }
        public String getIntentionName() {
            return this.intentionName;
        }

        public GetDialogLogResponseBodyDataHitIntentionList setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

    }

    public static class GetDialogLogResponseBodyDataIntentionList extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("intentionName")
        public String intentionName;

        @NameInMap("intentionScript")
        public String intentionScript;

        public static GetDialogLogResponseBodyDataIntentionList build(java.util.Map<String, ?> map) throws Exception {
            GetDialogLogResponseBodyDataIntentionList self = new GetDialogLogResponseBodyDataIntentionList();
            return TeaModel.build(map, self);
        }

        public GetDialogLogResponseBodyDataIntentionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDialogLogResponseBodyDataIntentionList setIntentionName(String intentionName) {
            this.intentionName = intentionName;
            return this;
        }
        public String getIntentionName() {
            return this.intentionName;
        }

        public GetDialogLogResponseBodyDataIntentionList setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

    }

    public static class GetDialogLogResponseBodyData extends TeaModel {
        @NameInMap("analysisProcess")
        public String analysisProcess;

        @NameInMap("conversationList")
        public String conversationList;

        @NameInMap("hitIntentionList")
        public java.util.List<GetDialogLogResponseBodyDataHitIntentionList> hitIntentionList;

        @NameInMap("intentionList")
        public java.util.List<GetDialogLogResponseBodyDataIntentionList> intentionList;

        /**
         * <strong>example:</strong>
         * <p>1382</p>
         */
        @NameInMap("modelCostTime")
        public Long modelCostTime;

        @NameInMap("recallList")
        public String recallList;

        public static GetDialogLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDialogLogResponseBodyData self = new GetDialogLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDialogLogResponseBodyData setAnalysisProcess(String analysisProcess) {
            this.analysisProcess = analysisProcess;
            return this;
        }
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        public GetDialogLogResponseBodyData setConversationList(String conversationList) {
            this.conversationList = conversationList;
            return this;
        }
        public String getConversationList() {
            return this.conversationList;
        }

        public GetDialogLogResponseBodyData setHitIntentionList(java.util.List<GetDialogLogResponseBodyDataHitIntentionList> hitIntentionList) {
            this.hitIntentionList = hitIntentionList;
            return this;
        }
        public java.util.List<GetDialogLogResponseBodyDataHitIntentionList> getHitIntentionList() {
            return this.hitIntentionList;
        }

        public GetDialogLogResponseBodyData setIntentionList(java.util.List<GetDialogLogResponseBodyDataIntentionList> intentionList) {
            this.intentionList = intentionList;
            return this;
        }
        public java.util.List<GetDialogLogResponseBodyDataIntentionList> getIntentionList() {
            return this.intentionList;
        }

        public GetDialogLogResponseBodyData setModelCostTime(Long modelCostTime) {
            this.modelCostTime = modelCostTime;
            return this;
        }
        public Long getModelCostTime() {
            return this.modelCostTime;
        }

        public GetDialogLogResponseBodyData setRecallList(String recallList) {
            this.recallList = recallList;
            return this;
        }
        public String getRecallList() {
            return this.recallList;
        }

    }

}
