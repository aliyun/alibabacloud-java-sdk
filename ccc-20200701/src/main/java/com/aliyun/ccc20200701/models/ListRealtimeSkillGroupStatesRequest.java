// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeSkillGroupStatesRequest extends TeaModel {
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListRealtimeSkillGroupStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeSkillGroupStatesRequest self = new ListRealtimeSkillGroupStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListRealtimeSkillGroupStatesRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public ListRealtimeSkillGroupStatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRealtimeSkillGroupStatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRealtimeSkillGroupStatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
