// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class GetSkillContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     * <h2>name: alibabacloud-find-skills
     * description: &quot;Search for official Alibaba Cloud Agent Skills based on user requirements&quot;</h2>
     * <p>Agent Skill Body Content Here</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1764D64D-5262-55DA-BDBF-1F949B1B34F7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSkillContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillContentResponseBody self = new GetSkillContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetSkillContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
