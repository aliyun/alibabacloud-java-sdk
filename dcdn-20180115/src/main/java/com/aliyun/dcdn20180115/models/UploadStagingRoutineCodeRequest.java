// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UploadStagingRoutineCodeRequest extends TeaModel {
    /**
     * <p>The description of the version.</p>
     */
    @NameInMap("CodeDescription")
    public String codeDescription;

    /**
     * <p>The name of the routine. The name needs to be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

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

}
