// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersRequest extends TeaModel {
    /**
     * <p>The application ID. Specifies the application to filter users who are <strong>authorized for that specific application</strong> (authorized through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). This parameter applies to delivery groups with the <code>App</code> authorization mode. Obtain the application ID from the Apps list returned by the <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a> operation.</p>
     * <p>If not specified, all authorized users under the delivery group are returned. This parameter is not supported when querying by delivery group set.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-i87mycyn419nu****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery group ID. Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain this value. For cloud browser groups, specify the browser group ID returned by the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</p>
     * <p><strong>Exactly one of this parameter and AppInstanceGroupSetId must be specified.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group set ID.</p>
     * <p><strong>Exactly one of this parameter and AppInstanceGroupId must be specified.</strong> When querying by set, do not specify AppId or AppInstancePersistentId. Otherwise, a parameter error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstanceGroupSetId")
    public String appInstanceGroupSetId;

    /**
     * <p>The persistent session ID. Specifies the persistent session to filter users who are granted that session. This parameter applies to delivery groups with the <code>Session</code> authorization mode. Call the <a href="~~ListPersistentAppInstances~~">ListPersistentAppInstances</a> operation to obtain this value.</p>
     * <p>If specified, only users granted that session are returned. However, the response parameter AppInstancePersistentIds still lists all persistent sessions granted to each user. This parameter is not supported when querying by delivery group set.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3mw2fg4j****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>The username for <strong>exact matching</strong>. If not specified, no filtering by exact username is applied. Can be specified together with UserIdFuzzy, in which case both conditions must be met.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The page number, starting from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Valid values: 1 to 100.</p>
     * <p>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, pagination is based on authorization records. Multiple authorization records for the same user are merged into a single user entry. Therefore, the actual number of users returned on the current page may be less than this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. The value must match the product type of the queried delivery group or delivery group set. If the value does not match, a resource-not-found error code is returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: Wuying Cloud Application.</li>
     * <li>CloudBrowser: Cloud Browser.</li>
     * <li>WuyingServer: Enterprise Edition Workstation.</li>
     * <li>WuyingWorkstation: Personal Edition Linggou Container Workstation.</li>
     * <li>WuyingWorkstationTeam: Linggou Team Edition Container Workstation.</li>
     * <li>WuyingWorkstationBusiness: Linggou Dedicated Edition Container Workstation.</li>
     * <li>AndroidCloud: Cloud Phone.</li>
     * <li>AIAgent: AgentBay (AI agent).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The username keyword for <strong>fuzzy matching</strong>. A match occurs if the username contains this keyword. For example, if you specify <code>ali</code>, both <code>alice</code> and <code>ali.wang</code> are returned. If not specified, no keyword-based filtering is applied.</p>
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
