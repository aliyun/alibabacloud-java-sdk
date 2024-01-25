// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDataSourceListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceType")
    public Integer dataSourceType;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetDataSourceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceListRequest self = new GetDataSourceListRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDataSourceListRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public GetDataSourceListRequest setDataSourceType(Integer dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public Integer getDataSourceType() {
        return this.dataSourceType;
    }

    public GetDataSourceListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetDataSourceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
