// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRunningJobsRequest extends TeaModel {
    /**
     * <p>The time when the query starts. This parameter specifies the time when a job is submitted.</p>
     * <br>
     * <p>*   The time range that is specified by the **from** and **to** request parameters is a closed interval. The start time and end time are included in the range. If the value of **from** is the same as the value of **to**, the time range is invalid, and a null value is returned.</p>
     * <p>*   The value is a UNIX timestamp that represents the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <p>The list of job executors.</p>
     */
    @NameInMap("jobOwnerList")
    public java.util.List<String> jobOwnerList;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 20.</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The list of nicknames of quotas that are used by jobs.</p>
     */
    @NameInMap("quotaNicknameList")
    public java.util.List<String> quotaNicknameList;

    /**
     * <p>The time when the query ends. This parameter specifies the time when a job is submitted.</p>
     * <br>
     * <p>*   The time interval that is specified by the **from** and **to** request parameters is a closed interval. The start time and end time are included in the interval. If the value of **from** is the same as the value of **to**, the interval is invalid, and a null value is returned.</p>
     * <p>*   The value is a UNIX timestamp that represents the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("to")
    public Long to;

    public static GetRunningJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunningJobsRequest self = new GetRunningJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetRunningJobsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetRunningJobsRequest setJobOwnerList(java.util.List<String> jobOwnerList) {
        this.jobOwnerList = jobOwnerList;
        return this;
    }
    public java.util.List<String> getJobOwnerList() {
        return this.jobOwnerList;
    }

    public GetRunningJobsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetRunningJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetRunningJobsRequest setQuotaNicknameList(java.util.List<String> quotaNicknameList) {
        this.quotaNicknameList = quotaNicknameList;
        return this;
    }
    public java.util.List<String> getQuotaNicknameList() {
        return this.quotaNicknameList;
    }

    public GetRunningJobsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
