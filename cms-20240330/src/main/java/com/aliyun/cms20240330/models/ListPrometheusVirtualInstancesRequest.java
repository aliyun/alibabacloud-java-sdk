// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusVirtualInstancesRequest extends TeaModel {
    /**
     * <p>The maximum number of instances to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The optional cloud services.</p>
     * 
     * <strong>example:</strong>
     * <p>ack-csi-fuse</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The next token for the paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4e5f60718293a4b5c6d7e****8f9a0b1c2d3e4f508f9a0b1c2d3e4f508f9a0b1c2d3e4f50</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
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
