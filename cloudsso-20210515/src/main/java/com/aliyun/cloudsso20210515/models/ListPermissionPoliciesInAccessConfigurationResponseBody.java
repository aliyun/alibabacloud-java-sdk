// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListPermissionPoliciesInAccessConfigurationResponseBody extends TeaModel {
    @NameInMap("PermissionPolicies")
    public java.util.List<ListPermissionPoliciesInAccessConfigurationResponseBodyPermissionPolicies> permissionPolicies;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AddTime")
        public String addTime;

        @NameInMap("PermissionPolicyDocument")
        public String permissionPolicyDocument;

        @NameInMap("PermissionPolicyName")
        public String permissionPolicyName;

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
