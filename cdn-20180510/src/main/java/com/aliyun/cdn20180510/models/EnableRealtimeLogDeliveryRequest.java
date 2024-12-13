// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class EnableRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which you want to enable real-time log delivery. You can specify multiple domain names and separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("Project")
    public String project;

    @NameInMap("Region")
    public String region;

    public static EnableRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRealtimeLogDeliveryRequest self = new EnableRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public EnableRealtimeLogDeliveryRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public EnableRealtimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public EnableRealtimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public EnableRealtimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
