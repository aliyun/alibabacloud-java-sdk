// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QuerySkillGroupsRequest extends TeaModel {
    @NameInMap("ChannelType")
    public Integer channelType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DepartmentId")
    public Long departmentId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QuerySkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySkillGroupsRequest self = new QuerySkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySkillGroupsRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public QuerySkillGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public QuerySkillGroupsRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public QuerySkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySkillGroupsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySkillGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
