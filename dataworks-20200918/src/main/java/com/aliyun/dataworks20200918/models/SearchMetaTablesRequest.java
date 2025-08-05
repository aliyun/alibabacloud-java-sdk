// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SearchMetaTablesRequest extends TeaModel {
    @NameInMap("AppGuid")
    public String appGuid;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("EntityType")
    public Integer entityType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Scope")
    public String scope;

    public static SearchMetaTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMetaTablesRequest self = new SearchMetaTablesRequest();
        return TeaModel.build(map, self);
    }

    public SearchMetaTablesRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public SearchMetaTablesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SearchMetaTablesRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public SearchMetaTablesRequest setEntityType(Integer entityType) {
        this.entityType = entityType;
        return this;
    }
    public Integer getEntityType() {
        return this.entityType;
    }

    public SearchMetaTablesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchMetaTablesRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SearchMetaTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchMetaTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMetaTablesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
