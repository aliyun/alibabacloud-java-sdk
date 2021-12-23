// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpaceClientConfigRequest extends TeaModel {
    @NameInMap("Detail")
    public String detail;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static DescribeSpaceClientConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpaceClientConfigRequest self = new DescribeSpaceClientConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpaceClientConfigRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public DescribeSpaceClientConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeSpaceClientConfigRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
