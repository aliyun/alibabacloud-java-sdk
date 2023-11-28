// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateCollectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateCollectorResponseBodyResult result;

    public static CreateCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectorResponseBody self = new CreateCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCollectorResponseBody setResult(CreateCollectorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateCollectorResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateCollectorResponseBodyResult extends TeaModel {
        @NameInMap("resId")
        public String resId;

        public static CreateCollectorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateCollectorResponseBodyResult self = new CreateCollectorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateCollectorResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

    }

}
