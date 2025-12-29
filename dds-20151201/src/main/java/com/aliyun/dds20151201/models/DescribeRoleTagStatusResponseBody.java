// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRoleTagStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>69D55DEC-B219-569F-A686-AC2F67A1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RoleTagStatus")
    public String roleTagStatus;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;d-2ze204b4db58****&quot;: &quot;false&quot;,
     *     &quot;d-2zeb9716646e***&quot;: &quot;false&quot;
     * }</p>
     */
    @NameInMap("ShardRoleTagStatus")
    public java.util.Map<String, ?> shardRoleTagStatus;

    public static DescribeRoleTagStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleTagStatusResponseBody self = new DescribeRoleTagStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoleTagStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoleTagStatusResponseBody setRoleTagStatus(String roleTagStatus) {
        this.roleTagStatus = roleTagStatus;
        return this;
    }
    public String getRoleTagStatus() {
        return this.roleTagStatus;
    }

    public DescribeRoleTagStatusResponseBody setShardRoleTagStatus(java.util.Map<String, ?> shardRoleTagStatus) {
        this.shardRoleTagStatus = shardRoleTagStatus;
        return this;
    }
    public java.util.Map<String, ?> getShardRoleTagStatus() {
        return this.shardRoleTagStatus;
    }

}
