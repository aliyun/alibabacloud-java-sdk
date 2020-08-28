// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddClientToBlackListRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("FileSystemId")
    @Validation(required = true)
    public String fileSystemId;

    @NameInMap("ClientIP")
    @Validation(required = true)
    public String clientIP;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    public static AddClientToBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClientToBlackListRequest self = new AddClientToBlackListRequest();
        return TeaModel.build(map, self);
    }

    public AddClientToBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddClientToBlackListRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
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

}
