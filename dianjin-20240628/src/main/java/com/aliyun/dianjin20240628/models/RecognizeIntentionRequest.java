// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RecognizeIntentionRequest extends TeaModel {
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
     * <p>common</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conversation")
    public String conversation;

    @NameInMap("globalIntentionList")
    public java.util.List<RecognizeIntentionRequestGlobalIntentionList> globalIntentionList;

    @NameInMap("hierarchicalIntentionList")
    public java.util.List<RecognizeIntentionRequestHierarchicalIntentionList> hierarchicalIntentionList;

    @NameInMap("intentionDomainCode")
    public String intentionDomainCode;

    @NameInMap("intentionList")
    public java.util.List<RecognizeIntentionRequestIntentionList> intentionList;

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
        @NameInMap("description")
        public String description;

        @NameInMap("intention")
        public String intention;

        /**
         * <strong>example:</strong>
         * <p>1810566978021232640</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

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
        @NameInMap("description")
        public String description;

        @NameInMap("intention")
        public String intention;

        /**
         * <strong>example:</strong>
         * <p>1810929291010150400</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

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
        @NameInMap("description")
        public String description;

        @NameInMap("intention")
        public String intention;

        /**
         * <strong>example:</strong>
         * <p>1808766224000262144</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

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
