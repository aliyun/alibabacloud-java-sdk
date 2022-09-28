// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class CreateNormalAccountRequest extends TeaModel {
    @NameInMap("CreateNormalAccountInfoList")
    public java.util.List<CreateNormalAccountRequestCreateNormalAccountInfoList> createNormalAccountInfoList;

    public static CreateNormalAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNormalAccountRequest self = new CreateNormalAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateNormalAccountRequest setCreateNormalAccountInfoList(java.util.List<CreateNormalAccountRequestCreateNormalAccountInfoList> createNormalAccountInfoList) {
        this.createNormalAccountInfoList = createNormalAccountInfoList;
        return this;
    }
    public java.util.List<CreateNormalAccountRequestCreateNormalAccountInfoList> getCreateNormalAccountInfoList() {
        return this.createNormalAccountInfoList;
    }

    public static class CreateNormalAccountRequestCreateNormalAccountInfoList extends TeaModel {
        @NameInMap("AliyunPk")
        public Long aliyunPk;

        @NameInMap("Cid")
        public Long cid;

        @NameInMap("CustomCredit")
        public String customCredit;

        @NameInMap("CustomNick")
        public String customNick;

        @NameInMap("CustomerAccount")
        public String customerAccount;

        @NameInMap("CustomerRebateType")
        public String customerRebateType;

        @NameInMap("FxDescription")
        public String fxDescription;

        @NameInMap("FxShutdownstatus")
        public String fxShutdownstatus;

        @NameInMap("isEnterprise")
        public Integer isEnterprise;

        public static CreateNormalAccountRequestCreateNormalAccountInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateNormalAccountRequestCreateNormalAccountInfoList self = new CreateNormalAccountRequestCreateNormalAccountInfoList();
            return TeaModel.build(map, self);
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setAliyunPk(Long aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public Long getAliyunPk() {
            return this.aliyunPk;
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setCustomCredit(String customCredit) {
            this.customCredit = customCredit;
            return this;
        }
        public String getCustomCredit() {
            return this.customCredit;
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setCustomNick(String customNick) {
            this.customNick = customNick;
            return this;
        }
        public String getCustomNick() {
            return this.customNick;
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setCustomerAccount(String customerAccount) {
            this.customerAccount = customerAccount;
            return this;
        }
        public String getCustomerAccount() {
            return this.customerAccount;
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setCustomerRebateType(String customerRebateType) {
            this.customerRebateType = customerRebateType;
            return this;
        }
        public String getCustomerRebateType() {
            return this.customerRebateType;
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setFxDescription(String fxDescription) {
            this.fxDescription = fxDescription;
            return this;
        }
        public String getFxDescription() {
            return this.fxDescription;
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setFxShutdownstatus(String fxShutdownstatus) {
            this.fxShutdownstatus = fxShutdownstatus;
            return this;
        }
        public String getFxShutdownstatus() {
            return this.fxShutdownstatus;
        }

        public CreateNormalAccountRequestCreateNormalAccountInfoList setIsEnterprise(Integer isEnterprise) {
            this.isEnterprise = isEnterprise;
            return this;
        }
        public Integer getIsEnterprise() {
            return this.isEnterprise;
        }

    }

}
