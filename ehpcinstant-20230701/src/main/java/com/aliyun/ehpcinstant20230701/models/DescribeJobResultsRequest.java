// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobResultsRequest extends TeaModel {
    /**
     * <p>The executor number.</p>
     * 
     * <strong>example:</strong>
     * <p>0_1</p>
     */
    @NameInMap("ArrayIndex")
    public Integer arrayIndex;

    /**
     * <p>The encoding format for the <code>CommandContent</code> and <code>Output</code> fields in the response. Valid values:</p>
     * <ul>
     * <li><p>PlainText: Returns the original script content and output.</p>
     * </li>
     * <li><p>Base64: Returns the Base64-encoded script content and output.</p>
     * </li>
     * </ul>
     * <p>The default value is Base64.</p>
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
     * <p>The maximum size of the log in bytes. The value must be between 1 and 1,048,576 (1 MB).</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("LimitBytes")
    public String limitBytes;

    /**
     * <p>The time in UTC, formatted according to RFC 3339.</p>
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
