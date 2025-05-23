// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterInspectReportsRequest extends TeaModel {
    /**
     * <p>The maximum number of returned results. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AK8uQQrxgFKsI3OiS5TbhUQ9R3kPme4I3</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListClusterInspectReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInspectReportsRequest self = new ListClusterInspectReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterInspectReportsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListClusterInspectReportsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
