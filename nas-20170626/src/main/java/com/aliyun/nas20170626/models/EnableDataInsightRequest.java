// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableDataInsightRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li>CPFS for Lingjun: The value must start with <code>bmcpfs-</code>, such as bmcpfs-125487\<em>\</em>\<em>\</em>.<blockquote>
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

    public static EnableDataInsightRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDataInsightRequest self = new EnableDataInsightRequest();
        return TeaModel.build(map, self);
    }

    public EnableDataInsightRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
