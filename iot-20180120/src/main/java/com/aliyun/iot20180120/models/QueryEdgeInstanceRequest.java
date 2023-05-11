// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceRequest extends TeaModel {
    /**
     * <p>The name of the edge instance.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Maximum value: 30. Default value: 10. If you specify a value smaller than 1, the system uses 10.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The error code. Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see [Error codes](~~135200~~).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page from which the results are displayed. The minimum value is 1. If you specify a value smaller than 1, the system uses 1.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceRequest self = new QueryEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEdgeInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryEdgeInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
