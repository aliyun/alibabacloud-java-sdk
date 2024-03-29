// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetLoginPreferenceRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetLoginPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPreferenceRequest self = new GetLoginPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginPreferenceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
