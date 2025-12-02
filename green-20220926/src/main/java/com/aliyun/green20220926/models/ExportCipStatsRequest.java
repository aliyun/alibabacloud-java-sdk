// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportCipStatsRequest extends TeaModel {
    /**
     * <p>Whether to support monthly indexing. Values: -<strong>true</strong>: Supported. -<strong>false</strong>: Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ByMonth")
    public Boolean byMonth;

    /**
     * <p>The end time of the query, in the format yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-16 09:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Export type. Values: -<strong>level</strong>: Export by risk level. -<strong>label</strong>: Export by label.</p>
     * 
     * <strong>example:</strong>
     * <p>label</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The label of the task to be exported.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Service code.</p>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The start time of the query, in the format yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-15 09:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>Sub-account UID.</p>
     * 
     * <strong>example:</strong>
     * <p>268220485413130979</p>
     */
    @NameInMap("SubUid")
    public String subUid;

    /**
     * <p>Type, values: -<strong>cip</strong>: Content Security Invocation Count Statistics. -<strong>risk_level</strong>: Content Security Risk Level Statistics. -<strong>content_moderation</strong>: AI Safety Guardrail Content Compliance Risk Level and Label Statistics. -<strong>sensitive_data</strong>: AI Safety Guardrail Sensitive Data Risk Level and Label Statistics. -<strong>prompt_attack</strong>: AI Safety Guardrail Prompt Word Risk Level and Label Statistics.</p>
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
