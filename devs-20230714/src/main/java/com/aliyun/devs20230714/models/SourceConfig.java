// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class SourceConfig extends TeaModel {
    @NameInMap("repository")
    public RepositorySourceConfig repository;

    @NameInMap("template")
    public TemplateSourceConfig template;

    public static SourceConfig build(java.util.Map<String, ?> map) throws Exception {
        SourceConfig self = new SourceConfig();
        return TeaModel.build(map, self);
    }

    public SourceConfig setRepository(RepositorySourceConfig repository) {
        this.repository = repository;
        return this;
    }
    public RepositorySourceConfig getRepository() {
        return this.repository;
    }

    public SourceConfig setTemplate(TemplateSourceConfig template) {
        this.template = template;
        return this;
    }
    public TemplateSourceConfig getTemplate() {
        return this.template;
    }

}
