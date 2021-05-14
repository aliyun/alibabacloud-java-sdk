// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdatePrivateRdsClassRequest extends TeaModel {
    @NameInMap("RdsClass")
    public String rdsClass;

    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Storage")
    public String storage;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("PrePayDuration")
    public Integer prePayDuration;

    public static UpdatePrivateRdsClassRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateRdsClassRequest self = new UpdatePrivateRdsClassRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateRdsClassRequest setRdsClass(String rdsClass) {
        this.rdsClass = rdsClass;
        return this;
    }
    public String getRdsClass() {
        return this.rdsClass;
    }

    public UpdatePrivateRdsClassRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public UpdatePrivateRdsClassRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpdatePrivateRdsClassRequest setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

    public UpdatePrivateRdsClassRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public UpdatePrivateRdsClassRequest setPrePayDuration(Integer prePayDuration) {
        this.prePayDuration = prePayDuration;
        return this;
    }
    public Integer getPrePayDuration() {
        return this.prePayDuration;
    }

}
