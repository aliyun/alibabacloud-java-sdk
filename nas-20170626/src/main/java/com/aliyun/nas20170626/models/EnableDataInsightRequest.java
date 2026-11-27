// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableDataInsightRequest extends TeaModel {
    /**
     * <p>The ID of the file system. The ID must start with <code>bmcpfs-</code>, such as bmcpfs-125487****. You can obtain the ID by purchasing a file system through the NAS console or by calling the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> operation and setting FileSystemType to bmcpfs.</p>
     * <blockquote>
     * <p>This feature is supported only by CPFS for Lingjun file systems.</p>
     * </blockquote>
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
