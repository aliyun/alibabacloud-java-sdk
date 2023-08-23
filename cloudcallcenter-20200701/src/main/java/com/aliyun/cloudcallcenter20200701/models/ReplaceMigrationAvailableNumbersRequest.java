// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ReplaceMigrationAvailableNumbersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("OperatorUid")
    public Long operatorUid;

    @NameInMap("V1Numbers")
    public String v1Numbers;

    @NameInMap("V2Numbers")
    public String v2Numbers;

    public static ReplaceMigrationAvailableNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceMigrationAvailableNumbersRequest self = new ReplaceMigrationAvailableNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceMigrationAvailableNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReplaceMigrationAvailableNumbersRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ReplaceMigrationAvailableNumbersRequest setOperatorUid(Long operatorUid) {
        this.operatorUid = operatorUid;
        return this;
    }
    public Long getOperatorUid() {
        return this.operatorUid;
    }

    public ReplaceMigrationAvailableNumbersRequest setV1Numbers(String v1Numbers) {
        this.v1Numbers = v1Numbers;
        return this;
    }
    public String getV1Numbers() {
        return this.v1Numbers;
    }

    public ReplaceMigrationAvailableNumbersRequest setV2Numbers(String v2Numbers) {
        this.v2Numbers = v2Numbers;
        return this;
    }
    public String getV2Numbers() {
        return this.v2Numbers;
    }

}
