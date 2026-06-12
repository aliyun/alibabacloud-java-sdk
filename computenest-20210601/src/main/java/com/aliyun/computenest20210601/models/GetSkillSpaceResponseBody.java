// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillSpaceResponseBody extends TeaModel {
    /**
     * <p>The time when the SkillSpace was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the SkillSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("SkillSpaceDescription")
    public String skillSpaceDescription;

    /**
     * <p>The ID of the SkillSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-11111</p>
     */
    @NameInMap("SkillSpaceId")
    public String skillSpaceId;

    /**
     * <p>The name of the SkillSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("SkillSpaceName")
    public String skillSpaceName;

    /**
     * <p>The time when the SkillSpace was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetSkillSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillSpaceResponseBody self = new GetSkillSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillSpaceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetSkillSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillSpaceResponseBody setSkillSpaceDescription(String skillSpaceDescription) {
        this.skillSpaceDescription = skillSpaceDescription;
        return this;
    }
    public String getSkillSpaceDescription() {
        return this.skillSpaceDescription;
    }

    public GetSkillSpaceResponseBody setSkillSpaceId(String skillSpaceId) {
        this.skillSpaceId = skillSpaceId;
        return this;
    }
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    public GetSkillSpaceResponseBody setSkillSpaceName(String skillSpaceName) {
        this.skillSpaceName = skillSpaceName;
        return this;
    }
    public String getSkillSpaceName() {
        return this.skillSpaceName;
    }

    public GetSkillSpaceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
