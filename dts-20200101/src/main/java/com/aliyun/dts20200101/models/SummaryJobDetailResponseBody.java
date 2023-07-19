// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SummaryJobDetailResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the data migration or data synchronization task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The returned information about the migrated or synchronized objects in arrays.</p>
     * <br>
     * <p>>  The arrays are in the following format: \[{"key":"Function","state":5,"totalCount":22},{"key":"Procedure","state":5,"totalCount":26},{"key":"Table","state":0,"totalCount":68},{"key":"View","state":5,"totalCount":100}].</p>
     */
    @NameInMap("ProgressSummaryDetails")
    public java.util.List<SummaryJobDetailResponseBodyProgressSummaryDetails> progressSummaryDetails;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SummaryJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SummaryJobDetailResponseBody self = new SummaryJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public SummaryJobDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SummaryJobDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SummaryJobDetailResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SummaryJobDetailResponseBody setProgressSummaryDetails(java.util.List<SummaryJobDetailResponseBodyProgressSummaryDetails> progressSummaryDetails) {
        this.progressSummaryDetails = progressSummaryDetails;
        return this;
    }
    public java.util.List<SummaryJobDetailResponseBodyProgressSummaryDetails> getProgressSummaryDetails() {
        return this.progressSummaryDetails;
    }

    public SummaryJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SummaryJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SummaryJobDetailResponseBodyProgressSummaryDetails extends TeaModel {
        /**
         * <p>The type of migrated or synchronized object. Valid values: **Table**, **Constraint**, **Index**, **View**, **Materialize View**, **Type**, **Synonym**, **Trigger**, **Function**, **Procedure**, **Package**, **Default**, **Rule**, **PlanGuide**, and **Sequence**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The state of the data migration or data synchronization task. Valid values:</p>
         * <br>
         * <p>*   **0**: The task was complete.</p>
         * <p>*   **1**: The task was waiting to start.</p>
         * <p>*   **2**: The task was being initialized.</p>
         * <p>*   **3**: The task was in progress.</p>
         * <p>*   **4**: An error occurred.</p>
         * <p>*   **5**: The task failed.</p>
         */
        @NameInMap("State")
        public Integer state;

        /**
         * <p>The total number of migrated or synchronized objects.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static SummaryJobDetailResponseBodyProgressSummaryDetails build(java.util.Map<String, ?> map) throws Exception {
            SummaryJobDetailResponseBodyProgressSummaryDetails self = new SummaryJobDetailResponseBodyProgressSummaryDetails();
            return TeaModel.build(map, self);
        }

        public SummaryJobDetailResponseBodyProgressSummaryDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SummaryJobDetailResponseBodyProgressSummaryDetails setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public SummaryJobDetailResponseBodyProgressSummaryDetails setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
