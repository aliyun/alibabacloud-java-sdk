// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdatePrivateRdsClassRequest extends TeaModel {
    /**
     * <p>Specifies whether to use vouchers to offset the purchase fees. Valid values: <strong>true</strong> and <strong>false</strong>. Default value: false.</p>
     * <blockquote>
     * <p>If you downgrade the specifications of an instance after you use the vouchers, the vouchers used for the purchase cannot be refunded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The ID of the custom ApsaraDB RDS instance at the storage layer.</p>
     * <blockquote>
     * <p>You can call the <a href="~~xxxx~~">DescribeDrdsRdsInstances</a> operation to query the details of all ApsaraDB RDS instances at the storage layer of a PolarDB-X 1.0 instance, including the IDs of the ApsaraDB RDS instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of the instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds*************</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>This parameter is discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PrePayDuration")
    public Integer prePayDuration;

    /**
     * <p>The new instance type of the custom ApsaraDB RDS instance at the storage layer.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/196546.html">DescribeAvailableClasses</a> operation to view the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds.mysql.c1.xlarge</p>
     */
    @NameInMap("RdsClass")
    public String rdsClass;

    /**
     * <p>The new storage capacity of the custom ApsaraDB RDS instance at the storage layer.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/196546.html">DescribeAvailableClasses</a> operation to view the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
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
