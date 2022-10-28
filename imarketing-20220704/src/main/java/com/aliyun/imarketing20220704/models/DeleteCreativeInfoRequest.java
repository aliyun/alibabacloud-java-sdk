// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class DeleteCreativeInfoRequest extends TeaModel {
    @NameInMap("AccountNo")
    public String accountNo;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MainId")
    public Long mainId;

    @NameInMap("UpdateUser")
    public String updateUser;

    public static DeleteCreativeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCreativeInfoRequest self = new DeleteCreativeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCreativeInfoRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public DeleteCreativeInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteCreativeInfoRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteCreativeInfoRequest setMainId(Long mainId) {
        this.mainId = mainId;
        return this;
    }
    public Long getMainId() {
        return this.mainId;
    }

    public DeleteCreativeInfoRequest setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

}
