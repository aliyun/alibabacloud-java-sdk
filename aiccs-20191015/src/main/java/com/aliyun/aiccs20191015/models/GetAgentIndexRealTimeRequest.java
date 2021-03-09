// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentIndexRealTimeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepIds")
    public java.util.List<Integer> depIds;

    @NameInMap("GroupIds")
    public java.util.List<Integer> groupIds;

    public static GetAgentIndexRealTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentIndexRealTimeRequest self = new GetAgentIndexRealTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentIndexRealTimeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAgentIndexRealTimeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAgentIndexRealTimeRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAgentIndexRealTimeRequest setDepIds(java.util.List<Integer> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Integer> getDepIds() {
        return this.depIds;
    }

    public GetAgentIndexRealTimeRequest setGroupIds(java.util.List<Integer> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Integer> getGroupIds() {
        return this.groupIds;
    }

}
