// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessPointRequest extends TeaModel {
    @NameInMap("AccessPointId")
    public String accessPointId;

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
