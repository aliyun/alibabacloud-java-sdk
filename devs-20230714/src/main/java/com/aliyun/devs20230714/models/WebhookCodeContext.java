// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class WebhookCodeContext extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("branch")
    public String branch;

    /**
     * <strong>example:</strong>
     * <p>b1dd9ba168dfef1cb3a1dd608b6054c771a93959</p>
     */
    @NameInMap("commitID")
    public String commitID;

    /**
     * <strong>example:</strong>
     * <p>my PR decscription</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>PUSH</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <strong>example:</strong>
     * <p>commit message</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>merged</p>
     */
    @NameInMap("prType")
    public String prType;

    /**
     * <strong>example:</strong>
     * <p><a href="https://codeup.aliyun.com/my-namespace/my-repo.git">https://codeup.aliyun.com/my-namespace/my-repo.git</a></p>
     */
    @NameInMap("repoUrl")
    public String repoUrl;

    /**
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("sourceBranch")
    public String sourceBranch;

    /**
     * <strong>example:</strong>
     * <p>release-0.0.1</p>
     */
    @NameInMap("tag")
    public String tag;

    /**
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("targetBranch")
    public String targetBranch;

    /**
     * <strong>example:</strong>
     * <h1>FIX</h1>
     */
    @NameInMap("title")
    public String title;

    public static WebhookCodeContext build(java.util.Map<String, ?> map) throws Exception {
        WebhookCodeContext self = new WebhookCodeContext();
        return TeaModel.build(map, self);
    }

    public WebhookCodeContext setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public WebhookCodeContext setCommitID(String commitID) {
        this.commitID = commitID;
        return this;
    }
    public String getCommitID() {
        return this.commitID;
    }

    public WebhookCodeContext setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public WebhookCodeContext setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public WebhookCodeContext setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WebhookCodeContext setPrType(String prType) {
        this.prType = prType;
        return this;
    }
    public String getPrType() {
        return this.prType;
    }

    public WebhookCodeContext setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

    public WebhookCodeContext setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public WebhookCodeContext setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public WebhookCodeContext setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public WebhookCodeContext setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
