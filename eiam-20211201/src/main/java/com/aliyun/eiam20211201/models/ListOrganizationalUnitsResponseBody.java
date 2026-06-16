// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsResponseBody extends TeaModel {
    /**
     * <p>The list of organizational units.</p>
     */
    @NameInMap("OrganizationalUnits")
    public java.util.List<ListOrganizationalUnitsResponseBodyOrganizationalUnits> organizationalUnits;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that are returned. This value is the total number of matched entries. The maximum number of entries that can be returned in a single request is specified by PageSize.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
         * <p>The time when the organizational unit was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
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
         * <p>Indicates whether the organizational unit is a leaf node. A value of true indicates that the organizational unit has no child nodes. A value of false indicates that the organizational unit has child nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Leaf")
        public Boolean leaf;

        /**
         * <p>The external ID of the organizational unit. This ID is used to map the data of the organizational unit to the data of an external system. By default, the value of this parameter is the organizational unit ID.</p>
         * <p>Note: The external ID must be unique within the same source type and source ID.</p>
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
         * <li>build_in: The organizational unit is created in IDaaS.</li>
         * <li>ding_talk: The organizational unit is imported from DingTalk.</li>
         * <li>ad: The organizational unit is imported from Active Directory (AD).</li>
         * <li>ldap: The organizational unit is imported from a Lightweight Directory Access Protocol (LDAP) directory.</li>
         * <li>we_com: The organizational unit is imported from WeCom.</li>
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
