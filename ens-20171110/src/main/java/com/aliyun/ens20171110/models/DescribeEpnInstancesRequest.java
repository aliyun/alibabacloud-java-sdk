// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstancesRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeEpnInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstancesRequest self = new DescribeEpnInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstancesRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public DescribeEpnInstancesRequest setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public DescribeEpnInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEpnInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
