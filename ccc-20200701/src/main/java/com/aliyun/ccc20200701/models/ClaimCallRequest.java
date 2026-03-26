// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ClaimCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[
     * {
     * &quot;f0&quot;: &quot;zeren001@report-test-2&quot;,
     * &quot;f1&quot;: &quot;desktop-voip-box@report-test-2&quot;
     * }
     * ]</p>
     */
    @NameInMap("CandidateUserListJson")
    public String candidateUserListJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6538214103685****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>test_sg_****@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <strong>example:</strong>
     * <p>tags</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>invoker@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ClaimCallRequest build(java.util.Map<String, ?> map) throws Exception {
        ClaimCallRequest self = new ClaimCallRequest();
        return TeaModel.build(map, self);
    }

    public ClaimCallRequest setCandidateUserListJson(String candidateUserListJson) {
        this.candidateUserListJson = candidateUserListJson;
        return this;
    }
    public String getCandidateUserListJson() {
        return this.candidateUserListJson;
    }

    public ClaimCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ClaimCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ClaimCallRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ClaimCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ClaimCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
