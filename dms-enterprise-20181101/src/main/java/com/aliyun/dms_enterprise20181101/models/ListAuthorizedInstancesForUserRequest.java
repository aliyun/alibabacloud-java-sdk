// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedInstancesForUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("EnvType")
    public String envType;

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
     * <p>policy_test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListAuthorizedInstancesForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedInstancesForUserRequest self = new ListAuthorizedInstancesForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedInstancesForUserRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ListAuthorizedInstancesForUserRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListAuthorizedInstancesForUserRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedInstancesForUserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedInstancesForUserRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListAuthorizedInstancesForUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListAuthorizedInstancesForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
