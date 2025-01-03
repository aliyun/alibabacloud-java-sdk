// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsDetailsRequest extends TeaModel {
    /**
     * <p>Card SMS sending ID, which is the BizCardId field in the response when calling SendCardSms or SendBatchCardSms.</p>
     * 
     * <strong>example:</strong>
     * <p>123456^0</p>
     */
    @NameInMap("BizCardId")
    public String bizCardId;

    /**
     * <p>Digital SMS sending ID, which is the BizDigitalId field in the response when calling SendCardSms or SendBatchCardSms.</p>
     * 
     * <strong>example:</strong>
     * <p>12346^0</p>
     */
    @NameInMap("BizDigitId")
    public String bizDigitId;

    /**
     * <p>Text SMS sending ID, which is the BizSmsId field in the response when calling SendCardSms or SendBatchCardSms.</p>
     * 
     * <strong>example:</strong>
     * <p>1234576^0</p>
     */
    @NameInMap("BizSmsId")
    public String bizSmsId;

    /**
     * <p>For paginated viewing of sending records, specify the current page number of the sending records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>For paginated viewing of sending records, specify the number of card SMS records to display per page.</p>
     * <p>The value range is 1~50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Domestic phone number that received the SMS. Format: 11-digit phone number, for example, 1390000****.</p>
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
     * <p>Card SMS sending date, supports querying records from the last 30 days.</p>
     * <p>Format: yyyyMMdd, for example, 20240112.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240112</p>
     */
    @NameInMap("SendDate")
    public String sendDate;

    public static GetCardSmsDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardSmsDetailsRequest self = new GetCardSmsDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetCardSmsDetailsRequest setBizCardId(String bizCardId) {
        this.bizCardId = bizCardId;
        return this;
    }
    public String getBizCardId() {
        return this.bizCardId;
    }

    public GetCardSmsDetailsRequest setBizDigitId(String bizDigitId) {
        this.bizDigitId = bizDigitId;
        return this;
    }
    public String getBizDigitId() {
        return this.bizDigitId;
    }

    public GetCardSmsDetailsRequest setBizSmsId(String bizSmsId) {
        this.bizSmsId = bizSmsId;
        return this;
    }
    public String getBizSmsId() {
        return this.bizSmsId;
    }

    public GetCardSmsDetailsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetCardSmsDetailsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetCardSmsDetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetCardSmsDetailsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetCardSmsDetailsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetCardSmsDetailsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetCardSmsDetailsRequest setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

}
