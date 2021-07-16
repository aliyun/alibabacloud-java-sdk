// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemTimelinesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public CreateProblemTimelinesResponseBodyData data;

    public static CreateProblemTimelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemTimelinesResponseBody self = new CreateProblemTimelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProblemTimelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProblemTimelinesResponseBody setData(CreateProblemTimelinesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProblemTimelinesResponseBodyData getData() {
        return this.data;
    }

    public static class CreateProblemTimelinesResponseBodyData extends TeaModel {
        @NameInMap("problemTimelineIds")
        public java.util.List<Long> problemTimelineIds;

        public static CreateProblemTimelinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProblemTimelinesResponseBodyData self = new CreateProblemTimelinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProblemTimelinesResponseBodyData setProblemTimelineIds(java.util.List<Long> problemTimelineIds) {
            this.problemTimelineIds = problemTimelineIds;
            return this;
        }
        public java.util.List<Long> getProblemTimelineIds() {
            return this.problemTimelineIds;
        }

    }

}
