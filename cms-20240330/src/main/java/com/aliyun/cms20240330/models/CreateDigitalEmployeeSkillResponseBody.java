// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDigitalEmployeeSkillResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>skill</p>
     */
    @NameInMap("skillName")
    public String skillName;

    public static CreateDigitalEmployeeSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalEmployeeSkillResponseBody self = new CreateDigitalEmployeeSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDigitalEmployeeSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDigitalEmployeeSkillResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
