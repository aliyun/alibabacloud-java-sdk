// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddAlgorithmRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("AlgorithmType")
    public Integer algorithmType;

    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ExpandInformation")
    public String expandInformation;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("StartTime")
    public Long startTime;

    public static AddAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAlgorithmRequest self = new AddAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public AddAlgorithmRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public AddAlgorithmRequest setAlgorithmType(Integer algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public Integer getAlgorithmType() {
        return this.algorithmType;
    }

    public AddAlgorithmRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public AddAlgorithmRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public AddAlgorithmRequest setExpandInformation(String expandInformation) {
        this.expandInformation = expandInformation;
        return this;
    }
    public String getExpandInformation() {
        return this.expandInformation;
    }

    public AddAlgorithmRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public AddAlgorithmRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddAlgorithmRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public AddAlgorithmRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public AddAlgorithmRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
