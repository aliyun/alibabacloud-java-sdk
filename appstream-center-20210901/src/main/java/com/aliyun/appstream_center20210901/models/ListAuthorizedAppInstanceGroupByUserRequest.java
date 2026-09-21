// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedAppInstanceGroupByUserRequest extends TeaModel {
    /**
     * <p>The application ID. Fuzzy matching is supported: delivery groups that contain a deployed application whose ID includes the specified string are returned. You can obtain the application ID from the Apps list returned by this operation.</p>
     * <p>If this parameter is not specified, no filtering by application ID is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery group ID. Fuzzy matching is supported: delivery groups whose IDs contain the specified string are returned. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID.</p>
     * <p>If this parameter is not specified, no filtering by delivery group ID is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group name. Fuzzy matching is supported. For example, if you set this parameter to <code>Office App</code>, delivery groups whose names contain <code>Office App</code> (such as <code>My Office App</code> or <code>Office App A</code>) are returned.</p>
     * <p>If this parameter is not specified, no filtering by delivery group name is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>Office App</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The application name. Fuzzy matching is supported: delivery groups that contain a deployed application whose name includes the specified string are returned.</p>
     * <p>If this parameter is not specified, no filtering by application name is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>Office App</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The username. An <strong>exact match</strong> is performed on the username to query the delivery groups for which the user has been granted delivery group-level authorization.</p>
     * <blockquote>
     * <p>This parameter is required. If this parameter is not specified, the error code <code>InvalidParameter.UserId</code> is returned.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of delivery groups to return per page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. The value must match the product type of the delivery groups to query. Only delivery groups of the specified product type are returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: WUYING Cloud Application.</li>
     * <li>CloudBrowser: cloud browser.</li>
     * <li>WuyingServer: Enterprise Edition workstation.</li>
     * <li>WuyingWorkstation: Personal Edition Lingjun container workstation.</li>
     * <li>WuyingWorkstationTeam: Team Edition Lingjun container workstation.</li>
     * <li>WuyingWorkstationBusiness: Dedicated Edition Lingjun container workstation.</li>
     * <li>AndroidCloud: cloud phone.</li>
     * <li>AIAgent: AgentBay (AI agent).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListAuthorizedAppInstanceGroupByUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAppInstanceGroupByUserRequest self = new ListAuthorizedAppInstanceGroupByUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedAppInstanceGroupByUserRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
