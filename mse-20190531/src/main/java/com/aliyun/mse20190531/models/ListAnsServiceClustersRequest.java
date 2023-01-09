// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServiceClustersRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the MSE cluster.
    // 
    // > The MSE cluster is different from the cluster of the Nacos service.
    @NameInMap("ClusterId")
    public String clusterId;

    // The alias of the cluster.
    @NameInMap("ClusterName")
    public String clusterName;

    // The name of the group.
    @NameInMap("GroupName")
    public String groupName;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the namespace.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The number of the page to return.
    @NameInMap("PageNum")
    public Integer pageNum;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The extended request parameters in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    // The name of the service.
    @NameInMap("ServiceName")
    public String serviceName;

    public static ListAnsServiceClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnsServiceClustersRequest self = new ListAnsServiceClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListAnsServiceClustersRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListAnsServiceClustersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAnsServiceClustersRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListAnsServiceClustersRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListAnsServiceClustersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAnsServiceClustersRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListAnsServiceClustersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAnsServiceClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAnsServiceClustersRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListAnsServiceClustersRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
