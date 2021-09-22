// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpaceResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("Name")
    public String name;

    @NameInMap("Desc")
    public String desc;

    public static DescribeSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpaceResponseBody self = new DescribeSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSpaceResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpaceResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeSpaceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSpaceResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
