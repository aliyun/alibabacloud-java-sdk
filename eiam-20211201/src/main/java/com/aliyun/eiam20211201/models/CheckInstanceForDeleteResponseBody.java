// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CheckInstanceForDeleteResponseBody extends TeaModel {
    @NameInMap("CheckInstanceResult")
    public CheckInstanceForDeleteResponseBodyCheckInstanceResult checkInstanceResult;

    /**
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
         * <p>有帮助的控制台地址，可以管理对应的资源，从而解除实例删除限制。可能返回为空，不一定所有的资源ID都有管理地址返回。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://console-rpa.aliyun.com/">https://console-rpa.aliyun.com/</a></p>
         */
        @NameInMap("HelpfulConsoleUrl")
        public String helpfulConsoleUrl;

        /**
         * <p>导致实例删除受限的资源ID。</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-nguosqgr75ndg784k8</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>针对实例删除受限的原因文字描述。</p>
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
         * <p>true表示实例可以被删除；false表示实例不可被删除，具体查看RestrictScenarios属性。</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Deletable")
        public Boolean deletable;

        /**
         * <p>true表示实例可以被删除；false表示实例不可被删除，具体查看RestrictScenarios属性。</p>
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
