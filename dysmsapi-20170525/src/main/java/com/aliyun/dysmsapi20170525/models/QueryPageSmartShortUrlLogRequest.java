// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPageSmartShortUrlLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20181225</p>
     */
    @NameInMap("CreateDateEnd")
    public Long createDateEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20181225</p>
     */
    @NameInMap("CreateDateStart")
    public Long createDateStart;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://ays.cn/">http://ays.cn/</a>****</p>
     */
    @NameInMap("ShortUrl")
    public String shortUrl;

    public static QueryPageSmartShortUrlLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPageSmartShortUrlLogRequest self = new QueryPageSmartShortUrlLogRequest();
        return TeaModel.build(map, self);
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

    public QueryPageSmartShortUrlLogRequest setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public String getShortUrl() {
        return this.shortUrl;
    }

}
