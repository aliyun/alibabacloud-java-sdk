// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDbClusterParamRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParamName")
    public String paramName;

    @NameInMap("aliUid")
    public Long aliUid;

    @NameInMap("regionId")
    public String regionId;

    public static DescribeDbClusterParamRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterParamRequest self = new DescribeDbClusterParamRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterParamRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDbClusterParamRequest setParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }
    public String getParamName() {
        return this.paramName;
    }

    public DescribeDbClusterParamRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeDbClusterParamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
