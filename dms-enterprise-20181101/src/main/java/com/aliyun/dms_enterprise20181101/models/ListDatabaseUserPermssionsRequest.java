// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDatabaseUserPermssionsRequest extends TeaModel {
    @NameInMap("DbId")
    public String dbId;

    @NameInMap("Logic")
    public Boolean logic;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PermType")
    public String permType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("UserName")
    public String userName;

    public static ListDatabaseUserPermssionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseUserPermssionsRequest self = new ListDatabaseUserPermssionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabaseUserPermssionsRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public ListDatabaseUserPermssionsRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListDatabaseUserPermssionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatabaseUserPermssionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatabaseUserPermssionsRequest setPermType(String permType) {
        this.permType = permType;
        return this;
    }
    public String getPermType() {
        return this.permType;
    }

    public ListDatabaseUserPermssionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDatabaseUserPermssionsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListDatabaseUserPermssionsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
