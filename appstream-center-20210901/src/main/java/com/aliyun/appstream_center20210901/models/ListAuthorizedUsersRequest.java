// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersRequest extends TeaModel {
    /**
     * <p>The application ID. This parameter is used to filter users who are <strong>specifically authorized for this application</strong> (authorized through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). This parameter applies to app instance groups whose authorization mode is <code>App</code>. You can obtain the application ID from the Apps list returned by the <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a> operation.</p>
     * <p>If this parameter is not specified, all authorized users under the app instance group are returned. This parameter is not supported when querying by app instance group set.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The app instance group ID. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. For cloud browser groups, specify the browser group ID returned by the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</p>
     * <p><strong>You must specify either this parameter or AppInstanceGroupSetId, but not both.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The app instance group set ID.</p>
     * <p><strong>You must specify either this parameter or AppInstanceGroupId, but not both.</strong> When querying by set, do not specify AppId or AppInstancePersistentId. Otherwise, a parameter error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstanceGroupSetId")
    public String appInstanceGroupSetId;

    /**
     * <p>The persistent session ID. This parameter is used to filter users who are granted this persistent session. This parameter applies to app instance groups whose authorization mode is <code>Session</code>. You can call the <a href="~~ListPersistentAppInstances~~">ListPersistentAppInstances</a> operation to obtain the ID.</p>
     * <p>If this parameter is specified, only the users granted this session are returned. However, the AppInstancePersistentIds response parameter still lists all persistent sessions granted to the user. This parameter is not supported when querying by app instance group set.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3mw2fg4j****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>The username. Performs <strong>exact match</strong> by username. If this parameter is not specified, filtering by full username is not applied. This parameter can be specified together with UserIdFuzzy, and both conditions must be met.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The page number. Pages start from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records returned per page. Valid values: 1 to 100.</p>
     * <p>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, pagination is based on authorization records. Multiple authorization records for the same user are merged into one user in the response. Therefore, the actual number of users returned on the current page may be less than this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. The value must be consistent with the product type of the queried app instance group or app instance group set. If they are inconsistent, a resource not found error code is returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: Wuying Cloud App</li>
     * <li>CloudBrowser: Cloud Browser</li>
     * <li>WuyingServer: Enterprise Edition workstation</li>
     * <li>WuyingWorkstation: Personal Edition Linggou container workstation</li>
     * <li>WuyingWorkstationTeam: Team Edition Linggou container workstation</li>
     * <li>WuyingWorkstationBusiness: Dedicated Edition Linggou container workstation</li>
     * <li>AndroidCloud: Cloud Phone</li>
     * <li>AIAgent: AgentBay (AI agent)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The username keyword. Performs <strong>fuzzy match</strong> by username. A hit occurs if the username contains this keyword. For example, if you specify <code>ali</code>, both <code>alice</code> and <code>ali.wang</code> are matched. If this parameter is not specified, filtering by keyword is not applied.</p>
     * 
     * <strong>example:</strong>
     * <p>ali</p>
     */
    @NameInMap("UserIdFuzzy")
    public String userIdFuzzy;

    public static ListAuthorizedUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersRequest self = new ListAuthorizedUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAuthorizedUsersRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAuthorizedUsersRequest setAppInstanceGroupSetId(String appInstanceGroupSetId) {
        this.appInstanceGroupSetId = appInstanceGroupSetId;
        return this;
    }
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    public ListAuthorizedUsersRequest setAppInstancePersistentId(String appInstancePersistentId) {
        this.appInstancePersistentId = appInstancePersistentId;
        return this;
    }
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    public ListAuthorizedUsersRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListAuthorizedUsersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedUsersRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListAuthorizedUsersRequest setUserIdFuzzy(String userIdFuzzy) {
        this.userIdFuzzy = userIdFuzzy;
        return this;
    }
    public String getUserIdFuzzy() {
        return this.userIdFuzzy;
    }

}
