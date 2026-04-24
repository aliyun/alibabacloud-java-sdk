// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusVirtualInstancesRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Optional cloud product</p>
     * 
     * <strong>example:</strong>
     * <p>ack-csi-fuse</p>
     */
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("tenantId")
    public String tenantId;

    public static ListPrometheusVirtualInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusVirtualInstancesRequest self = new ListPrometheusVirtualInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusVirtualInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrometheusVirtualInstancesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListPrometheusVirtualInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrometheusVirtualInstancesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
