// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static GetSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSessionRequest self = new GetSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetSessionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
