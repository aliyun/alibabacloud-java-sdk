// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTargetsResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FailIds")
    @Validation(required = true)
    public DeleteMetricRuleTargetsResponseFailIds failIds;

    public static DeleteMetricRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTargetsResponse self = new DeleteMetricRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteMetricRuleTargetsResponseFailIdsTargetIds extends TeaModel {
        @NameInMap("TargetId")
        @Validation(required = true)
        public java.util.List<String> targetId;

        public static DeleteMetricRuleTargetsResponseFailIdsTargetIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteMetricRuleTargetsResponseFailIdsTargetIds self = new DeleteMetricRuleTargetsResponseFailIdsTargetIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DeleteMetricRuleTargetsResponseFailIds extends TeaModel {
        @NameInMap("TargetIds")
        @Validation(required = true)
        public DeleteMetricRuleTargetsResponseFailIdsTargetIds targetIds;

        public static DeleteMetricRuleTargetsResponseFailIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteMetricRuleTargetsResponseFailIds self = new DeleteMetricRuleTargetsResponseFailIds();
            return TeaModel.build(map, self);
        }

    }

}
