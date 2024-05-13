// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupStatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SkillGroupIds")
    public String skillGroupIds;

    public static ListSkillGroupStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupStatesRequest self = new ListSkillGroupStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupStatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSkillGroupStatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillGroupStatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillGroupStatesRequest setSkillGroupIds(String skillGroupIds) {
        this.skillGroupIds = skillGroupIds;
        return this;
    }
    public String getSkillGroupIds() {
        return this.skillGroupIds;
    }

}
