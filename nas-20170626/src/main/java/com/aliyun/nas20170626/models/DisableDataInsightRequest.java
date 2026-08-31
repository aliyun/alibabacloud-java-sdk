// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DisableDataInsightRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, for example, bmcpfs-0015\<em>\</em>\<em>\</em>.<blockquote>
     * <p>Only CPFS for Lingjun file systems are supported.</p>
     * </blockquote>
     * </li>
     * </ul>
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
