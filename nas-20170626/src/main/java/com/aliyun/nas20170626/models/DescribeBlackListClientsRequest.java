// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsRequest extends TeaModel {
    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("ClientIP")
    public String clientIP;

    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the region where the file system resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeBlackListClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListClientsRequest self = new DescribeBlackListClientsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListClientsRequest setClientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }
    public String getClientIP() {
        return this.clientIP;
    }

    public DescribeBlackListClientsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeBlackListClientsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
