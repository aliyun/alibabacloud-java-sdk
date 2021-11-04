// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseRequest extends TeaModel {
    @NameInMap("DbType")
    public String dbType;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SearchRange")
    public String searchRange;

    @NameInMap("SearchTarget")
    public String searchTarget;

    @NameInMap("Tid")
    public Long tid;

    public static SearchDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDatabaseRequest self = new SearchDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public SearchDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public SearchDatabaseRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public SearchDatabaseRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchDatabaseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchDatabaseRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SearchDatabaseRequest setSearchRange(String searchRange) {
        this.searchRange = searchRange;
        return this;
    }
    public String getSearchRange() {
        return this.searchRange;
    }

    public SearchDatabaseRequest setSearchTarget(String searchTarget) {
        this.searchTarget = searchTarget;
        return this;
    }
    public String getSearchTarget() {
        return this.searchTarget;
    }

    public SearchDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
