// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateExportTaskRequest extends TeaModel {
    /**
     * <p>The parameters for the export task. The value is a JSON string that is generated based on the query conditions.</p>
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
     * <p>The type of data to export. Valid values:</p>
     * <ul>
     * <li>incident_list: event list.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>incident_list</p>
     */
    @NameInMap("ExportTaskType")
    public String exportTaskType;

    /**
     * <p>The language of the response. Valid values:</p>
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
     * <p>The region of the Data Management center. Select a region based on where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: The Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Regions outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can use this parameter to switch to the perspective of a member.</p>
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
