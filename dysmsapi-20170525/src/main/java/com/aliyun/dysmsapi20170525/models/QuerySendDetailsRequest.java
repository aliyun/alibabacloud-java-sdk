// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsRequest extends TeaModel {
    /**
     * <p>The delivery receipt ID. This is the <code>BizId</code> returned in the response when you call the <a href="https://help.aliyun.com/document_detail/419273.html">SendSms</a> or <a href="https://help.aliyun.com/document_detail/419274.html">SendBatchSms</a> operation.</p>
     * <blockquote>
     * <p>You can specify only one <code>BizId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>134523^435****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The current page number for paginated results.</p>
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
     * <p>The number of delivery records to return on each page.</p>
     * <p>Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The phone number to query. The format is as follows:</p>
     * <ul>
     * <li><p>For messages to the Chinese mainland, use an 11-digit phone number, such as 1390000\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>For international SMS, use the format: country/region code + phone number, such as 8520000\<em>\</em>\<em>\</em>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can specify only one phone number.</p>
     * </blockquote>
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
     * <p>The date when the SMS message was sent. You can query records from the past 30 days.</p>
     * <p>Format: <strong>yyyyMMdd</strong>, for example, 20250601.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250601</p>
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
