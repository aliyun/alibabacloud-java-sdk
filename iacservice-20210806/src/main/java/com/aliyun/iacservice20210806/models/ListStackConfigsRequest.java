// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListStackConfigsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>s8UVlnE23gZvjCvCwkoZ7Z4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("status")
    public String status;

    /**
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
