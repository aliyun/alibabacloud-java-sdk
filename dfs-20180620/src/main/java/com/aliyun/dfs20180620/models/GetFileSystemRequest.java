// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetFileSystemRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    public static GetFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileSystemRequest self = new GetFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public GetFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public GetFileSystemRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

}
