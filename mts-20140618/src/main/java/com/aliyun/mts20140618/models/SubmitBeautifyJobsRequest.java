// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitBeautifyJobsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("BeautifyConfig")
    public String beautifyConfig;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SubmitBeautifyJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBeautifyJobsRequest self = new SubmitBeautifyJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBeautifyJobsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitBeautifyJobsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitBeautifyJobsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitBeautifyJobsRequest setBeautifyConfig(String beautifyConfig) {
        this.beautifyConfig = beautifyConfig;
        return this;
    }
    public String getBeautifyConfig() {
        return this.beautifyConfig;
    }

    public SubmitBeautifyJobsRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitBeautifyJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitBeautifyJobsRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public SubmitBeautifyJobsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
