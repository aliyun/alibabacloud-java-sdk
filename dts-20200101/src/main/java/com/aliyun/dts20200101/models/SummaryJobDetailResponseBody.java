// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SummaryJobDetailResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the data migration or data synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>l3m1213ye7l****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The returned information about the migrated or synchronized objects in arrays.</p>
     * <blockquote>
     * <p> The arrays are in the following format: [{&quot;key&quot;:&quot;Function&quot;,&quot;state&quot;:5,&quot;totalCount&quot;:22},{&quot;key&quot;:&quot;Procedure&quot;,&quot;state&quot;:5,&quot;totalCount&quot;:26},{&quot;key&quot;:&quot;Table&quot;,&quot;state&quot;:0,&quot;totalCount&quot;:68},{&quot;key&quot;:&quot;View&quot;,&quot;state&quot;:5,&quot;totalCount&quot;:100}].</p>
     * </blockquote>
     */
    @NameInMap("ProgressSummaryDetails")
    public java.util.List<SummaryJobDetailResponseBodyProgressSummaryDetails> progressSummaryDetails;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9033138C-5AB3-5EB7-BA78-43131F19297C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The type of migrated or synchronized object. Valid values: <strong>Table</strong>, <strong>Constraint</strong>, <strong>Index</strong>, <strong>View</strong>, <strong>Materialize View</strong>, <strong>Type</strong>, <strong>Synonym</strong>, <strong>Trigger</strong>, <strong>Function</strong>, <strong>Procedure</strong>, <strong>Package</strong>, <strong>Default</strong>, <strong>Rule</strong>, <strong>PlanGuide</strong>, and <strong>Sequence</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The state of the data migration or data synchronization task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task was complete.</li>
         * <li><strong>1</strong>: The task was waiting to start.</li>
         * <li><strong>2</strong>: The task was being initialized.</li>
         * <li><strong>3</strong>: The task was in progress.</li>
         * <li><strong>4</strong>: An error occurred.</li>
         * <li><strong>5</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("State")
        public Integer state;

        /**
         * <p>The total number of migrated or synchronized objects.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
