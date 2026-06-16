// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForApplicationResponseBody extends TeaModel {
    /**
     * <p>The list of organizations.</p>
     */
    @NameInMap("OrganizationalUnits")
    public java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits> organizationalUnits;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOrganizationalUnitsForApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsForApplicationResponseBody self = new ListOrganizationalUnitsForApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsForApplicationResponseBody setOrganizationalUnits(java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }
    public java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    public ListOrganizationalUnitsForApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationalUnitsForApplicationResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnitsApplicationRoles extends TeaModel {
        /**
         * <p>The ID of the application role.</p>
         * 
         * <strong>example:</strong>
         * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
         */
        @NameInMap("ApplicationRoleId")
        public String applicationRoleId;

        public static ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnitsApplicationRoles build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnitsApplicationRoles self = new ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnitsApplicationRoles();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnitsApplicationRoles setApplicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

    }

    public static class ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits extends TeaModel {
        /**
         * <p>The list of application roles.</p>
         */
        @NameInMap("ApplicationRoles")
        public java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnitsApplicationRoles> applicationRoles;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        public static ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits self = new ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits setApplicationRoles(java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnitsApplicationRoles> applicationRoles) {
            this.applicationRoles = applicationRoles;
            return this;
        }
        public java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnitsApplicationRoles> getApplicationRoles() {
            return this.applicationRoles;
        }

        public ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

    }

}
