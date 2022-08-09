// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterSaveRequest extends TeaModel {
    @NameInMap("alipay_no")
    public String alipayNo;

    @NameInMap("corp_id")
    public String corpId;

    @NameInMap("number")
    public String number;

    @NameInMap("scope")
    public Long scope;

    @NameInMap("thirdpart_id")
    public String thirdpartId;

    @NameInMap("title")
    public String title;

    public static CostCenterSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        CostCenterSaveRequest self = new CostCenterSaveRequest();
        return TeaModel.build(map, self);
    }

    public CostCenterSaveRequest setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
        return this;
    }
    public String getAlipayNo() {
        return this.alipayNo;
    }

    public CostCenterSaveRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CostCenterSaveRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public CostCenterSaveRequest setScope(Long scope) {
        this.scope = scope;
        return this;
    }
    public Long getScope() {
        return this.scope;
    }

    public CostCenterSaveRequest setThirdpartId(String thirdpartId) {
        this.thirdpartId = thirdpartId;
        return this;
    }
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public CostCenterSaveRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
