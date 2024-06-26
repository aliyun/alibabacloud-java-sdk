// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApproveEthereumInviteeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Invitee")
    public java.util.List<ApproveEthereumInviteeRequestInvitee> invitee;

    public static ApproveEthereumInviteeRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveEthereumInviteeRequest self = new ApproveEthereumInviteeRequest();
        return TeaModel.build(map, self);
    }

    public ApproveEthereumInviteeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ApproveEthereumInviteeRequest setInvitee(java.util.List<ApproveEthereumInviteeRequestInvitee> invitee) {
        this.invitee = invitee;
        return this;
    }
    public java.util.List<ApproveEthereumInviteeRequestInvitee> getInvitee() {
        return this.invitee;
    }

    public static class ApproveEthereumInviteeRequestInvitee extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static ApproveEthereumInviteeRequestInvitee build(java.util.Map<String, ?> map) throws Exception {
            ApproveEthereumInviteeRequestInvitee self = new ApproveEthereumInviteeRequestInvitee();
            return TeaModel.build(map, self);
        }

        public ApproveEthereumInviteeRequestInvitee setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
