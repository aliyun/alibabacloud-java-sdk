// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCtrlInstanceMemberAccountsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InstanceMemberCount")
    public Long instanceMemberCount;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxInstanceMemberNum")
    public Long maxInstanceMemberNum;

    /**
     * <strong>example:</strong>
     * <p>9CC69FDA-69F6-585B-9262-A306F425****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCtrlInstanceMemberAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCtrlInstanceMemberAccountsResponseBody self = new DescribeCtrlInstanceMemberAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCtrlInstanceMemberAccountsResponseBody setInstanceMemberCount(Long instanceMemberCount) {
        this.instanceMemberCount = instanceMemberCount;
        return this;
    }
    public Long getInstanceMemberCount() {
        return this.instanceMemberCount;
    }

    public DescribeCtrlInstanceMemberAccountsResponseBody setMaxInstanceMemberNum(Long maxInstanceMemberNum) {
        this.maxInstanceMemberNum = maxInstanceMemberNum;
        return this;
    }
    public Long getMaxInstanceMemberNum() {
        return this.maxInstanceMemberNum;
    }

    public DescribeCtrlInstanceMemberAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
