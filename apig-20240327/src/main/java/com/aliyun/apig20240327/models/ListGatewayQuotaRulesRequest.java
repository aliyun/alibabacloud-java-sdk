// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayQuotaRulesRequest extends TeaModel {
    /**
     * <p>The keyword in the rule name used for fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>daily</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries to return in a single call. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>C4tM8BlBJwHSNyjWpGaci4/7dKNGp1JMgsKtvCagmtY=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The status of the rule. Valid values: enabled and disabled. If you do not specify this parameter, all rules are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ruleStatus")
    public String ruleStatus;

    /**
     * <p>The keyword in the name of the associated subject for fuzzy matching based on the consumer or consumer group name.</p>
     * 
     * <strong>example:</strong>
     * <p>alpha</p>
     */
    @NameInMap("subjectNameLike")
    public String subjectNameLike;

    public static ListGatewayQuotaRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayQuotaRulesRequest self = new ListGatewayQuotaRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayQuotaRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListGatewayQuotaRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGatewayQuotaRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGatewayQuotaRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayQuotaRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewayQuotaRulesRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    public ListGatewayQuotaRulesRequest setSubjectNameLike(String subjectNameLike) {
        this.subjectNameLike = subjectNameLike;
        return this;
    }
    public String getSubjectNameLike() {
        return this.subjectNameLike;
    }

}
