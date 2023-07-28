// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRunningJobsShrinkRequest extends TeaModel {
    @NameInMap("from")
    public Long from;

    @NameInMap("jobOwnerList")
    public String jobOwnerListShrink;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("quotaNicknameList")
    public String quotaNicknameListShrink;

    @NameInMap("to")
    public Long to;

    public static GetRunningJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunningJobsShrinkRequest self = new GetRunningJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetRunningJobsShrinkRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetRunningJobsShrinkRequest setJobOwnerListShrink(String jobOwnerListShrink) {
        this.jobOwnerListShrink = jobOwnerListShrink;
        return this;
    }
    public String getJobOwnerListShrink() {
        return this.jobOwnerListShrink;
    }

    public GetRunningJobsShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetRunningJobsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetRunningJobsShrinkRequest setQuotaNicknameListShrink(String quotaNicknameListShrink) {
        this.quotaNicknameListShrink = quotaNicknameListShrink;
        return this;
    }
    public String getQuotaNicknameListShrink() {
        return this.quotaNicknameListShrink;
    }

    public GetRunningJobsShrinkRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
