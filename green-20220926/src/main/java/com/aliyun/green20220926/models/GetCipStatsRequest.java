// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetCipStatsRequest extends TeaModel {
    /**
     * <p>Specifies whether monthly indexing is supported. Valid values:</p>
     * <ul>
     * <li>true: Supported.</li>
     * <li>false: Not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ByMonth")
    public Boolean byMonth;

    /**
     * <p>The end time of the query. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-11 10:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The label.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The query condition.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The service code.</p>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The start time of the query. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-10 10:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The UID of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>253552244990701265</p>
     */
    @NameInMap("SubUid")
    public String subUid;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li><strong>cip</strong>: Content Moderation invocation usage statistics.</li>
     * <li><strong>risk_level</strong>: Content Moderation risk level statistics.</li>
     * <li><strong>content_moderation</strong>: AI safety guardrail content compliance risk level and tag statistics.</li>
     * <li><strong>sensitive_data</strong>: AI safety guardrail sensitive data risk level and tag statistics.</li>
     * <li><strong>prompt_attack</strong>: AI safety guardrail prompt risk level and tag statistics.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>risk_level</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetCipStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCipStatsRequest self = new GetCipStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetCipStatsRequest setByMonth(Boolean byMonth) {
        this.byMonth = byMonth;
        return this;
    }
    public Boolean getByMonth() {
        return this.byMonth;
    }

    public GetCipStatsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetCipStatsRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public GetCipStatsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetCipStatsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCipStatsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetCipStatsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetCipStatsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetCipStatsRequest setSubUid(String subUid) {
        this.subUid = subUid;
        return this;
    }
    public String getSubUid() {
        return this.subUid;
    }

    public GetCipStatsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
