// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainStatusOteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;Status&quot;:&quot;renewProhibited&quot;,&quot;StatusMsg&quot;:&quot;test&quot;}]</p>
     */
    @NameInMap("AddStatusList")
    public java.util.List<UpdateRspDomainStatusOteRequestAddStatusList> addStatusList;

    /**
     * <strong>example:</strong>
     * <p>443F1A21-XXXX-55C4-93E1-FF020DF93D7B</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;Status&quot;:&quot;renewProhibited&quot;,&quot;StatusMsg&quot;:&quot;test&quot;}]</p>
     */
    @NameInMap("DeleteStatusList")
    public java.util.List<UpdateRspDomainStatusOteRequestDeleteStatusList> deleteStatusList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gatewayId001</p>
     */
    @NameInMap("OperatorId")
    public String operatorId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registryGateway</p>
     */
    @NameInMap("OperatorType")
    public String operatorType;

    public static UpdateRspDomainStatusOteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainStatusOteRequest self = new UpdateRspDomainStatusOteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainStatusOteRequest setAddStatusList(java.util.List<UpdateRspDomainStatusOteRequestAddStatusList> addStatusList) {
        this.addStatusList = addStatusList;
        return this;
    }
    public java.util.List<UpdateRspDomainStatusOteRequestAddStatusList> getAddStatusList() {
        return this.addStatusList;
    }

    public UpdateRspDomainStatusOteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRspDomainStatusOteRequest setDeleteStatusList(java.util.List<UpdateRspDomainStatusOteRequestDeleteStatusList> deleteStatusList) {
        this.deleteStatusList = deleteStatusList;
        return this;
    }
    public java.util.List<UpdateRspDomainStatusOteRequestDeleteStatusList> getDeleteStatusList() {
        return this.deleteStatusList;
    }

    public UpdateRspDomainStatusOteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateRspDomainStatusOteRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateRspDomainStatusOteRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public static class UpdateRspDomainStatusOteRequestAddStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>serverDeleteProhibited</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMsg")
        public String statusMsg;

        public static UpdateRspDomainStatusOteRequestAddStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainStatusOteRequestAddStatusList self = new UpdateRspDomainStatusOteRequestAddStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainStatusOteRequestAddStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainStatusOteRequestAddStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

    public static class UpdateRspDomainStatusOteRequestDeleteStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>serverDeleteProhibited</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMsg")
        public String statusMsg;

        public static UpdateRspDomainStatusOteRequestDeleteStatusList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRspDomainStatusOteRequestDeleteStatusList self = new UpdateRspDomainStatusOteRequestDeleteStatusList();
            return TeaModel.build(map, self);
        }

        public UpdateRspDomainStatusOteRequestDeleteStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRspDomainStatusOteRequestDeleteStatusList setStatusMsg(String statusMsg) {
            this.statusMsg = statusMsg;
            return this;
        }
        public String getStatusMsg() {
            return this.statusMsg;
        }

    }

}
