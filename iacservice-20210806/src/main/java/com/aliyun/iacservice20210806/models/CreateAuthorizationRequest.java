// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("dueTime")
    public String dueTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-148e7853433574fff6b316f4eb737e</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a220da4-f594-4776-87ed-f37888ec0473</p>
     */
    @NameInMap("uid")
    public Long uid;

    public static CreateAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRequest self = new CreateAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAuthorizationRequest setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public String getDueTime() {
        return this.dueTime;
    }

    public CreateAuthorizationRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateAuthorizationRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public CreateAuthorizationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAuthorizationRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
