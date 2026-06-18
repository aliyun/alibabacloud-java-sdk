// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListTraceTasksRequest extends TeaModel {
    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>60.xx.xxx.38</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The diagnose ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f2xxx5</p>
     */
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    /**
     * <p>The domain name to diagnose.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">http://www.example.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Time zone: UTC/GMT.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size. Valid values: any integer from 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The start time. Time zone: UTC/GMT.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The diagnostic task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxx-x-x-xxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The diagnostic trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>000000xxxxxxxxxxxxxxxxxxxxxx33427e</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListTraceTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTraceTasksRequest self = new ListTraceTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTraceTasksRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public ListTraceTasksRequest setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public ListTraceTasksRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListTraceTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTraceTasksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTraceTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTraceTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTraceTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListTraceTasksRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
