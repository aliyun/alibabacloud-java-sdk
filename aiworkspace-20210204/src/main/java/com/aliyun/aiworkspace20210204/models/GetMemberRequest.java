// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetMemberRequest extends TeaModel {
    /**
     * <p>The member ID. You must specify only one of the following parameters: UserId and MemberId.</p>
     * 
     * <strong>example:</strong>
     * <p>145883-21513926******88039</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The ID of the Alibaba Cloud account. You can call <a href="https://help.aliyun.com/document_detail/449133.html">ListWorkspaceUsers</a> to obtain the ID of the Alibaba Cloud account. You must specify only one of the following parameters: UserId and MemberId.</p>
     * 
     * <strong>example:</strong>
     * <p>21513926******88039</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMemberRequest self = new GetMemberRequest();
        return TeaModel.build(map, self);
    }

    public GetMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public GetMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
