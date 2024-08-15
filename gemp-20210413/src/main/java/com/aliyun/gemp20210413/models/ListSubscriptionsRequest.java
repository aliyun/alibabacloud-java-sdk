// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378FTOKENA11</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("notFilterScopeObjectDeleted")
    public Boolean notFilterScopeObjectDeleted;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("notifyObject")
    public String notifyObject;

    /**
     * <strong>example:</strong>
     * <p>SERVICE</p>
     */
    @NameInMap("notifyObjectType")
    public String notifyObjectType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>SERVICE</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("scopeObject")
    public String scopeObject;

    /**
     * <strong>example:</strong>
     * <p>newTitle</p>
     */
    @NameInMap("subscriptionTitle")
    public String subscriptionTitle;

    public static ListSubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionsRequest self = new ListSubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListSubscriptionsRequest setNotFilterScopeObjectDeleted(Boolean notFilterScopeObjectDeleted) {
        this.notFilterScopeObjectDeleted = notFilterScopeObjectDeleted;
        return this;
    }
    public Boolean getNotFilterScopeObjectDeleted() {
        return this.notFilterScopeObjectDeleted;
    }

    public ListSubscriptionsRequest setNotifyObject(String notifyObject) {
        this.notifyObject = notifyObject;
        return this;
    }
    public String getNotifyObject() {
        return this.notifyObject;
    }

    public ListSubscriptionsRequest setNotifyObjectType(String notifyObjectType) {
        this.notifyObjectType = notifyObjectType;
        return this;
    }
    public String getNotifyObjectType() {
        return this.notifyObjectType;
    }

    public ListSubscriptionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSubscriptionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSubscriptionsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSubscriptionsRequest setScopeObject(String scopeObject) {
        this.scopeObject = scopeObject;
        return this;
    }
    public String getScopeObject() {
        return this.scopeObject;
    }

    public ListSubscriptionsRequest setSubscriptionTitle(String subscriptionTitle) {
        this.subscriptionTitle = subscriptionTitle;
        return this;
    }
    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

}
