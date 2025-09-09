// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CheckAccountExistRequest extends TeaModel {
    @NameInMap("EcIdAccountIds")
    public java.util.List<CheckAccountExistRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ToUserType")
    public Integer toUserType;

    /**
     * <strong>example:</strong>
     * <p>12323</p>
     */
    @NameInMap("TransferAccount")
    public String transferAccount;

    public static CheckAccountExistRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountExistRequest self = new CheckAccountExistRequest();
        return TeaModel.build(map, self);
    }

    public CheckAccountExistRequest setEcIdAccountIds(java.util.List<CheckAccountExistRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<CheckAccountExistRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public CheckAccountExistRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public CheckAccountExistRequest setToUserType(Integer toUserType) {
        this.toUserType = toUserType;
        return this;
    }
    public Integer getToUserType() {
        return this.toUserType;
    }

    public CheckAccountExistRequest setTransferAccount(String transferAccount) {
        this.transferAccount = transferAccount;
        return this;
    }
    public String getTransferAccount() {
        return this.transferAccount;
    }

    public static class CheckAccountExistRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1004064243473974</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static CheckAccountExistRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            CheckAccountExistRequestEcIdAccountIds self = new CheckAccountExistRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public CheckAccountExistRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public CheckAccountExistRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
