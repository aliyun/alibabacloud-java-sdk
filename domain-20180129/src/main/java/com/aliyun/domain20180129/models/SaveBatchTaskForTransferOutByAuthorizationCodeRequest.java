// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForTransferOutByAuthorizationCodeRequest extends TeaModel {
    /**
     * <p>A list of domain names to transfer out, each with its authorization code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SaveBatchTaskForTransferOutByAuthorizationCode</p>
     */
    @NameInMap("TransferOutParamList")
    public java.util.List<SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList> transferOutParamList;

    public static SaveBatchTaskForTransferOutByAuthorizationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForTransferOutByAuthorizationCodeRequest self = new SaveBatchTaskForTransferOutByAuthorizationCodeRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForTransferOutByAuthorizationCodeRequest setTransferOutParamList(java.util.List<SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList> transferOutParamList) {
        this.transferOutParamList = transferOutParamList;
        return this;
    }
    public java.util.List<SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList> getTransferOutParamList() {
        return this.transferOutParamList;
    }

    public static class SaveBatchTaskForTransferOutByAuthorizationCodeRequestTransferOutParamList extends TeaModel {
        /**
         * <p>The authorization code for the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test2o#Lck</p>
         */
        @NameInMap("AuthorizationCode")
        public String authorizationCode;

        /**
         * <p>The domain name to transfer out.</p>
         * 
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
