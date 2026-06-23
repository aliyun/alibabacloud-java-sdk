// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RecognizeIntentionRequest extends TeaModel {
    /**
     * <p>Enable analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("analysis")
    public Boolean analysis;

    /**
     * <p>Business type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>Conversation text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>##客服##：您好，请问是朱杰先生吗？这里是诚信财务的周莉。我们发现您有一项款项昨天是账单日，但您还没还款，这很可能是一个小小的疏忽。来电是提醒您尽快完成还款，避免影响您的信用记录。\n ##客户##：今天天气怎么样呢？</p>
     */
    @NameInMap("conversation")
    public String conversation;

    /**
     * <p>Global intent list. Required when opType is hierarchical.</p>
     */
    @NameInMap("globalIntentionList")
    public java.util.List<RecognizeIntentionRequestGlobalIntentionList> globalIntentionList;

    /**
     * <p>Hierarchical intent list. Required when opType is hierarchical.</p>
     */
    @NameInMap("hierarchicalIntentionList")
    public java.util.List<RecognizeIntentionRequestHierarchicalIntentionList> hierarchicalIntentionList;

    /**
     * <p>Intent library: Local intent library code.</p>
     * 
     * <strong>example:</strong>
     * <p>collection</p>
     */
    @NameInMap("intentionDomainCode")
    public String intentionDomainCode;

    /**
     * <p>Intent list. Required when bizType is not attitude.</p>
     */
    @NameInMap("intentionList")
    public java.util.List<RecognizeIntentionRequestIntentionList> intentionList;

    /**
     * <p>Operation type.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("opType")
    public String opType;

    /**
     * <p>Recommend intent.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recommend")
    public Boolean recommend;

    public static RecognizeIntentionRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIntentionRequest self = new RecognizeIntentionRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeIntentionRequest setAnalysis(Boolean analysis) {
        this.analysis = analysis;
        return this;
    }
    public Boolean getAnalysis() {
        return this.analysis;
    }

    public RecognizeIntentionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public RecognizeIntentionRequest setConversation(String conversation) {
        this.conversation = conversation;
        return this;
    }
    public String getConversation() {
        return this.conversation;
    }

    public RecognizeIntentionRequest setGlobalIntentionList(java.util.List<RecognizeIntentionRequestGlobalIntentionList> globalIntentionList) {
        this.globalIntentionList = globalIntentionList;
        return this;
    }
    public java.util.List<RecognizeIntentionRequestGlobalIntentionList> getGlobalIntentionList() {
        return this.globalIntentionList;
    }

    public RecognizeIntentionRequest setHierarchicalIntentionList(java.util.List<RecognizeIntentionRequestHierarchicalIntentionList> hierarchicalIntentionList) {
        this.hierarchicalIntentionList = hierarchicalIntentionList;
        return this;
    }
    public java.util.List<RecognizeIntentionRequestHierarchicalIntentionList> getHierarchicalIntentionList() {
        return this.hierarchicalIntentionList;
    }

    public RecognizeIntentionRequest setIntentionDomainCode(String intentionDomainCode) {
        this.intentionDomainCode = intentionDomainCode;
        return this;
    }
    public String getIntentionDomainCode() {
        return this.intentionDomainCode;
    }

    public RecognizeIntentionRequest setIntentionList(java.util.List<RecognizeIntentionRequestIntentionList> intentionList) {
        this.intentionList = intentionList;
        return this;
    }
    public java.util.List<RecognizeIntentionRequestIntentionList> getIntentionList() {
        return this.intentionList;
    }

    public RecognizeIntentionRequest setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

    public RecognizeIntentionRequest setRecommend(Boolean recommend) {
        this.recommend = recommend;
        return this;
    }
    public Boolean getRecommend() {
        return this.recommend;
    }

    public static class RecognizeIntentionRequestGlobalIntentionList extends TeaModel {
        /**
         * <p>Intent description.</p>
         * 
         * <strong>example:</strong>
         * <p>正常付款3</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>正常付款3</p>
         */
        @NameInMap("intention")
        public String intention;

        /**
         * <p>Intent code.</p>
         * 
         * <strong>example:</strong>
         * <p>1810566978021232640</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        /**
         * <p>Intent script.</p>
         * 
         * <strong>example:</strong>
         * <p>好的，那先不打扰您了，祝您生活愉快！再见！</p>
         */
        @NameInMap("intentionScript")
        public String intentionScript;

        public static RecognizeIntentionRequestGlobalIntentionList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIntentionRequestGlobalIntentionList self = new RecognizeIntentionRequestGlobalIntentionList();
            return TeaModel.build(map, self);
        }

        public RecognizeIntentionRequestGlobalIntentionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RecognizeIntentionRequestGlobalIntentionList setIntention(String intention) {
            this.intention = intention;
            return this;
        }
        public String getIntention() {
            return this.intention;
        }

        public RecognizeIntentionRequestGlobalIntentionList setIntentionCode(String intentionCode) {
            this.intentionCode = intentionCode;
            return this;
        }
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public RecognizeIntentionRequestGlobalIntentionList setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

    }

    public static class RecognizeIntentionRequestHierarchicalIntentionList extends TeaModel {
        /**
         * <p>Intent description.</p>
         * 
         * <strong>example:</strong>
         * <p>询问股票价格</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>询问股票价格</p>
         */
        @NameInMap("intention")
        public String intention;

        /**
         * <p>Intent code.</p>
         * 
         * <strong>example:</strong>
         * <p>1810929291010150400</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        /**
         * <p>Intent script.</p>
         * 
         * <strong>example:</strong>
         * <p>好的，那先不打扰您了，祝您生活愉快！再见！</p>
         */
        @NameInMap("intentionScript")
        public String intentionScript;

        public static RecognizeIntentionRequestHierarchicalIntentionList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIntentionRequestHierarchicalIntentionList self = new RecognizeIntentionRequestHierarchicalIntentionList();
            return TeaModel.build(map, self);
        }

        public RecognizeIntentionRequestHierarchicalIntentionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RecognizeIntentionRequestHierarchicalIntentionList setIntention(String intention) {
            this.intention = intention;
            return this;
        }
        public String getIntention() {
            return this.intention;
        }

        public RecognizeIntentionRequestHierarchicalIntentionList setIntentionCode(String intentionCode) {
            this.intentionCode = intentionCode;
            return this;
        }
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public RecognizeIntentionRequestHierarchicalIntentionList setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

    }

    public static class RecognizeIntentionRequestIntentionList extends TeaModel {
        /**
         * <p>Intent description.</p>
         * 
         * <strong>example:</strong>
         * <p>客户表示忘记还款</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>客户表示忘记还款</p>
         */
        @NameInMap("intention")
        public String intention;

        /**
         * <p>Intent code.</p>
         * 
         * <strong>example:</strong>
         * <p>1808766224000262144</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        /**
         * <p>Intent script.</p>
         * 
         * <strong>example:</strong>
         * <p>好的，那先不打扰您了，祝您生活愉快！再见！</p>
         */
        @NameInMap("intentionScript")
        public String intentionScript;

        public static RecognizeIntentionRequestIntentionList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIntentionRequestIntentionList self = new RecognizeIntentionRequestIntentionList();
            return TeaModel.build(map, self);
        }

        public RecognizeIntentionRequestIntentionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RecognizeIntentionRequestIntentionList setIntention(String intention) {
            this.intention = intention;
            return this;
        }
        public String getIntention() {
            return this.intention;
        }

        public RecognizeIntentionRequestIntentionList setIntentionCode(String intentionCode) {
            this.intentionCode = intentionCode;
            return this;
        }
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public RecognizeIntentionRequestIntentionList setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

    }

}
