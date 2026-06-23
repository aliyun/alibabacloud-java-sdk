// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSkillRequest extends TeaModel {
    /**
     * <p>The unique name of the Skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-skill</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillRequest self = new GetSkillRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
