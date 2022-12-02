// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConfigurationVariateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("VariateName")
    public String variateName;

    public static ListConfigurationVariateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigurationVariateRequest self = new ListConfigurationVariateRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigurationVariateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConfigurationVariateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConfigurationVariateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConfigurationVariateRequest setVariateName(String variateName) {
        this.variateName = variateName;
        return this;
    }
    public String getVariateName() {
        return this.variateName;
    }

}
