// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ContextSchema extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://git-scm.com/">git</a> address for <a href="https://git-scm.com/docs/git-clone">git clone</a>.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:git@gitlab.alibaba-inc.com">git@gitlab.alibaba-inc.com</a>:serverless/lambda.git</p>
     */
    @NameInMap("hint")
    public String hint;

    /**
     * <strong>example:</strong>
     * <p>gitRepoUrl</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("required")
    public Boolean required;

    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("type")
    public String type;

    public static ContextSchema build(java.util.Map<String, ?> map) throws Exception {
        ContextSchema self = new ContextSchema();
        return TeaModel.build(map, self);
    }

    public ContextSchema setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ContextSchema setHint(String hint) {
        this.hint = hint;
        return this;
    }
    public String getHint() {
        return this.hint;
    }

    public ContextSchema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContextSchema setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public ContextSchema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
