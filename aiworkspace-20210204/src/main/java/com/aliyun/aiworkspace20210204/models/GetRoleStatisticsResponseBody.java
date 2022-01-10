// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetRoleStatisticsResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 角色信息统计
    @NameInMap("Roles")
    public java.util.List<GetRoleStatisticsResponseBodyRoles> roles;

    // 总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetRoleStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoleStatisticsResponseBody self = new GetRoleStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoleStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoleStatisticsResponseBody setRoles(java.util.List<GetRoleStatisticsResponseBodyRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<GetRoleStatisticsResponseBodyRoles> getRoles() {
        return this.roles;
    }

    public GetRoleStatisticsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetRoleStatisticsResponseBodyRoles extends TeaModel {
        // 成员数量
        @NameInMap("MemberSize")
        public Long memberSize;

        // 角色名
        @NameInMap("RoleName")
        public String roleName;

        public static GetRoleStatisticsResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            GetRoleStatisticsResponseBodyRoles self = new GetRoleStatisticsResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public GetRoleStatisticsResponseBodyRoles setMemberSize(Long memberSize) {
            this.memberSize = memberSize;
            return this;
        }
        public Long getMemberSize() {
            return this.memberSize;
        }

        public GetRoleStatisticsResponseBodyRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
