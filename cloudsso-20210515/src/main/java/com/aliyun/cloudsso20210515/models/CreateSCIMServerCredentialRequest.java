// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateSCIMServerCredentialRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static CreateSCIMServerCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSCIMServerCredentialRequest self = new CreateSCIMServerCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateSCIMServerCredentialRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
