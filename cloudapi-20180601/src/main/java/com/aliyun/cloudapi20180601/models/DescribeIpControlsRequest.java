// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeIpControlsRequest extends TeaModel {
    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("IpControlName")
    public String ipControlName;

    @NameInMap("IpControlType")
    public String ipControlType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeIpControlsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpControlsRequest self = new DescribeIpControlsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpControlsRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public DescribeIpControlsRequest setIpControlName(String ipControlName) {
        this.ipControlName = ipControlName;
        return this;
    }
    public String getIpControlName() {
        return this.ipControlName;
    }

    public DescribeIpControlsRequest setIpControlType(String ipControlType) {
        this.ipControlType = ipControlType;
        return this;
    }
    public String getIpControlType() {
        return this.ipControlType;
    }

    public DescribeIpControlsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpControlsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpControlsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
