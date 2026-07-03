// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListTrafficStatisticsRequest extends TeaModel {
    /**
     * <p>The language of the response messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>A list of user IDs for batch data ingestion.</p>
     */
    @NameInMap("LogUserIds")
    public java.util.List<Long> logUserIds;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region of the Data Management center for threat analysis. Select a region based on the location of your asset. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your asset is in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your asset is outside China.</p>
     * </li>
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
     * <p>The user ID of a member. This parameter is used by an administrator to switch to the perspective of the member.</p>
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
     * <p>The statistic granularity. Valid values:</p>
     * <ul>
     * <li><p>day: day. This is the default value.</p>
     * </li>
     * <li><p>hour: hour.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("TrafficStatisticPeriodType")
    public String trafficStatisticPeriodType;

    /**
     * <p>The statistic dimension. Valid values:</p>
     * <ul>
     * <li><p>Region</p>
     * </li>
     * <li><p>Product</p>
     * </li>
     * <li><p>DataIngetion</p>
     * </li>
     * <li><p>logUserId</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Region</p>
     */
    @NameInMap("TrafficStatisticType")
    public String trafficStatisticType;

    /**
     * <p>The type of the log traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>agentAnalysisLogTraffic</p>
     */
    @NameInMap("TrafficType")
    public String trafficType;

    public static ListTrafficStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficStatisticsRequest self = new ListTrafficStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrafficStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTrafficStatisticsRequest setLogUserIds(java.util.List<Long> logUserIds) {
        this.logUserIds = logUserIds;
        return this;
    }
    public java.util.List<Long> getLogUserIds() {
        return this.logUserIds;
    }

    public ListTrafficStatisticsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListTrafficStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTrafficStatisticsRequest setRegionTag(Integer regionTag) {
        this.regionTag = regionTag;
        return this;
    }
    public Integer getRegionTag() {
        return this.regionTag;
    }

    public ListTrafficStatisticsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListTrafficStatisticsRequest setTrafficStatisticPeriod(String trafficStatisticPeriod) {
        this.trafficStatisticPeriod = trafficStatisticPeriod;
        return this;
    }
    public String getTrafficStatisticPeriod() {
        return this.trafficStatisticPeriod;
    }

    public ListTrafficStatisticsRequest setTrafficStatisticPeriodType(String trafficStatisticPeriodType) {
        this.trafficStatisticPeriodType = trafficStatisticPeriodType;
        return this;
    }
    public String getTrafficStatisticPeriodType() {
        return this.trafficStatisticPeriodType;
    }

    public ListTrafficStatisticsRequest setTrafficStatisticType(String trafficStatisticType) {
        this.trafficStatisticType = trafficStatisticType;
        return this;
    }
    public String getTrafficStatisticType() {
        return this.trafficStatisticType;
    }

    public ListTrafficStatisticsRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
