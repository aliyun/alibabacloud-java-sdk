// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("CheckApplicationProvisioningUserPrimaryOuResult")
    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult checkApplicationProvisioningUserPrimaryOuResult;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody self = new CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody setCheckApplicationProvisioningUserPrimaryOuResult(CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult checkApplicationProvisioningUserPrimaryOuResult) {
        this.checkApplicationProvisioningUserPrimaryOuResult = checkApplicationProvisioningUserPrimaryOuResult;
        return this;
    }
    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult getCheckApplicationProvisioningUserPrimaryOuResult() {
        return this.checkApplicationProvisioningUserPrimaryOuResult;
    }

    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult extends TeaModel {
        /**
         * <p>是否授权</p>
         */
        @NameInMap("AllowAuthorization")
        public Boolean allowAuthorization;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult build(java.util.Map<String, ?> map) throws Exception {
            CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult self = new CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult();
            return TeaModel.build(map, self);
        }

        public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult setAllowAuthorization(Boolean allowAuthorization) {
            this.allowAuthorization = allowAuthorization;
            return this;
        }
        public Boolean getAllowAuthorization() {
            return this.allowAuthorization;
        }

        public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBodyCheckApplicationProvisioningUserPrimaryOuResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
