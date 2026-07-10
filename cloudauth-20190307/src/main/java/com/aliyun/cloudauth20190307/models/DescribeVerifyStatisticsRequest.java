// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyStatisticsRequest extends TeaModel {
    /**
     * <p>Specifies whether the age is older than 14. Valid values:</p>
     * <ul>
     * <li><strong>T</strong>: older than 14</li>
     * <li><strong>F</strong>: younger than 14.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("AgeGt")
    public String ageGt;

    /**
     * <p>The end time of the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760630399999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><strong>antcloudauth</strong>: financial-grade ID Verification.</li>
     * <li><strong>cloudauthst</strong> (discontinued): enhanced ID Verification.</li>
     * <li><strong>cloudauth</strong> (discontinued): ID Verification.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The start time of the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760025600000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeVerifyStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyStatisticsRequest self = new DescribeVerifyStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyStatisticsRequest setAgeGt(String ageGt) {
        this.ageGt = ageGt;
        return this;
    }
    public String getAgeGt() {
        return this.ageGt;
    }

    public DescribeVerifyStatisticsRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeVerifyStatisticsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeVerifyStatisticsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeVerifyStatisticsRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
