// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpacesShrinkRequest extends TeaModel {
    @NameInMap("EmasWorkspaceId")
    public Long emasWorkspaceId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SpaceIds")
    public String spaceIdsShrink;

    @NameInMap("SpecCode")
    public String specCode;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSpacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpacesShrinkRequest self = new DescribeSpacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpacesShrinkRequest setEmasWorkspaceId(Long emasWorkspaceId) {
        this.emasWorkspaceId = emasWorkspaceId;
        return this;
    }
    public Long getEmasWorkspaceId() {
        return this.emasWorkspaceId;
    }

    public DescribeSpacesShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeSpacesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSpacesShrinkRequest setSpaceIdsShrink(String spaceIdsShrink) {
        this.spaceIdsShrink = spaceIdsShrink;
        return this;
    }
    public String getSpaceIdsShrink() {
        return this.spaceIdsShrink;
    }

    public DescribeSpacesShrinkRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public DescribeSpacesShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
