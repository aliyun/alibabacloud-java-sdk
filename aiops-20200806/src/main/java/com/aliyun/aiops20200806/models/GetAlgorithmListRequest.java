// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmListRequest extends TeaModel {
    @NameInMap("AlgorithmType")
    public Integer algorithmType;

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

    public static GetAlgorithmListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmListRequest self = new GetAlgorithmListRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmListRequest setAlgorithmType(Integer algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public Integer getAlgorithmType() {
        return this.algorithmType;
    }

    public GetAlgorithmListRequest setExpandInformation(String expandInformation) {
        this.expandInformation = expandInformation;
        return this;
    }
    public String getExpandInformation() {
        return this.expandInformation;
    }

    public GetAlgorithmListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAlgorithmListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetAlgorithmListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetAlgorithmListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetAlgorithmListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
