// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListStackConfigsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to read in this request. Default value: 20. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that marks the position from which to start reading. Leave empty to start from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>s8UVlnE23gZvjCvCwkoZ7Z4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The status of the stack configuration.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Creating</td>
     * <td>Being created.</td>
     * </tr>
     * <tr>
     * <td>Created</td>
     * <td>Created.</td>
     * </tr>
     * <tr>
     * <td>Waiting</td>
     * <td>Waiting for deployment.</td>
     * </tr>
     * <tr>
     * <td>Deploying</td>
     * <td>Being deployed.</td>
     * </tr>
     * <tr>
     * <td>Deployed</td>
     * <td>Deployed.</td>
     * </tr>
     * <tr>
     * <td>Errored</td>
     * <td>Deployment failed.</td>
     * </tr>
     * <tr>
     * <td>Deleting</td>
     * <td>Being deleted.</td>
     * </tr>
     * <tr>
     * <td>Deleted</td>
     * <td>Deleted.</td>
     * </tr>
     * <tr>
     * <td>DeleteFailed</td>
     * <td>Deletion failed.</td>
     * </tr>
     * <tr>
     * <td>DetectTriggered</td>
     * <td>Drift detection triggered.</td>
     * </tr>
     * </tbody></table>
     * 
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The version number of the stack configuration, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
     * 
     * <strong>example:</strong>
     * <p>v4</p>
     */
    @NameInMap("version")
    public String version;

    public static ListStackConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackConfigsRequest self = new ListStackConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListStackConfigsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListStackConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStackConfigsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListStackConfigsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
