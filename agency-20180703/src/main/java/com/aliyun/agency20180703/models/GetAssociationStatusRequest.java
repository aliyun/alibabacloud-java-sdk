// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetAssociationStatusRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("GetAssociationStatusList")
    public java.util.List<GetAssociationStatusRequestGetAssociationStatusList> getAssociationStatusList;

    public static GetAssociationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssociationStatusRequest self = new GetAssociationStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAssociationStatusRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetAssociationStatusRequest setGetAssociationStatusList(java.util.List<GetAssociationStatusRequestGetAssociationStatusList> getAssociationStatusList) {
        this.getAssociationStatusList = getAssociationStatusList;
        return this;
    }
    public java.util.List<GetAssociationStatusRequestGetAssociationStatusList> getGetAssociationStatusList() {
        return this.getAssociationStatusList;
    }

    public static class GetAssociationStatusRequestGetAssociationStatusList extends TeaModel {
        @NameInMap("InviteId")
        public Long inviteId;

        public static GetAssociationStatusRequestGetAssociationStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetAssociationStatusRequestGetAssociationStatusList self = new GetAssociationStatusRequestGetAssociationStatusList();
            return TeaModel.build(map, self);
        }

        public GetAssociationStatusRequestGetAssociationStatusList setInviteId(Long inviteId) {
            this.inviteId = inviteId;
            return this;
        }
        public Long getInviteId() {
            return this.inviteId;
        }

    }

}
