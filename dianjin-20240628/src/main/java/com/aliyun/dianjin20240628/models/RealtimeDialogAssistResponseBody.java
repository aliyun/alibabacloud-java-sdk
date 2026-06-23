// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealtimeDialogAssistResponseBody extends TeaModel {
    /**
     * <p>Time consumed</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>Response data</p>
     */
    @NameInMap("data")
    public RealtimeDialogAssistResponseBodyData data;

    /**
     * <p>Data type</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID. This is the system-recorded request ID. If issues arise, provide this ID to the Model Studio DianJin R\&amp;D team for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>67C7021A-D268-553D-8C15-A087B9604028</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Timestamp</p>
     * 
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
        /**
         * <p>Recommended utterance</p>
         * 
         * <strong>example:</strong>
         * <p>可按照SOP流程回应。</p>
         */
        @NameInMap("assistScript")
        public String assistScript;

        /**
         * <p>Intent encoding</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1920005488515465216&quot;</p>
         */
        @NameInMap("intentCode")
        public String intentCode;

        /**
         * <p>Intent labels</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("intentLabels")
        public String intentLabels;

        /**
         * <p>Intent name</p>
         * 
         * <strong>example:</strong>
         * <p>礼貌问答</p>
         */
        @NameInMap("intentName")
        public String intentName;

        /**
         * <p>Whether intent escaped</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
         * <p>Recommended flow</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("assistSop")
        public String assistSop;

        /**
         * <p>Intent encoding</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("intentCode")
        public String intentCode;

        /**
         * <p>Intent name</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("intentName")
        public String intentName;

        /**
         * <p>Indicates whether the intent is to escape.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Specific content of the dialog</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Unique identity of the dialog role</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;98457834685635&quot;</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <p>Customer service ID</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1374683645635&quot;</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <p>Agent type. 0: Robot, 1: Human.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;0&quot;</p>
         */
        @NameInMap("customerServiceType")
        public String customerServiceType;

        /**
         * <p>Role. 0 indicates customer, 1 indicates agent.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;0&quot;</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>Type of dialog content</p>
         * 
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
        /**
         * <p>Analysis process</p>
         * 
         * <strong>example:</strong>
         * <p>客户回答的内容与提供的意图列表描述均不匹配，没有表达出对账单、还款、天气或其他服务的具体需求或问题。</p>
         */
        @NameInMap("analysisProcess")
        public String analysisProcess;

        /**
         * <p>List of dialog assist results</p>
         */
        @NameInMap("assistScripts")
        public java.util.List<RealtimeDialogAssistResponseBodyDataAssistScripts> assistScripts;

        /**
         * <p>List of flow assist results</p>
         */
        @NameInMap("assistSop")
        public java.util.List<RealtimeDialogAssistResponseBodyDataAssistSop> assistSop;

        /**
         * <p>Current dialog content</p>
         */
        @NameInMap("conversationModel")
        public java.util.List<RealtimeDialogAssistResponseBodyDataConversationModel> conversationModel;

        /**
         * <p>Whether interrupted</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("interrupt")
        public Boolean interrupt;

        /**
         * <p>Unique request ID. This request ID matches the request ID in the input parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>Session ID</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1915593248420413441&quot;</p>
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
