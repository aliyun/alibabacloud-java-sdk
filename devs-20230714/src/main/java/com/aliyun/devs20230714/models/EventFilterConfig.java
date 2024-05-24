// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EventFilterConfig extends TeaModel {
    @NameInMap("pullRequest")
    public PullRequestFilter pullRequest;

    @NameInMap("push")
    public PushFilter push;

    public static EventFilterConfig build(java.util.Map<String, ?> map) throws Exception {
        EventFilterConfig self = new EventFilterConfig();
        return TeaModel.build(map, self);
    }

    public EventFilterConfig setPullRequest(PullRequestFilter pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }
    public PullRequestFilter getPullRequest() {
        return this.pullRequest;
    }

    public EventFilterConfig setPush(PushFilter push) {
        this.push = push;
        return this;
    }
    public PushFilter getPush() {
        return this.push;
    }

}
