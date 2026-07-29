// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsResponseBody extends TeaModel {
    /**
     * <p>A list of data objects.</p>
     */
    @NameInMap("data")
    public java.util.List<ListOrganizationalUnitsResponseBodyData> data;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListOrganizationalUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsResponseBody self = new ListOrganizationalUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsResponseBody setData(java.util.List<ListOrganizationalUnitsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOrganizationalUnitsResponseBodyData> getData() {
        return this.data;
    }

    public ListOrganizationalUnitsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrganizationalUnitsResponseBodyData extends TeaModel {
        /**
         * <p>The time when the organization was created. This is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652083425923</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The description of the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>测试组织</p>
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
         * <p>The external ID of the organization. This ID is used to map external data to the organization\&quot;s data in IDaaS. The default value is the IDaaS organization ID.</p>
         * <p>Note: The external ID must be unique for the same source type and source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("organizationalUnitExternalId")
        public String organizationalUnitExternalId;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("organizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>The organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>name001</p>
         */
        @NameInMap("organizationalUnitName")
        public String organizationalUnitName;

        /**
         * <p>The source ID of the organization.</p>
         * <p>For the \<code>build_in\\</code> type, the default value is the instance ID. For other types, the value is the enterprise ID from the source. For example, if the source is DingTalk, the value is the \<code>corpId\\</code> of the DingTalk enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("organizationalUnitSourceId")
        public String organizationalUnitSourceId;

        /**
         * <p>The source type of the organization. Valid values:</p>
         * <ul>
         * <li><p>\<code>build_in\\</code>: The organization is created in IDaaS.</p>
         * </li>
         * <li><p>\<code>ding_talk\\</code>: The organization is imported from DingTalk.</p>
         * </li>
         * <li><p>\<code>ad\\</code>: The organization is imported from Active Directory (AD).</p>
         * </li>
         * <li><p>\<code>ldap\\</code>: The organization is imported from LDAP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        @NameInMap("organizationalUnitSourceType")
        public String organizationalUnitSourceType;

        /**
         * <p>The parent organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The time when the organization was last updated. This is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652083425923</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static ListOrganizationalUnitsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsResponseBodyData self = new ListOrganizationalUnitsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListOrganizationalUnitsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOrganizationalUnitsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }
        public String getOrganizationalUnitExternalId() {
            return this.organizationalUnitExternalId;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitSourceId(String organizationalUnitSourceId) {
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }
        public String getOrganizationalUnitSourceId() {
            return this.organizationalUnitSourceId;
        }

        public ListOrganizationalUnitsResponseBodyData setOrganizationalUnitSourceType(String organizationalUnitSourceType) {
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }
        public String getOrganizationalUnitSourceType() {
            return this.organizationalUnitSourceType;
        }

        public ListOrganizationalUnitsResponseBodyData setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListOrganizationalUnitsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
