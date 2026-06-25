// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>Specifies whether to enable Auto Scaling for the service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoscalerEnabled")
    public Boolean autoscalerEnabled;

    /**
     * <p>The UID of the account that created the service.</p>
     * 
     * <strong>example:</strong>
     * <p>19989224166xxxxxxx</p>
     */
    @NameInMap("CallerUid")
    public String callerUid;

    /**
     * <p>Specifies whether to enable scheduled auto scaling for the service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CronscalerEnabled")
    public Boolean cronscalerEnabled;

    /**
     * <p>The keyword for a fuzzy search. This parameter supports fuzzy searches by service name only.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The private gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("Gateway")
    public String gateway;

    /**
     * <p>The name of the service group. To learn how to obtain this name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether to include services that do not belong to any workspace. The default value is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeNoWorkspace")
    public Boolean includeNoWorkspace;

    /**
     * <p>Filters services by label.</p>
     */
    @NameInMap("Label")
    public java.util.Map<String, String> label;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>desc</code> (default): descending.</p>
     * </li>
     * <li><p><code>asc</code>: ascending.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the results to return. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of services to return per page. The default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UID of the primary service. This parameter applies to member services in a service group.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-m-ijafy3c8cxxxx</p>
     */
    @NameInMap("ParentServiceUid")
    public String parentServiceUid;

    /**
     * <p>The quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>quota1****</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The custom name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ResourceAliasName")
    public String resourceAliasName;

    /**
     * <p>Specifies whether to enable a burstable resource pool for the service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceBurstable")
    public Boolean resourceBurstable;

    /**
     * <p>The ID of the resource group. To learn how to query for this ID, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-asdas****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name or ID of the service\&quot;s resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-hd0qwy8cxxxx</p>
     */
    @NameInMap("ResourceName")
    @Deprecated
    public String resourceName;

    /**
     * <p>The type of resource the service uses. Valid values:</p>
     * <ul>
     * <li><p>PublicResource</p>
     * </li>
     * <li><p>DedicatedResource</p>
     * </li>
     * <li><p>Lingjun</p>
     * </li>
     * <li><p>SelfManagedLingjun</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PublicResource</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The service role.</p>
     * 
     * <strong>example:</strong>
     * <p>LLMGateway</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>echo_test</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The status of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><p>Async</p>
     * </li>
     * <li><p>Standard</p>
     * </li>
     * <li><p>Queue</p>
     * </li>
     * <li><p>LLM</p>
     * </li>
     * <li><p>RAG</p>
     * </li>
     * <li><p>Serverless</p>
     * </li>
     * <li><p>LLMGatewayService</p>
     * </li>
     * <li><p>OfflineTask</p>
     * </li>
     * <li><p>SDCluster</p>
     * </li>
     * <li><p>ScalableJob</p>
     * </li>
     * <li><p>ScalableJobService</p>
     * </li>
     * <li><p>AssistantJob</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The service UID.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-m-c9iw3yitxxxx</p>
     */
    @NameInMap("ServiceUid")
    public String serviceUid;

    /**
     * <p>The sort field. By default, results are sorted by timestamp in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>Specifies whether the service accepts group traffic. This parameter applies only to services within a service group.</p>
     * 
     * <strong>example:</strong>
     * <p>grouping</p>
     */
    @NameInMap("TrafficState")
    public String trafficState;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListServicesRequest setAutoscalerEnabled(Boolean autoscalerEnabled) {
        this.autoscalerEnabled = autoscalerEnabled;
        return this;
    }
    public Boolean getAutoscalerEnabled() {
        return this.autoscalerEnabled;
    }

    public ListServicesRequest setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public ListServicesRequest setCronscalerEnabled(Boolean cronscalerEnabled) {
        this.cronscalerEnabled = cronscalerEnabled;
        return this;
    }
    public Boolean getCronscalerEnabled() {
        return this.cronscalerEnabled;
    }

    public ListServicesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListServicesRequest setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public ListServicesRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListServicesRequest setIncludeNoWorkspace(Boolean includeNoWorkspace) {
        this.includeNoWorkspace = includeNoWorkspace;
        return this;
    }
    public Boolean getIncludeNoWorkspace() {
        return this.includeNoWorkspace;
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

    public ListServicesRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public ListServicesRequest setResourceAliasName(String resourceAliasName) {
        this.resourceAliasName = resourceAliasName;
        return this;
    }
    public String getResourceAliasName() {
        return this.resourceAliasName;
    }

    public ListServicesRequest setResourceBurstable(Boolean resourceBurstable) {
        this.resourceBurstable = resourceBurstable;
        return this;
    }
    public Boolean getResourceBurstable() {
        return this.resourceBurstable;
    }

    public ListServicesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    @Deprecated
    public ListServicesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListServicesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListServicesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
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

    public ListServicesRequest setTrafficState(String trafficState) {
        this.trafficState = trafficState;
        return this;
    }
    public String getTrafficState() {
        return this.trafficState;
    }

    public ListServicesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
