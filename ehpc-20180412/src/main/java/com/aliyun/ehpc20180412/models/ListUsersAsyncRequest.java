// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUsersAsyncRequest extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     */
    @NameInMap("AsyncId")
    public String asyncId;

    /**
     * <p>The ID of the E-HPC cluster. You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number.\</p>
     * <p>Pages start from page 1.\</p>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.\</p>
     * <p>Valid values: 1 to 50.\</p>
     * <p>Default value: 10.</p>
     */
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
