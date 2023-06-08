// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealtimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The name of the Logstore where log entries are stored.</p>
     */
    @NameInMap("Logstore")
    public String logstore;

    /**
     * <p>The name of the Log Service project that is used for real-time log delivery.</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The ID of the region where the Log Service project is deployed.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of real-time log delivery. Valid values:</p>
     * <br>
     * <p>*   **online**</p>
     * <p>*   **offline**</p>
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
