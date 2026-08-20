// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobResultsRequest extends TeaModel {
    /**
     * <p>The executor index.</p>
     * 
     * <strong>example:</strong>
     * <p>0_1</p>
     */
    @NameInMap("ArrayIndex")
    public Integer arrayIndex;

    /**
     * <p>The encoding method for the CommandContent and Output fields in the response. Valid values:</p>
     * <ul>
     * <li>PlainText: returns the original script content and output.</li>
     * <li>Base64: returns Base64-encoded script content and output.</li>
     * </ul>
     * <p>Default value: Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>job-xxxxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The maximum size of the log. Unit: bytes. Valid values: 1 to 1048576 (1 MB).</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("LimitBytes")
    public String limitBytes;

    /**
     * <p>The start time in UTC, in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-02T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Task0</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeJobResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResultsRequest self = new DescribeJobResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobResultsRequest setArrayIndex(Integer arrayIndex) {
        this.arrayIndex = arrayIndex;
        return this;
    }
    public Integer getArrayIndex() {
        return this.arrayIndex;
    }

    public DescribeJobResultsRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public DescribeJobResultsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeJobResultsRequest setLimitBytes(String limitBytes) {
        this.limitBytes = limitBytes;
        return this;
    }
    public String getLimitBytes() {
        return this.limitBytes;
    }

    public DescribeJobResultsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeJobResultsRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
