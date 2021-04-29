// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmsDetailRequest extends TeaModel {
    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("SendDate")
    @Validation(required = true)
    public String sendDate;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("SendStatus")
    public String sendStatus;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("BizId")
    public String bizId;

    public static DescribeSmsDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsDetailRequest self = new DescribeSmsDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmsDetailRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public DescribeSmsDetailRequest setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

    public DescribeSmsDetailRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeSmsDetailRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public DescribeSmsDetailRequest setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public String getSendStatus() {
        return this.sendStatus;
    }

    public DescribeSmsDetailRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public DescribeSmsDetailRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DescribeSmsDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSmsDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSmsDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
