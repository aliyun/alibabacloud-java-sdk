// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListenersRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the MSE instance to which the service belongs.
    // 
    // > You must specify InstanceId or ClusterId.
    @NameInMap("ClusterId")
    public String clusterId;

    // The name of the cluster to which the service belongs.
    // 
    // > The cluster is a concept for Nacos services and does not refer to a Microservices Engine (MSE) instance.
    @NameInMap("ClusterName")
    public String clusterName;

    // The group to which the service belongs.
    @NameInMap("GroupName")
    public String groupName;

    // A reserved parameter.
    @NameInMap("HasIpCount")
    public String hasIpCount;

    // The ID of the instance to which the service belongs.
    // 
    // > You must specify InstanceId or ClusterId.
    @NameInMap("InstanceId")
    public String instanceId;

    // The namespace to which the service belongs.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The number of the page to return.
    @NameInMap("PageNum")
    public Integer pageNum;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID.
    @NameInMap("RegionId")
    public String regionId;

    // The extended request parameters in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    // The name of the service whose listeners you want to query.
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
