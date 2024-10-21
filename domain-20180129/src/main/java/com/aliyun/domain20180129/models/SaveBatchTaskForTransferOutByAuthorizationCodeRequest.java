// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForTransferOutByAuthorizationCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Long")
    public String _long;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransferOutParamList")
    public java.util.List<SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList> transferOutParamList;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForTransferOutByAuthorizationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForTransferOutByAuthorizationCodeRequest self = new SaveBatchTaskForTransferOutByAuthorizationCodeRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForTransferOutByAuthorizationCodeRequest set_long(String _long) {
        this._long = _long;
        return this;
    }
    public String get_long() {
        return this._long;
    }

    public SaveBatchTaskForTransferOutByAuthorizationCodeRequest setTransferOutParamList(java.util.List<SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList> transferOutParamList) {
        this.transferOutParamList = transferOutParamList;
        return this;
    }
    public java.util.List<SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList> getTransferOutParamList() {
        return this.transferOutParamList;
    }

    public SaveBatchTaskForTransferOutByAuthorizationCodeRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static class SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Test2o#Lck</p>
         */
        @NameInMap("AuthorizationCode")
        public String authorizationCode;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList self = new SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList setAuthorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        public SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
