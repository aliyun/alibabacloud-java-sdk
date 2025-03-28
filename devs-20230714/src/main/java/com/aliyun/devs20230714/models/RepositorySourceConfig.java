// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RepositorySourceConfig extends TeaModel {
    @NameInMap("codeVersion")
    public CodeVersionReference codeVersion;

    @NameInMap("filter")
    public EventFilterConfig filter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-repository</p>
     */
    @NameInMap("repositoryName")
    public String repositoryName;

    public static RepositorySourceConfig build(java.util.Map<String, ?> map) throws Exception {
        RepositorySourceConfig self = new RepositorySourceConfig();
        return TeaModel.build(map, self);
    }

    public RepositorySourceConfig setCodeVersion(CodeVersionReference codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public CodeVersionReference getCodeVersion() {
        return this.codeVersion;
    }

    public RepositorySourceConfig setFilter(EventFilterConfig filter) {
        this.filter = filter;
        return this;
    }
    public EventFilterConfig getFilter() {
        return this.filter;
    }

    public RepositorySourceConfig setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }
    public String getRepositoryName() {
        return this.repositoryName;
    }

}
