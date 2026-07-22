// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeScheduledTaskExecutionsRequest extends TeaModel {
    /**
     * <p>The end time of the time range in ISO-8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-12T23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>acp-axxkuuxahbu1*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of results to return per request. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Leave this parameter empty for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the scheduled task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sch-260705-agb*****</p>
     */
    @NameInMap("ScheduledId")
    public String scheduledId;

    /**
     * <p>The start time of the time range in ISO-8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-01T00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeScheduledTaskExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTaskExecutionsRequest self = new DescribeScheduledTaskExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTaskExecutionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScheduledTaskExecutionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeScheduledTaskExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeScheduledTaskExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScheduledTaskExecutionsRequest setScheduledId(String scheduledId) {
        this.scheduledId = scheduledId;
        return this;
    }
    public String getScheduledId() {
        return this.scheduledId;
    }

    public DescribeScheduledTaskExecutionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScheduledTaskExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
