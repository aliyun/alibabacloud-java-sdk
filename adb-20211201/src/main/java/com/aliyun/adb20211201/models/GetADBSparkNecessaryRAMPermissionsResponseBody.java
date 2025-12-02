// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetADBSparkNecessaryRAMPermissionsResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetADBSparkNecessaryRAMPermissionsResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>642F3512-C628-5D0C-8815-F6670C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetADBSparkNecessaryRAMPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetADBSparkNecessaryRAMPermissionsResponseBody self = new GetADBSparkNecessaryRAMPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetADBSparkNecessaryRAMPermissionsResponseBody setData(GetADBSparkNecessaryRAMPermissionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetADBSparkNecessaryRAMPermissionsResponseBodyData getData() {
        return this.data;
    }

    public GetADBSparkNecessaryRAMPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail extends TeaModel {
        /**
         * <p>The name of the RAM action that failed the authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>ListSparkApps</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the policy denial. Valid values:</p>
         * <ul>
         * <li>ImplicitDeny: Resource owner has not configured relevant permission policies for the current user, default denial of unauthorized operations.</li>
         * <li>ExplicitDeny: RAM policies configured by the resource owner explicitly deny the current user access to corresponding resources</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The type of the policy that causes the access denied error.</p>
         * <ul>
         * <li>ControlPolicy: control policy</li>
         * <li>SessionPolicy: Temporary Token additional permission policy</li>
         * <li>AssumeRolePolicy: RAM role trust policy</li>
         * <li>AccountLevelIdentityBasedPolicy: Principal policy within account authorization scope, including custom policies and system policies</li>
         * <li>ResourceGroupLevelIdentityBasedPolicy: Principal policy within resource group authorization scope, including custom policies and system policies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ControlPolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The identity type of the current user. Valid values:</p>
         * <ul>
         * <li>SubUser: a RAM user</li>
         * <li>AssumedRoleUser: a RAM role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <p>Authentication object information, can be the current user\&quot;s RAM account ID, or the role information corresponding to the current visitor.</p>
         * 
         * <strong>example:</strong>
         * <p>223345695632****</p>
         */
        @NameInMap("ResourceAuthTargetInfo")
        public String resourceAuthTargetInfo;

        /**
         * <p>The ID of the resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>11685695632****</p>
         */
        @NameInMap("ResourceOwnerId")
        public String resourceOwnerId;

        public static GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail self = new GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail setResourceAuthTargetInfo(String resourceAuthTargetInfo) {
            this.resourceAuthTargetInfo = resourceAuthTargetInfo;
            return this;
        }
        public String getResourceAuthTargetInfo() {
            return this.resourceAuthTargetInfo;
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail setResourceOwnerId(String resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

    }

    public static class GetADBSparkNecessaryRAMPermissionsResponseBodyData extends TeaModel {
        /**
         * <p>When permission check fails, returns diagnostic information related to permission check failure.</p>
         */
        @NameInMap("DeniedDetail")
        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail deniedDetail;

        /**
         * <p>Check whether the use has the basic permissions to use Analytic DB for Spark.</p>
         * <ul>
         * <li>true: The check is passed and the basic permissions are granted.</li>
         * <li>false: The check fails and some permissions are missing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Passed")
        public Boolean passed;

        /**
         * <p>Based on diagnostic information, recommends configurations for customers to perform in the RAM system.</p>
         * 
         * <strong>example:</strong>
         * <p>Grant the system RAM policy \&quot;AliyunADBDeveloperAccess\&quot; to current RAM user can quickly solve this issue.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static GetADBSparkNecessaryRAMPermissionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetADBSparkNecessaryRAMPermissionsResponseBodyData self = new GetADBSparkNecessaryRAMPermissionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyData setDeniedDetail(GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail deniedDetail) {
            this.deniedDetail = deniedDetail;
            return this;
        }
        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail getDeniedDetail() {
            return this.deniedDetail;
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyData setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
