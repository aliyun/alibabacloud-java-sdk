// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealtimeDialogAssistResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public RealtimeDialogAssistResponseBodyData data;

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
     * <p>67C7021A-D268-553D-8C15-A087B9604028</p>
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

    public static RealtimeDialogAssistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RealtimeDialogAssistResponseBody self = new RealtimeDialogAssistResponseBody();
        return TeaModel.build(map, self);
    }

    public RealtimeDialogAssistResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public RealtimeDialogAssistResponseBody setData(RealtimeDialogAssistResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RealtimeDialogAssistResponseBodyData getData() {
        return this.data;
    }

    public RealtimeDialogAssistResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public RealtimeDialogAssistResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public RealtimeDialogAssistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RealtimeDialogAssistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RealtimeDialogAssistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RealtimeDialogAssistResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class RealtimeDialogAssistResponseBodyDataAssistScripts extends TeaModel {
        @NameInMap("assistScript")
        public String assistScript;

        /**
         * <strong>example:</strong>
         * <p>1920005488515465216</p>
         */
        @NameInMap("intentCode")
        public String intentCode;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("intentLabels")
        public String intentLabels;

        @NameInMap("intentName")
        public String intentName;

        @NameInMap("isDefault")
        public Boolean isDefault;

        public static RealtimeDialogAssistResponseBodyDataAssistScripts build(java.util.Map<String, ?> map) throws Exception {
            RealtimeDialogAssistResponseBodyDataAssistScripts self = new RealtimeDialogAssistResponseBodyDataAssistScripts();
            return TeaModel.build(map, self);
        }

        public RealtimeDialogAssistResponseBodyDataAssistScripts setAssistScript(String assistScript) {
            this.assistScript = assistScript;
            return this;
        }
        public String getAssistScript() {
            return this.assistScript;
        }

        public RealtimeDialogAssistResponseBodyDataAssistScripts setIntentCode(String intentCode) {
            this.intentCode = intentCode;
            return this;
        }
        public String getIntentCode() {
            return this.intentCode;
        }

        public RealtimeDialogAssistResponseBodyDataAssistScripts setIntentLabels(String intentLabels) {
            this.intentLabels = intentLabels;
            return this;
        }
        public String getIntentLabels() {
            return this.intentLabels;
        }

        public RealtimeDialogAssistResponseBodyDataAssistScripts setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public RealtimeDialogAssistResponseBodyDataAssistScripts setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

    public static class RealtimeDialogAssistResponseBodyDataAssistSop extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("assistSop")
        public String assistSop;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("intentCode")
        public String intentCode;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("intentName")
        public String intentName;

        @NameInMap("isDefault")
        public Boolean isDefault;

        public static RealtimeDialogAssistResponseBodyDataAssistSop build(java.util.Map<String, ?> map) throws Exception {
            RealtimeDialogAssistResponseBodyDataAssistSop self = new RealtimeDialogAssistResponseBodyDataAssistSop();
            return TeaModel.build(map, self);
        }

        public RealtimeDialogAssistResponseBodyDataAssistSop setAssistSop(String assistSop) {
            this.assistSop = assistSop;
            return this;
        }
        public String getAssistSop() {
            return this.assistSop;
        }

        public RealtimeDialogAssistResponseBodyDataAssistSop setIntentCode(String intentCode) {
            this.intentCode = intentCode;
            return this;
        }
        public String getIntentCode() {
            return this.intentCode;
        }

        public RealtimeDialogAssistResponseBodyDataAssistSop setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public RealtimeDialogAssistResponseBodyDataAssistSop setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

    public static class RealtimeDialogAssistResponseBodyDataConversationModel extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>98457834685635</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <strong>example:</strong>
         * <p>1374683645635</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("customerServiceType")
        public String customerServiceType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static RealtimeDialogAssistResponseBodyDataConversationModel build(java.util.Map<String, ?> map) throws Exception {
            RealtimeDialogAssistResponseBodyDataConversationModel self = new RealtimeDialogAssistResponseBodyDataConversationModel();
            return TeaModel.build(map, self);
        }

        public RealtimeDialogAssistResponseBodyDataConversationModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RealtimeDialogAssistResponseBodyDataConversationModel setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public RealtimeDialogAssistResponseBodyDataConversationModel setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public RealtimeDialogAssistResponseBodyDataConversationModel setCustomerServiceType(String customerServiceType) {
            this.customerServiceType = customerServiceType;
            return this;
        }
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        public RealtimeDialogAssistResponseBodyDataConversationModel setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public RealtimeDialogAssistResponseBodyDataConversationModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RealtimeDialogAssistResponseBodyData extends TeaModel {
        @NameInMap("analysisProcess")
        public String analysisProcess;

        @NameInMap("assistScripts")
        public java.util.List<RealtimeDialogAssistResponseBodyDataAssistScripts> assistScripts;

        @NameInMap("assistSop")
        public java.util.List<RealtimeDialogAssistResponseBodyDataAssistSop> assistSop;

        @NameInMap("conversationModel")
        public java.util.List<RealtimeDialogAssistResponseBodyDataConversationModel> conversationModel;

        @NameInMap("interrupt")
        public Boolean interrupt;

        /**
         * <strong>example:</strong>
         * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>1915593248420413441</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static RealtimeDialogAssistResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RealtimeDialogAssistResponseBodyData self = new RealtimeDialogAssistResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RealtimeDialogAssistResponseBodyData setAnalysisProcess(String analysisProcess) {
            this.analysisProcess = analysisProcess;
            return this;
        }
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        public RealtimeDialogAssistResponseBodyData setAssistScripts(java.util.List<RealtimeDialogAssistResponseBodyDataAssistScripts> assistScripts) {
            this.assistScripts = assistScripts;
            return this;
        }
        public java.util.List<RealtimeDialogAssistResponseBodyDataAssistScripts> getAssistScripts() {
            return this.assistScripts;
        }

        public RealtimeDialogAssistResponseBodyData setAssistSop(java.util.List<RealtimeDialogAssistResponseBodyDataAssistSop> assistSop) {
            this.assistSop = assistSop;
            return this;
        }
        public java.util.List<RealtimeDialogAssistResponseBodyDataAssistSop> getAssistSop() {
            return this.assistSop;
        }

        public RealtimeDialogAssistResponseBodyData setConversationModel(java.util.List<RealtimeDialogAssistResponseBodyDataConversationModel> conversationModel) {
            this.conversationModel = conversationModel;
            return this;
        }
        public java.util.List<RealtimeDialogAssistResponseBodyDataConversationModel> getConversationModel() {
            return this.conversationModel;
        }

        public RealtimeDialogAssistResponseBodyData setInterrupt(Boolean interrupt) {
            this.interrupt = interrupt;
            return this;
        }
        public Boolean getInterrupt() {
            return this.interrupt;
        }

        public RealtimeDialogAssistResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RealtimeDialogAssistResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
