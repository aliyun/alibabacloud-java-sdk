// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPublishedAppInstanceGroupRequest extends TeaModel {
    /**
     * <p>The application ID used for filtering delivery groups. Substring matching is supported. The delivery group must contain a deployed application that matches the condition. If this parameter is not specified or is set to an empty string, no filtering by application ID is applied. When specified together with <code>AppName</code>, the same application must satisfy both conditions.</p>
     * <p>This condition does not trim the returned <code>Apps</code> list.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery group ID used for filtering. Substring matching is supported. You can pass in a full ID or a consecutive segment of the ID. If this parameter is not specified or is set to an empty string, no filtering by ID is applied. This parameter can be used together with other filter conditions. Results must satisfy all conditions simultaneously.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group name used for filtering. Substring matching is supported. For example, if you pass in <code>OfficeApps</code>, delivery groups whose names contain this text are matched. If this parameter is not specified or is set to an empty string, no filtering by name is applied. When specified together with the delivery group ID, both the ID and name must match.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeApps</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The application name used for filtering delivery groups. Substring matching is supported. The delivery group must contain a deployed application whose name includes the specified text. If this parameter is not specified or is set to an empty string, no filtering by application name is applied. When specified together with <code>AppId</code>, the same application must satisfy both conditions.</p>
     * <p>This condition does not trim the returned <code>Apps</code> list.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeApps</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The username to exclude based on existing authorization. Exact username matching is used, for example, <code>alice</code>. When specified, delivery groups in which all applications have been directly authorized to this user are excluded. If this parameter is not specified or is set to an empty string, no exclusion based on user authorization is applied.</p>
     * <p><strong>Authorization granted for individual applications only, or access permissions obtained through user groups, is not fully evaluated by this condition.</strong> Do not treat the returned results as a complete list of delivery groups that the user has no access permissions to.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("ExcludeUserId")
    public String excludeUserId;

    /**
     * <p>The page number. This parameter is required. Start from page <code>1</code> and use this parameter together with <code>PageSize</code>. Keep other filter conditions unchanged when querying subsequent pages.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of delivery groups to return per page. This parameter is required. Valid values: <code>1</code> to <code>100</code>. Unit: delivery groups. Specify this value explicitly and do not rely on default values from other query operations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. This parameter is required. The value must match the product type of the delivery groups you want to query. Only published delivery groups of the specified product type are returned. A parameter error is returned if an unrecognized value is passed in.</p>
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

    public static ListPublishedAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppInstanceGroupRequest self = new ListPublishedAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppInstanceGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListPublishedAppInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListPublishedAppInstanceGroupRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListPublishedAppInstanceGroupRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListPublishedAppInstanceGroupRequest setExcludeUserId(String excludeUserId) {
        this.excludeUserId = excludeUserId;
        return this;
    }
    public String getExcludeUserId() {
        return this.excludeUserId;
    }

    public ListPublishedAppInstanceGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPublishedAppInstanceGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishedAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
