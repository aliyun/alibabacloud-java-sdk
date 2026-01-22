// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealTimeDialogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("analysis")
    public Boolean analysis;

    /**
     * <strong>example:</strong>
     * <p>mixIntentChat</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conversationModel")
    public java.util.List<RealTimeDialogRequestConversationModel> conversationModel;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("dialogMemoryTurns")
    public Integer dialogMemoryTurns;

    @NameInMap("metaData")
    public java.util.Map<String, ?> metaData;

    /**
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("opType")
    public String opType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recommend")
    public Boolean recommend;

    @NameInMap("scriptContentPlayed")
    public String scriptContentPlayed;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>237645726354</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("userVad")
    public Boolean userVad;

    public static RealTimeDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        RealTimeDialogRequest self = new RealTimeDialogRequest();
        return TeaModel.build(map, self);
    }

    public RealTimeDialogRequest setAnalysis(Boolean analysis) {
        this.analysis = analysis;
        return this;
    }
    public Boolean getAnalysis() {
        return this.analysis;
    }

    public RealTimeDialogRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public RealTimeDialogRequest setConversationModel(java.util.List<RealTimeDialogRequestConversationModel> conversationModel) {
        this.conversationModel = conversationModel;
        return this;
    }
    public java.util.List<RealTimeDialogRequestConversationModel> getConversationModel() {
        return this.conversationModel;
    }

    public RealTimeDialogRequest setDialogMemoryTurns(Integer dialogMemoryTurns) {
        this.dialogMemoryTurns = dialogMemoryTurns;
        return this;
    }
    public Integer getDialogMemoryTurns() {
        return this.dialogMemoryTurns;
    }

    public RealTimeDialogRequest setMetaData(java.util.Map<String, ?> metaData) {
        this.metaData = metaData;
        return this;
    }
    public java.util.Map<String, ?> getMetaData() {
        return this.metaData;
    }

    public RealTimeDialogRequest setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

    public RealTimeDialogRequest setRecommend(Boolean recommend) {
        this.recommend = recommend;
        return this;
    }
    public Boolean getRecommend() {
        return this.recommend;
    }

    public RealTimeDialogRequest setScriptContentPlayed(String scriptContentPlayed) {
        this.scriptContentPlayed = scriptContentPlayed;
        return this;
    }
    public String getScriptContentPlayed() {
        return this.scriptContentPlayed;
    }

    public RealTimeDialogRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RealTimeDialogRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public RealTimeDialogRequest setUserVad(Boolean userVad) {
        this.userVad = userVad;
        return this;
    }
    public Boolean getUserVad() {
        return this.userVad;
    }

    public static class RealTimeDialogRequestConversationModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("begin")
        public Integer begin;

        /**
         * <strong>example:</strong>
         * <p>2024-11-08 09:51:16</p>
         */
        @NameInMap("beginTime")
        public String beginTime;

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
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <strong>example:</strong>
         * <p>1983746378992743</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public Integer role;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("type")
        public String type;

        public static RealTimeDialogRequestConversationModel build(java.util.Map<String, ?> map) throws Exception {
            RealTimeDialogRequestConversationModel self = new RealTimeDialogRequestConversationModel();
            return TeaModel.build(map, self);
        }

        public RealTimeDialogRequestConversationModel setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public RealTimeDialogRequestConversationModel setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public RealTimeDialogRequestConversationModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RealTimeDialogRequestConversationModel setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public RealTimeDialogRequestConversationModel setCustomerServiceId(String customerServiceId) {
            this.customerServiceId = customerServiceId;
            return this;
        }
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        public RealTimeDialogRequestConversationModel setCustomerServiceType(String customerServiceType) {
            this.customerServiceType = customerServiceType;
            return this;
        }
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        public RealTimeDialogRequestConversationModel setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public RealTimeDialogRequestConversationModel setIntentionCode(String intentionCode) {
            this.intentionCode = intentionCode;
            return this;
        }
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public RealTimeDialogRequestConversationModel setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public RealTimeDialogRequestConversationModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
