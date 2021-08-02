// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceMuRequest extends TeaModel {
    // 创建时间起始
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    // 创建时间截止
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    // 任务id
    @NameInMap("JobId")
    public String jobId;

    // 水印强度
    @NameInMap("Level")
    public Long level;

    // 水印信息id
    @NameInMap("MessageId")
    public Long messageId;

    // 页偏移
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryTraceMuRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceMuRequest self = new QueryTraceMuRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceMuRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryTraceMuRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryTraceMuRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryTraceMuRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public QueryTraceMuRequest setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

    public QueryTraceMuRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryTraceMuRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
