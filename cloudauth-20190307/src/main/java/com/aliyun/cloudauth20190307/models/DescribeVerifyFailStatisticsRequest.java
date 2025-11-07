// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyFailStatisticsRequest extends TeaModel {
    /**
     * <p>Age greater than 14 years old:</p>
     * <ul>
     * <li><strong>T</strong>: Greater than</li>
     * <li><strong>F</strong>: Less than</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("AgeGt")
    public String ageGt;

    /**
     * <p>API code:</p>
     * <ul>
     * <li><strong>INIT_SERVICE</strong>: Server-side initialization failure</li>
     * <li><strong>INIT_DEVICE</strong>: Client-side failure</li>
     * <li><strong>VERIFY_DEVICE</strong>: Authentication failed</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INIT_SERVICE</p>
     */
    @NameInMap("Api")
    public String api;

    /**
     * <p>Device type.</p>
     * <ul>
     * <li>ios</li>
     * <li>android</li>
     * <li>websdk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ios</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>End time of the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760630399999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>Product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Service type:</p>
     * <ul>
     * <li><strong>antcloudauth</strong>: Financial-grade real-person authentication.</li>
     * <li><strong>cloudauthst</strong> (discontinued): Enhanced real-person authentication.</li>
     * <li><strong>cloudauth</strong> (discontinued): Real-person authentication.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudauthst</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Start time of the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760025600000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeVerifyFailStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyFailStatisticsRequest self = new DescribeVerifyFailStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyFailStatisticsRequest setAgeGt(String ageGt) {
        this.ageGt = ageGt;
        return this;
    }
    public String getAgeGt() {
        return this.ageGt;
    }

    public DescribeVerifyFailStatisticsRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public DescribeVerifyFailStatisticsRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public DescribeVerifyFailStatisticsRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeVerifyFailStatisticsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeVerifyFailStatisticsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeVerifyFailStatisticsRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
