// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocAsyncResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetDocAsyncResponseBodyData> data;

    public static GetDocAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocAsyncResponseBody self = new GetDocAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocAsyncResponseBody setData(java.util.List<GetDocAsyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDocAsyncResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDocAsyncResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("DataId")
        public String dataId;

        public static GetDocAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocAsyncResponseBodyData self = new GetDocAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocAsyncResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetDocAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
