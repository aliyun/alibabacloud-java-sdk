// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdatePrivateRdsClassRequest extends TeaModel {
    /**
     * <p>Specifies whether to use vouchers to offset the purchase fees. Valid values: **true** and **false**. Default value: false.</p>
     * <br>
     * <p>> If you downgrade the specifications of an instance after you use the vouchers, the vouchers used for the purchase cannot be refunded.</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The ID of the custom ApsaraDB RDS instance at the storage layer.</p>
     * <br>
     * <p>> You can call the [DescribeDrdsRdsInstances](~~xxxx~~) operation to query the details of all ApsaraDB RDS instances at the storage layer of a PolarDB-X 1.0 instance, including the IDs of the ApsaraDB RDS instances.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     * <br>
     * <p>> You can call the [DescribeDrdsInstances](~~139284~~) operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of the instances.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>This parameter is discontinued.</p>
     */
    @NameInMap("PrePayDuration")
    public Integer prePayDuration;

    /**
     * <p>The new instance type of the custom ApsaraDB RDS instance at the storage layer.</p>
     * <br>
     * <p>> You can call the [DescribeAvailableClasses](~~196546~~) operation to view the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.</p>
     */
    @NameInMap("RdsClass")
    public String rdsClass;

    /**
     * <p>The new storage capacity of the custom ApsaraDB RDS instance at the storage layer.</p>
     * <br>
     * <p>> You can call the [DescribeAvailableClasses](~~196546~~) operation to view the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.</p>
     */
    @NameInMap("Storage")
    public String storage;

    public static UpdatePrivateRdsClassRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateRdsClassRequest self = new UpdatePrivateRdsClassRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateRdsClassRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public UpdatePrivateRdsClassRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpdatePrivateRdsClassRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public UpdatePrivateRdsClassRequest setPrePayDuration(Integer prePayDuration) {
        this.prePayDuration = prePayDuration;
        return this;
    }
    public Integer getPrePayDuration() {
        return this.prePayDuration;
    }

    public UpdatePrivateRdsClassRequest setRdsClass(String rdsClass) {
        this.rdsClass = rdsClass;
        return this;
    }
    public String getRdsClass() {
        return this.rdsClass;
    }

    public UpdatePrivateRdsClassRequest setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

}
