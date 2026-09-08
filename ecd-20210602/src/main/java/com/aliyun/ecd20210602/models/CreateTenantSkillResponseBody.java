// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateTenantSkillResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unique ID of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>s-04rj8mzqj1fu****</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    public static CreateTenantSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantSkillResponseBody self = new CreateTenantSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantSkillResponseBody setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

}
