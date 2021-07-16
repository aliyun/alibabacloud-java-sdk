// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionsRequest extends TeaModel {
    // 第几页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 一页几条
    @NameInMap("pageSize")
    public Integer pageSize;

    // 通知订阅名
    @NameInMap("subscriptionTitle")
    public String subscriptionTitle;

    // 订阅范围类型 0全部1服务2流转规则
    @NameInMap("scope")
    public String scope;

    // 订阅范围对象名称
    @NameInMap("scopeObject")
    public String scopeObject;

    // 通知对象类型notifyWhoType:0服务组 1个人
    @NameInMap("notifyObjectType")
    public String notifyObjectType;

    // 通知对象名
    @NameInMap("notifyObject")
    public String notifyObject;

    // 幂等参数
    @NameInMap("clientToken")
    public String clientToken;

    public static ListSubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionsRequest self = new ListSubscriptionsRequest();
        return TeaModel.build(map, self);
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

    public ListSubscriptionsRequest setSubscriptionTitle(String subscriptionTitle) {
        this.subscriptionTitle = subscriptionTitle;
        return this;
    }
    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
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

    public ListSubscriptionsRequest setNotifyObjectType(String notifyObjectType) {
        this.notifyObjectType = notifyObjectType;
        return this;
    }
    public String getNotifyObjectType() {
        return this.notifyObjectType;
    }

    public ListSubscriptionsRequest setNotifyObject(String notifyObject) {
        this.notifyObject = notifyObject;
        return this;
    }
    public String getNotifyObject() {
        return this.notifyObject;
    }

    public ListSubscriptionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
