// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSpaceRequest extends TeaModel {
    @NameInMap("EmasWorkspaceId")
    public String emasWorkspaceId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SpaceIds")
    public java.util.List<String> spaceIds;

    public static ListSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSpaceRequest self = new ListSpaceRequest();
        return TeaModel.build(map, self);
    }

    public ListSpaceRequest setEmasWorkspaceId(String emasWorkspaceId) {
        this.emasWorkspaceId = emasWorkspaceId;
        return this;
    }
    public String getEmasWorkspaceId() {
        return this.emasWorkspaceId;
    }

    public ListSpaceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListSpaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSpaceRequest setSpaceIds(java.util.List<String> spaceIds) {
        this.spaceIds = spaceIds;
        return this;
    }
    public java.util.List<String> getSpaceIds() {
        return this.spaceIds;
    }

}
