// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedDatabasesForUserRequest extends TeaModel {
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
     * <p>false</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

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

    public static ListAuthorizedDatabasesForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedDatabasesForUserRequest self = new ListAuthorizedDatabasesForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedDatabasesForUserRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ListAuthorizedDatabasesForUserRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListAuthorizedDatabasesForUserRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListAuthorizedDatabasesForUserRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedDatabasesForUserRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedDatabasesForUserRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListAuthorizedDatabasesForUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListAuthorizedDatabasesForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
