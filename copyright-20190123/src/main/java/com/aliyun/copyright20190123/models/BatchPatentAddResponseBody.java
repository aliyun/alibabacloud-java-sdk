// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class BatchPatentAddResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<BatchPatentAddResponseBodyData> data;

    public static BatchPatentAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchPatentAddResponseBody self = new BatchPatentAddResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchPatentAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchPatentAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchPatentAddResponseBody setData(java.util.List<BatchPatentAddResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchPatentAddResponseBodyData> getData() {
        return this.data;
    }

    public static class BatchPatentAddResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("ApplyNumber")
        public String applyNumber;

        public static BatchPatentAddResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchPatentAddResponseBodyData self = new BatchPatentAddResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchPatentAddResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchPatentAddResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchPatentAddResponseBodyData setApplyNumber(String applyNumber) {
            this.applyNumber = applyNumber;
            return this;
        }
        public String getApplyNumber() {
            return this.applyNumber;
        }

    }

}
