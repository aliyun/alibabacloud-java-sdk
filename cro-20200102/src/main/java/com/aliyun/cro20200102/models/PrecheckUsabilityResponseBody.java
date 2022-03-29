// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class PrecheckUsabilityResponseBody extends TeaModel {
    @NameInMap("CheckResult")
    public PrecheckUsabilityResponseBodyCheckResult checkResult;

    @NameInMap("RequestId")
    public String requestId;

    public static PrecheckUsabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrecheckUsabilityResponseBody self = new PrecheckUsabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public PrecheckUsabilityResponseBody setCheckResult(PrecheckUsabilityResponseBodyCheckResult checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public PrecheckUsabilityResponseBodyCheckResult getCheckResult() {
        return this.checkResult;
    }

    public PrecheckUsabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PrecheckUsabilityResponseBodyCheckResult extends TeaModel {
        @NameInMap("AuthorityUsableCode")
        public Integer authorityUsableCode;

        @NameInMap("HitRisk")
        public Boolean hitRisk;

        @NameInMap("UnavailableStatus")
        public Boolean unavailableStatus;

        @NameInMap("UsableClient")
        public Boolean usableClient;

        public static PrecheckUsabilityResponseBodyCheckResult build(java.util.Map<String, ?> map) throws Exception {
            PrecheckUsabilityResponseBodyCheckResult self = new PrecheckUsabilityResponseBodyCheckResult();
            return TeaModel.build(map, self);
        }

        public PrecheckUsabilityResponseBodyCheckResult setAuthorityUsableCode(Integer authorityUsableCode) {
            this.authorityUsableCode = authorityUsableCode;
            return this;
        }
        public Integer getAuthorityUsableCode() {
            return this.authorityUsableCode;
        }

        public PrecheckUsabilityResponseBodyCheckResult setHitRisk(Boolean hitRisk) {
            this.hitRisk = hitRisk;
            return this;
        }
        public Boolean getHitRisk() {
            return this.hitRisk;
        }

        public PrecheckUsabilityResponseBodyCheckResult setUnavailableStatus(Boolean unavailableStatus) {
            this.unavailableStatus = unavailableStatus;
            return this;
        }
        public Boolean getUnavailableStatus() {
            return this.unavailableStatus;
        }

        public PrecheckUsabilityResponseBodyCheckResult setUsableClient(Boolean usableClient) {
            this.usableClient = usableClient;
            return this;
        }
        public Boolean getUsableClient() {
            return this.usableClient;
        }

    }

}
