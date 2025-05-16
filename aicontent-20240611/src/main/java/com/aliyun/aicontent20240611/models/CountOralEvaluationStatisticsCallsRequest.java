// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CountOralEvaluationStatisticsCallsRequest extends TeaModel {
    @NameInMap("body")
    public OralEvaluationStatisticsCallsCountRequest body;

    public static CountOralEvaluationStatisticsCallsRequest build(java.util.Map<String, ?> map) throws Exception {
        CountOralEvaluationStatisticsCallsRequest self = new CountOralEvaluationStatisticsCallsRequest();
        return TeaModel.build(map, self);
    }

    public CountOralEvaluationStatisticsCallsRequest setBody(OralEvaluationStatisticsCallsCountRequest body) {
        this.body = body;
        return this;
    }
    public OralEvaluationStatisticsCallsCountRequest getBody() {
        return this.body;
    }

}
