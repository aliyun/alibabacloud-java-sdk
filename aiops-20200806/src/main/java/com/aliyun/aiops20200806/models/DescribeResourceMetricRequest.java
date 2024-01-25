// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeResourceMetricRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("FirstLoad")
    public Integer firstLoad;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeResourceMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceMetricRequest self = new DescribeResourceMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceMetricRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeResourceMetricRequest setFirstLoad(Integer firstLoad) {
        this.firstLoad = firstLoad;
        return this;
    }
    public Integer getFirstLoad() {
        return this.firstLoad;
    }

    public DescribeResourceMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeResourceMetricRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeResourceMetricRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
