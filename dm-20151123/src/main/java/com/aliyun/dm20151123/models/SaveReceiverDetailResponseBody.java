// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SaveReceiverDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public SaveReceiverDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>638</p>
     */
    @NameInMap("ErrorCount")
    public Integer errorCount;

    /**
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>274</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    public static SaveReceiverDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveReceiverDetailResponseBody self = new SaveReceiverDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveReceiverDetailResponseBody setData(SaveReceiverDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveReceiverDetailResponseBodyData getData() {
        return this.data;
    }

    public SaveReceiverDetailResponseBody setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    public Integer getErrorCount() {
        return this.errorCount;
    }

    public SaveReceiverDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveReceiverDetailResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static class SaveReceiverDetailResponseBodyDataDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@mail.com">test@mail.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        public static SaveReceiverDetailResponseBodyDataDetail build(java.util.Map<String, ?> map) throws Exception {
            SaveReceiverDetailResponseBodyDataDetail self = new SaveReceiverDetailResponseBodyDataDetail();
            return TeaModel.build(map, self);
        }

        public SaveReceiverDetailResponseBodyDataDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class SaveReceiverDetailResponseBodyData extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<SaveReceiverDetailResponseBodyDataDetail> detail;

        public static SaveReceiverDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveReceiverDetailResponseBodyData self = new SaveReceiverDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveReceiverDetailResponseBodyData setDetail(java.util.List<SaveReceiverDetailResponseBodyDataDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<SaveReceiverDetailResponseBodyDataDetail> getDetail() {
            return this.detail;
        }

    }

}
