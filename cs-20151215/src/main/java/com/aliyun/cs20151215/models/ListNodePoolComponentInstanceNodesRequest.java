// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentInstanceNodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("config_revision")
    public String configRevision;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou.10.91.xx.xx&quot;]</p>
     */
    @NameInMap("node_names")
    public java.util.List<String> nodeNames;

    /**
     * <strong>example:</strong>
     * <p>1.28.9-aliyun.1</p>
     */
    @NameInMap("version")
    public String version;

    public static ListNodePoolComponentInstanceNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentInstanceNodesRequest self = new ListNodePoolComponentInstanceNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentInstanceNodesRequest setConfigRevision(String configRevision) {
        this.configRevision = configRevision;
        return this;
    }
    public String getConfigRevision() {
        return this.configRevision;
    }

    public ListNodePoolComponentInstanceNodesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodePoolComponentInstanceNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodePoolComponentInstanceNodesRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public ListNodePoolComponentInstanceNodesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
