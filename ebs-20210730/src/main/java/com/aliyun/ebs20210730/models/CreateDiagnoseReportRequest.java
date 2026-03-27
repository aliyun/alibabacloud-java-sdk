// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiagnoseReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("DiagnoseType")
    public String diagnoseType;

    /**
     * <strong>example:</strong>
     * <p>2024-09-07T16:49:25Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>d-asb1s8***</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>Disk</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>2024-09-01T02:26:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnoseReportRequest self = new CreateDiagnoseReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnoseReportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDiagnoseReportRequest setDiagnoseType(String diagnoseType) {
        this.diagnoseType = diagnoseType;
        return this;
    }
    public String getDiagnoseType() {
        return this.diagnoseType;
    }

    public CreateDiagnoseReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateDiagnoseReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiagnoseReportRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateDiagnoseReportRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateDiagnoseReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
