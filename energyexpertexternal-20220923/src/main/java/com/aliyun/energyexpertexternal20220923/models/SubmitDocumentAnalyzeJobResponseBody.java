// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocumentAnalyzeJobResponseBody extends TeaModel {
    @NameInMap("data")
    public SubmitDocumentAnalyzeJobResponseBodyData data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SubmitDocumentAnalyzeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentAnalyzeJobResponseBody self = new SubmitDocumentAnalyzeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentAnalyzeJobResponseBody setData(SubmitDocumentAnalyzeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDocumentAnalyzeJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitDocumentAnalyzeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDocumentAnalyzeJobResponseBodyData extends TeaModel {
        @NameInMap("jobId")
        public String jobId;

        public static SubmitDocumentAnalyzeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocumentAnalyzeJobResponseBodyData self = new SubmitDocumentAnalyzeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDocumentAnalyzeJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
