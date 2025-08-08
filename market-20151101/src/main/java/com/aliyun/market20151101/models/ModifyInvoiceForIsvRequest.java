// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ModifyInvoiceForIsvRequest extends TeaModel {
    @NameInMap("CheckNotice")
    public String checkNotice;

    /**
     * <strong>example:</strong>
     * <p><a href="https://oss.aliyuncs.com/xxxx.png">https://oss.aliyuncs.com/xxxx.png</a></p>
     */
    @NameInMap("ElectronUrl")
    public String electronUrl;

    @NameInMap("InvoiceId")
    public Long invoiceId;

    /**
     * <strong>example:</strong>
     * <p>1897702****</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperateType")
    public Integer operateType;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static ModifyInvoiceForIsvRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInvoiceForIsvRequest self = new ModifyInvoiceForIsvRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInvoiceForIsvRequest setCheckNotice(String checkNotice) {
        this.checkNotice = checkNotice;
        return this;
    }
    public String getCheckNotice() {
        return this.checkNotice;
    }

    public ModifyInvoiceForIsvRequest setElectronUrl(String electronUrl) {
        this.electronUrl = electronUrl;
        return this;
    }
    public String getElectronUrl() {
        return this.electronUrl;
    }

    public ModifyInvoiceForIsvRequest setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public ModifyInvoiceForIsvRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ModifyInvoiceForIsvRequest setOperateType(Integer operateType) {
        this.operateType = operateType;
        return this;
    }
    public Integer getOperateType() {
        return this.operateType;
    }

    public ModifyInvoiceForIsvRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
