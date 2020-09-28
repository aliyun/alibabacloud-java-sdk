// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidProjectRequest extends TeaModel {
    @NameInMap("PidProjectName")
    @Validation(required = true)
    public String pidProjectName;

    @NameInMap("PidOrganisationId")
    @Validation(required = true)
    public String pidOrganisationId;

    @NameInMap("PidProjectDesc")
    public String pidProjectDesc;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    public static CreatePidProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePidProjectRequest self = new CreatePidProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreatePidProjectRequest setPidProjectName(String pidProjectName) {
        this.pidProjectName = pidProjectName;
        return this;
    }
    public String getPidProjectName() {
        return this.pidProjectName;
    }

    public CreatePidProjectRequest setPidOrganisationId(String pidOrganisationId) {
        this.pidOrganisationId = pidOrganisationId;
        return this;
    }
    public String getPidOrganisationId() {
        return this.pidOrganisationId;
    }

    public CreatePidProjectRequest setPidProjectDesc(String pidProjectDesc) {
        this.pidProjectDesc = pidProjectDesc;
        return this;
    }
    public String getPidProjectDesc() {
        return this.pidProjectDesc;
    }

    public CreatePidProjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
