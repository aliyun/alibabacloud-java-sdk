// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryDomainsRequest extends TeaModel {
    /**
     * <p>The name of the Logstore to which log entries are delivered.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logstore_example</p>
     */
    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the Log Service project that is used for real-time log delivery.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project_example</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The ID of the region where the Log Service project is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    public static ListLiveRealtimeLogDeliveryDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryDomainsRequest self = new ListLiveRealtimeLogDeliveryDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryDomainsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListLiveRealtimeLogDeliveryDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListLiveRealtimeLogDeliveryDomainsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListLiveRealtimeLogDeliveryDomainsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListLiveRealtimeLogDeliveryDomainsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
