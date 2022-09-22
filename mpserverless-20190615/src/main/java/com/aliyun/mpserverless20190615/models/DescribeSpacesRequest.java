// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpacesRequest extends TeaModel {
    @NameInMap("EmasWorkspaceId")
    public Long emasWorkspaceId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SpaceIds")
    public java.util.List<String> spaceIds;

    @NameInMap("SpecCode")
    public String specCode;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpacesRequest self = new DescribeSpacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpacesRequest setEmasWorkspaceId(Long emasWorkspaceId) {
        this.emasWorkspaceId = emasWorkspaceId;
        return this;
    }
    public Long getEmasWorkspaceId() {
        return this.emasWorkspaceId;
    }

    public DescribeSpacesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeSpacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSpacesRequest setSpaceIds(java.util.List<String> spaceIds) {
        this.spaceIds = spaceIds;
        return this;
    }
    public java.util.List<String> getSpaceIds() {
        return this.spaceIds;
    }

    public DescribeSpacesRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public DescribeSpacesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
