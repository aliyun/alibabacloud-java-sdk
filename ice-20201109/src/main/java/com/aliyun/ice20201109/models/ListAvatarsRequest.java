// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarsRequest extends TeaModel {
    @NameInMap("AvatarType")
    public String avatarType;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAvatarsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarsRequest self = new ListAvatarsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvatarsRequest setAvatarType(String avatarType) {
        this.avatarType = avatarType;
        return this;
    }
    public String getAvatarType() {
        return this.avatarType;
    }

    public ListAvatarsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAvatarsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
