// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListTreePhysicalSpacesShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PhysicalSpaceIds")
    public String physicalSpaceIdsShrink;

    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    @NameInMap("Tree")
    public Boolean tree;

    public static ListTreePhysicalSpacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTreePhysicalSpacesShrinkRequest self = new ListTreePhysicalSpacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTreePhysicalSpacesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTreePhysicalSpacesShrinkRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListTreePhysicalSpacesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTreePhysicalSpacesShrinkRequest setPhysicalSpaceIdsShrink(String physicalSpaceIdsShrink) {
        this.physicalSpaceIdsShrink = physicalSpaceIdsShrink;
        return this;
    }
    public String getPhysicalSpaceIdsShrink() {
        return this.physicalSpaceIdsShrink;
    }

    public ListTreePhysicalSpacesShrinkRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public ListTreePhysicalSpacesShrinkRequest setTree(Boolean tree) {
        this.tree = tree;
        return this;
    }
    public Boolean getTree() {
        return this.tree;
    }

}
