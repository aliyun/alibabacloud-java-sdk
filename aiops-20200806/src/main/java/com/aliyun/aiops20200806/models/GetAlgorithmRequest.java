// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmRequest extends TeaModel {
    @NameInMap("ExpandInformation")
    public String expandInformation;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmRequest self = new GetAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmRequest setExpandInformation(String expandInformation) {
        this.expandInformation = expandInformation;
        return this;
    }
    public String getExpandInformation() {
        return this.expandInformation;
    }

    public GetAlgorithmRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAlgorithmRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetAlgorithmRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetAlgorithmRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetAlgorithmRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
