// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DomainKnowledgeRetrieveResponseBody extends TeaModel {
    /**
     * <p>La liste des résultats récupérés.</p>
     */
    @NameInMap("Data")
    public java.util.List<DomainKnowledgeRetrieveResponseBodyData> data;

    /**
     * <p>L\&quot;identifiant de la requête.</p>
     * 
     * <strong>example:</strong>
     * <p>019FABCB-6C7D-18FE-AA42-922BFC9555D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DomainKnowledgeRetrieveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DomainKnowledgeRetrieveResponseBody self = new DomainKnowledgeRetrieveResponseBody();
        return TeaModel.build(map, self);
    }

    public DomainKnowledgeRetrieveResponseBody setData(java.util.List<DomainKnowledgeRetrieveResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DomainKnowledgeRetrieveResponseBodyData> getData() {
        return this.data;
    }

    public DomainKnowledgeRetrieveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DomainKnowledgeRetrieveResponseBodyData extends TeaModel {
        /**
         * <p>Le score du texte récupéré ; plus le score est élevé, plus le résultat est pertinent.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>La source des résultats récupérés.</p>
         * 
         * <strong>example:</strong>
         * <p>Base de connaissances de l\&quot;activité nationale</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Le texte récupéré.</p>
         * 
         * <strong>example:</strong>
         * <p>Sur le site national d\&quot;Alibaba Cloud, le renouvellement de nom de domaine peut être effectué via les méthodes suivantes</p>
         */
        @NameInMap("Text")
        public String text;

        public static DomainKnowledgeRetrieveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DomainKnowledgeRetrieveResponseBodyData self = new DomainKnowledgeRetrieveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DomainKnowledgeRetrieveResponseBodyData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public DomainKnowledgeRetrieveResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DomainKnowledgeRetrieveResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
