// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SkipTrialPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SkipTrialPolicyResponseBodyData data;

    public static SkipTrialPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SkipTrialPolicyResponseBody self = new SkipTrialPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SkipTrialPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SkipTrialPolicyResponseBody setData(SkipTrialPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SkipTrialPolicyResponseBodyData getData() {
        return this.data;
    }

    public static class SkipTrialPolicyResponseBodyData extends TeaModel {
        @NameInMap("SkipResult")
        public Integer skipResult;

        public static SkipTrialPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SkipTrialPolicyResponseBodyData self = new SkipTrialPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SkipTrialPolicyResponseBodyData setSkipResult(Integer skipResult) {
            this.skipResult = skipResult;
            return this;
        }
        public Integer getSkipResult() {
            return this.skipResult;
        }

    }

}
