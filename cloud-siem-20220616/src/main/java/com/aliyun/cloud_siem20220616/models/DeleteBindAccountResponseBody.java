// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteBindAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteBindAccountResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindAccountResponseBody self = new DeleteBindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBindAccountResponseBody setData(DeleteBindAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteBindAccountResponseBodyData getData() {
        return this.data;
    }

    public DeleteBindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteBindAccountResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        public static DeleteBindAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteBindAccountResponseBodyData self = new DeleteBindAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteBindAccountResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
