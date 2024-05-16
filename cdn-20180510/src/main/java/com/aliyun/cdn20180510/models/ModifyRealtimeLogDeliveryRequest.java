// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The accelerated domain name for which you want to modify the configurations of real-time log delivery. Only one domain name is supported.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The name of the Logstore where log entries are stored.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Logstore")
    public String logstore;

    /**
     * <p>The name of the Log Service project that is used for real-time log delivery.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The ID of the region where the Log Service project is deployed. For more information, see [Regions that support real-time log delivery](https://help.aliyun.com/document_detail/144883.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    public static ModifyRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRealtimeLogDeliveryRequest self = new ModifyRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRealtimeLogDeliveryRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyRealtimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ModifyRealtimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ModifyRealtimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
