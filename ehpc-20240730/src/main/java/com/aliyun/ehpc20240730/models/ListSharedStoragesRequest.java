// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListSharedStoragesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the attached file system.</p>
     * 
     * <strong>example:</strong>
     * <p>0bd504b0**</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The type of the attached file system. Valid values:</p>
     * <ul>
     * <li>nas</li>
     * <li>cpfs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nas</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    public static ListSharedStoragesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSharedStoragesRequest self = new ListSharedStoragesRequest();
        return TeaModel.build(map, self);
    }

    public ListSharedStoragesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListSharedStoragesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListSharedStoragesRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

}
