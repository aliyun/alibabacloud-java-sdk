// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

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
