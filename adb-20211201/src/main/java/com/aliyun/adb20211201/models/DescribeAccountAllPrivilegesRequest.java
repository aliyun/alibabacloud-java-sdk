// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountAllPrivilegesRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Marker")
    public String marker;

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
