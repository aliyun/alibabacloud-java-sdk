// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StopCollectQualityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("ReturnValue")
    public StopCollectQualityResponseBodyReturnValue returnValue;

    public static StopCollectQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopCollectQualityResponseBody self = new StopCollectQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public StopCollectQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopCollectQualityResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public StopCollectQualityResponseBody setReturnValue(StopCollectQualityResponseBodyReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public StopCollectQualityResponseBodyReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static class StopCollectQualityResponseBodyReturnValue extends TeaModel {
        @NameInMap("Result")
        public String result;

        public static StopCollectQualityResponseBodyReturnValue build(java.util.Map<String, ?> map) throws Exception {
            StopCollectQualityResponseBodyReturnValue self = new StopCollectQualityResponseBodyReturnValue();
            return TeaModel.build(map, self);
        }

        public StopCollectQualityResponseBodyReturnValue setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
