// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPublishedAppsRequest extends TeaModel {
    /**
     * <p>The application ID used for filtering. Substring matching is supported. You can specify a complete ID or a consecutive segment of it. If this parameter is not specified or is set to an empty string, filtering by application ID is not applied. If both this parameter and <code>AppName</code> are specified, both conditions must be met by the same application.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery group ID used for filtering. Substring matching is supported. You can specify a complete ID or a consecutive segment of it. If this parameter is not specified or is set to an empty string, filtering by delivery group ID is not applied. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain delivery group IDs. This parameter can be used together with other filter conditions, and all conditions must be met simultaneously.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group name used for filtering. Substring matching is supported. For example, if you specify <code>OfficeApps</code>, delivery groups whose names contain this text are matched. If this parameter is not specified or is set to an empty string, filtering by delivery group name is not applied. If both this parameter and the delivery group ID are specified, both conditions must be met.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeApps</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The application name used for filtering. Substring matching is supported. For example, if you specify <code>OfficeApps</code>, applications whose names contain this text are matched. If this parameter is not specified or is set to an empty string, filtering by application name is not applied. If both this parameter and <code>AppId</code> are specified, both conditions must be met by the same application.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeApps</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The username to exclude. Exact username matching is used. For example, <code>alice</code>. When specified, applications that have been authorized to this user through <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> by application are not returned. This helps you find applications that can still be authorized to the user. If this parameter is not specified or is set to an empty string, no exclusion based on user authorization is applied.</p>
     * <p><strong>Access permissions granted through delivery-group-level authorization or user groups are not evaluated by this condition.</strong> The returned results cannot be treated as a complete list of applications that the user has no access to.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("ExcludeUserId")
    public String excludeUserId;

    /**
     * <p>The page number. This parameter is required. Start from page <code>1</code> and use this parameter together with <code>PageSize</code>. Keep other filter conditions unchanged when querying subsequent pages. If an invalid value is specified, the error code <code>InvalidParameter.PageNumber</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of application records to return per page. This parameter is required. Valid values: <code>1</code> to <code>100</code>. If the value is out of range, the error code <code>InvalidParameter.PageSize</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. This parameter is required. The value is case-insensitive. Only applications in published delivery groups of the specified product type are returned. If an unrecognized value is specified, the error code <code>InvalidParameter.ProductType</code> is returned. Filtering and statistics related to per-application authorization (<code>ExcludeUserId</code> and <code>AuthorizedUserCount</code>) are primarily used in WUYING Cloud Application common scenarios.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>CloudApp</code>: WUYING Cloud Application.</li>
     * <li><code>CloudBrowser</code>: Cloud Browser.</li>
     * <li><code>WuyingServer</code>: Enterprise Workstation.</li>
     * <li><code>WuyingWorkstation</code>: Personal Edition Lingjou Container Workstation.</li>
     * <li><code>WuyingWorkstationTeam</code>: Team Edition Lingjou Container Workstation.</li>
     * <li><code>WuyingWorkstationBusiness</code>: Dedicated Edition Lingjou Container Workstation.</li>
     * <li><code>AndroidCloud</code>: Cloud Phone.</li>
     * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListPublishedAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppsRequest self = new ListPublishedAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListPublishedAppsRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListPublishedAppsRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListPublishedAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListPublishedAppsRequest setExcludeUserId(String excludeUserId) {
        this.excludeUserId = excludeUserId;
        return this;
    }
    public String getExcludeUserId() {
        return this.excludeUserId;
    }

    public ListPublishedAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPublishedAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishedAppsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
