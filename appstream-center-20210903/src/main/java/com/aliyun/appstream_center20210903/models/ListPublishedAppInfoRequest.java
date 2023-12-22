// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListPublishedAppInfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("CategoryType")
    public Long categoryType;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("ClientOS")
    public String clientOS;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("LoginRegionId")
    public String loginRegionId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("OrderParam")
    public String orderParam;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SortType")
    public String sortType;

    public static ListPublishedAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppInfoRequest self = new ListPublishedAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListPublishedAppInfoRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListPublishedAppInfoRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public ListPublishedAppInfoRequest setCategoryType(Long categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public Long getCategoryType() {
        return this.categoryType;
    }

    public ListPublishedAppInfoRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ListPublishedAppInfoRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public ListPublishedAppInfoRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public ListPublishedAppInfoRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public ListPublishedAppInfoRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListPublishedAppInfoRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public ListPublishedAppInfoRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ListPublishedAppInfoRequest setOrderParam(String orderParam) {
        this.orderParam = orderParam;
        return this;
    }
    public String getOrderParam() {
        return this.orderParam;
    }

    public ListPublishedAppInfoRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListPublishedAppInfoRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListPublishedAppInfoRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
