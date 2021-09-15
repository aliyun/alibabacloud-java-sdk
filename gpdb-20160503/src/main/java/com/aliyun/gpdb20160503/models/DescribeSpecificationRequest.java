// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSpecificationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("CpuCores")
    public Integer cpuCores;

    @NameInMap("TotalNodeNum")
    public Integer totalNodeNum;

    public static DescribeSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpecificationRequest self = new DescribeSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpecificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSpecificationRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSpecificationRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeSpecificationRequest setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }
    public Integer getCpuCores() {
        return this.cpuCores;
    }

    public DescribeSpecificationRequest setTotalNodeNum(Integer totalNodeNum) {
        this.totalNodeNum = totalNodeNum;
        return this;
    }
    public Integer getTotalNodeNum() {
        return this.totalNodeNum;
    }

}
