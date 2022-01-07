// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceChannelRequest extends TeaModel {
    @NameInMap("ChannelName")
    public String channelName;

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

    public static QueryEdgeInstanceChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceChannelRequest self = new QueryEdgeInstanceChannelRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public QueryEdgeInstanceChannelRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEdgeInstanceChannelRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public QueryEdgeInstanceChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryEdgeInstanceChannelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEdgeInstanceChannelRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
