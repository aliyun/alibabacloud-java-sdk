// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetIdentityProviderSyncScopeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("EstimateStatus")
    public String estimateStatus;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("EstimatedUserCount")
    public Long estimatedUserCount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ExpandedDepartmentCount")
    public Long expandedDepartmentCount;

    /**
     * <strong>example:</strong>
     * <p>EXAMPLE-REQUEST-ID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SelectedDepartments")
    public java.util.List<GetIdentityProviderSyncScopeResponseBodySelectedDepartments> selectedDepartments;

    @NameInMap("SyncScope")
    public GetIdentityProviderSyncScopeResponseBodySyncScope syncScope;

    public static GetIdentityProviderSyncScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderSyncScopeResponseBody self = new GetIdentityProviderSyncScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderSyncScopeResponseBody setEstimateStatus(String estimateStatus) {
        this.estimateStatus = estimateStatus;
        return this;
    }
    public String getEstimateStatus() {
        return this.estimateStatus;
    }

    public GetIdentityProviderSyncScopeResponseBody setEstimatedUserCount(Long estimatedUserCount) {
        this.estimatedUserCount = estimatedUserCount;
        return this;
    }
    public Long getEstimatedUserCount() {
        return this.estimatedUserCount;
    }

    public GetIdentityProviderSyncScopeResponseBody setExpandedDepartmentCount(Long expandedDepartmentCount) {
        this.expandedDepartmentCount = expandedDepartmentCount;
        return this;
    }
    public Long getExpandedDepartmentCount() {
        return this.expandedDepartmentCount;
    }

    public GetIdentityProviderSyncScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderSyncScopeResponseBody setSelectedDepartments(java.util.List<GetIdentityProviderSyncScopeResponseBodySelectedDepartments> selectedDepartments) {
        this.selectedDepartments = selectedDepartments;
        return this;
    }
    public java.util.List<GetIdentityProviderSyncScopeResponseBodySelectedDepartments> getSelectedDepartments() {
        return this.selectedDepartments;
    }

    public GetIdentityProviderSyncScopeResponseBody setSyncScope(GetIdentityProviderSyncScopeResponseBodySyncScope syncScope) {
        this.syncScope = syncScope;
        return this;
    }
    public GetIdentityProviderSyncScopeResponseBodySyncScope getSyncScope() {
        return this.syncScope;
    }

    public static class GetIdentityProviderSyncScopeResponseBodySelectedDepartments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Exists")
        public Boolean exists;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>研发部</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetIdentityProviderSyncScopeResponseBodySelectedDepartments build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderSyncScopeResponseBodySelectedDepartments self = new GetIdentityProviderSyncScopeResponseBodySelectedDepartments();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderSyncScopeResponseBodySelectedDepartments setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }
        public Boolean getExists() {
            return this.exists;
        }

        public GetIdentityProviderSyncScopeResponseBodySelectedDepartments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetIdentityProviderSyncScopeResponseBodySelectedDepartments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetIdentityProviderSyncScopeResponseBodySyncScope extends TeaModel {
        @NameInMap("DepartmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static GetIdentityProviderSyncScopeResponseBodySyncScope build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderSyncScopeResponseBodySyncScope self = new GetIdentityProviderSyncScopeResponseBodySyncScope();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderSyncScopeResponseBodySyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public GetIdentityProviderSyncScopeResponseBodySyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}
