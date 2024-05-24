// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ConnectionSpec extends TeaModel {
    @NameInMap("account")
    public GitAccount account;

    @NameInMap("gitlabConfig")
    public GitLabConfig gitlabConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("platform")
    public String platform;

    public static ConnectionSpec build(java.util.Map<String, ?> map) throws Exception {
        ConnectionSpec self = new ConnectionSpec();
        return TeaModel.build(map, self);
    }

    public ConnectionSpec setAccount(GitAccount account) {
        this.account = account;
        return this;
    }
    public GitAccount getAccount() {
        return this.account;
    }

    public ConnectionSpec setGitlabConfig(GitLabConfig gitlabConfig) {
        this.gitlabConfig = gitlabConfig;
        return this;
    }
    public GitLabConfig getGitlabConfig() {
        return this.gitlabConfig;
    }

    public ConnectionSpec setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
