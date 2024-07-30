// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsResponseBody extends TeaModel {
    /**
     * <p>The list of data objects of organizational units.</p>
     */
    @NameInMap("OrganizationalUnits")
    public java.util.List<ListOrganizationalUnitsResponseBodyOrganizationalUnits> organizationalUnits;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOrganizationalUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsResponseBody self = new ListOrganizationalUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsResponseBody setOrganizationalUnits(java.util.List<ListOrganizationalUnitsResponseBodyOrganizationalUnits> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }
    public java.util.List<ListOrganizationalUnitsResponseBodyOrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    public ListOrganizationalUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationalUnitsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrganizationalUnitsResponseBodyOrganizationalUnits extends TeaModel {
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
         * <p>组织名称。</p>
         * 
         * <strong>example:</strong>
         * <p>test_organizationalUnit_name</p>
         */
        @NameInMap("OrganizationalUnitName")
        public String organizationalUnitName;

        /**
         * <p>The source ID of the organizational unit.</p>
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

        public static ListOrganizationalUnitsResponseBodyOrganizationalUnits build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsResponseBodyOrganizationalUnits self = new ListOrganizationalUnitsResponseBodyOrganizationalUnits();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setLeaf(Boolean leaf) {
            this.leaf = leaf;
            return this;
        }
        public Boolean getLeaf() {
            return this.leaf;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }
        public String getOrganizationalUnitExternalId() {
            return this.organizationalUnitExternalId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }
        public String getOrganizationalUnitSourceId() {
            return this.organizationalUnitSourceId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }
        public String getOrganizationalUnitSourceType() {
            return this.organizationalUnitSourceType;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListOrganizationalUnitsResponseBodyOrganizationalUnits setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
