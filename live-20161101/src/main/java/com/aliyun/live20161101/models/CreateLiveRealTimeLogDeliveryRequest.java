// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveRealTimeLogDeliveryRequest extends TeaModel {
    @NameInMap("Project")
    @Validation(required = true)
    public String project;

    @NameInMap("Logstore")
    @Validation(required = true)
    public String logstore;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static CreateLiveRealTimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRealTimeLogDeliveryRequest self = new CreateLiveRealTimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRealTimeLogDeliveryRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateLiveRealTimeLogDeliveryRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public CreateLiveRealTimeLogDeliveryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateLiveRealTimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
