// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBriefSkillGroupsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchPattern")
    public String searchPattern;

    public static ListBriefSkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBriefSkillGroupsRequest self = new ListBriefSkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListBriefSkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListBriefSkillGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBriefSkillGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBriefSkillGroupsRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

}
