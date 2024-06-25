// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the delivery receipt. The delivery receipt ID is the value of the BizId parameter that is returned when you call the SendSms or SendBatchSms operation.</p>
     * 
     * <strong>example:</strong>
     * <p>134523^435****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The page number of the first page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of items displayed per page.</p>
     * <p>Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The mobile numbers of the recipients. Format:</p>
     * <ul>
     * <li>If you send messages in the Chinese mainland, specify an 11-digit mobile number, for example, 1390000\<em>\</em>\<em>\</em>.</li>
     * <li>If you send messages to countries or regions outside the Chinese mainland, specify this parameter in the \<Area code>\<Mobile number> format. Example: 8520000\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
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
     * <p>The date when the message was sent. You can query messages that were sent within the last 30 days.</p>
     * <p>Format: yyyyMMdd. Example: 20181225.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20181228</p>
     */
    @NameInMap("SendDate")
    public String sendDate;

    public static QuerySendDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsRequest self = new QuerySendDetailsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QuerySendDetailsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySendDetailsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySendDetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySendDetailsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QuerySendDetailsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySendDetailsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySendDetailsRequest setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

}
