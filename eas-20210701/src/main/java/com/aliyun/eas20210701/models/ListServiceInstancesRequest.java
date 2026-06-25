// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceInstancesRequest extends TeaModel {
    /**
     * <p>A keyword for the search. You can search by instance name, instance IP address, host IP address, or instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>10.118.xx.xx</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The IP address of the host where the service instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>10.224.xx.xx</p>
     */
    @NameInMap("HostIP")
    public String hostIP;

    /**
     * <p>The IP address of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.224.xx.xx</p>
     */
    @NameInMap("InstanceIP")
    public String instanceIP;

    /**
     * <p>The name of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>foo-bdc5xxxx-8l7rk</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The status of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c7.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the instance is a spot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSpot")
    public Boolean isSpot;

    /**
     * <p>Specifies whether to query the list of instance replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ListReplica")
    public Boolean listReplica;

    /**
     * <p>The type of the sub-service. This parameter is valid only for aggregation services.</p>
     * 
     * <strong>example:</strong>
     * <p>LLMDecode</p>
     */
    @NameInMap("MemberType")
    public String memberType;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>quota1****</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The name of the instance replica.</p>
     * 
     * <strong>example:</strong>
     * <p>cbh-qwen3-a1bc-prefill-ep1tp4dp</p>
     */
    @NameInMap("ReplicaName")
    public String replicaName;

    /**
     * <p>The resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-xxxxxxx</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The type of the resource group to which the service instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>PublicResource</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The role of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>Queue</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The field to use for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>StartTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    public static ListServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesRequest self = new ListServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListServiceInstancesRequest setHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }
    public String getHostIP() {
        return this.hostIP;
    }

    public ListServiceInstancesRequest setInstanceIP(String instanceIP) {
        this.instanceIP = instanceIP;
        return this;
    }
    public String getInstanceIP() {
        return this.instanceIP;
    }

    public ListServiceInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListServiceInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public ListServiceInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListServiceInstancesRequest setIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }
    public Boolean getIsSpot() {
        return this.isSpot;
    }

    public ListServiceInstancesRequest setListReplica(Boolean listReplica) {
        this.listReplica = listReplica;
        return this;
    }
    public Boolean getListReplica() {
        return this.listReplica;
    }

    public ListServiceInstancesRequest setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

    public ListServiceInstancesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServiceInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServiceInstancesRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public ListServiceInstancesRequest setReplicaName(String replicaName) {
        this.replicaName = replicaName;
        return this;
    }
    public String getReplicaName() {
        return this.replicaName;
    }

    public ListServiceInstancesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ListServiceInstancesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListServiceInstancesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListServiceInstancesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
