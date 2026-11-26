// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetSecurityInfoPreferenceRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetSecurityInfoPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityInfoPreferenceRequest self = new GetSecurityInfoPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public GetSecurityInfoPreferenceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
