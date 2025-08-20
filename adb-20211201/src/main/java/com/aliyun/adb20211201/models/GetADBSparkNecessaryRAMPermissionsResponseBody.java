// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetADBSparkNecessaryRAMPermissionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetADBSparkNecessaryRAMPermissionsResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>ListSparkApps</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <p>ControlPolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <strong>example:</strong>
         * <p>223345695632****</p>
         */
        @NameInMap("ResourceAuthTargetInfo")
        public String resourceAuthTargetInfo;

        /**
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
        @NameInMap("DeniedDetail")
        public GetADBSparkNecessaryRAMPermissionsResponseBodyDataDeniedDetail deniedDetail;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Passed")
        public Boolean passed;

        /**
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
