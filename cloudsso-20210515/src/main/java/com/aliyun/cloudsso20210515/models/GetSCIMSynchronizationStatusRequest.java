// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetSCIMSynchronizationStatusRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetSCIMSynchronizationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSCIMSynchronizationStatusRequest self = new GetSCIMSynchronizationStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSCIMSynchronizationStatusRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
