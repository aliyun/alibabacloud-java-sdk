// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasOsStatisticsRequest extends TeaModel {
    /**
     * <p>Product code.</p>
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
     * <p>1000002995</p>
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
     * <p>Time range for the query, indicating how many days ago.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TimeRange")
    public String timeRange;

    public static DescribeVerifyPersonasOsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasOsStatisticsRequest self = new DescribeVerifyPersonasOsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasOsStatisticsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeVerifyPersonasOsStatisticsRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DescribeVerifyPersonasOsStatisticsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeVerifyPersonasOsStatisticsRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
