// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PauseSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static PauseSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseSessionRequest self = new PauseSessionRequest();
        return TeaModel.build(map, self);
    }

    public PauseSessionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
