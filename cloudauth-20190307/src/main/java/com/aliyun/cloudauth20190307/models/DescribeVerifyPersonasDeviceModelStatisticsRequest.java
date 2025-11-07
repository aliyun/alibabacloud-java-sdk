// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasDeviceModelStatisticsRequest extends TeaModel {
    /**
     * <p>Product Code.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000015316</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>Service type:</p>
     * <ul>
     * <li><strong>antcloudauth</strong>: Financial-grade real-person authentication.</li>
     * <li><strong>cloudauthst</strong> (discontinued): Enhanced real-person authentication.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Time range for the query, indicating how many days back.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeRange")
    public String timeRange;

    public static DescribeVerifyPersonasDeviceModelStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasDeviceModelStatisticsRequest self = new DescribeVerifyPersonasDeviceModelStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasDeviceModelStatisticsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeVerifyPersonasDeviceModelStatisticsRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DescribeVerifyPersonasDeviceModelStatisticsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeVerifyPersonasDeviceModelStatisticsRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
