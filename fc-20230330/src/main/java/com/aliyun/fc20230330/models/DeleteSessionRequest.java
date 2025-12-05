// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DeleteSessionRequest extends TeaModel {
    /**
     * <p>The function alias or version associated with the session to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>aliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static DeleteSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionRequest self = new DeleteSessionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSessionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
