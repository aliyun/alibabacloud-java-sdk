// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryEdgeInstanceDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDeviceRequest self = new QueryEdgeInstanceDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDeviceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEdgeInstanceDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryEdgeInstanceDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEdgeInstanceDeviceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
