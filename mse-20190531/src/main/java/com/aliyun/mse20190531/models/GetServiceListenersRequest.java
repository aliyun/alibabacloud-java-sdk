// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListenersRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the MSE instance to which the service belongs.</p>
     * <br>
     * <p>> You must specify InstanceId or ClusterId.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster to which the service belongs.</p>
     * <br>
     * <p>> The cluster is a concept for Nacos services and does not refer to a Microservices Engine (MSE) instance.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The group to which the service belongs.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("HasIpCount")
    public String hasIpCount;

    /**
     * <p>The ID of the instance to which the service belongs.</p>
     * <br>
     * <p>> You must specify InstanceId or ClusterId.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The namespace to which the service belongs.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The name of the service whose listeners you want to query.</p>
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
