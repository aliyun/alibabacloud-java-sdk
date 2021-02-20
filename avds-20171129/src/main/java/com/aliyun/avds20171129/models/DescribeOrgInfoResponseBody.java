// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeOrgInfoResponseBody extends TeaModel {
    @NameInMap("OrgId")
    public Integer orgId;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreatedAt")
    public Long createdAt;

    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Name")
    public String name;

    public static DescribeOrgInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgInfoResponseBody self = new DescribeOrgInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrgInfoResponseBody setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public DescribeOrgInfoResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeOrgInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrgInfoResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public DescribeOrgInfoResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeOrgInfoResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
