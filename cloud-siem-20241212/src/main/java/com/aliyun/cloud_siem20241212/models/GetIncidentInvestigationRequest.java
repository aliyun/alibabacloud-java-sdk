// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetIncidentInvestigationRequest extends TeaModel {
    /**
     * <p>The display ID of the AI investigation report. You can obtain this value from the IncidentInvestigationDisplayId field returned by ListIncidentInvestigations. This parameter takes effect only when IncidentInvestigationId is not specified. If neither identifier is specified, the most recent successfully completed investigation result for the specified incident is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>755616bb5d63046c1e4f62ea872a****</p>
     */
    @NameInMap("IncidentInvestigationDisplayId")
    public String incidentInvestigationDisplayId;

    /**
     * <p>The AI investigation report ID. You can obtain this value from the IncidentInvestigationId field returned by ListIncidentInvestigations. If both this parameter and IncidentInvestigationDisplayId are specified, this parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>951a6a0b-14c7-4332-ace6-bff21c******</p>
     */
    @NameInMap("IncidentInvestigationId")
    public String incidentInvestigationId;

    /**
     * <p>The globally unique identity of the event. If neither the report ID nor the display ID is specified, the most recent successfully completed investigation result for this event is returned via event query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Chinese mainland.</li>
     * <li>ap-southeast-1: Outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to the view of another member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static GetIncidentInvestigationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentInvestigationRequest self = new GetIncidentInvestigationRequest();
        return TeaModel.build(map, self);
    }

    public GetIncidentInvestigationRequest setIncidentInvestigationDisplayId(String incidentInvestigationDisplayId) {
        this.incidentInvestigationDisplayId = incidentInvestigationDisplayId;
        return this;
    }
    public String getIncidentInvestigationDisplayId() {
        return this.incidentInvestigationDisplayId;
    }

    public GetIncidentInvestigationRequest setIncidentInvestigationId(String incidentInvestigationId) {
        this.incidentInvestigationId = incidentInvestigationId;
        return this;
    }
    public String getIncidentInvestigationId() {
        return this.incidentInvestigationId;
    }

    public GetIncidentInvestigationRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public GetIncidentInvestigationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetIncidentInvestigationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetIncidentInvestigationRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
