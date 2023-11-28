// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportIdsResponseBody extends TeaModel {
    /**
     * <p>The header of the response.</p>
     */
    @NameInMap("Headers")
    public ListDiagnoseReportIdsResponseBodyHeaders headers;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    public static ListDiagnoseReportIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseReportIdsResponseBody self = new ListDiagnoseReportIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseReportIdsResponseBody setHeaders(ListDiagnoseReportIdsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListDiagnoseReportIdsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListDiagnoseReportIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiagnoseReportIdsResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

    public static class ListDiagnoseReportIdsResponseBodyHeaders extends TeaModel {
        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListDiagnoseReportIdsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnoseReportIdsResponseBodyHeaders self = new ListDiagnoseReportIdsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListDiagnoseReportIdsResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

}
