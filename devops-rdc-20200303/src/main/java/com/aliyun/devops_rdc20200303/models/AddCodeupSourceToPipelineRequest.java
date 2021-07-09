// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class AddCodeupSourceToPipelineRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    // 流水线ID
    @NameInMap("PipelineId")
    public Long pipelineId;

    // Codeup的代码库路径，比如 group1/repo1
    @NameInMap("CodePath")
    public String codePath;

    // 代码库分支
    @NameInMap("CodeBranch")
    public String codeBranch;

    public static AddCodeupSourceToPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCodeupSourceToPipelineRequest self = new AddCodeupSourceToPipelineRequest();
        return TeaModel.build(map, self);
    }

    public AddCodeupSourceToPipelineRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public AddCodeupSourceToPipelineRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public AddCodeupSourceToPipelineRequest setCodePath(String codePath) {
        this.codePath = codePath;
        return this;
    }
    public String getCodePath() {
        return this.codePath;
    }

    public AddCodeupSourceToPipelineRequest setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

}
