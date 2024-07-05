// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaInfoJobListRequest extends TeaModel {
    /**
     * <p>The IDs of the media information analysis jobs.</p>
     * <ul>
     * <li>You can query up to 10 jobs at a time. Separate multiple IDs with commas (,).</li>
     * <li>You can obtain the details from the response parameters of the <a href="https://help.aliyun.com/document_detail/602827.html">SubmitMediaInfoJob</a> operation.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify the JobIds parameter, the <strong>InvalidParameter</strong> error code is returned.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23ca1d184c0e4341e5b665e2a12****</p>
     */
    @NameInMap("MediaInfoJobIds")
    public String mediaInfoJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryMediaInfoJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaInfoJobListRequest self = new QueryMediaInfoJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaInfoJobListRequest setMediaInfoJobIds(String mediaInfoJobIds) {
        this.mediaInfoJobIds = mediaInfoJobIds;
        return this;
    }
    public String getMediaInfoJobIds() {
        return this.mediaInfoJobIds;
    }

    public QueryMediaInfoJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaInfoJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaInfoJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaInfoJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
