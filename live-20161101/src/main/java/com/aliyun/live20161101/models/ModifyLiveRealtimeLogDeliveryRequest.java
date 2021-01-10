// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Project")
    public String project;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("Region")
    public String region;

    @NameInMap("DomainName")
    public String domainName;

    public static ModifyLiveRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveRealtimeLogDeliveryRequest self = new ModifyLiveRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLiveRealtimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ModifyLiveRealtimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ModifyLiveRealtimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyLiveRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
