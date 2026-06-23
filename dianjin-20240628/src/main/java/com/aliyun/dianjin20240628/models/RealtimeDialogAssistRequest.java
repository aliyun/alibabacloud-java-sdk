// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealtimeDialogAssistRequest extends TeaModel {
    /**
     * <p>Whether to analyze</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("analysis")
    public Boolean analysis;

    /**
     * <p>Business type. Currently, only dialogAssist is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dialogAssist</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>Dialog list</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("conversationModel")
    public java.util.List<RealtimeDialogAssistRequestConversationModel> conversationModel;

    /**
     * <p>Number of historical dialog turns included</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("dialogMemoryTurns")
    public Integer dialogMemoryTurns;

    /**
     * <p>Hang up the session</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hangUpDialog")
    public Boolean hangUpDialog;

    /**
     * <p>metaData</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;phoneTailNumber&quot;: &quot;机主尾号：98X1&quot;,
     *       &quot;preScreeningQuota&quot;: &quot;预审额度：3万&quot;,
     *       &quot;generalInterest&quot;: &quot;平台一般利息：20.4%&quot;
     *     }</p>
     */
    @NameInMap("metaData")
    public java.util.Map<String, ?> metaData;

    /**
     * <p>Request ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Portion of the previous agent utterance already broadcast</p>
     * 
     * <strong>example:</strong>
     * <p>你好</p>
     */
    @NameInMap("scriptContentPlayed")
    public String scriptContentPlayed;

    /**
     * <p>Session ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1915593248420413441</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Whether the user interrupted</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("userVad")
    public Boolean userVad;

    public static RealtimeDialogAssistRequest build(java.util.Map<String, ?> map) throws Exception {
        RealtimeDialogAssistRequest self = new RealtimeDialogAssistRequest();
        return TeaModel.build(map, self);
    }

    public RealtimeDialogAssistRequest setAnalysis(Boolean analysis) {
        this.analysis = analysis;
        return this;
    }
    public Boolean getAnalysis() {
        return this.analysis;
    }

    public RealtimeDialogAssistRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public RealtimeDialogAssistRequest setConversationModel(java.util.List<RealtimeDialogAssistRequestConversationModel> conversationModel) {
        this.conversationModel = conversationModel;
        return this;
    }
    public java.util.List<RealtimeDialogAssistRequestConversationModel> getConversationModel() {
        return this.conversationModel;
    }

    public RealtimeDialogAssistRequest setDialogMemoryTurns(Integer dialogMemoryTurns) {
        this.dialogMemoryTurns = dialogMemoryTurns;
        return this;
    }
    public Integer getDialogMemoryTurns() {
        return this.dialogMemoryTurns;
    }

    public RealtimeDialogAssistRequest setHangUpDialog(Boolean hangUpDialog) {
        this.hangUpDialog = hangUpDialog;
        return this;
    }
    public Boolean getHangUpDialog() {
        return this.hangUpDialog;
    }

    public RealtimeDialogAssistRequest setMetaData(java.util.Map<String, ?> metaData) {
        this.metaData = metaData;
        return this;
    }
    public java.util.Map<String, ?> getMetaData() {
        return this.metaData;
    }

    public RealtimeDialogAssistRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RealtimeDialogAssistRequest setScriptContentPlayed(String scriptContentPlayed) {
        this.scriptContentPlayed = scriptContentPlayed;
        return this;
    }
    public String getScriptContentPlayed() {
        return this.scriptContentPlayed;
    }

    public RealtimeDialogAssistRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RealtimeDialogAssistRequest setUserVad(Boolean userVad) {
        this.userVad = userVad;
        return this;
    }
    public Boolean getUserVad() {
        return this.userVad;
    }

    public static class RealtimeDialogAssistRequestConversationModel extends TeaModel {
        /**
         * <p>Start time of this utterance, offset in milliseconds from the session start.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("begin")
        public Integer begin;

        /**
         * <p>Start time of this utterance</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-12 09:00:00</p>
         */
        @NameInMap("beginTime")
        public String beginTime;

        /**
         * <p>Specific content of the dialog</p>
         * <p>This parameter is required.</p>
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
         * <p>98457834685635</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <p>Customer service ID</p>
         * 
         * <strong>example:</strong>
         * <p>1374683645635</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <p>Agent type. 0: Robot, 1: Human.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("customerServiceType")
        public String customerServiceType;

        /**
         * <p>End time of this utterance, offset in milliseconds from the session start.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>Role. 0 indicates customer, 1 indicates agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public Integer role;

        /**
         * <p>Type of dialog content. Currently, only text is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static RealtimeDialogAssistRequestConversationModel build(java.util.Map<String, ?> map) throws Exception {
            RealtimeDialogAssistRequestConversationModel self = new RealtimeDialogAssistRequestConversationModel();
            return TeaModel.build(map, self);
        }

        public RealtimeDialogAssistRequestConversationModel setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public RealtimeDialogAssistRequestConversationModel setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public RealtimeDialogAssistRequestConversationModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RealtimeDialogAssistRequestConversationModel setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public RealtimeDialogAssistRequestConversationModel setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public RealtimeDialogAssistRequestConversationModel setCustomerServiceType(String customerServiceType) {
            this.customerServiceType = customerServiceType;
            return this;
        }
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        public RealtimeDialogAssistRequestConversationModel setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public RealtimeDialogAssistRequestConversationModel setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public RealtimeDialogAssistRequestConversationModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
