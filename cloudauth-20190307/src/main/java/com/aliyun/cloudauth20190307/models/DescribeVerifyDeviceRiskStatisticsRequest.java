// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyDeviceRiskStatisticsRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1748624399999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The code of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100000xxxx</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><strong>antcloudauth</strong>: financial-grade ID Verification.</li>
     * <li><strong>cloudauthst</strong> (discontinued): ID Verification - Enhanced Edition.</li>
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
     * <p>The start time of the query. The value is a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1746720000000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeVerifyDeviceRiskStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyDeviceRiskStatisticsRequest self = new DescribeVerifyDeviceRiskStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyDeviceRiskStatisticsRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeVerifyDeviceRiskStatisticsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeVerifyDeviceRiskStatisticsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public DescribeVerifyDeviceRiskStatisticsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeVerifyDeviceRiskStatisticsRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
