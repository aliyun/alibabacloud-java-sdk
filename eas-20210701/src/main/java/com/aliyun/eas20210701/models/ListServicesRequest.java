// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>Filters services by visibility. PUBLIC indicates a public service, and PRIVATE indicates a private service.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>Specifies whether elastic scaling is enabled for the service.</p>
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
     * <p>Specifies whether scheduled scaling is enabled for the service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CronscalerEnabled")
    public Boolean cronscalerEnabled;

    /**
     * <p>The fuzzy match field. Only fuzzy matching by service name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The ID of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("Gateway")
    public String gateway;

    /**
     * <p>The name of the service group. For information about how to obtain the service group name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether to include services that do not belong to any workspace. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeNoWorkspace")
    public Boolean includeNoWorkspace;

    /**
     * <p>The label used to filter services.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:null}</p>
     */
    @NameInMap("Label")
    public java.util.Map<String, String> label;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>desc: Descending order. This is the default value.</li>
     * <li>asc: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the service list to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of services to return on each page during a paged query. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the primary service that corresponds to the band member service.</p>
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
     * <p>Specifies whether the burstable resource pool is enabled for the service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceBurstable")
    public Boolean resourceBurstable;

    /**
     * <p>The ID of the resource group. For information about how to query the resource group ID, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-asdas****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name or ID of the resource group to which the service belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-hd0qwy8cxxxx</p>
     */
    @NameInMap("ResourceName")
    @Deprecated
    public String resourceName;

    /**
     * <p>The type of resource used by the service. Valid values:</p>
     * <ul>
     * <li>PublicResource</li>
     * <li>DedicatedResource</li>
     * <li>Lingjun</li>
     * <li>SelfManagedLingjun</li>
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
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>echo_test</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The running status of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li>Async</li>
     * <li>Standard</li>
     * <li>Queue</li>
     * <li>LLM</li>
     * <li>RAG</li>
     * <li>Serverless</li>
     * <li>LLMGatewayService</li>
     * <li>Offline Task</li>
     * <li>SDCluster</li>
     * <li>ScalableJob</li>
     * <li>ScalableJobService</li>
     * <li>AssistantJob</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The UID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-m-c9iw3yitxxxx</p>
     */
    @NameInMap("ServiceUid")
    public String serviceUid;

    /**
     * <p>The sort field. By default, timestamp fields are sorted in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>Specifies whether to receive group traffic. This parameter is valid only for group services.</p>
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
