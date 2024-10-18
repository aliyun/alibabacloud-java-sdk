// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CommitRoutineStagingCodeRequest extends TeaModel {
    @NameInMap("CodeDescription")
    public String codeDescription;

    /**
     * <strong>example:</strong>
     * <p>CommitRoutineStagingCode</p>
     */
    @NameInMap("Name")
    public String name;

    public static CommitRoutineStagingCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitRoutineStagingCodeRequest self = new CommitRoutineStagingCodeRequest();
        return TeaModel.build(map, self);
    }

    public CommitRoutineStagingCodeRequest setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public CommitRoutineStagingCodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
