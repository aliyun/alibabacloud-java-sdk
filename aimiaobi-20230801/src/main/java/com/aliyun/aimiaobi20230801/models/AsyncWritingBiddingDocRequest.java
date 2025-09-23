// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncWritingBiddingDocRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>comany name</p>
     */
    @NameInMap("CompanyKeyword")
    public String companyKeyword;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncWritingBiddingDocRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncWritingBiddingDocRequest self = new AsyncWritingBiddingDocRequest();
        return TeaModel.build(map, self);
    }

    public AsyncWritingBiddingDocRequest setCompanyKeyword(String companyKeyword) {
        this.companyKeyword = companyKeyword;
        return this;
    }
    public String getCompanyKeyword() {
        return this.companyKeyword;
    }

    public AsyncWritingBiddingDocRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public AsyncWritingBiddingDocRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncWritingBiddingDocRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
