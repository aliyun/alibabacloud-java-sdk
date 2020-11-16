// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Project")
    @Validation(required = true)
    public String project;

    @NameInMap("Logstore")
    @Validation(required = true)
    public String logstore;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

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

    public DeleteLiveRealtimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteLiveRealtimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DeleteLiveRealtimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
