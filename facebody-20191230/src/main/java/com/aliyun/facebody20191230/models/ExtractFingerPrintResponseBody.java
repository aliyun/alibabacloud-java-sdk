// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractFingerPrintResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ExtractFingerPrintResponseBodyData data;

    public static ExtractFingerPrintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractFingerPrintResponseBody self = new ExtractFingerPrintResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractFingerPrintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExtractFingerPrintResponseBody setData(ExtractFingerPrintResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtractFingerPrintResponseBodyData getData() {
        return this.data;
    }

    public static class ExtractFingerPrintResponseBodyData extends TeaModel {
        @NameInMap("FingerPrint")
        public byte[] fingerPrint;

        public static ExtractFingerPrintResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtractFingerPrintResponseBodyData self = new ExtractFingerPrintResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtractFingerPrintResponseBodyData setFingerPrint(byte[] fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public byte[] getFingerPrint() {
            return this.fingerPrint;
        }

    }

}
