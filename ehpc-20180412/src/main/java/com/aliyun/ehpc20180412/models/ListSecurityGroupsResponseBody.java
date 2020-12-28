// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("SecurityGroups")
    public java.util.List<String> securityGroups;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsResponseBody self = new ListSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsResponseBody setSecurityGroups(java.util.List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public ListSecurityGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
