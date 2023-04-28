// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterInfoRequest extends TeaModel {
    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("AclSwitch")
    public Boolean aclSwitch;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static QueryClusterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterInfoRequest self = new QueryClusterInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterInfoRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryClusterInfoRequest setAclSwitch(Boolean aclSwitch) {
        this.aclSwitch = aclSwitch;
        return this;
    }
    public Boolean getAclSwitch() {
        return this.aclSwitch;
    }

    public QueryClusterInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryClusterInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryClusterInfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryClusterInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryClusterInfoRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
