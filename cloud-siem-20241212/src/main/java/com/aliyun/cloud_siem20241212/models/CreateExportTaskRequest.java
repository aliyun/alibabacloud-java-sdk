// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateExportTaskRequest extends TeaModel {
    /**
     * <p>The parameters of the export task. The parameters are concatenated based on query conditions and formatted in JSON.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;IncidentName&quot;: &quot;name&quot;,
     *     &quot;IncidentStatus&quot;: &quot;1&quot;,
     *     &quot;ThreatLevel&quot;:[&quot;1&quot;,&quot;2&quot;],
     *     &quot;IncidentUuids&quot;:&quot;315EE627-39DC-560A-8DFD-CBF66AD9****&quot;
     * }</p>
     */
    @NameInMap("ExportTaskParameter")
    public String exportTaskParameter;

    /**
     * <p>The export type. Valid values:</p>
     * <ul>
     * <li>incident_list: incident list.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>incident_list</p>
     */
    @NameInMap("ExportTaskType")
    public String exportTaskType;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * Note: This parameter is required. If it is not provided, the API returns a 400 error with the message &quot;The specified Lang can not be empty.&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region of the data management center for Threat Analysis. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static CreateExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExportTaskRequest self = new CreateExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateExportTaskRequest setExportTaskParameter(String exportTaskParameter) {
        this.exportTaskParameter = exportTaskParameter;
        return this;
    }
    public String getExportTaskParameter() {
        return this.exportTaskParameter;
    }

    public CreateExportTaskRequest setExportTaskType(String exportTaskType) {
        this.exportTaskType = exportTaskType;
        return this;
    }
    public String getExportTaskType() {
        return this.exportTaskType;
    }

    public CreateExportTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateExportTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateExportTaskRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
