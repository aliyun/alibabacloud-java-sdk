// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateProblemResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateProblemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemResponseBody self = new CreateProblemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProblemResponseBody setData(CreateProblemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProblemResponseBodyData getData() {
        return this.data;
    }

    public CreateProblemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateProblemResponseBodyData extends TeaModel {
        // 故障Id
        @NameInMap("problemId")
        public Long problemId;

        public static CreateProblemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProblemResponseBodyData self = new CreateProblemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProblemResponseBodyData setProblemId(Long problemId) {
            this.problemId = problemId;
            return this;
        }
        public Long getProblemId() {
            return this.problemId;
        }

    }

}
