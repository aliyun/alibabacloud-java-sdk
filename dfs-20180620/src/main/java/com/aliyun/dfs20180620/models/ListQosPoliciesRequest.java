// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListQosPoliciesRequest extends TeaModel {
    @NameInMap("FederationId")
    public String federationId;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListQosPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQosPoliciesRequest self = new ListQosPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListQosPoliciesRequest setFederationId(String federationId) {
        this.federationId = federationId;
        return this;
    }
    public String getFederationId() {
        return this.federationId;
    }

    public ListQosPoliciesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListQosPoliciesRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ListQosPoliciesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQosPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
