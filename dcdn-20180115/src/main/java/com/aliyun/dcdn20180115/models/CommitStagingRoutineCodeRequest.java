// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CommitStagingRoutineCodeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Name")
    public String name;

    @NameInMap("CodeDescription")
    public String codeDescription;

    public static CommitStagingRoutineCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitStagingRoutineCodeRequest self = new CommitStagingRoutineCodeRequest();
        return TeaModel.build(map, self);
    }

    public CommitStagingRoutineCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CommitStagingRoutineCodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CommitStagingRoutineCodeRequest setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

}
