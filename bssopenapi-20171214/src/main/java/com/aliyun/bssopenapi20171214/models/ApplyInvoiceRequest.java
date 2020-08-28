// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ApplyInvoiceRequest extends TeaModel {
    @NameInMap("InvoiceAmount")
    @Validation(required = true)
    public Long invoiceAmount;

    @NameInMap("CustomerId")
    @Validation(required = true)
    public Long customerId;

    @NameInMap("AddressId")
    @Validation(required = true)
    public Long addressId;

    @NameInMap("InvoicingType")
    public Integer invoicingType;

    @NameInMap("ProcessWay")
    public Integer processWay;

    @NameInMap("ApplyUserNick")
    @Validation(required = true)
    public String applyUserNick;

    @NameInMap("SelectedIds")
    @Validation(required = true)
    public java.util.List<Long> selectedIds;

    @NameInMap("InvoiceByAmount")
    public Boolean invoiceByAmount;

    public static ApplyInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceRequest self = new ApplyInvoiceRequest();
        return TeaModel.build(map, self);
    }

}
