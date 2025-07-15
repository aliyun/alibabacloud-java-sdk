// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveEdgeTransferRequest extends TeaModel {
    /**
     * <p>The ingest domain. You can set only one stream relay configuration for an ingest domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteLiveEdgeTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveEdgeTransferRequest self = new DeleteLiveEdgeTransferRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveEdgeTransferRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveEdgeTransferRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveEdgeTransferRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
