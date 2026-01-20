// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainServerProhibitStatusForGatewayOteRequest extends TeaModel {
    @NameInMap("AddStatusList")
    public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList> addStatusList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwoefasdf</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeleteStatusList")
    public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList> deleteStatusList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static UpdateRspDomainServerProhibitStatusForGatewayOteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainServerProhibitStatusForGatewayOteRequest self = new UpdateRspDomainServerProhibitStatusForGatewayOteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteRequest setAddStatusList(java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList> addStatusList) {
        this.addStatusList = addStatusList;
        return this;
    }
    public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList> getAddStatusList() {
        return this.addStatusList;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteRequest setDeleteStatusList(java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList> deleteStatusList) {
        this.deleteStatusList = deleteStatusList;
        return this;
    }
    public java.util.List<UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList> getDeleteStatusList() {
        return this.deleteStatusList;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>serverDeleteProhibited</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMsg")
        public String statusMsg;

        public static UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList self = new UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteRequestAddStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

    public static class UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>serverDeleteProhibited</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMsg")
        public String statusMsg;

        public static UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList self = new UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainServerProhibitStatusForGatewayOteRequestDeleteStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

}
