// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitResponseBody extends TeaModel {
    /**
     * <p>The time when the organizational unit was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1652083425923</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The description of the organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The external ID of the organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>id_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("organizationalUnitExternalId")
    public String organizationalUnitExternalId;

    /**
     * <p>The ID of the organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("organizationalUnitId")
    public String organizationalUnitId;

    /**
     * <p>The name of the organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>name001</p>
     */
    @NameInMap("organizationalUnitName")
    public String organizationalUnitName;

    /**
     * <p>The source ID of the organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>id_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("organizationalUnitSourceId")
    public String organizationalUnitSourceId;

    /**
     * <p>The source type of the organizational unit. Valid values:</p>
     * <ul>
     * <li>build_in: The organizational unit was created in Identity as a Service (IDaaS).</li>
     * <li>ding_talk: The organizational unit was imported from DingTalk.</li>
     * <li>ad: The organizational unit was imported from Microsoft Active Directory (AD).</li>
     * <li>ldap: The organizational unit was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>build_in</p>
     */
    @NameInMap("organizationalUnitSourceType")
    public String organizationalUnitSourceType;

    /**
     * <p>The ID of the parent organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("parentId")
    public String parentId;

    /**
     * <p>The time when the organizational unit was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1652083425923</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static GetOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitResponseBody self = new GetOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetOrganizationalUnitResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetOrganizationalUnitResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
        this.organizationalUnitExternalId = organizationalUnitExternalId;
        return this;
    }
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
        this.organizationalUnitSourceId = organizationalUnitSourceId;
        return this;
    }
    public String getOrganizationalUnitSourceId() {
        return this.organizationalUnitSourceId;
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
        this.organizationalUnitSourceType = organizationalUnitSourceType;
        return this;
    }
    public String getOrganizationalUnitSourceType() {
        return this.organizationalUnitSourceType;
    }

    public GetOrganizationalUnitResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public GetOrganizationalUnitResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
