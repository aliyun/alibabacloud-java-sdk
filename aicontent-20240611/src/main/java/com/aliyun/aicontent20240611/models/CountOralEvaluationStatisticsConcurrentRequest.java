// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CountOralEvaluationStatisticsConcurrentRequest extends TeaModel {
    @NameInMap("body")
    public OralEvaluationStatisticsConcurrentCountRequest body;

    public static CountOralEvaluationStatisticsConcurrentRequest build(java.util.Map<String, ?> map) throws Exception {
        CountOralEvaluationStatisticsConcurrentRequest self = new CountOralEvaluationStatisticsConcurrentRequest();
        return TeaModel.build(map, self);
    }

    public CountOralEvaluationStatisticsConcurrentRequest setBody(OralEvaluationStatisticsConcurrentCountRequest body) {
        this.body = body;
        return this;
    }
    public OralEvaluationStatisticsConcurrentCountRequest getBody() {
        return this.body;
    }

}
