// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAsyncJobResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>7CB9B663-3EF8-4C9C-A464-FDA2B5F1E3A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAsyncJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultResponseBody self = new GetAsyncJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultResponseBody setData(GetAsyncJobResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncJobResultResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAsyncJobResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>paramsIllegal</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>CCCAAAFB-5628-40DD-A12C-6F52326C1B03</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;NewProbability\&quot;:\&quot;4.062644e-06\&quot;,\&quot;NormalProbability\&quot;:\&quot;0.7230905\&quot;,\&quot;OtherProbability\&quot;:\&quot;0.27690542\&quot;,\&quot;LesionRatio\&quot;:\&quot;0.9387283236994219\&quot;,\&quot;Mask\&quot;:\&quot;<a href="http://algo-app-aic-med-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/covid19-dcm/unspecified/2020032702/1b1e1018-6fcf-11ea-8fa1-d20b34387541.nii.gz?Expires=1585276394&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=%2F1LNGWJUqvY0VRYGgg8Ldtb3BF****%5C%5C%22%7D">http://algo-app-aic-med-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/covid19-dcm/unspecified/2020032702/1b1e1018-6fcf-11ea-8fa1-d20b34387541.nii.gz?Expires=1585276394&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=%2F1LNGWJUqvY0VRYGgg8Ldtb3BF****\\&quot;}</a></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>PROCESS_SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAsyncJobResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncJobResultResponseBodyData self = new GetAsyncJobResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncJobResultResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetAsyncJobResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetAsyncJobResultResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAsyncJobResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAsyncJobResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
