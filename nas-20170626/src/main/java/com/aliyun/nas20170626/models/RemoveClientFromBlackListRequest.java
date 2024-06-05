// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RemoveClientFromBlackListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientIP")
    public String clientIP;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RemoveClientFromBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClientFromBlackListRequest self = new RemoveClientFromBlackListRequest();
        return TeaModel.build(map, self);
    }

    public RemoveClientFromBlackListRequest setClientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }
    public String getClientIP() {
        return this.clientIP;
    }

    public RemoveClientFromBlackListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveClientFromBlackListRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public RemoveClientFromBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
