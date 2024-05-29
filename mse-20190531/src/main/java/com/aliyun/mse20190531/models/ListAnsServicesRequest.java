// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServicesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>查询服务下某个集群的实例列表是所需要的参数</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The name of the contact group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether to query the number of instances that are used for the service.</p>
     */
    @NameInMap("HasIpCount")
    public String hasIpCount;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static ListAnsServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnsServicesRequest self = new ListAnsServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListAnsServicesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListAnsServicesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAnsServicesRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListAnsServicesRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListAnsServicesRequest setHasIpCount(String hasIpCount) {
        this.hasIpCount = hasIpCount;
        return this;
    }
    public String getHasIpCount() {
        return this.hasIpCount;
    }

    public ListAnsServicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAnsServicesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListAnsServicesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAnsServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAnsServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAnsServicesRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListAnsServicesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
