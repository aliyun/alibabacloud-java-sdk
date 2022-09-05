// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetCreativeInfoRequest extends TeaModel {
    @NameInMap("AccountNo")
    public String accountNo;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MainId")
    public Long mainId;

    public static GetCreativeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreativeInfoRequest self = new GetCreativeInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCreativeInfoRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public GetCreativeInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetCreativeInfoRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetCreativeInfoRequest setMainId(Long mainId) {
        this.mainId = mainId;
        return this;
    }
    public Long getMainId() {
        return this.mainId;
    }

}
