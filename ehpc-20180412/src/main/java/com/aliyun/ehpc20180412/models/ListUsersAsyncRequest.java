// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUsersAsyncRequest extends TeaModel {
    @NameInMap("AsyncId")
    public String asyncId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListUsersAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersAsyncRequest self = new ListUsersAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersAsyncRequest setAsyncId(String asyncId) {
        this.asyncId = asyncId;
        return this;
    }
    public String getAsyncId() {
        return this.asyncId;
    }

    public ListUsersAsyncRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListUsersAsyncRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersAsyncRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
