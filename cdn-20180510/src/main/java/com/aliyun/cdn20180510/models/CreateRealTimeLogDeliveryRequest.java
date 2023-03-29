// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateRealTimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which you want to configure real-time log delivery. You can specify multiple domain names and separate them with commas (,).</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.</p>
     */
    @NameInMap("Logstore")
    public String logstore;

    /**
     * <p>The name of the Log Service project that is used for real-time log delivery.</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The ID of the region where the Log Service project is deployed. For more information, see [Regions that support real-time log delivery](~~144883~~).</p>
     */
    @NameInMap("Region")
    public String region;

    public static CreateRealTimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealTimeLogDeliveryRequest self = new CreateRealTimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealTimeLogDeliveryRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateRealTimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public CreateRealTimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateRealTimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
