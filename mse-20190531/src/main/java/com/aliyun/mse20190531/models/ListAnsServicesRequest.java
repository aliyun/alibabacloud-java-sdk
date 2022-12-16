// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServicesRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the cluster.
    // 
    // > This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.
    @NameInMap("ClusterId")
    public String clusterId;

    // The name of the contact group.
    @NameInMap("GroupName")
    public String groupName;

    // Specifies whether to query the number of instances that are used for the service.
    @NameInMap("HasIpCount")
    public String hasIpCount;

    // The ID of the instance.
    // 
    // > This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.
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

    // The extended request parameter in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    // The name of the service.
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
