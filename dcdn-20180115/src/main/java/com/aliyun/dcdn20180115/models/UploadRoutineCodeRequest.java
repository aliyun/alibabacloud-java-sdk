// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UploadRoutineCodeRequest extends TeaModel {
    /**
     * <p>The description of the code version.</p>
     */
    @NameInMap("CodeDescription")
    public String codeDescription;

    /**
     * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
     */
    @NameInMap("Name")
    public String name;

    public static UploadRoutineCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRoutineCodeRequest self = new UploadRoutineCodeRequest();
        return TeaModel.build(map, self);
    }

    public UploadRoutineCodeRequest setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public UploadRoutineCodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
