// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryLearningStatusNewResponseBody extends TeaModel {
    @NameInMap("LearningStatus")
    public String learningStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryLearningStatusNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLearningStatusNewResponseBody self = new QueryLearningStatusNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLearningStatusNewResponseBody setLearningStatus(String learningStatus) {
        this.learningStatus = learningStatus;
        return this;
    }
    public String getLearningStatus() {
        return this.learningStatus;
    }

    public QueryLearningStatusNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
