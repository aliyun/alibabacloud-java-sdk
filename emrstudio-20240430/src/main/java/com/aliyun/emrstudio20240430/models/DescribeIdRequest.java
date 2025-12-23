// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeIdRequest extends TeaModel {
    /**
     * <p>id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-123****</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111234</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DescribeIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdRequest self = new DescribeIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
