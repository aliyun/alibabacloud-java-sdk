// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CommitRoutineStagingCodeRequest extends TeaModel {
    /**
     * <p>The description of the code version.</p>
     * 
     * <strong>example:</strong>
     * <p>description of this code ver</p>
     */
    @NameInMap("CodeDescription")
    public String codeDescription;

    /**
     * <p>The routine name.</p>
     * <p>This parameter is required.</p>
     * 
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
