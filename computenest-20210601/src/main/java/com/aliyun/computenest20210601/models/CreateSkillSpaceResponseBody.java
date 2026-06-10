// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillSpaceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>SkillSpace ID</p>
     * 
     * <strong>example:</strong>
     * <p>ss-11111</p>
     */
    @NameInMap("SkillSpaceId")
    public String skillSpaceId;

    public static CreateSkillSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillSpaceResponseBody self = new CreateSkillSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSkillSpaceResponseBody setSkillSpaceId(String skillSpaceId) {
        this.skillSpaceId = skillSpaceId;
        return this;
    }
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

}
