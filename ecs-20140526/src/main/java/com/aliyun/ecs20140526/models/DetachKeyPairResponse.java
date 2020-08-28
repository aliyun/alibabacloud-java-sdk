// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("FailCount")
    @Validation(required = true)
    public String failCount;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("Results")
    @Validation(required = true)
    public DetachKeyPairResponseResults results;

    public static DetachKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairResponse self = new DetachKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public static class DetachKeyPairResponseResultsResult extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Success")
        @Validation(required = true)
        public String success;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static DetachKeyPairResponseResultsResult build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseResultsResult self = new DetachKeyPairResponseResultsResult();
            return TeaModel.build(map, self);
        }

    }

    public static class DetachKeyPairResponseResults extends TeaModel {
        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<DetachKeyPairResponseResultsResult> result;

        public static DetachKeyPairResponseResults build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseResults self = new DetachKeyPairResponseResults();
            return TeaModel.build(map, self);
        }

    }

}
