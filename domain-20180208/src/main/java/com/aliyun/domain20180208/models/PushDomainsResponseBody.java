// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class PushDomainsResponseBody extends TeaModel {
    @NameInMap("Module")
    public PushDomainsResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>F51977F9-2B40-462B-BCCD-CF5BB1E9DB56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PushDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushDomainsResponseBody self = new PushDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public PushDomainsResponseBody setModule(PushDomainsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public PushDomainsResponseBodyModule getModule() {
        return this.module;
    }

    public PushDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PushDomainsResponseBodyModuleFailedResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cdxuanfeng.cn</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>connect timed out</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static PushDomainsResponseBodyModuleFailedResults build(java.util.Map<String, ?> map) throws Exception {
            PushDomainsResponseBodyModuleFailedResults self = new PushDomainsResponseBodyModuleFailedResults();
            return TeaModel.build(map, self);
        }

        public PushDomainsResponseBodyModuleFailedResults setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public PushDomainsResponseBodyModuleFailedResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PushDomainsResponseBodyModuleFailedResults setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class PushDomainsResponseBodyModule extends TeaModel {
        @NameInMap("FailedResults")
        public java.util.List<PushDomainsResponseBodyModuleFailedResults> failedResults;

        /**
         * <strong>example:</strong>
         * <p>20250124100136aYCj4hdA</p>
         */
        @NameInMap("OutBizId")
        public String outBizId;

        /**
         * <strong>example:</strong>
         * <p>21301203021303120201</p>
         */
        @NameInMap("PushNo")
        public String pushNo;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <strong>example:</strong>
         * <p>[&quot;a.com&quot;,  &quot;b.com&quot;]</p>
         */
        @NameInMap("SuccessDomains")
        public java.util.List<String> successDomains;

        public static PushDomainsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            PushDomainsResponseBodyModule self = new PushDomainsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public PushDomainsResponseBodyModule setFailedResults(java.util.List<PushDomainsResponseBodyModuleFailedResults> failedResults) {
            this.failedResults = failedResults;
            return this;
        }
        public java.util.List<PushDomainsResponseBodyModuleFailedResults> getFailedResults() {
            return this.failedResults;
        }

        public PushDomainsResponseBodyModule setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public PushDomainsResponseBodyModule setPushNo(String pushNo) {
            this.pushNo = pushNo;
            return this;
        }
        public String getPushNo() {
            return this.pushNo;
        }

        public PushDomainsResponseBodyModule setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public PushDomainsResponseBodyModule setSuccessDomains(java.util.List<String> successDomains) {
            this.successDomains = successDomains;
            return this;
        }
        public java.util.List<String> getSuccessDomains() {
            return this.successDomains;
        }

    }

}
