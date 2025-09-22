// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineCodeVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GetRoutineCodeVersion</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetRoutineCodeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineCodeVersionRequest self = new GetRoutineCodeVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutineCodeVersionRequest setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public GetRoutineCodeVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
