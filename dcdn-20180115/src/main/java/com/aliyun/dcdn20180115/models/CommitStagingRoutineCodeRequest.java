// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CommitStagingRoutineCodeRequest extends TeaModel {
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

    public static CommitStagingRoutineCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitStagingRoutineCodeRequest self = new CommitStagingRoutineCodeRequest();
        return TeaModel.build(map, self);
    }

    public CommitStagingRoutineCodeRequest setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public CommitStagingRoutineCodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
