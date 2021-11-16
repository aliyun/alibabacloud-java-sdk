// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemMeasureResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateProblemMeasureResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateProblemMeasureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemMeasureResponseBody self = new CreateProblemMeasureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProblemMeasureResponseBody setData(CreateProblemMeasureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProblemMeasureResponseBodyData getData() {
        return this.data;
    }

    public CreateProblemMeasureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateProblemMeasureResponseBodyData extends TeaModel {
        // 故障措施Id
        @NameInMap("measureId")
        public Long measureId;

        public static CreateProblemMeasureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProblemMeasureResponseBodyData self = new CreateProblemMeasureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProblemMeasureResponseBodyData setMeasureId(Long measureId) {
            this.measureId = measureId;
            return this;
        }
        public Long getMeasureId() {
            return this.measureId;
        }

    }

}
