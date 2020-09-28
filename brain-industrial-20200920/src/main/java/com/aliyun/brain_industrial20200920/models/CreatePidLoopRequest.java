// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidLoopRequest extends TeaModel {
    @NameInMap("PidLoopName")
    @Validation(required = true)
    public String pidLoopName;

    @NameInMap("IsCrucialPidLoop")
    @Validation(required = true)
    public Boolean isCrucialPidLoop;

    @NameInMap("PidLoopDesc")
    public String pidLoopDesc;

    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("PidLoopDcsType")
    @Validation(required = true)
    public String pidLoopDcsType;

    @NameInMap("PidLoopType")
    @Validation(required = true)
    public String pidLoopType;

    @NameInMap("PidLoopConfiguration")
    @Validation(required = true)
    public java.util.Map<String, ?> pidLoopConfiguration;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    public static CreatePidLoopRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePidLoopRequest self = new CreatePidLoopRequest();
        return TeaModel.build(map, self);
    }

    public CreatePidLoopRequest setPidLoopName(String pidLoopName) {
        this.pidLoopName = pidLoopName;
        return this;
    }
    public String getPidLoopName() {
        return this.pidLoopName;
    }

    public CreatePidLoopRequest setIsCrucialPidLoop(Boolean isCrucialPidLoop) {
        this.isCrucialPidLoop = isCrucialPidLoop;
        return this;
    }
    public Boolean getIsCrucialPidLoop() {
        return this.isCrucialPidLoop;
    }

    public CreatePidLoopRequest setPidLoopDesc(String pidLoopDesc) {
        this.pidLoopDesc = pidLoopDesc;
        return this;
    }
    public String getPidLoopDesc() {
        return this.pidLoopDesc;
    }

    public CreatePidLoopRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public CreatePidLoopRequest setPidLoopDcsType(String pidLoopDcsType) {
        this.pidLoopDcsType = pidLoopDcsType;
        return this;
    }
    public String getPidLoopDcsType() {
        return this.pidLoopDcsType;
    }

    public CreatePidLoopRequest setPidLoopType(String pidLoopType) {
        this.pidLoopType = pidLoopType;
        return this;
    }
    public String getPidLoopType() {
        return this.pidLoopType;
    }

    public CreatePidLoopRequest setPidLoopConfiguration(java.util.Map<String, ?> pidLoopConfiguration) {
        this.pidLoopConfiguration = pidLoopConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getPidLoopConfiguration() {
        return this.pidLoopConfiguration;
    }

    public CreatePidLoopRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
