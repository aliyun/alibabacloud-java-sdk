// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelineResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public CreateProblemTimelineResponseBodyData data;

    public static CreateProblemTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemTimelineResponseBody self = new CreateProblemTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProblemTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProblemTimelineResponseBody setData(CreateProblemTimelineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProblemTimelineResponseBodyData getData() {
        return this.data;
    }

    public static class CreateProblemTimelineResponseBodyData extends TeaModel {
        @NameInMap("problemTimelineId")
        public Long problemTimelineId;

        public static CreateProblemTimelineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProblemTimelineResponseBodyData self = new CreateProblemTimelineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProblemTimelineResponseBodyData setProblemTimelineId(Long problemTimelineId) {
            this.problemTimelineId = problemTimelineId;
            return this;
        }
        public Long getProblemTimelineId() {
            return this.problemTimelineId;
        }

    }

}
