// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EventPayload extends TeaModel {
    @NameInMap("codeup")
    public CodeupEventPayload codeup;

    @NameInMap("gitee")
    public GiteeEventPayload gitee;

    @NameInMap("github")
    public GithubEventPayload github;

    @NameInMap("gitlab")
    public GitlabEventPayload gitlab;

    @NameInMap("manual")
    public ManualEventPayload manual;

    public static EventPayload build(java.util.Map<String, ?> map) throws Exception {
        EventPayload self = new EventPayload();
        return TeaModel.build(map, self);
    }

    public EventPayload setCodeup(CodeupEventPayload codeup) {
        this.codeup = codeup;
        return this;
    }
    public CodeupEventPayload getCodeup() {
        return this.codeup;
    }

    public EventPayload setGitee(GiteeEventPayload gitee) {
        this.gitee = gitee;
        return this;
    }
    public GiteeEventPayload getGitee() {
        return this.gitee;
    }

    public EventPayload setGithub(GithubEventPayload github) {
        this.github = github;
        return this;
    }
    public GithubEventPayload getGithub() {
        return this.github;
    }

    public EventPayload setGitlab(GitlabEventPayload gitlab) {
        this.gitlab = gitlab;
        return this;
    }
    public GitlabEventPayload getGitlab() {
        return this.gitlab;
    }

    public EventPayload setManual(ManualEventPayload manual) {
        this.manual = manual;
        return this;
    }
    public ManualEventPayload getManual() {
        return this.manual;
    }

}
