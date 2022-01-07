// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceByDriverRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryEdgeInstanceDeviceByDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDeviceByDriverRequest self = new QueryEdgeInstanceDeviceByDriverRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDeviceByDriverRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryEdgeInstanceDeviceByDriverRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEdgeInstanceDeviceByDriverRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public QueryEdgeInstanceDeviceByDriverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryEdgeInstanceDeviceByDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEdgeInstanceDeviceByDriverRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
