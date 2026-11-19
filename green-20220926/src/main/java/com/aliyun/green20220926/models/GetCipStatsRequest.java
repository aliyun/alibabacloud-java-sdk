// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetCipStatsRequest extends TeaModel {
    /**
     * <p>Specifies whether monthly indexing is supported. Valid values: true: Supported. false: Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ByMonth")
    public Boolean byMonth;

    /**
     * <p>The end time of the query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
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
     * <p>porn</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The query conditions.</p>
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
     * <p>The start time of the query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
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
     * <p>The type. Valid values: <strong>cip</strong>: Content Moderation invoke usage statistics. <strong>risk_level</strong>: Content Moderation security risk level statistics. <strong>content_moderation</strong>: content compliance risk level and label statistics for AI security guardrails. <strong>sensitive_data</strong>: sensitive data risk level and label statistics for AI security guardrails. <strong>prompt_attack</strong>: prompt risk level and label statistics for AI security guardrails.</p>
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
