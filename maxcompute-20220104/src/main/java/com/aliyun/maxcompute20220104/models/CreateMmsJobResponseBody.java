// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsJobResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CreateMmsJobResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73207140-0FD5-588A-B11A-3CE093924196</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMmsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsJobResponseBody self = new CreateMmsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMmsJobResponseBody setData(CreateMmsJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMmsJobResponseBodyData getData() {
        return this.data;
    }

    public CreateMmsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMmsJobResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous task that is created for the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("asyncTaskId")
        public Long asyncTaskId;

        public static CreateMmsJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMmsJobResponseBodyData self = new CreateMmsJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMmsJobResponseBodyData setAsyncTaskId(Long asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public Long getAsyncTaskId() {
            return this.asyncTaskId;
        }

    }

}
