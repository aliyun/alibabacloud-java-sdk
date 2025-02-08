// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
    /**
     * <p>The type of the data source. Valid values: ODPS, emr, mysql, holo, analyticdb_for_mysql, oracle, postgresql, sqlserver, clickhouse, and starrocks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps
     * emr
     * mysql
     * holo</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>Pagination information, which specifies the starting point of this read.</p>
     * 
     * <strong>example:</strong>
     * <p>12222</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries displayed on each page. The default value is 10 and the maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTablesRequest self = new ListTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTablesRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListTablesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
