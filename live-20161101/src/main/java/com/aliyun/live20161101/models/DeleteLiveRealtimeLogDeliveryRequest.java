// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The streaming domain name.</p>
     * <p>To specify multiple domain names, separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the SLS Logstore to which logs are delivered in real time.</p>
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
     * <p>The name of the Simple Log Service (SLS) project to which logs are delivered in real time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project_example</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The region where the SLS project is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteLiveRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRealtimeLogDeliveryRequest self = new DeleteLiveRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveRealtimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DeleteLiveRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveRealtimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteLiveRealtimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteLiveRealtimeLogDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
