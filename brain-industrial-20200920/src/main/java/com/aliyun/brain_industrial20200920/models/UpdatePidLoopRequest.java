// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class UpdatePidLoopRequest extends TeaModel {
    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("PidLoopName")
    @Validation(required = true)
    public String pidLoopName;

    @NameInMap("Crucial")
    @Validation(required = true)
    public Boolean crucial;

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

    public static UpdatePidLoopRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePidLoopRequest self = new UpdatePidLoopRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePidLoopRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public UpdatePidLoopRequest setPidLoopName(String pidLoopName) {
        this.pidLoopName = pidLoopName;
        return this;
    }
    public String getPidLoopName() {
        return this.pidLoopName;
    }

    public UpdatePidLoopRequest setCrucial(Boolean crucial) {
        this.crucial = crucial;
        return this;
    }
    public Boolean getCrucial() {
        return this.crucial;
    }

    public UpdatePidLoopRequest setPidLoopDesc(String pidLoopDesc) {
        this.pidLoopDesc = pidLoopDesc;
        return this;
    }
    public String getPidLoopDesc() {
        return this.pidLoopDesc;
    }

    public UpdatePidLoopRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public UpdatePidLoopRequest setPidLoopDcsType(String pidLoopDcsType) {
        this.pidLoopDcsType = pidLoopDcsType;
        return this;
    }
    public String getPidLoopDcsType() {
        return this.pidLoopDcsType;
    }

    public UpdatePidLoopRequest setPidLoopType(String pidLoopType) {
        this.pidLoopType = pidLoopType;
        return this;
    }
    public String getPidLoopType() {
        return this.pidLoopType;
    }

    public UpdatePidLoopRequest setPidLoopConfiguration(java.util.Map<String, ?> pidLoopConfiguration) {
        this.pidLoopConfiguration = pidLoopConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getPidLoopConfiguration() {
        return this.pidLoopConfiguration;
    }

}
