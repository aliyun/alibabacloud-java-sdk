// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListStacksRequest extends TeaModel {
    /**
     * <p>The keyword used to perform a fuzzy search by stack name.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>21a90f5d-a469-4ac4-a8ea-f6e1e7470e6f</p>
     */
    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The maximum number of results to return. Default value: 100. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. This parameter is empty if no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>LC4NJL3Ru2bIiRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The stack status.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Creating</td>
     * <td>Being created</td>
     * </tr>
     * <tr>
     * <td>Created</td>
     * <td>Creation complete</td>
     * </tr>
     * <tr>
     * <td>Waiting</td>
     * <td>Waiting for deployment</td>
     * </tr>
     * <tr>
     * <td>Deploying</td>
     * <td>Being deployed</td>
     * </tr>
     * <tr>
     * <td>Deployed</td>
     * <td>Deployment complete</td>
     * </tr>
     * <tr>
     * <td>Errored</td>
     * <td>Deployment failed</td>
     * </tr>
     * <tr>
     * <td>Deleting</td>
     * <td>Being deleted</td>
     * </tr>
     * <tr>
     * <td>Deleted</td>
     * <td>Deleted</td>
     * </tr>
     * <tr>
     * <td>DeleteFailed</td>
     * <td>Deletion failed</td>
     * </tr>
     * <tr>
     * <td>DetectTriggered</td>
     * <td>Drift detection triggered</td>
     * </tr>
     * </tbody></table>
     * 
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("status")
    public String status;

    public static ListStacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStacksRequest self = new ListStacksRequest();
        return TeaModel.build(map, self);
    }

    public ListStacksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListStacksRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public ListStacksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListStacksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStacksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStacksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStacksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
