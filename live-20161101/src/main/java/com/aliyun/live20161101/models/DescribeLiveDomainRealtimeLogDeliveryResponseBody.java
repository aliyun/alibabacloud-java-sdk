// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealtimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The name of the Logstore in Simple Log Service (SLS) for real-time log delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>logstore_example</p>
     */
    @NameInMap("Logstore")
    public String logstore;

    /**
     * <p>The name of the SLS project for real-time log delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>project_example</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The region where the SLS project is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F8F3852-912F-42AC-80EB-F1CF4284DE93</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of real-time log delivery. Valid values:</p>
     * <ul>
     * <li><p>online: Real-time log delivery is enabled.</p>
     * </li>
     * <li><p>offline: Real-time log delivery is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeLiveDomainRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealtimeLogDeliveryResponseBody self = new DescribeLiveDomainRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponseBody setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
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

    public DescribeLiveDomainRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
