// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>myDisplayName</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>145883-21513926******88039</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public java.util.List<String> roles;

    /**
     * <strong>example:</strong>
     * <p>21513926******88039</p>
     */
    @NameInMap("UserId")
    public String userId;

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

    public GetMemberResponseBody setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public GetMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
