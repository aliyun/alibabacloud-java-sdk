// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class InvokeFunctionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public InvokeFunctionResponseBodyResult result;

    public static InvokeFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeFunctionResponseBody self = new InvokeFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeFunctionResponseBody setResult(InvokeFunctionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public InvokeFunctionResponseBodyResult getResult() {
        return this.result;
    }

    public static class InvokeFunctionResponseBodyResult extends TeaModel {
        @NameInMap("Output")
        public String output;

        @NameInMap("BackEndRequestId")
        public String backEndRequestId;

        public static InvokeFunctionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            InvokeFunctionResponseBodyResult self = new InvokeFunctionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public InvokeFunctionResponseBodyResult setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public InvokeFunctionResponseBodyResult setBackEndRequestId(String backEndRequestId) {
            this.backEndRequestId = backEndRequestId;
            return this;
        }
        public String getBackEndRequestId() {
            return this.backEndRequestId;
        }

    }

}
