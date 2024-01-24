// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddClientToBlackListRequest extends TeaModel {
    /**
     * <p>The IP address of the client to add.</p>
     */
    @NameInMap("ClientIP")
    public String clientIP;

    /**
     * <p>This parameter ensures the idempotency of each request. A ClientToken is generated for each client. Make sure that each ClientToken is unique between different requests. The parameter can be a maximum of 64 characters in length and contain ASCII characters.</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](https://www.alibabacloud.com/help/doc-detail/25693.htm).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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

    public static AddClientToBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClientToBlackListRequest self = new AddClientToBlackListRequest();
        return TeaModel.build(map, self);
    }

    public AddClientToBlackListRequest setClientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }
    public String getClientIP() {
        return this.clientIP;
    }

    public AddClientToBlackListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddClientToBlackListRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public AddClientToBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
