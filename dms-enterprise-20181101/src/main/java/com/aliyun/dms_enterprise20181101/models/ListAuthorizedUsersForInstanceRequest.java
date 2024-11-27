// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersForInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>poc_test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <strong>example:</strong>
     * <p>3****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListAuthorizedUsersForInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersForInstanceRequest self = new ListAuthorizedUsersForInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersForInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAuthorizedUsersForInstanceRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedUsersForInstanceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedUsersForInstanceRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListAuthorizedUsersForInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
