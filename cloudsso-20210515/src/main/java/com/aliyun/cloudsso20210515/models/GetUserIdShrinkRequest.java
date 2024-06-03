// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserIdShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The identifier information about the user that is synchronized from an external identity provider (IdP).</p>
     */
    @NameInMap("ExternalId")
    public String externalIdShrink;

    public static GetUserIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdShrinkRequest self = new GetUserIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetUserIdShrinkRequest setExternalIdShrink(String externalIdShrink) {
        this.externalIdShrink = externalIdShrink;
        return this;
    }
    public String getExternalIdShrink() {
        return this.externalIdShrink;
    }

}
