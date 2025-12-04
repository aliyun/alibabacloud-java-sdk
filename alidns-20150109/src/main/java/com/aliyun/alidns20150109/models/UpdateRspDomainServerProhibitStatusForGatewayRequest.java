// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainServerProhibitStatusForGatewayRequest extends TeaModel {
    @NameInMap("AddStatusList")
    public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList> addStatusList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdf</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeleteStatusList")
    public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList> deleteStatusList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static UpdateRspDomainServerProhibitStatusForGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainServerProhibitStatusForGatewayRequest self = new UpdateRspDomainServerProhibitStatusForGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainServerProhibitStatusForGatewayRequest setAddStatusList(java.util.List<UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList> addStatusList) {
        this.addStatusList = addStatusList;
        return this;
    }
    public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList> getAddStatusList() {
        return this.addStatusList;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayRequest setDeleteStatusList(java.util.List<UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList> deleteStatusList) {
        this.deleteStatusList = deleteStatusList;
        return this;
    }
    public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList> getDeleteStatusList() {
        return this.deleteStatusList;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>serverDeleteProhibited</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMsg")
        public String statusMsg;

        public static UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList self = new UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayRequestAddStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>serverDeleteProhibited</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMsg")
        public String statusMsg;

        public static UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList self = new UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayRequestDeleteStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

}
