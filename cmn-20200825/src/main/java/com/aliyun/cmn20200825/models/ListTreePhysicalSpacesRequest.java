// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListTreePhysicalSpacesRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public String maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 物理空间ID
    @NameInMap("PhysicalSpaceIds")
    public java.util.List<String> physicalSpaceIds;

    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    // 如果Tree为true时，分页失效
    @NameInMap("Tree")
    public Boolean tree;

    public static ListTreePhysicalSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTreePhysicalSpacesRequest self = new ListTreePhysicalSpacesRequest();
        return TeaModel.build(map, self);
    }

    public ListTreePhysicalSpacesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTreePhysicalSpacesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListTreePhysicalSpacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTreePhysicalSpacesRequest setPhysicalSpaceIds(java.util.List<String> physicalSpaceIds) {
        this.physicalSpaceIds = physicalSpaceIds;
        return this;
    }
    public java.util.List<String> getPhysicalSpaceIds() {
        return this.physicalSpaceIds;
    }

    public ListTreePhysicalSpacesRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public ListTreePhysicalSpacesRequest setTree(Boolean tree) {
        this.tree = tree;
        return this;
    }
    public Boolean getTree() {
        return this.tree;
    }

}
