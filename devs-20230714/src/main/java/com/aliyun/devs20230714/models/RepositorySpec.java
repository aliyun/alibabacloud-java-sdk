// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RepositorySpec extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cloneUrl")
    public String cloneUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("connectionName")
    public String connectionName;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("id")
    public Long id;

    @NameInMap("owner")
    public String owner;

    @NameInMap("platform")
    public String platform;

    @NameInMap("webUrl")
    public String webUrl;

    public static RepositorySpec build(java.util.Map<String, ?> map) throws Exception {
        RepositorySpec self = new RepositorySpec();
        return TeaModel.build(map, self);
    }

    public RepositorySpec setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }
    public String getCloneUrl() {
        return this.cloneUrl;
    }

    public RepositorySpec setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public RepositorySpec setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RepositorySpec setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RepositorySpec setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public RepositorySpec setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public RepositorySpec setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

}
