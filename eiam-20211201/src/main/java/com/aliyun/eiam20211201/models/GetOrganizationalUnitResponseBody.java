// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitResponseBody extends TeaModel {
    /**
     * <p>The organizational unit data object.</p>
     */
    @NameInMap("OrganizationalUnit")
    public GetOrganizationalUnitResponseBodyOrganizationalUnit organizationalUnit;

    /**
     * <p>The request ID.</p>
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
         * <p>The time when the organizational unit was created. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>Test organization</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Specifies whether the organizational unit is a leaf node. A value of true indicates that the organizational unit has no child nodes. A value of false indicates that the organizational unit has child nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Leaf")
        public Boolean leaf;

        /**
         * <p>The external ID of the organizational unit. It is used to map external data to IDaaS organizational units. The default value is the IDaaS organizational unit ID. Note: The external ID must be unique within the same source type and source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("OrganizationalUnitExternalId")
        public String organizationalUnitExternalId;

        /**
         * <p>The organizational unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>The name of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>test_organizationalUnit_name</p>
         */
        @NameInMap("OrganizationalUnitName")
        public String organizationalUnitName;

        /**
         * <p>The source ID of the organizational unit. For self-managed organizational units, the default value is the instance ID. For other types, the value corresponds to the enterprise ID of the respective source. For example, for DingTalk, the value is the corpId of the DingTalk enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("OrganizationalUnitSourceId")
        public String organizationalUnitSourceId;

        /**
         * <p>The account source type. Valid values:</p>
         * <ul>
         * <li>build_in: Self-managed.</li>
         * <li>ding_talk: Imported from DingTalk.</li>
         * <li>ad: Imported from AD.</li>
         * <li>ldap: Imported from LDAP.</li>
         * <li>we_com: Imported from WeCom.</li>
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
         * <p>The time when the organizational unit was last updated. The value is a UNIX timestamp in milliseconds.</p>
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
