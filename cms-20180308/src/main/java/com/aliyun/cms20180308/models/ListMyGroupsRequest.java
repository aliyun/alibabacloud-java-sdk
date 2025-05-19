// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListMyGroupsRequest extends TeaModel {
    @NameInMap("BindUrls")
    public String bindUrls;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SelectContactGroups")
    public Boolean selectContactGroups;

    @NameInMap("Type")
    public String type;

    public static ListMyGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupsRequest self = new ListMyGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListMyGroupsRequest setBindUrls(String bindUrls) {
        this.bindUrls = bindUrls;
        return this;
    }
    public String getBindUrls() {
        return this.bindUrls;
    }

    public ListMyGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListMyGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMyGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMyGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMyGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListMyGroupsRequest setSelectContactGroups(Boolean selectContactGroups) {
        this.selectContactGroups = selectContactGroups;
        return this;
    }
    public Boolean getSelectContactGroups() {
        return this.selectContactGroups;
    }

    public ListMyGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
