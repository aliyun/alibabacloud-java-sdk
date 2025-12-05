// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateSessionRequest extends TeaModel {
    /**
     * <p>Creates session configurations.</p>
     */
    @NameInMap("body")
    public CreateSessionInput body;

    /**
     * <p>Specifies the version or alias to which the sesion belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>aliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static CreateSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionRequest self = new CreateSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSessionRequest setBody(CreateSessionInput body) {
        this.body = body;
        return this;
    }
    public CreateSessionInput getBody() {
        return this.body;
    }

    public CreateSessionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
