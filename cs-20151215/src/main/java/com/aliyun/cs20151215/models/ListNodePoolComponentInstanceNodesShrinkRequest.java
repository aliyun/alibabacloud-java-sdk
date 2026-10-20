// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListNodePoolComponentInstanceNodesShrinkRequest extends TeaModel {
    /**
     * <p>Filters nodes by the specified configuration version number of the node component.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("config_revision")
    public String configRevision;

    /**
     * <p>The maximum number of records to return in a single response for pagination. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("max_results")
    public Integer maxResults;

    /**
     * <p>The pagination cursor. Do not specify this parameter for the first request. For subsequent requests, specify the token returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>5c0a1c0f91c14c6****</p>
     */
    @NameInMap("next_token")
    public String nextToken;

    /**
     * <p>Specifies the list of node names to query.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou.10.91.xx.xx&quot;]</p>
     */
    @NameInMap("node_names")
    public String nodeNamesShrink;

    /**
     * <p>Filters nodes by the specified node component version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.28.9-aliyun.1</p>
     */
    @NameInMap("version")
    public String version;

    public static ListNodePoolComponentInstanceNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodePoolComponentInstanceNodesShrinkRequest self = new ListNodePoolComponentInstanceNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodePoolComponentInstanceNodesShrinkRequest setConfigRevision(String configRevision) {
        this.configRevision = configRevision;
        return this;
    }
    public String getConfigRevision() {
        return this.configRevision;
    }

    public ListNodePoolComponentInstanceNodesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodePoolComponentInstanceNodesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodePoolComponentInstanceNodesShrinkRequest setNodeNamesShrink(String nodeNamesShrink) {
        this.nodeNamesShrink = nodeNamesShrink;
        return this;
    }
    public String getNodeNamesShrink() {
        return this.nodeNamesShrink;
    }

    public ListNodePoolComponentInstanceNodesShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
