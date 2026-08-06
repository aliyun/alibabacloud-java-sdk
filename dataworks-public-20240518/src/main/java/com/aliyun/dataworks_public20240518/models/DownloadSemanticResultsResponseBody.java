// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DownloadSemanticResultsResponseBody extends TeaModel {
    /**
     * <p>The collection of result files for the specified job run. Multiple items are returned if a single run generates multiple files.</p>
     */
    @NameInMap("Data")
    public DownloadSemanticResultsResponseBodyData data;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DownloadSemanticResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSemanticResultsResponseBody self = new DownloadSemanticResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSemanticResultsResponseBody setData(DownloadSemanticResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DownloadSemanticResultsResponseBodyData getData() {
        return this.data;
    }

    public DownloadSemanticResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadSemanticResultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadSemanticResultsResponseBodyDataResults extends TeaModel {
        /**
         * <p>The temporary pre-signed download URL of the result file. Download the file promptly by using an HTTP GET request. Do not log, share, or treat the full URL as a long-term address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/temporary-download-url">https://example.com/temporary-download-url</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The job name to which the artifact belongs. This value is the same as the JobName in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic-job-demo</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The run ID to which the artifact belongs. You can compare this value with Data.JobRunId in the RunSemanticJob response or JobRunId in the ListSemanticJobRuns response.</p>
         * 
         * <strong>example:</strong>
         * <p>01H00000000000000000000000</p>
         */
        @NameInMap("JobRunId")
        public String jobRunId;

        public static DownloadSemanticResultsResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            DownloadSemanticResultsResponseBodyDataResults self = new DownloadSemanticResultsResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public DownloadSemanticResultsResponseBodyDataResults setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DownloadSemanticResultsResponseBodyDataResults setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DownloadSemanticResultsResponseBodyDataResults setJobRunId(String jobRunId) {
            this.jobRunId = jobRunId;
            return this;
        }
        public String getJobRunId() {
            return this.jobRunId;
        }

    }

    public static class DownloadSemanticResultsResponseBodyData extends TeaModel {
        /**
         * <p>The list of result files. Each item contains the associated job name, run ID, and a short-lived download URL.</p>
         */
        @NameInMap("Results")
        public java.util.List<DownloadSemanticResultsResponseBodyDataResults> results;

        public static DownloadSemanticResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DownloadSemanticResultsResponseBodyData self = new DownloadSemanticResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DownloadSemanticResultsResponseBodyData setResults(java.util.List<DownloadSemanticResultsResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DownloadSemanticResultsResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
