// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("Project")
    public String project;

    @NameInMap("Region")
    public String region;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the region where the Log Service project is deployed.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDomainRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealtimeLogDeliveryResponseBody self = new DescribeDomainRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealtimeLogDeliveryResponseBody setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DescribeDomainRealtimeLogDeliveryResponseBody setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeDomainRealtimeLogDeliveryResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDomainRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRealtimeLogDeliveryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
