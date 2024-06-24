// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterModifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:a@alipay.com">a@alipay.com</a></p>
     */
    @NameInMap("alipay_no")
    public String alipayNo;

    @NameInMap("disable")
    public Long disable;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("number")
    public String number;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scope")
    public Long scope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340049</p>
     */
    @NameInMap("thirdpart_id")
    public String thirdpartId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    public static CostCenterModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CostCenterModifyRequest self = new CostCenterModifyRequest();
        return TeaModel.build(map, self);
    }

    public CostCenterModifyRequest setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
        return this;
    }
    public String getAlipayNo() {
        return this.alipayNo;
    }

    public CostCenterModifyRequest setDisable(Long disable) {
        this.disable = disable;
        return this;
    }
    public Long getDisable() {
        return this.disable;
    }

    public CostCenterModifyRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public CostCenterModifyRequest setScope(Long scope) {
        this.scope = scope;
        return this;
    }
    public Long getScope() {
        return this.scope;
    }

    public CostCenterModifyRequest setThirdpartId(String thirdpartId) {
        this.thirdpartId = thirdpartId;
        return this;
    }
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public CostCenterModifyRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
