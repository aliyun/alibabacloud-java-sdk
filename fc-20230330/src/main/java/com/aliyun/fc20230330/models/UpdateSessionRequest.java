// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateSessionRequest extends TeaModel {
    /**
     * <p>The session update configuration.</p>
     */
    @NameInMap("body")
    public UpdateSessionInput body;

    /**
     * <p>The function alias or version associated with the session to be updated.</p>
     * 
     * <strong>example:</strong>
     * <p>aliasName1</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static UpdateSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionRequest self = new UpdateSessionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSessionRequest setBody(UpdateSessionInput body) {
        this.body = body;
        return this;
    }
    public UpdateSessionInput getBody() {
        return this.body;
    }

    public UpdateSessionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
