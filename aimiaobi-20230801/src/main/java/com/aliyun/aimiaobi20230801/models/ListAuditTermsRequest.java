// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAuditTermsRequest extends TeaModel {
    /**
     * <p>Maximum number of records to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>XXXX</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Dictionary name. Optional. Defaults to Default if not specified.</p>
     */
    @NameInMap("TermsName")
    public String termsName;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. Get your <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAuditTermsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuditTermsRequest self = new ListAuditTermsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuditTermsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuditTermsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuditTermsRequest setTermsName(String termsName) {
        this.termsName = termsName;
        return this;
    }
    public String getTermsName() {
        return this.termsName;
    }

    public ListAuditTermsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
