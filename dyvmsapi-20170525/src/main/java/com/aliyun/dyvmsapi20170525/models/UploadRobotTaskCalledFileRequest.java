// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UploadRobotTaskCalledFileRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("TtsParam")
    public String ttsParam;

    @NameInMap("TtsParamHead")
    public String ttsParamHead;

    public static UploadRobotTaskCalledFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRobotTaskCalledFileRequest self = new UploadRobotTaskCalledFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadRobotTaskCalledFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UploadRobotTaskCalledFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UploadRobotTaskCalledFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UploadRobotTaskCalledFileRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UploadRobotTaskCalledFileRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public UploadRobotTaskCalledFileRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public UploadRobotTaskCalledFileRequest setTtsParamHead(String ttsParamHead) {
        this.ttsParamHead = ttsParamHead;
        return this;
    }
    public String getTtsParamHead() {
        return this.ttsParamHead;
    }

}
