// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListDirectionalAddressRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDirectionalAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDirectionalAddressRequest self = new ListDirectionalAddressRequest();
        return TeaModel.build(map, self);
    }

    public ListDirectionalAddressRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListDirectionalAddressRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListDirectionalAddressRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
