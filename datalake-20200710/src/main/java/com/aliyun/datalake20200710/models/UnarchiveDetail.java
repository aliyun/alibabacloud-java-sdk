// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UnarchiveDetail extends TeaModel {
    // api调用次数
    @NameInMap("ApiCallTimes")
    public Long apiCallTimes;

    // 成本
    @NameInMap("Cost")
    public Long cost;

    // 存储大小
    @NameInMap("StorageSize")
    public Long storageSize;

    // 存储类型
    @NameInMap("StorageType")
    public String storageType;

    // 解冻状态
    @NameInMap("UnarchiveTaskStatus")
    public String unarchiveTaskStatus;

    public static UnarchiveDetail build(java.util.Map<String, ?> map) throws Exception {
        UnarchiveDetail self = new UnarchiveDetail();
        return TeaModel.build(map, self);
    }

    public UnarchiveDetail setApiCallTimes(Long apiCallTimes) {
        this.apiCallTimes = apiCallTimes;
        return this;
    }
    public Long getApiCallTimes() {
        return this.apiCallTimes;
    }

    public UnarchiveDetail setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public UnarchiveDetail setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public UnarchiveDetail setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public UnarchiveDetail setUnarchiveTaskStatus(String unarchiveTaskStatus) {
        this.unarchiveTaskStatus = unarchiveTaskStatus;
        return this;
    }
    public String getUnarchiveTaskStatus() {
        return this.unarchiveTaskStatus;
    }

}
