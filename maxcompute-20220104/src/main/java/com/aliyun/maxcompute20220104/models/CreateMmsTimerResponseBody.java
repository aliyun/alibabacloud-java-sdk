// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsTimerResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateMmsTimerResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0be3e0b716671885050924814e3623</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMmsTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsTimerResponseBody self = new CreateMmsTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMmsTimerResponseBody setData(CreateMmsTimerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMmsTimerResponseBodyData getData() {
        return this.data;
    }

    public CreateMmsTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMmsTimerResponseBodyData extends TeaModel {
        /**
         * <p>timer id</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("timerId")
        public Long timerId;

        public static CreateMmsTimerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMmsTimerResponseBodyData self = new CreateMmsTimerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMmsTimerResponseBodyData setTimerId(Long timerId) {
            this.timerId = timerId;
            return this;
        }
        public Long getTimerId() {
            return this.timerId;
        }

    }

}
