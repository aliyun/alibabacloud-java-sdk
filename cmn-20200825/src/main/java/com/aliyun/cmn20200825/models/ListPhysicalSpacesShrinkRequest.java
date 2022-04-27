// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListPhysicalSpacesShrinkRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 物理空间ID
    @NameInMap("PhysicalSpaceIds")
    public String physicalSpaceIdsShrink;

    // 物理空间名称，支持模糊搜索。
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
