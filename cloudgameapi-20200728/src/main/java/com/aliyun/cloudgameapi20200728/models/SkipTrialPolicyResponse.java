// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SkipTrialPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SkipTrialPolicyResponseData data;

    public static SkipTrialPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipTrialPolicyResponse self = new SkipTrialPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SkipTrialPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SkipTrialPolicyResponse setData(SkipTrialPolicyResponseData data) {
        this.data = data;
        return this;
    }
    public SkipTrialPolicyResponseData getData() {
        return this.data;
    }

    public static class SkipTrialPolicyResponseData extends TeaModel {
        @NameInMap("SkipResult")
        @Validation(required = true)
        public Integer skipResult;

        public static SkipTrialPolicyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SkipTrialPolicyResponseData self = new SkipTrialPolicyResponseData();
            return TeaModel.build(map, self);
        }

        public SkipTrialPolicyResponseData setSkipResult(Integer skipResult) {
            this.skipResult = skipResult;
            return this;
        }
        public Integer getSkipResult() {
            return this.skipResult;
        }

    }

}
