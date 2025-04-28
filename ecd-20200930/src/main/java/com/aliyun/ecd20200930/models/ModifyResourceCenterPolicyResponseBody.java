// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyResourceCenterPolicyResponseBody extends TeaModel {
    /**
     * <p>The modification results.</p>
     */
    @NameInMap("ModifyResults")
    public java.util.List<ModifyResourceCenterPolicyResponseBodyModifyResults> modifyResults;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourceCenterPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceCenterPolicyResponseBody self = new ModifyResourceCenterPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceCenterPolicyResponseBody setModifyResults(java.util.List<ModifyResourceCenterPolicyResponseBodyModifyResults> modifyResults) {
        this.modifyResults = modifyResults;
        return this;
    }
    public java.util.List<ModifyResourceCenterPolicyResponseBodyModifyResults> getModifyResults() {
        return this.modifyResults;
    }

    public ModifyResourceCenterPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyResourceCenterPolicyResponseBodyModifyResults extends TeaModel {
        /**
         * <p>The verification result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckResult")
        public Boolean checkResult;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-e254cpyt9bb*****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static ModifyResourceCenterPolicyResponseBodyModifyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyResourceCenterPolicyResponseBodyModifyResults self = new ModifyResourceCenterPolicyResponseBodyModifyResults();
            return TeaModel.build(map, self);
        }

        public ModifyResourceCenterPolicyResponseBodyModifyResults setCheckResult(Boolean checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Boolean getCheckResult() {
            return this.checkResult;
        }

        public ModifyResourceCenterPolicyResponseBodyModifyResults setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
