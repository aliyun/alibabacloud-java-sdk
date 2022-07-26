// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UnarchiveDetail extends TeaModel {
    @NameInMap("ApiCallTimes")
    public Long apiCallTimes;

    @NameInMap("Cost")
    public Long cost;

    @NameInMap("StorageSize")
    public Long storageSize;

    @NameInMap("StorageType")
    public String storageType;

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
