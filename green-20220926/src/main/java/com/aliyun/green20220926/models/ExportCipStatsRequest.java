// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportCipStatsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ByMonth")
    public Boolean byMonth;

    /**
     * <strong>example:</strong>
     * <p>2024-04-16 09:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ExportType")
    public String exportType;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <strong>example:</strong>
     * <p>2024-04-15 09:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>268220485413130979</p>
     */
    @NameInMap("SubUid")
    public String subUid;

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
