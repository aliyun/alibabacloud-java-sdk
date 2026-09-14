// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiagnoseReportRequest extends TeaModel {
    /**
     * <p>A client-generated token to ensure request idempotency. This lets you safely retry the request without creating a duplicate diagnostic report. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The diagnosis type. The only valid value is:</p>
     * <ul>
     * <li>Performance: performance diagnosis</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("DiagnoseType")
    public String diagnoseType;

    /**
     * <p>The end time for the diagnosis, in UTC. The time must be in the ISO 8601 format (yyyy-MM-ddTHH:mm:ssZ).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-07T16:49:25Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region ID. Call the <a href="https://help.aliyun.com/zh/ecs/developer-reference/api-ebs-2021-07-30-describeregions?spm=a2c4g.11186623.0.i7">DescribeRegions</a> operation to find all regions supported by EBS Data Insight.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-asb1s8***</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. The only valid value is:</p>
     * <ul>
     * <li>Disk: a cloud disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disk</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The start time for the diagnosis, in UTC. The time must be in the ISO 8601 format (yyyy-MM-ddTHH:mm:ssZ).</p>
     * 
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
