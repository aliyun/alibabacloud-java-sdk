// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetHistoryPsiPreCacheJobsForJobMembersRequest extends TeaModel {
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("MemberId1")
    public Long memberId1;

    @NameInMap("MemberId2")
    public Long memberId2;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetHistoryPsiPreCacheJobsForJobMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryPsiPreCacheJobsForJobMembersRequest self = new GetHistoryPsiPreCacheJobsForJobMembersRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoryPsiPreCacheJobsForJobMembersRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersRequest setMemberId1(Long memberId1) {
        this.memberId1 = memberId1;
        return this;
    }
    public Long getMemberId1() {
        return this.memberId1;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersRequest setMemberId2(Long memberId2) {
        this.memberId2 = memberId2;
        return this;
    }
    public Long getMemberId2() {
        return this.memberId2;
    }

    public GetHistoryPsiPreCacheJobsForJobMembersRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
