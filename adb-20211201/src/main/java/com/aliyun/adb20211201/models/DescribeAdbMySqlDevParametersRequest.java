// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlDevParametersRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DevParamName")
    public String devParamName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAdbMySqlDevParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlDevParametersRequest self = new DescribeAdbMySqlDevParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlDevParametersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAdbMySqlDevParametersRequest setDevParamName(String devParamName) {
        this.devParamName = devParamName;
        return this;
    }
    public String getDevParamName() {
        return this.devParamName;
    }

    public DescribeAdbMySqlDevParametersRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAdbMySqlDevParametersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAdbMySqlDevParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
