// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ManagePrivateRdsRequest extends TeaModel {
    /**
     * <p>The ID of the custom ApsaraDB RDS instance at the storage layer.</p>
     * <br>
     * <p>> You can call the [DescribeDrdsRdsInstances](~~215526~~) operation to query the details of all ApsaraDB RDS instances, including the ID of the instance.</p>
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
     * <p>The JSON string that consists of request parameters and the values of the request parameters of an operation that you need to call for the custom ApsaraDB RDS instance. The value of a request parameter is of the STRING type. Example: `{NodeId:"1797****"}`.</p>
     * <br>
     * <p>For more information about the request parameters and valid values of the request parameters of each operation, see the request parameter sections in the following topics:</p>
     * <br>
     * <p>*   [DescribeDBInstanceAttribute](~~26231~~)</p>
     * <p>*   [DescribeAvailableClasses](~~196546~~)</p>
     * <p>*   [DescribeSQLCollectorPolicy](~~26292~~)</p>
     * <p>*   [ModifySQLCollectorPolicy](~~26293~~)</p>
     * <p>*   [DescribeParameters](~~26285~~)</p>
     * <p>*   [ModifyParameter](~~26286~~)</p>
     * <p>*   [DescribeDBInstanceHAConfig](~~26244~~)</p>
     * <p>*   [SwitchDBInstanceHA](~~26251~~)</p>
     * <br>
     * <p>> Among the required request parameters of the preceding operations, you do not need to specify the `Action` and `DBInstanceId` parameters. You must specify all the other required request parameters.</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The operation that you want to perform on the custom ApsaraDB RDS instance. Valid values:</p>
     * <br>
     * <p>*   **DescribeDBInstanceAttribute**: queries the details of the custom ApsaraDB RDS instance.</p>
     * <p>*   **DescribeAvailableClasses**: queries the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.</p>
     * <p>*   **DescribeSQLCollectorPolicy**: queries whether the SQL Explorer (SQL Audit) feature is enabled for custom ApsaraDB RDS instance.</p>
     * <p>*   **ModifySQLCollectorPolicy**: enables or disables the SQL Explorer (SQL Audit) feature for the custom ApsaraDB RDS instance.</p>
     * <p>*   **DescribeParameters**: queries the parameter settings of the custom ApsaraDB RDS instance.</p>
     * <p>*   **ModifyParameter**: modifies the parameters of the custom ApsaraDB RDS instance.</p>
     * <p>*   **DescribeDBInstanceHAConfig**: queries the high availability mode and data replication mode of the custom ApsaraDB RDS instance.</p>
     * <p>*   **SwitchDBInstanceHA**: switches workloads between the primary and secondary custom ApsaraDB RDS instances.</p>
     */
    @NameInMap("RdsAction")
    public String rdsAction;

    /**
     * <p>The ID of the region in which the PolarDB-X 1.0 instance resides.</p>
     * <br>
     * <p>> You can call the [DescribeDrdsInstances](~~139284~~) operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of regions in which the instances reside.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ManagePrivateRdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ManagePrivateRdsRequest self = new ManagePrivateRdsRequest();
        return TeaModel.build(map, self);
    }

    public ManagePrivateRdsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ManagePrivateRdsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ManagePrivateRdsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ManagePrivateRdsRequest setRdsAction(String rdsAction) {
        this.rdsAction = rdsAction;
        return this;
    }
    public String getRdsAction() {
        return this.rdsAction;
    }

    public ManagePrivateRdsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
