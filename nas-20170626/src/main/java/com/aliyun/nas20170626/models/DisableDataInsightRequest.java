// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DisableDataInsightRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64y*****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DisableDataInsightRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDataInsightRequest self = new DisableDataInsightRequest();
        return TeaModel.build(map, self);
    }

    public DisableDataInsightRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
