// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateExportTaskRequest extends TeaModel {
    /**
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
     * <strong>example:</strong>
     * <p>incident_list</p>
     */
    @NameInMap("ExportTaskType")
    public String exportTaskType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
