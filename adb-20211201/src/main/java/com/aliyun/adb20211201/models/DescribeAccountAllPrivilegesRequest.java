// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountAllPrivilegesRequest extends TeaModel {
    /**
     * <p>The database account name for the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The cluster ID for the Enterprise Edition, Basic Edition, or Data Lakehouse Edition.
     * &lt;props=&quot;intl&quot;&gt;The cluster ID for the Data Lakehouse Edition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp14t95lun0w****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>If the response is truncated, use the <code>Marker</code> value from the response in this field to retrieve the next set of results.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAccountAllPrivilegesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAllPrivilegesRequest self = new DescribeAccountAllPrivilegesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAllPrivilegesRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAccountAllPrivilegesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAccountAllPrivilegesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public DescribeAccountAllPrivilegesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
