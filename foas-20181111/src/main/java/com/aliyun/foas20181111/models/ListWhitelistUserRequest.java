// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListWhitelistUserRequest extends TeaModel {
    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("state")
    public Integer state;

    @NameInMap("userId")
    public String userId;

    public static ListWhitelistUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWhitelistUserRequest self = new ListWhitelistUserRequest();
        return TeaModel.build(map, self);
    }

    public ListWhitelistUserRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListWhitelistUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWhitelistUserRequest setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

    public ListWhitelistUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
