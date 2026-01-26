// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetFilesetRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-125487\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS for Lingjun file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-0015\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The fileset ID.</p>
     * <blockquote>
     * <p> This parameter is required for CPFS file systems.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fset-1902718ea0ae****</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    public static GetFilesetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFilesetRequest self = new GetFilesetRequest();
        return TeaModel.build(map, self);
    }

    public GetFilesetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public GetFilesetRequest setFsetId(String fsetId) {
        this.fsetId = fsetId;
        return this;
    }
    public String getFsetId() {
        return this.fsetId;
    }

}
