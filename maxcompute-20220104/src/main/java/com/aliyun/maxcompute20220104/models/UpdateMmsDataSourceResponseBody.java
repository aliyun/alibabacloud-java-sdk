// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsDataSourceResponseBody extends TeaModel {
    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("data")
    public UpdateMmsDataSourceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76CE80C8-7392-5591-BCC8-610AFBF78ADF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMmsDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsDataSourceResponseBody self = new UpdateMmsDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMmsDataSourceResponseBody setData(UpdateMmsDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMmsDataSourceResponseBodyData getData() {
        return this.data;
    }

    public UpdateMmsDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateMmsDataSourceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous task. When you test the data source configuration, this ID is used to obtain the test result.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("asyncTaskId")
        public Long asyncTaskId;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>2000017</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        public static UpdateMmsDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMmsDataSourceResponseBodyData self = new UpdateMmsDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMmsDataSourceResponseBodyData setAsyncTaskId(Long asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public Long getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public UpdateMmsDataSourceResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

    }

}
