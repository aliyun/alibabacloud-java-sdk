// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListMediaWorkflowExecutionsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    @NameInMap("MediaWorkflowName")
    public String mediaWorkflowName;

    @NameInMap("InputFileURL")
    public String inputFileURL;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ListMediaWorkflowExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaWorkflowExecutionsRequest self = new ListMediaWorkflowExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaWorkflowExecutionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListMediaWorkflowExecutionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListMediaWorkflowExecutionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListMediaWorkflowExecutionsRequest setMediaWorkflowId(String mediaWorkflowId) {
        this.mediaWorkflowId = mediaWorkflowId;
        return this;
    }
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    public ListMediaWorkflowExecutionsRequest setMediaWorkflowName(String mediaWorkflowName) {
        this.mediaWorkflowName = mediaWorkflowName;
        return this;
    }
    public String getMediaWorkflowName() {
        return this.mediaWorkflowName;
    }

    public ListMediaWorkflowExecutionsRequest setInputFileURL(String inputFileURL) {
        this.inputFileURL = inputFileURL;
        return this;
    }
    public String getInputFileURL() {
        return this.inputFileURL;
    }

    public ListMediaWorkflowExecutionsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListMediaWorkflowExecutionsRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    public ListMediaWorkflowExecutionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
