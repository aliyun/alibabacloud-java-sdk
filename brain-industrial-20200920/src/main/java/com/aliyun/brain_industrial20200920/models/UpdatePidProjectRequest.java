// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class UpdatePidProjectRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("PidProjectName")
    public String pidProjectName;

    @NameInMap("PidProjectDesc")
    public String pidProjectDesc;

    @NameInMap("PidOrganisationId")
    @Validation(required = true)
    public String pidOrganisationId;

    public static UpdatePidProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePidProjectRequest self = new UpdatePidProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePidProjectRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public UpdatePidProjectRequest setPidProjectName(String pidProjectName) {
        this.pidProjectName = pidProjectName;
        return this;
    }
    public String getPidProjectName() {
        return this.pidProjectName;
    }

    public UpdatePidProjectRequest setPidProjectDesc(String pidProjectDesc) {
        this.pidProjectDesc = pidProjectDesc;
        return this;
    }
    public String getPidProjectDesc() {
        return this.pidProjectDesc;
    }

    public UpdatePidProjectRequest setPidOrganisationId(String pidOrganisationId) {
        this.pidOrganisationId = pidOrganisationId;
        return this;
    }
    public String getPidOrganisationId() {
        return this.pidOrganisationId;
    }

}
