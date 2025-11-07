// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaSearchPageListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_CARD_2_META</p>
     */
    @NameInMap("Api")
    public String api;

    /**
     * <strong>example:</strong>
     * <p>610*************1181</p>
     */
    @NameInMap("BankCard")
    public String bankCard;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1739926800000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <strong>example:</strong>
     * <p>522132197411184XXX</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <strong>example:</strong>
     * <p>CTCC</p>
     */
    @NameInMap("IspName")
    public String ispName;

    /**
     * <strong>example:</strong>
     * <p>19127612221</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>B012DB99-6C10-5740-81E0-B3A8C1C1B9C1</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760198400000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <strong>example:</strong>
     * <p>205</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("VehicleNum")
    public String vehicleNum;

    public static DescribeMetaSearchPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaSearchPageListRequest self = new DescribeMetaSearchPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetaSearchPageListRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public DescribeMetaSearchPageListRequest setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }
    public String getBankCard() {
        return this.bankCard;
    }

    public DescribeMetaSearchPageListRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public DescribeMetaSearchPageListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMetaSearchPageListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeMetaSearchPageListRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public DescribeMetaSearchPageListRequest setIspName(String ispName) {
        this.ispName = ispName;
        return this;
    }
    public String getIspName() {
        return this.ispName;
    }

    public DescribeMetaSearchPageListRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public DescribeMetaSearchPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetaSearchPageListRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public DescribeMetaSearchPageListRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeMetaSearchPageListRequest setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public DescribeMetaSearchPageListRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeMetaSearchPageListRequest setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
        return this;
    }
    public String getVehicleNum() {
        return this.vehicleNum;
    }

}
