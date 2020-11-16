// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Project")
    @Validation(required = true)
    public String project;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("Logstore")
    @Validation(required = true)
    public String logstore;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static DescribeLiveDomainRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealtimeLogDeliveryResponse self = new DescribeLiveDomainRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
