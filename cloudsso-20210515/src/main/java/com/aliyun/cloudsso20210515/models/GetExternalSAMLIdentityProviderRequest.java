// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetExternalSAMLIdentityProviderRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetExternalSAMLIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExternalSAMLIdentityProviderRequest self = new GetExternalSAMLIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetExternalSAMLIdentityProviderRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
