// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCopyrightPersonListRequest extends TeaModel {
    @NameInMap("RoleType")
    public Integer roleType;

    @NameInMap("OwnerType")
    public Integer ownerType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Keyword")
    public String keyword;

    public static GetCopyrightPersonListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCopyrightPersonListRequest self = new GetCopyrightPersonListRequest();
        return TeaModel.build(map, self);
    }

    public GetCopyrightPersonListRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public GetCopyrightPersonListRequest setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public Integer getOwnerType() {
        return this.ownerType;
    }

    public GetCopyrightPersonListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetCopyrightPersonListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCopyrightPersonListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
