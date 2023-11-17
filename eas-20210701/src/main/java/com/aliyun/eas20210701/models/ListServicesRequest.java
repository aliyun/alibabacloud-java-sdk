// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>{</p>
     * <p>  "RequestId": "40325405-579C-4D82-9624-EC2B1779848E",</p>
     * <p>  "Services": [</p>
     * <p>    {</p>
     * <p>      "ServiceId": "200516454695942578",</p>
     * <p>      "ServiceName": "vipserver",</p>
     * <p>      "ParentUid": "1628454689805075",</p>
     * <p>      "CallerUid": "eas",</p>
     * <p>      "CurrentVersion": 1,</p>
     * <p>      "Cpu": 1,</p>
     * <p>      "Gpu": 0,</p>
     * <p>      "Memory": 900,</p>
     * <p>      "Image": "registry.cn-zhangjiakou.aliyuncs.com/eas/ndisearch_v1_inner_zhangbei:v0.0.3-20200302145109",</p>
     * <p>      "Resource": "seccontent_inner_2080ti_5",</p>
     * <p>      "Namespace": "vipserver",</p>
     * <p>      "CreateTime": "2019-10-25T10:37:53Z",</p>
     * <p>      "UpdateTime": "2019-10-30T16:50:59Z",</p>
     * <p>      "TotalInstance": 1,</p>
     * <p>      "RunningInstance": 1,</p>
     * <p>      "PendingInstance": 0,</p>
     * <p>      "LatestVersion": 1,</p>
     * <p>      "Status": "Running",</p>
     * <p>      "Reason": "RUNNING",</p>
     * <p>      "Message": "Service is now scaling",</p>
     * <p>      "AccessToken": "",</p>
     * <p>      "Weight": 0</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>      "ServiceId": 97097,</p>
     * <p>      "ServiceName": "a1",</p>
     * <p>      "CallerUid": "eas",</p>
     * <p>      "CurrentVersion": 1,</p>
     * <p>      "Cpu": 1,</p>
     * <p>      "Gpu": 0,</p>
     * <p>      "Memory": 900,</p>
     * <p>      "Image": "registry.cn-hangzhou.aliyuncs.com/eas/pi_imemb_tb:v0.0.1-20191023130701",</p>
     * <p>      "Resource": "seccontent_inner_b",</p>
     * <p>      "Namespace": "a1",</p>
     * <p>      "CreateTime": "2020-05-26T18:03:11Z",</p>
     * <p>      "UpdateTime": "2020-05-26T18:03:11Z",</p>
     * <p>      "TotalInstance": 1,</p>
     * <p>      "RunningInstance": 0,</p>
     * <p>      "PendingInstance": 1,</p>
     * <p>      "LatestVersion": 1,</p>
     * <p>      "Status": "Failed",</p>
     * <p>      "Reason": "FAILED",</p>
     * <p>      "Message": "the server could not find the requested resource (post services.meta.k8s.io)",</p>
     * <p>      "AccessToken": "regression_test_token",</p>
     * <p>      "Weight": 0</p>
     * <p>    }</p>
     * <p>  ],</p>
     * <p>  "PageNumber": 1,</p>
     * <p>  "PageSize": 2,</p>
     * <p>  "TotalCount": 2</p>
     * <p>}</p>
     */
    @NameInMap("Filter")
    public String filter;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Label")
    public java.util.Map<String, String> label;

    /**
     * <p>所属的group。</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>376577</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentServiceUid")
    public String parentServiceUid;

    /**
     * <p>服务所属的资源组名称或ID。</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>服务名。</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>服务运行的状态。</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ServiceUid")
    public String serviceUid;

    /**
     * <p>服务的类型定义。</p>
     */
    @NameInMap("Sort")
    public String sort;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListServicesRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListServicesRequest setLabel(java.util.Map<String, String> label) {
        this.label = label;
        return this;
    }
    public java.util.Map<String, String> getLabel() {
        return this.label;
    }

    public ListServicesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServicesRequest setParentServiceUid(String parentServiceUid) {
        this.parentServiceUid = parentServiceUid;
        return this;
    }
    public String getParentServiceUid() {
        return this.parentServiceUid;
    }

    public ListServicesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListServicesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListServicesRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public ListServicesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListServicesRequest setServiceUid(String serviceUid) {
        this.serviceUid = serviceUid;
        return this;
    }
    public String getServiceUid() {
        return this.serviceUid;
    }

    public ListServicesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListServicesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
