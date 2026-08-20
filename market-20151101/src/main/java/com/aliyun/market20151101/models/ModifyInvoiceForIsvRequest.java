// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ModifyInvoiceForIsvRequest extends TeaModel {
    /**
     * <p>The remarks on the invoice from the service provider.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("CheckNotice")
    public String checkNotice;

    /**
     * <p>The electronic invoicing URL, used for customers to download the invoice.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss.aliyuncs.com/xxxx.png">https://oss.aliyuncs.com/xxxx.png</a></p>
     */
    @NameInMap("ElectronUrl")
    public String electronUrl;

    /**
     * <p>The invoice application ID. This corresponds to the Result.Id field in the response of the DescribeInvoiceForIsv operation.</p>
     * 
     * <strong>example:</strong>
     * <p>4072040****</p>
     */
    @NameInMap("InvoiceId")
    public Long invoiceId;

    /**
     * <p>The invoice number.</p>
     * 
     * <strong>example:</strong>
     * <p>1897702****</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>The operation to perform on the current invoice. Valid values:</p>
     * <ul>
     * <li>0: issue the invoice.</li>
     * <li>1: reject the invoice.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperateType")
    public Integer operateType;

    /**
     * <p>The type of the current invoice. Valid values:</p>
     * <ul>
     * <li>2: digital electronic general invoice.</li>
     * <li>3: digital electronic special invoice.</li>
     * </ul>
     * 
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
