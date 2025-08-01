// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitResponseBody extends TeaModel {
    /**
     * <p>The data object of the organizational unit.</p>
     */
    @NameInMap("OrganizationalUnit")
    public GetOrganizationalUnitResponseBodyOrganizationalUnit organizationalUnit;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitResponseBody self = new GetOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitResponseBody setOrganizationalUnit(GetOrganizationalUnitResponseBodyOrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }
    public GetOrganizationalUnitResponseBodyOrganizationalUnit getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    public GetOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOrganizationalUnitResponseBodyOrganizationalUnit extends TeaModel {
        /**
         * <p>The time when the organizational unit was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>Test organizational unit</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the node is a leaf node.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Leaf")
        public Boolean leaf;

        /**
         * <p>The external ID of the organizational unit. The external ID can be used by external data to map the data of the organizational unit in IDaaS EIAM. By default, the external ID is the organizational unit ID.</p>
         * <p>For organizational units with the same source type and source ID, each organizational unit has a unique external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("OrganizationalUnitExternalId")
        public String organizationalUnitExternalId;

        /**
         * <p>The ID of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>The Name of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>test_organizationalUnit_name</p>
         */
        @NameInMap("OrganizationalUnitName")
        public String organizationalUnitName;

        /**
         * <p>The source ID of the organizational unit.</p>
         * <p>If the organizational unit was created in IDaaS, its source ID is the ID of the IDaaS instance. If the organizational unit was imported, its source ID is the enterprise ID in the source. For example, if the organizational unit was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("OrganizationalUnitSourceId")
        public String organizationalUnitSourceId;

        /**
         * <p>The source type of the organizational unit. Valid values:</p>
         * <ul>
         * <li>build_in: The organizational unit was created in IDaaS.</li>
         * <li>ding_talk: The organizational unit was imported from DingTalk.</li>
         * <li>ad: The organizational unit was imported from Microsoft Active Directory (AD).</li>
         * <li>ldap: The organizational unit was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        @NameInMap("OrganizationalUnitSourceType")
        public String organizationalUnitSourceType;

        /**
         * <p>The ID of the parent organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The time when the organizational unit was last updated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetOrganizationalUnitResponseBodyOrganizationalUnit build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationalUnitResponseBodyOrganizationalUnit self = new GetOrganizationalUnitResponseBodyOrganizationalUnit();
            return TeaModel.build(map, self);
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setLeaf(Boolean leaf) {
            this.leaf = leaf;
            return this;
        }
        public Boolean getLeaf() {
            return this.leaf;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }
        public String getOrganizationalUnitExternalId() {
            return this.organizationalUnitExternalId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }
        public String getOrganizationalUnitSourceId() {
            return this.organizationalUnitSourceId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }
        public String getOrganizationalUnitSourceType() {
            return this.organizationalUnitSourceType;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetOrganizationalUnitResponseBodyOrganizationalUnit setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
