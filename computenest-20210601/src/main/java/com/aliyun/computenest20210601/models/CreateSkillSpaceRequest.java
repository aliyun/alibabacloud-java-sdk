// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillSpaceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The value of ClientToken can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the SkillSpace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All-in-one office toolkit — generate reports, process data, manage files, and streamline workflows effortlessly.</p>
     */
    @NameInMap("SkillSpaceDescription")
    public String skillSpaceDescription;

    /**
     * <p>The name of the SkillSpace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>office-toolkit-skills</p>
     */
    @NameInMap("SkillSpaceName")
    public String skillSpaceName;

    public static CreateSkillSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillSpaceRequest self = new CreateSkillSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillSpaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSkillSpaceRequest setSkillSpaceDescription(String skillSpaceDescription) {
        this.skillSpaceDescription = skillSpaceDescription;
        return this;
    }
    public String getSkillSpaceDescription() {
        return this.skillSpaceDescription;
    }

    public CreateSkillSpaceRequest setSkillSpaceName(String skillSpaceName) {
        this.skillSpaceName = skillSpaceName;
        return this;
    }
    public String getSkillSpaceName() {
        return this.skillSpaceName;
    }

}
