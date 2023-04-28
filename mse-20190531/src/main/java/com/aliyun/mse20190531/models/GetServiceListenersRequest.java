// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListenersRequest extends TeaModel {
    /**
     * <p>system error</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("HasIpCount")
    public String hasIpCount;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>systemError</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static GetServiceListenersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListenersRequest self = new GetServiceListenersRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceListenersRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetServiceListenersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetServiceListenersRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetServiceListenersRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GetServiceListenersRequest setHasIpCount(String hasIpCount) {
        this.hasIpCount = hasIpCount;
        return this;
    }
    public String getHasIpCount() {
        return this.hasIpCount;
    }

    public GetServiceListenersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetServiceListenersRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public GetServiceListenersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetServiceListenersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetServiceListenersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceListenersRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public GetServiceListenersRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
