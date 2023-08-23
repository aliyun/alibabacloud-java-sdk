// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CreateCorpNumberGroupRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static CreateCorpNumberGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpNumberGroupRequest self = new CreateCorpNumberGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateCorpNumberGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCorpNumberGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
