// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetMemberResponseBody extends TeaModel {
    // 成员显示名
    @NameInMap("DisplayName")
    public String displayName;

    // 创建 UTC 时间，日期格式 iso8601
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 成员 id
    @NameInMap("MemberId")
    public String memberId;

    // 角色列表
    @NameInMap("Roles")
    public java.util.List<String> roles;

    // 用户 id
    @NameInMap("UserId")
    public String userId;

    // 云账号用户名
    @NameInMap("UserName")
    public String userName;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemberResponseBody self = new GetMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemberResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetMemberResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetMemberResponseBody setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public GetMemberResponseBody setRoles(java.util.List<String> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<String> getRoles() {
        return this.roles;
    }

    public GetMemberResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetMemberResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
