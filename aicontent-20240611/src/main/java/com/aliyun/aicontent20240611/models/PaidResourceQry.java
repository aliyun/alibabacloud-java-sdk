// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PaidResourceQry extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("resourceStatus")
    public String resourceStatus;

    public static PaidResourceQry build(java.util.Map<String, ?> map) throws Exception {
        PaidResourceQry self = new PaidResourceQry();
        return TeaModel.build(map, self);
    }

    public PaidResourceQry setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public PaidResourceQry setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public PaidResourceQry setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }
    public String getResourceStatus() {
        return this.resourceStatus;
    }

}
