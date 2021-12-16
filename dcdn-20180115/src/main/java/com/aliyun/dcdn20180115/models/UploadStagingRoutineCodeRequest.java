// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UploadStagingRoutineCodeRequest extends TeaModel {
    @NameInMap("CodeDescription")
    public String codeDescription;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static UploadStagingRoutineCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadStagingRoutineCodeRequest self = new UploadStagingRoutineCodeRequest();
        return TeaModel.build(map, self);
    }

    public UploadStagingRoutineCodeRequest setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public UploadStagingRoutineCodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadStagingRoutineCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
