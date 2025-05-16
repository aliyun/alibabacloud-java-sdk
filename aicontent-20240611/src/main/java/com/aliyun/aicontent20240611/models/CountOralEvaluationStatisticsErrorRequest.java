// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CountOralEvaluationStatisticsErrorRequest extends TeaModel {
    @NameInMap("body")
    public OralEvaluationStatisticsErrorCountRequest body;

    public static CountOralEvaluationStatisticsErrorRequest build(java.util.Map<String, ?> map) throws Exception {
        CountOralEvaluationStatisticsErrorRequest self = new CountOralEvaluationStatisticsErrorRequest();
        return TeaModel.build(map, self);
    }

    public CountOralEvaluationStatisticsErrorRequest setBody(OralEvaluationStatisticsErrorCountRequest body) {
        this.body = body;
        return this;
    }
    public OralEvaluationStatisticsErrorCountRequest getBody() {
        return this.body;
    }

}
