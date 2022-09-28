// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetInviteStatusRequest extends TeaModel {
    @NameInMap("InviteStatusList")
    public java.util.List<GetInviteStatusRequestInviteStatusList> inviteStatusList;

    public static GetInviteStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInviteStatusRequest self = new GetInviteStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetInviteStatusRequest setInviteStatusList(java.util.List<GetInviteStatusRequestInviteStatusList> inviteStatusList) {
        this.inviteStatusList = inviteStatusList;
        return this;
    }
    public java.util.List<GetInviteStatusRequestInviteStatusList> getInviteStatusList() {
        return this.inviteStatusList;
    }

    public static class GetInviteStatusRequestInviteStatusList extends TeaModel {
        @NameInMap("InviteId")
        public Long inviteId;

        public static GetInviteStatusRequestInviteStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetInviteStatusRequestInviteStatusList self = new GetInviteStatusRequestInviteStatusList();
            return TeaModel.build(map, self);
        }

        public GetInviteStatusRequestInviteStatusList setInviteId(Long inviteId) {
            this.inviteId = inviteId;
            return this;
        }
        public Long getInviteId() {
            return this.inviteId;
        }

    }

}
