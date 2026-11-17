// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteAiModelSourceModelRequest extends TeaModel {
    /**
     * <p>The expected object version. Use the version returned by the most recent query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

    public static DeleteAiModelSourceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiModelSourceModelRequest self = new DeleteAiModelSourceModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAiModelSourceModelRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

}
