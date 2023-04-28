// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryInstancesInfoRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>systemError</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>system error</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static QueryInstancesInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstancesInfoRequest self = new QueryInstancesInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstancesInfoRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryInstancesInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryInstancesInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryInstancesInfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryInstancesInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryInstancesInfoRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
