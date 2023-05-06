// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppGroupAdaptorRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupUid")
    public String groupUid;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Type")
    public Integer type;

    public static ListAppGroupAdaptorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupAdaptorRequest self = new ListAppGroupAdaptorRequest();
        return TeaModel.build(map, self);
    }

    public ListAppGroupAdaptorRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListAppGroupAdaptorRequest setGroupUid(String groupUid) {
        this.groupUid = groupUid;
        return this;
    }
    public String getGroupUid() {
        return this.groupUid;
    }

    public ListAppGroupAdaptorRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupAdaptorRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupAdaptorRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
