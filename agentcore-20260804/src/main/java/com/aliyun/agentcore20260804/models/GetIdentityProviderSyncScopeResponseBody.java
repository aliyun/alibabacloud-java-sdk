// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderSyncScopeResponseBody extends TeaModel {
    /**
     * <p>The business status code of the API request. SUCCESS indicates that the request is successful, but does not indicate that the asynchronous synchronization task is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The business data returned by the request.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;syncScope&quot;:{&quot;mode&quot;:&quot;SelectedDepartments&quot;,&quot;departmentIds&quot;:[&quot;10001&quot;]},&quot;selectedDepartments&quot;:[{&quot;id&quot;:&quot;10001&quot;,&quot;name&quot;:&quot;R&amp;D Department&quot;,&quot;exists&quot;:true}],&quot;estimateStatus&quot;:&quot;Ready&quot;,&quot;expandedDepartmentCount&quot;:2,&quot;estimatedUserCount&quot;:12}</p>
     */
    @NameInMap("data")
    public GetIdentityProviderSyncScopeResponseBodyData data;

    /**
     * <p>The HTTP status code of the API request. It does not indicate the execution result of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message of the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request. Provide this value when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API request is successful. To check whether the asynchronous task is completed, query the task status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetIdentityProviderSyncScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderSyncScopeResponseBody self = new GetIdentityProviderSyncScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderSyncScopeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentityProviderSyncScopeResponseBody setData(GetIdentityProviderSyncScopeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentityProviderSyncScopeResponseBodyData getData() {
        return this.data;
    }

    public GetIdentityProviderSyncScopeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetIdentityProviderSyncScopeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentityProviderSyncScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderSyncScopeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments extends TeaModel {
        /**
         * <p>Indicates whether the selected department still exists. A value of false indicates that the selection is invalid and the synchronization scope must be reconfirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("exists")
        public Boolean exists;

        /**
         * <p>The unique identifier of the department returned by the identity provider. When querying the sub-departments of this node, use this value as parentDepartmentId.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the department returned by the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department</p>
         */
        @NameInMap("name")
        public String name;

        public static GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments self = new GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }
        public Boolean getExists() {
            return this.exists;
        }

        public GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetIdentityProviderSyncScopeResponseBodyDataSyncScope extends TeaModel {
        /**
         * <p>When the mode is SelectedDepartments, this parameter contains at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When the mode is AllAuthorized, pass an empty array or omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>The scope mode. Valid values: AllAuthorized (the entire authorized scope, limited by the application\&quot;s address book authorization) and SelectedDepartments (the selected departments and all their sub-departments). When explicitly submitting syncScope, a valid mode must be provided and verified by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("mode")
        public String mode;

        public static GetIdentityProviderSyncScopeResponseBodyDataSyncScope build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderSyncScopeResponseBodyDataSyncScope self = new GetIdentityProviderSyncScopeResponseBodyDataSyncScope();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderSyncScopeResponseBodyDataSyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public GetIdentityProviderSyncScopeResponseBodyDataSyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class GetIdentityProviderSyncScopeResponseBodyData extends TeaModel {
        /**
         * <p>The estimation status of the user count for the synchronization scope. The count is available only when the status is Ready. A missing count in other states cannot be considered as 0.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("estimateStatus")
        public String estimateStatus;

        /**
         * <p>The estimated number of users in the saved synchronization scope. This parameter is returned only when estimateStatus is Ready and the downstream system provides the value. It does not represent the number of users that have been synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("estimatedUserCount")
        public Long estimatedUserCount;

        /**
         * <p>The estimated number of departments including sub-departments. This parameter is returned only when estimateStatus is Ready and the downstream system provides the value.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("expandedDepartmentCount")
        public Long expandedDepartmentCount;

        /**
         * <p>The names and validity of the saved selected departments. This parameter can be an empty array when the mode is AllAuthorized. An empty array does not indicate that the organization has no departments.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;10001&quot;,&quot;name&quot;:&quot;R&amp;D Department&quot;,&quot;exists&quot;:true}]</p>
         */
        @NameInMap("selectedDepartments")
        public java.util.List<GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments> selectedDepartments;

        /**
         * <p>The saved synchronization scope downstream. AllAuthorized indicates the address book scope authorized for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;SelectedDepartments&quot;,&quot;departmentIds&quot;:[&quot;10001&quot;]}</p>
         */
        @NameInMap("syncScope")
        public GetIdentityProviderSyncScopeResponseBodyDataSyncScope syncScope;

        public static GetIdentityProviderSyncScopeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderSyncScopeResponseBodyData self = new GetIdentityProviderSyncScopeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderSyncScopeResponseBodyData setEstimateStatus(String estimateStatus) {
            this.estimateStatus = estimateStatus;
            return this;
        }
        public String getEstimateStatus() {
            return this.estimateStatus;
        }

        public GetIdentityProviderSyncScopeResponseBodyData setEstimatedUserCount(Long estimatedUserCount) {
            this.estimatedUserCount = estimatedUserCount;
            return this;
        }
        public Long getEstimatedUserCount() {
            return this.estimatedUserCount;
        }

        public GetIdentityProviderSyncScopeResponseBodyData setExpandedDepartmentCount(Long expandedDepartmentCount) {
            this.expandedDepartmentCount = expandedDepartmentCount;
            return this;
        }
        public Long getExpandedDepartmentCount() {
            return this.expandedDepartmentCount;
        }

        public GetIdentityProviderSyncScopeResponseBodyData setSelectedDepartments(java.util.List<GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments> selectedDepartments) {
            this.selectedDepartments = selectedDepartments;
            return this;
        }
        public java.util.List<GetIdentityProviderSyncScopeResponseBodyDataSelectedDepartments> getSelectedDepartments() {
            return this.selectedDepartments;
        }

        public GetIdentityProviderSyncScopeResponseBodyData setSyncScope(GetIdentityProviderSyncScopeResponseBodyDataSyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public GetIdentityProviderSyncScopeResponseBodyDataSyncScope getSyncScope() {
            return this.syncScope;
        }

    }

}
