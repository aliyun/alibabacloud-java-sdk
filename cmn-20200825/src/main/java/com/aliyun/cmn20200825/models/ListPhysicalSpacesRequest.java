// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListPhysicalSpacesRequest extends TeaModel {
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
    public java.util.List<String> physicalSpaceIds;

    // 物理空间名称，支持模糊搜索。
    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    public static ListPhysicalSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhysicalSpacesRequest self = new ListPhysicalSpacesRequest();
        return TeaModel.build(map, self);
    }

    public ListPhysicalSpacesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPhysicalSpacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPhysicalSpacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPhysicalSpacesRequest setPhysicalSpaceIds(java.util.List<String> physicalSpaceIds) {
        this.physicalSpaceIds = physicalSpaceIds;
        return this;
    }
    public java.util.List<String> getPhysicalSpaceIds() {
        return this.physicalSpaceIds;
    }

    public ListPhysicalSpacesRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

}
