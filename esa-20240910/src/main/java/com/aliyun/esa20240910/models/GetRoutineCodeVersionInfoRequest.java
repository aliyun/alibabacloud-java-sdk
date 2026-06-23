// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineCodeVersionInfoRequest extends TeaModel {
    /**
     * <p>The code version number to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>The name of the Edge Routine.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetRoutineCodeVersionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineCodeVersionInfoRequest self = new GetRoutineCodeVersionInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutineCodeVersionInfoRequest setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public GetRoutineCodeVersionInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
