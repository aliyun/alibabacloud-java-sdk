// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BindAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public BindAccountResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static BindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAccountResponseBody self = new BindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAccountResponseBody setData(BindAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAccountResponseBodyData getData() {
        return this.data;
    }

    public BindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BindAccountResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        public static BindAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAccountResponseBodyData self = new BindAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAccountResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
