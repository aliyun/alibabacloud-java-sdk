// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponse extends TeaModel {
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
    public AttachKeyPairResponseResults results;

    public static AttachKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponse self = new AttachKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public static class AttachKeyPairResponseResultsResult extends TeaModel {
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

        public static AttachKeyPairResponseResultsResult build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseResultsResult self = new AttachKeyPairResponseResultsResult();
            return TeaModel.build(map, self);
        }

    }

    public static class AttachKeyPairResponseResults extends TeaModel {
        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<AttachKeyPairResponseResultsResult> result;

        public static AttachKeyPairResponseResults build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseResults self = new AttachKeyPairResponseResults();
            return TeaModel.build(map, self);
        }

    }

}
