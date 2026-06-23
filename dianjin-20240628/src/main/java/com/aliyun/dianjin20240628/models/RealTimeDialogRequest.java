// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealTimeDialogRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("analysis")
    public Boolean analysis;

    /**
     * <p>The business type. The default value is mixIntentChat.</p>
     * 
     * <strong>example:</strong>
     * <p>mixIntentChat</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>The list of conversations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("conversationModel")
    public java.util.List<RealTimeDialogRequestConversationModel> conversationModel;

    /**
     * <p>The number of historical conversation turns to include.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("dialogMemoryTurns")
    public Integer dialogMemoryTurns;

    /**
     * <p>The metadata used to encapsulate prompts.</p>
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
     * <p>The operation type. Only common and hierarchical are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("opType")
    public String opType;

    /**
     * <p>The recommended intent.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recommend")
    public Boolean recommend;

    /**
     * <p>The part of the previous script from the customer service representative that has been played.</p>
     * 
     * <strong>example:</strong>
     * <p>你好，我是</p>
     */
    @NameInMap("scriptContentPlayed")
    public String scriptContentPlayed;

    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>237645726354</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to return the response in a stream.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>Specifies whether the user interrupted the conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
         * <p>The start time of the sentence, in milliseconds, relative to the start of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("begin")
        public Integer begin;

        /**
         * <p>The start time of this sentence.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-08 09:51:16</p>
         */
        @NameInMap("beginTime")
        public String beginTime;

        /**
         * <p>The specific content of the conversation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>人工客服</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The unique ID of the conversation role. This parameter is <strong>required</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>98457834685635</p>
         */
        @NameInMap("customerId")
        public String customerId;

        /**
         * <p>The ID of the customer service representative. This parameter is <strong>required</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1374683645635</p>
         */
        @NameInMap("customerServiceId")
        public String customerServiceId;

        /**
         * <p>The type of the customer service representative. 0: bot, 1: human.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("customerServiceType")
        public String customerServiceType;

        /**
         * <p>The end time of the sentence, in milliseconds, relative to the start of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>The intent code.</p>
         * 
         * <strong>example:</strong>
         * <p>198379874354</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        /**
         * <p>The role. 0 indicates the customer, and 1 indicates the customer service representative.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("role")
        public Integer role;

        /**
         * <p>The type of the conversation content. Valid values: text, audio, and image.</p>
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
