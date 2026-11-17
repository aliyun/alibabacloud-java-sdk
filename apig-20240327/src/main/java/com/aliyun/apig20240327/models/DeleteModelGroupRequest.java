// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteModelGroupRequest extends TeaModel {
    /**
     * <p>The expected version. Only this version is deleted. API saved-state references prevent deletion, and authorization references are cleared.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

    public static DeleteModelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelGroupRequest self = new DeleteModelGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelGroupRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

}
