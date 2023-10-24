// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetJobResourceUsageShrinkRequest extends TeaModel {
    /**
     * <p>The date that is accurate to the day part for the query. The date must be in the yyyy-MM-dd format.</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <p>The list of job executors.</p>
     */
    @NameInMap("jobOwnerList")
    public String jobOwnerListShrink;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The list of nicknames of quotas that are used by jobs.</p>
     */
    @NameInMap("quotaNicknameList")
    public String quotaNicknameListShrink;

    public static GetJobResourceUsageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobResourceUsageShrinkRequest self = new GetJobResourceUsageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetJobResourceUsageShrinkRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetJobResourceUsageShrinkRequest setJobOwnerListShrink(String jobOwnerListShrink) {
        this.jobOwnerListShrink = jobOwnerListShrink;
        return this;
    }
    public String getJobOwnerListShrink() {
        return this.jobOwnerListShrink;
    }

    public GetJobResourceUsageShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetJobResourceUsageShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetJobResourceUsageShrinkRequest setQuotaNicknameListShrink(String quotaNicknameListShrink) {
        this.quotaNicknameListShrink = quotaNicknameListShrink;
        return this;
    }
    public String getQuotaNicknameListShrink() {
        return this.quotaNicknameListShrink;
    }

}
