// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemSubtotalResponseBody extends TeaModel {
    /**
     * <p>object</p>
     */
    @NameInMap("data")
    public CreateProblemSubtotalResponseBodyData data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateProblemSubtotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemSubtotalResponseBody self = new CreateProblemSubtotalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProblemSubtotalResponseBody setData(CreateProblemSubtotalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProblemSubtotalResponseBodyData getData() {
        return this.data;
    }

    public CreateProblemSubtotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateProblemSubtotalResponseBodyData extends TeaModel {
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
