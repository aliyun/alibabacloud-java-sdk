// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateRuleRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    /**
     * <p>ID</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static UpdateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleRequest self = new UpdateRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
