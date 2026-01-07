// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServicesShrinkRequest extends TeaModel {
    @NameInMap("AutoscalerEnabled")
    public Boolean autoscalerEnabled;

    /**
     * <strong>example:</strong>
     * <p>19989224166xxxxxxx</p>
     */
    @NameInMap("CallerUid")
    public String callerUid;

    @NameInMap("CronscalerEnabled")
    public Boolean cronscalerEnabled;

    /**
     * <p>The field that is used for fuzzy matches. The system performs fuzzy matches only by service name.</p>
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
     * <p>The name of the service group. For more information about how to query the name of a service group, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IncludeNoWorkspace")
    public Boolean includeNoWorkspace;

    /**
     * <p>The tag that is used to filter services.</p>
     */
    @NameInMap("Label")
    public String labelShrink;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li>desc (default): The query results are sorted in descending order.</li>
     * <li>asc: The query results are sorted in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the primary service that corresponds to the Band member service.</p>
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
     * <p>quota12345</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("ResourceAliasName")
    public String resourceAliasName;

    @NameInMap("ResourceBurstable")
    public Boolean resourceBurstable;

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

    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The server role.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DataLoader</li>
     * <li>FrontEnd</li>
     * <li>DataSet</li>
     * <li>SDProxy</li>
     * <li>LLMSscheduler</li>
     * <li>ScalableJob</li>
     * <li>LLMGateway</li>
     * <li>Job</li>
     * <li>Queue</li>
     * </ul>
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
     * <p>The service state.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Creating</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Stopped</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Failed</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Complete</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Cloning</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Stopping</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Updating</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Waiting</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>HotUpdate</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Committing</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Starting</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DeleteFailed</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Running</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Developing</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Scaling</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Deleted</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Pending</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Deleting</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
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
     * <li>Offline Task</li>
     * <li>Proxima</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Async</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Standard</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>OfflineTask</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Proxima</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The user ID (UID) of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-m-c9iw3yitxxxx</p>
     */
    @NameInMap("ServiceUid")
    public String serviceUid;

    /**
     * <p>The sort field. By default, the query results are sorted by the timestamp type in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    @NameInMap("TrafficState")
    public String trafficState;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListServicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesShrinkRequest self = new ListServicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesShrinkRequest setAutoscalerEnabled(Boolean autoscalerEnabled) {
        this.autoscalerEnabled = autoscalerEnabled;
        return this;
    }
    public Boolean getAutoscalerEnabled() {
        return this.autoscalerEnabled;
    }

    public ListServicesShrinkRequest setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public ListServicesShrinkRequest setCronscalerEnabled(Boolean cronscalerEnabled) {
        this.cronscalerEnabled = cronscalerEnabled;
        return this;
    }
    public Boolean getCronscalerEnabled() {
        return this.cronscalerEnabled;
    }

    public ListServicesShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListServicesShrinkRequest setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public ListServicesShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListServicesShrinkRequest setIncludeNoWorkspace(Boolean includeNoWorkspace) {
        this.includeNoWorkspace = includeNoWorkspace;
        return this;
    }
    public Boolean getIncludeNoWorkspace() {
        return this.includeNoWorkspace;
    }

    public ListServicesShrinkRequest setLabelShrink(String labelShrink) {
        this.labelShrink = labelShrink;
        return this;
    }
    public String getLabelShrink() {
        return this.labelShrink;
    }

    public ListServicesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServicesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServicesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServicesShrinkRequest setParentServiceUid(String parentServiceUid) {
        this.parentServiceUid = parentServiceUid;
        return this;
    }
    public String getParentServiceUid() {
        return this.parentServiceUid;
    }

    public ListServicesShrinkRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public ListServicesShrinkRequest setResourceAliasName(String resourceAliasName) {
        this.resourceAliasName = resourceAliasName;
        return this;
    }
    public String getResourceAliasName() {
        return this.resourceAliasName;
    }

    public ListServicesShrinkRequest setResourceBurstable(Boolean resourceBurstable) {
        this.resourceBurstable = resourceBurstable;
        return this;
    }
    public Boolean getResourceBurstable() {
        return this.resourceBurstable;
    }

    public ListServicesShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    @Deprecated
    public ListServicesShrinkRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListServicesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListServicesShrinkRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListServicesShrinkRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListServicesShrinkRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public ListServicesShrinkRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListServicesShrinkRequest setServiceUid(String serviceUid) {
        this.serviceUid = serviceUid;
        return this;
    }
    public String getServiceUid() {
        return this.serviceUid;
    }

    public ListServicesShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListServicesShrinkRequest setTrafficState(String trafficState) {
        this.trafficState = trafficState;
        return this;
    }
    public String getTrafficState() {
        return this.trafficState;
    }

    public ListServicesShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
