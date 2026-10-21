// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListTrafficStatisticsShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * Note: This parameter is required in practice. If this parameter is not specified, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of user IDs for batch data ingestion.</p>
     */
    @NameInMap("LogUserIds")
    public String logUserIdsShrink;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region where the threat detection and response data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegionTag")
    public Integer regionTag;

    /**
     * <p>The user ID that the administrator switches to when viewing from another member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The statistical period.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TrafficStatisticPeriod")
    public String trafficStatisticPeriod;

    /**
     * <p>The statistical granularity. Valid values:</p>
     * <ul>
     * <li>day: day. This is the default value.</li>
     * <li>hour: hour.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("TrafficStatisticPeriodType")
    public String trafficStatisticPeriodType;

    /**
     * <p>The statistical dimension. Valid values:</p>
     * <ul>
     * <li>Region</li>
     * <li>Product</li>
     * <li>DataIngetion</li>
     * <li>logUserId</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Region</p>
     */
    @NameInMap("TrafficStatisticType")
    public String trafficStatisticType;

    /**
     * <p>The log traffic type.</p>
     * 
     * <strong>example:</strong>
     * <p>agentAnalysisLogTraffic</p>
     */
    @NameInMap("TrafficType")
    public String trafficType;

    public static ListTrafficStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficStatisticsShrinkRequest self = new ListTrafficStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTrafficStatisticsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTrafficStatisticsShrinkRequest setLogUserIdsShrink(String logUserIdsShrink) {
        this.logUserIdsShrink = logUserIdsShrink;
        return this;
    }
    public String getLogUserIdsShrink() {
        return this.logUserIdsShrink;
    }

    public ListTrafficStatisticsShrinkRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListTrafficStatisticsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTrafficStatisticsShrinkRequest setRegionTag(Integer regionTag) {
        this.regionTag = regionTag;
        return this;
    }
    public Integer getRegionTag() {
        return this.regionTag;
    }

    public ListTrafficStatisticsShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListTrafficStatisticsShrinkRequest setTrafficStatisticPeriod(String trafficStatisticPeriod) {
        this.trafficStatisticPeriod = trafficStatisticPeriod;
        return this;
    }
    public String getTrafficStatisticPeriod() {
        return this.trafficStatisticPeriod;
    }

    public ListTrafficStatisticsShrinkRequest setTrafficStatisticPeriodType(String trafficStatisticPeriodType) {
        this.trafficStatisticPeriodType = trafficStatisticPeriodType;
        return this;
    }
    public String getTrafficStatisticPeriodType() {
        return this.trafficStatisticPeriodType;
    }

    public ListTrafficStatisticsShrinkRequest setTrafficStatisticType(String trafficStatisticType) {
        this.trafficStatisticType = trafficStatisticType;
        return this;
    }
    public String getTrafficStatisticType() {
        return this.trafficStatisticType;
    }

    public ListTrafficStatisticsShrinkRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
