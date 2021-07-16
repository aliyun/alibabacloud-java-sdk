// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemSubtotalResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public CreateProblemSubtotalResponseBodyData data;

    public static CreateProblemSubtotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemSubtotalResponseBody self = new CreateProblemSubtotalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProblemSubtotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProblemSubtotalResponseBody setData(CreateProblemSubtotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProblemSubtotalResponseBodyData getData() {
        return this.data;
    }

    public static class CreateProblemSubtotalResponseBodyData extends TeaModel {
        // 小计id
        @NameInMap("subtotalId")
        public Long subtotalId;

        public static CreateProblemSubtotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProblemSubtotalResponseBodyData self = new CreateProblemSubtotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProblemSubtotalResponseBodyData setSubtotalId(Long subtotalId) {
            this.subtotalId = subtotalId;
            return this;
        }
        public Long getSubtotalId() {
            return this.subtotalId;
        }

    }

}
