// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServiceClustersRequest extends TeaModel {
    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>illegalRequest</p>
     */
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
