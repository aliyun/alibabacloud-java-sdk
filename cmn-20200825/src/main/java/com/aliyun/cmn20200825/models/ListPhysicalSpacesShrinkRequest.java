// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListPhysicalSpacesShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PhysicalSpaceIds")
    public String physicalSpaceIdsShrink;

    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    public static ListPhysicalSpacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhysicalSpacesShrinkRequest self = new ListPhysicalSpacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPhysicalSpacesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPhysicalSpacesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPhysicalSpacesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPhysicalSpacesShrinkRequest setPhysicalSpaceIdsShrink(String physicalSpaceIdsShrink) {
        this.physicalSpaceIdsShrink = physicalSpaceIdsShrink;
        return this;
    }
    public String getPhysicalSpaceIdsShrink() {
        return this.physicalSpaceIdsShrink;
    }

    public ListPhysicalSpacesShrinkRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

}
