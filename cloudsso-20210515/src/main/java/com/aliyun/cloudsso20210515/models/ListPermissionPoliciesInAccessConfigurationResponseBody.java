// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListPermissionPoliciesInAccessConfigurationResponseBody extends TeaModel {
    /**
     * <p>The policies.</p>
     */
    @NameInMap("PermissionPolicies")
    public java.util.List<ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies> permissionPolicies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3A5E771F-1F5A-5555-A64E-579748AAFD98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of policies.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ListPermissionPoliciesInAccessConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionPoliciesInAccessConfigurationResponseBody self = new ListPermissionPoliciesInAccessConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionPoliciesInAccessConfigurationResponseBody setPermissionPolicies(java.util.List<ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies> permissionPolicies) {
        this.permissionPolicies = permissionPolicies;
        return this;
    }
    public java.util.List<ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies> getPermissionPolicies() {
        return this.permissionPolicies;
    }

    public ListPermissionPoliciesInAccessConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPermissionPoliciesInAccessConfigurationResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies extends TeaModel {
        /**
         * <p>The time when the policy was created for the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-03T06:37:25Z</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <p>The configurations of the inline policy.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of the PermissionPolicyType parameter is Inline.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Statement\&quot;: [{\&quot;Action\&quot;: \&quot;<em>\&quot;,\&quot;Effect\&quot;: \&quot;Allow\&quot;,\&quot;Resource\&quot;: \&quot;</em>\&quot;}],\&quot;Version\&quot;: \&quot;1\&quot;}</p>
         */
        @NameInMap("PermissionPolicyDocument")
        public String permissionPolicyDocument;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSFullAccess</p>
         */
        @NameInMap("PermissionPolicyName")
        public String permissionPolicyName;

        /**
         * <p>The type of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PermissionPolicyType")
        public String permissionPolicyType;

        public static ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies self = new ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies();
            return TeaModel.build(map, self);
        }

        public ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies setPermissionPolicyDocument(String permissionPolicyDocument) {
            this.permissionPolicyDocument = permissionPolicyDocument;
            return this;
        }
        public String getPermissionPolicyDocument() {
            return this.permissionPolicyDocument;
        }

        public ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies setPermissionPolicyName(String permissionPolicyName) {
            this.permissionPolicyName = permissionPolicyName;
            return this;
        }
        public String getPermissionPolicyName() {
            return this.permissionPolicyName;
        }

        public ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies setPermissionPolicyType(String permissionPolicyType) {
            this.permissionPolicyType = permissionPolicyType;
            return this;
        }
        public String getPermissionPolicyType() {
            return this.permissionPolicyType;
        }

    }

}
