// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchGetExpressionFieldsRequest extends TeaModel {
    /**
     * <p>The regular expressions.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Expressions")
    public java.util.List<BatchGetExpressionFieldsRequestExpressions> expressions;

    /**
     * <p>The WAF rule category.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static BatchGetExpressionFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetExpressionFieldsRequest self = new BatchGetExpressionFieldsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetExpressionFieldsRequest setExpressions(java.util.List<BatchGetExpressionFieldsRequestExpressions> expressions) {
        this.expressions = expressions;
        return this;
    }
    public java.util.List<BatchGetExpressionFieldsRequestExpressions> getExpressions() {
        return this.expressions;
    }

    public BatchGetExpressionFieldsRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public BatchGetExpressionFieldsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class BatchGetExpressionFieldsRequestExpressions extends TeaModel {
        /**
         * <p>The content of the regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>ip.src eq 1.1.1.1</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The ID of the regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        public static BatchGetExpressionFieldsRequestExpressions build(java.util.Map<String, ?> map) throws Exception {
            BatchGetExpressionFieldsRequestExpressions self = new BatchGetExpressionFieldsRequestExpressions();
            return TeaModel.build(map, self);
        }

        public BatchGetExpressionFieldsRequestExpressions setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public BatchGetExpressionFieldsRequestExpressions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
