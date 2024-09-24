// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessPointRequest extends TeaModel {
    /**
     * <p>The ID of the access point.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-ie15yd****</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DescribeAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointRequest self = new DescribeAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public DescribeAccessPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
