// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetAgenticSpaceRequest extends TeaModel {
    /**
     * <p>AgenticSpace Id。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentic-229oypxjgpau2****</p>
     */
    @NameInMap("AgenticSpaceId")
    public String agenticSpaceId;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>06229oypxjgox0u****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static GetAgenticSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticSpaceRequest self = new GetAgenticSpaceRequest();
        return TeaModel.build(map, self);
    }

    public GetAgenticSpaceRequest setAgenticSpaceId(String agenticSpaceId) {
        this.agenticSpaceId = agenticSpaceId;
        return this;
    }
    public String getAgenticSpaceId() {
        return this.agenticSpaceId;
    }

    public GetAgenticSpaceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
