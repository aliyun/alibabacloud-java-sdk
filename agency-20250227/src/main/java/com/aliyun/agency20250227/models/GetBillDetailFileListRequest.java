// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetBillDetailFileListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202502</p>
     */
    @NameInMap("BillMonth")
    public String billMonth;

    public static GetBillDetailFileListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBillDetailFileListRequest self = new GetBillDetailFileListRequest();
        return TeaModel.build(map, self);
    }

    public GetBillDetailFileListRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

}
