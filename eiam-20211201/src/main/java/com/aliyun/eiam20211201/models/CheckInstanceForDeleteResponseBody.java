// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CheckInstanceForDeleteResponseBody extends TeaModel {
    /**
     * <p>The check result.</p>
     */
    @NameInMap("CheckInstanceResult")
    public CheckInstanceForDeleteResponseBodyCheckInstanceResult checkInstanceResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckInstanceForDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceForDeleteResponseBody self = new CheckInstanceForDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceForDeleteResponseBody setCheckInstanceResult(CheckInstanceForDeleteResponseBodyCheckInstanceResult checkInstanceResult) {
        this.checkInstanceResult = checkInstanceResult;
        return this;
    }
    public CheckInstanceForDeleteResponseBodyCheckInstanceResult getCheckInstanceResult() {
        return this.checkInstanceResult;
    }

    public CheckInstanceForDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios extends TeaModel {
        /**
         * <p>The console URL that provides helpful information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://console-rpa.aliyun.com/">https://console-rpa.aliyun.com/</a></p>
         */
        @NameInMap("HelpfulConsoleUrl")
        public String helpfulConsoleUrl;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-nguosqgr75ndg784k8</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The restriction reason.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_product_dependency</p>
         */
        @NameInMap("RestrictReason")
        public String restrictReason;

        public static CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios build(java.util.Map<String, ?> map) throws Exception {
            CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios self = new CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios();
            return TeaModel.build(map, self);
        }

        public CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios setHelpfulConsoleUrl(String helpfulConsoleUrl) {
            this.helpfulConsoleUrl = helpfulConsoleUrl;
            return this;
        }
        public String getHelpfulConsoleUrl() {
            return this.helpfulConsoleUrl;
        }

        public CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios setRestrictReason(String restrictReason) {
            this.restrictReason = restrictReason;
            return this;
        }
        public String getRestrictReason() {
            return this.restrictReason;
        }

    }

    public static class CheckInstanceForDeleteResponseBodyCheckInstanceResult extends TeaModel {
        /**
         * <p>Indicates whether the instance can be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Deletable")
        public Boolean deletable;

        /**
         * <p>The restriction information for instances that cannot be deleted.</p>
         */
        @NameInMap("RestrictScenarios")
        public java.util.List<CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios> restrictScenarios;

        public static CheckInstanceForDeleteResponseBodyCheckInstanceResult build(java.util.Map<String, ?> map) throws Exception {
            CheckInstanceForDeleteResponseBodyCheckInstanceResult self = new CheckInstanceForDeleteResponseBodyCheckInstanceResult();
            return TeaModel.build(map, self);
        }

        public CheckInstanceForDeleteResponseBodyCheckInstanceResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public CheckInstanceForDeleteResponseBodyCheckInstanceResult setRestrictScenarios(java.util.List<CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios> restrictScenarios) {
            this.restrictScenarios = restrictScenarios;
            return this;
        }
        public java.util.List<CheckInstanceForDeleteResponseBodyCheckInstanceResultRestrictScenarios> getRestrictScenarios() {
            return this.restrictScenarios;
        }

    }

}
