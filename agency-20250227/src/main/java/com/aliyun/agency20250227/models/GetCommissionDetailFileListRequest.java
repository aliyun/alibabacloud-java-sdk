// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetCommissionDetailFileListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>202501</p>
     */
    @NameInMap("BillMonth")
    public String billMonth;

    public static GetCommissionDetailFileListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommissionDetailFileListRequest self = new GetCommissionDetailFileListRequest();
        return TeaModel.build(map, self);
    }

    public GetCommissionDetailFileListRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

}
