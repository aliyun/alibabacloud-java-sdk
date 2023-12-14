// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteDataSourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteDataSourceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceResponseBody self = new DeleteDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceResponseBody setData(DeleteDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDataSourceResponseBodyData getData() {
        return this.data;
    }

    public DeleteDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteDataSourceResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        public static DeleteDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataSourceResponseBodyData self = new DeleteDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDataSourceResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
