// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("notFilterScopeObjectDeleted")
    public Boolean notFilterScopeObjectDeleted;

    @NameInMap("notifyObject")
    public String notifyObject;

    @NameInMap("notifyObjectType")
    public String notifyObjectType;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("scope")
    public String scope;

    @NameInMap("scopeObject")
    public String scopeObject;

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
