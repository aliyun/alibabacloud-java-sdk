// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractFingerPrintResponseBody extends TeaModel {
    @NameInMap("Data")
    public ExtractFingerPrintResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D21978CC-C1E7-4A7A-A1B2-D5896BDC7ADF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExtractFingerPrintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractFingerPrintResponseBody self = new ExtractFingerPrintResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractFingerPrintResponseBody setData(ExtractFingerPrintResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtractFingerPrintResponseBodyData getData() {
        return this.data;
    }

    public ExtractFingerPrintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExtractFingerPrintResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/9j/4AAQSkZJRgABAQAAAQABAAD****</p>
         */
        @NameInMap("FingerPrint")
        public String fingerPrint;

        public static ExtractFingerPrintResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtractFingerPrintResponseBodyData self = new ExtractFingerPrintResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtractFingerPrintResponseBodyData setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public String getFingerPrint() {
            return this.fingerPrint;
        }

    }

}
