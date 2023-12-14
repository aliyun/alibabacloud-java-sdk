// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitImportLogTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitImportLogTasksResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitImportLogTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImportLogTasksResponseBody self = new SubmitImportLogTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImportLogTasksResponseBody setData(SubmitImportLogTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitImportLogTasksResponseBodyData getData() {
        return this.data;
    }

    public SubmitImportLogTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitImportLogTasksResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        public static SubmitImportLogTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitImportLogTasksResponseBodyData self = new SubmitImportLogTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitImportLogTasksResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
