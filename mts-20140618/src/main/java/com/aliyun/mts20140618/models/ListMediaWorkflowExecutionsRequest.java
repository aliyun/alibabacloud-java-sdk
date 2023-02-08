// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListMediaWorkflowExecutionsRequest extends TeaModel {
    /**
     * <p>The Object Storage Service (OSS) URL of the input file of the media workflow. The URL complies with RFC 3986 and is encoded in UTF-8, with reserved characters being percent-encoded.</p>
     */
    @NameInMap("InputFileURL")
    public String inputFileURL;

    /**
     * <p>The maximum number of media workflow execution instances to return. Valid values: `[1,100]`. Default value: **10**.</p>
     */
    @NameInMap("MaximumPageSize")
    public Long maximumPageSize;

    /**
     * <p>The ID of the media workflow whose execution instances you want to query. To obtain the workflow ID, you can log on to the **ApsaraVideo Media Processing (MPS) console** and choose **Workflows** > **Workflow Settings**.</p>
     */
    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    /**
     * <p>The name of the media workflow. To obtain the workflow name, you can log on to the **MPS console** and choose **Workflows** > **Workflow Settings**.</p>
     */
    @NameInMap("MediaWorkflowName")
    public String mediaWorkflowName;

    /**
     * <p>The token that is used to retrieve the next page of the query results. The value is a 32-bit UUID. When you request the first page of query results, leave the NextPageToken parameter empty. When you request more query results, specify the value of the NextPageToken parameter returned in the query results on the previous page.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListMediaWorkflowExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaWorkflowExecutionsRequest self = new ListMediaWorkflowExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaWorkflowExecutionsRequest setInputFileURL(String inputFileURL) {
        this.inputFileURL = inputFileURL;
        return this;
    }
    public String getInputFileURL() {
        return this.inputFileURL;
    }

    public ListMediaWorkflowExecutionsRequest setMaximumPageSize(Long maximumPageSize) {
        this.maximumPageSize = maximumPageSize;
        return this;
    }
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
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

    public ListMediaWorkflowExecutionsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListMediaWorkflowExecutionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
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

}
