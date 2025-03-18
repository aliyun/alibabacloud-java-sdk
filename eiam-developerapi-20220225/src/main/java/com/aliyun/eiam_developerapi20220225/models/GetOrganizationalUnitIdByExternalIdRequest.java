// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitIdByExternalIdRequest extends TeaModel {
    /**
     * <p>The external ID of the organizational unit. The external ID can be used to map external data to the data of the organizational unit in Employee Identity and Access Management (EIAM) of Identity as a Service (IDaaS). By default, the external ID is the organizational unit ID.</p>
     * <p>Note: For organizational units with the same source type and source ID, each organizational unit has a unique external ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("organizationalUnitExternalId")
    public String organizationalUnitExternalId;

    /**
     * <p>The source ID of the organizational unit.</p>
     * <p>If the organizational unit was created in IDaaS, its source ID is the ID of the IDaaS instance. If the organizational unit was imported, its source ID is the enterprise ID in the source. For example, if the organizational unit was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("organizationalUnitSourceId")
    public String organizationalUnitSourceId;

    /**
     * <p>The source type of the organizational unit. Valid values:</p>
     * <ul>
     * <li>build_in: The organizational unit was created in IDaaS.</li>
     * <li>ding_talk: The organizational unit was imported from DingTalk.</li>
     * <li>ad: The organizational unit was imported from Microsoft Active Directory (AD).</li>
     * <li>ldap: The organizational unit was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>build_in</p>
     */
    @NameInMap("organizationalUnitSourceType")
    public String organizationalUnitSourceType;

    public static GetOrganizationalUnitIdByExternalIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitIdByExternalIdRequest self = new GetOrganizationalUnitIdByExternalIdRequest();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitIdByExternalIdRequest setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
        this.organizationalUnitExternalId = organizationalUnitExternalId;
        return this;
    }
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    public GetOrganizationalUnitIdByExternalIdRequest setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
        this.organizationalUnitSourceId = organizationalUnitSourceId;
        return this;
    }
    public String getOrganizationalUnitSourceId() {
        return this.organizationalUnitSourceId;
    }

    public GetOrganizationalUnitIdByExternalIdRequest setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
        this.organizationalUnitSourceType = organizationalUnitSourceType;
        return this;
    }
    public String getOrganizationalUnitSourceType() {
        return this.organizationalUnitSourceType;
    }

}
