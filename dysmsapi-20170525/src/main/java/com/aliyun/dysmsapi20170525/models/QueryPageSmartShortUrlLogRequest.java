// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPageSmartShortUrlLogRequest extends TeaModel {
    @NameInMap("ClickState")
    public Long clickState;

    @NameInMap("CreateDateEnd")
    public Long createDateEnd;

    @NameInMap("CreateDateStart")
    public Long createDateStart;

    @NameInMap("EndId")
    public Long endId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ShortName")
    public String shortName;

    @NameInMap("ShortUrl")
    public String shortUrl;

    @NameInMap("StartId")
    public Long startId;

    public static QueryPageSmartShortUrlLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPageSmartShortUrlLogRequest self = new QueryPageSmartShortUrlLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryPageSmartShortUrlLogRequest setClickState(Long clickState) {
        this.clickState = clickState;
        return this;
    }
    public Long getClickState() {
        return this.clickState;
    }

    public QueryPageSmartShortUrlLogRequest setCreateDateEnd(Long createDateEnd) {
        this.createDateEnd = createDateEnd;
        return this;
    }
    public Long getCreateDateEnd() {
        return this.createDateEnd;
    }

    public QueryPageSmartShortUrlLogRequest setCreateDateStart(Long createDateStart) {
        this.createDateStart = createDateStart;
        return this;
    }
    public Long getCreateDateStart() {
        return this.createDateStart;
    }

    public QueryPageSmartShortUrlLogRequest setEndId(Long endId) {
        this.endId = endId;
        return this;
    }
    public Long getEndId() {
        return this.endId;
    }

    public QueryPageSmartShortUrlLogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryPageSmartShortUrlLogRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryPageSmartShortUrlLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPageSmartShortUrlLogRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QueryPageSmartShortUrlLogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryPageSmartShortUrlLogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryPageSmartShortUrlLogRequest setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }
    public String getShortName() {
        return this.shortName;
    }

    public QueryPageSmartShortUrlLogRequest setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public String getShortUrl() {
        return this.shortUrl;
    }

    public QueryPageSmartShortUrlLogRequest setStartId(Long startId) {
        this.startId = startId;
        return this;
    }
    public Long getStartId() {
        return this.startId;
    }

}
