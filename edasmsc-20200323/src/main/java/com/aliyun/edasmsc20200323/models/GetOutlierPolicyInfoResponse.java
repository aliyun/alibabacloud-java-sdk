// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetOutlierPolicyInfoResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("HttpCode")
    @Validation(required = true)
    public String httpCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Result")
    @Validation(required = true)
    public java.util.List<GetOutlierPolicyInfoResponseResult> result;

    public static GetOutlierPolicyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOutlierPolicyInfoResponse self = new GetOutlierPolicyInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetOutlierPolicyInfoResponseResult extends TeaModel {
        @NameInMap("ErrorRateThreshold")
        @Validation(required = true)
        public Double errorRateThreshold;

        @NameInMap("IsOutlierEnabled")
        @Validation(required = true)
        public Boolean isOutlierEnabled;

        @NameInMap("IsolationTime")
        @Validation(required = true)
        public Integer isolationTime;

        @NameInMap("MaxIsolationTimeMultiple")
        @Validation(required = true)
        public Integer maxIsolationTimeMultiple;

        @NameInMap("OutlierEnabled")
        @Validation(required = true)
        public Boolean outlierEnabled;

        @NameInMap("PolicyId")
        @Validation(required = true)
        public Integer policyId;

        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("RequestThreshold")
        @Validation(required = true)
        public Integer requestThreshold;

        @NameInMap("RpcType")
        @Validation(required = true)
        public Integer rpcType;

        @NameInMap("ShouldCountBizError")
        @Validation(required = true)
        public Boolean shouldCountBizError;

        public static GetOutlierPolicyInfoResponseResult build(java.util.Map<String, ?> map) throws Exception {
            GetOutlierPolicyInfoResponseResult self = new GetOutlierPolicyInfoResponseResult();
            return TeaModel.build(map, self);
        }

    }

}
