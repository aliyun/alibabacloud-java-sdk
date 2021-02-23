// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetImageAsyncResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetImageAsyncResponseBodyData> data;

    public static GetImageAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageAsyncResponseBody self = new GetImageAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageAsyncResponseBody setData(java.util.List<GetImageAsyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetImageAsyncResponseBodyData> getData() {
        return this.data;
    }

    public static class GetImageAsyncResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("DataId")
        public String dataId;

        public static GetImageAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageAsyncResponseBodyData self = new GetImageAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageAsyncResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetImageAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
