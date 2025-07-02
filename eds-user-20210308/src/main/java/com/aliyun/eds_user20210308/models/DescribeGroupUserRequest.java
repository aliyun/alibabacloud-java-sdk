// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeGroupUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>ug-12341234****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>co-0esnf80jab***</p>
     */
    @NameInMap("SolutionId")
    public String solutionId;

    public static DescribeGroupUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupUserRequest self = new DescribeGroupUserRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupUserRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeGroupUserRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeGroupUserRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
