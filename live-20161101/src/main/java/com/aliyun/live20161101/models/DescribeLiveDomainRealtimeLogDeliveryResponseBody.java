// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Project")
    public String project;

    @NameInMap("Region")
    public String region;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("Status")
    public String status;

    public static DescribeLiveDomainRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealtimeLogDeliveryResponseBody self = new DescribeLiveDomainRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponseBody setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponseBody setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
