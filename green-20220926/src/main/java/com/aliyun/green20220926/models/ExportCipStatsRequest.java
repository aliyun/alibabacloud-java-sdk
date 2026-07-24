// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportCipStatsRequest extends TeaModel {
    /**
     * <p>Specifies whether monthly indexing is supported. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
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
     * <p>2024-04-16 09:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The export type. Valid values:</p>
     * <ul>
     * <li><strong>level</strong>: export by risk level.</li>
     * <li><strong>label</strong>: export by label.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>label</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The task label to export.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Label")
    public String label;

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
     * <p>2024-04-15 09:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The UID of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>268220485413130979</p>
     */
    @NameInMap("SubUid")
    public String subUid;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li><strong>cip</strong>: Content Moderation invocation volume statistics.</li>
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

    public static ExportCipStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCipStatsRequest self = new ExportCipStatsRequest();
        return TeaModel.build(map, self);
    }

    public ExportCipStatsRequest setByMonth(Boolean byMonth) {
        this.byMonth = byMonth;
        return this;
    }
    public Boolean getByMonth() {
        return this.byMonth;
    }

    public ExportCipStatsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportCipStatsRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportCipStatsRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ExportCipStatsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportCipStatsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ExportCipStatsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public ExportCipStatsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ExportCipStatsRequest setSubUid(String subUid) {
        this.subUid = subUid;
        return this;
    }
    public String getSubUid() {
        return this.subUid;
    }

    public ExportCipStatsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
