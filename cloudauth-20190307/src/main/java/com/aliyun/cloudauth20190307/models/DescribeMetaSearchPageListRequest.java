// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaSearchPageListRequest extends TeaModel {
    /**
     * <p>The product API. Valid values:</p>
     * <ul>
     * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification</li>
     * <li><strong>ID_PERIOD</strong>: ID card validity period verification</li>
     * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration</li>
     * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status</li>
     * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition)</li>
     * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition)</li>
     * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification</li>
     * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition)</li>
     * <li><strong>MOBILE_DETECT</strong>: phone number detection </li>
     * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition)</li>
     * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition</li>
     * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition</li>
     * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query</li>
     * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_CARD_2_META</p>
     */
    @NameInMap("Api")
    public String api;

    /**
     * <p>The bank card number.</p>
     * 
     * <strong>example:</strong>
     * <p>610*************1181</p>
     */
    @NameInMap("BankCard")
    public String bankCard;

    /**
     * <p>The verification status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Verification passed.</li>
     * <li><strong>2</strong>: Verification failed.</li>
     * <li><strong>3</strong>: No record found.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1739926800000</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The ID card number.</p>
     * 
     * <strong>example:</strong>
     * <p>522132197411184XXX</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The name of the telecommunications service provider. Valid values:</p>
     * <ul>
     * <li><strong>CMCC</strong>: China Mobile</li>
     * <li><strong>CUCC</strong>: China Unicom</li>
     * <li><strong>CTCC</strong>: China Telecom.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CTCC</p>
     */
    @NameInMap("IspName")
    public String ispName;

    /**
     * <p>The mobile phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>19127612221</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B012DB99-6C10-5740-81E0-B3A8C1C1B9C1</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760198400000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>The result code. For more information, see <a href="https://www.alibabacloud.com/help/en/id-verification/information-verification/">official documentation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>205</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The license plate number.</p>
     * 
     * <strong>example:</strong>
     * <p>陕A9****</p>
     */
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
