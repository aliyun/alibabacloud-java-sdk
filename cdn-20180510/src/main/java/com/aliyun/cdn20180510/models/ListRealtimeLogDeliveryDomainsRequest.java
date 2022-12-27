// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryDomainsRequest extends TeaModel {
    // The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time. You can specify multiple Logstore names and separate them with commas (,).
    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The name of the Log Service project that is used for real-time log delivery. You can specify multiple project names and separate them with commas (,).
    @NameInMap("Project")
    public String project;

    // The ID of the region where the Log Service project is deployed. You can specify multiple region IDs and separate them with commas (,).
    // 
    // For more information about regions, see [Regions that support real-time log delivery](~~144883~~).
    @NameInMap("Region")
    public String region;

    public static ListRealtimeLogDeliveryDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeLogDeliveryDomainsRequest self = new ListRealtimeLogDeliveryDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListRealtimeLogDeliveryDomainsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListRealtimeLogDeliveryDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListRealtimeLogDeliveryDomainsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListRealtimeLogDeliveryDomainsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
