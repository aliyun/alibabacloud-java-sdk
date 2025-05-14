// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealtimeDialogAssistRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("analysis")
    public Boolean analysis;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dialogAssist</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conversationModel")
    public java.util.List<RealtimeDialogAssistRequestConversationModel> conversationModel;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("dialogMemoryTurns")
    public Integer dialogMemoryTurns;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hangUpDialog")
    public Boolean hangUpDialog;

    /**
     * <p>metaData</p>
     */
    @NameInMap("metaData")
    public java.util.Map<String, ?> metaData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0FC6636E-380A-5369-AE01-D1C15BB9B254</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1915593248420413441</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

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

    public RealtimeDialogAssistRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class RealtimeDialogAssistRequestConversationModel extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public Integer role;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static RealtimeDialogAssistRequestConversationModel build(java.util.Map<String, ?> map) throws Exception {
            RealtimeDialogAssistRequestConversationModel self = new RealtimeDialogAssistRequestConversationModel();
            return TeaModel.build(map, self);
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
