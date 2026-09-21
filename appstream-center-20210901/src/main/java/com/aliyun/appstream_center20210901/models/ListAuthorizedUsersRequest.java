// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersRequest extends TeaModel {
    /**
     * <p>The application ID used to filter authorization relationships.</p>
     * <p>Set this parameter when querying authorized users of a specific application. This parameter is not required when querying cloud browser groups or delivery group sets.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The delivery group ID. When querying cloud browsers, set this parameter to the browser group ID.</p>
     * <p>Specify either this parameter or <code>AppInstanceGroupSetId</code>, but not both.</p>
     * 
     * <strong>example:</strong>
     * <p>big-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group set ID.</p>
     * <p>Specify either this parameter or <code>AppInstanceGroupId</code>, but not both. When querying by set, omit <code>AppId</code> and <code>AppInstancePersistentId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstanceGroupSetId")
    public String appInstanceGroupSetId;

    /**
     * <p>The persistent session ID used to filter authorization relationships. This parameter applies to delivery groups that use session-based authorization.</p>
     * <p>This parameter is not required when querying delivery group sets.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>Performs an exact match by authorized username. If this parameter is not specified, results are not filtered by exact username.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The page number. This parameter is required. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of records per page. This parameter is required. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. Set this parameter to <code>CloudBrowser</code> when querying authorized users of cloud browsers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudBrowser</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Performs a fuzzy match by text contained in the authorized username.</p>
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
