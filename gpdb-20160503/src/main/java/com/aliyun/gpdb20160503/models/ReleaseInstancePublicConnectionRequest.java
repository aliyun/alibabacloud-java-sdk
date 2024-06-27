// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ReleaseInstancePublicConnectionRequest extends TeaModel {
    /**
     * <p>The type of the endpoint. Default value: primary. Valid values:</p>
     * <ul>
     * <li><strong>primary</strong>: primary endpoint.</li>
     * <li><strong>cluster</strong>: cluster endpoint. This type of endpoints can be created only for instances that have multiple coordinator nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The public endpoint of the instance.</p>
     * <p>You can log on to the AnalyticDB for PostgreSQL console and go to the <strong>Basic Information</strong> page of the instance to view the <strong>public endpoint</strong> in the <strong>Database Connection</strong> section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****.gpdb.rds.aliyuncs.com</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static ReleaseInstancePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancePublicConnectionRequest self = new ReleaseInstancePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancePublicConnectionRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public ReleaseInstancePublicConnectionRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ReleaseInstancePublicConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
