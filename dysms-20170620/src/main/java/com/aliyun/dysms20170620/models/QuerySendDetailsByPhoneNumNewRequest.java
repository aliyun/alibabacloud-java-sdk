// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendDetailsByPhoneNumNewRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public Long bizType;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PhoneNum")
    public String phoneNum;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SendDate")
    public String sendDate;

    @NameInMap("SendStatus")
    public Long sendStatus;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("StatisticsStatus")
    public Integer statisticsStatus;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static QuerySendDetailsByPhoneNumNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsByPhoneNumNewRequest self = new QuerySendDetailsByPhoneNumNewRequest();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsByPhoneNumNewRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QuerySendDetailsByPhoneNumNewRequest setBizType(Long bizType) {
        this.bizType = bizType;
        return this;
    }
    public Long getBizType() {
        return this.bizType;
    }

    public QuerySendDetailsByPhoneNumNewRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QuerySendDetailsByPhoneNumNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySendDetailsByPhoneNumNewRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySendDetailsByPhoneNumNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySendDetailsByPhoneNumNewRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public QuerySendDetailsByPhoneNumNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySendDetailsByPhoneNumNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySendDetailsByPhoneNumNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySendDetailsByPhoneNumNewRequest setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

    public QuerySendDetailsByPhoneNumNewRequest setSendStatus(Long sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public Long getSendStatus() {
        return this.sendStatus;
    }

    public QuerySendDetailsByPhoneNumNewRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySendDetailsByPhoneNumNewRequest setStatisticsStatus(Integer statisticsStatus) {
        this.statisticsStatus = statisticsStatus;
        return this;
    }
    public Integer getStatisticsStatus() {
        return this.statisticsStatus;
    }

    public QuerySendDetailsByPhoneNumNewRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
