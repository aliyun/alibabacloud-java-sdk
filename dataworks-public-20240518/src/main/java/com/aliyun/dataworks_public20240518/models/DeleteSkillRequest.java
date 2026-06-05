// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteSkillRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-skill</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillRequest self = new DeleteSkillRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
