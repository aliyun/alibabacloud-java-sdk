// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class GetCustomerRebateTypeRequest extends TeaModel {
    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("TransferUid")
    public Long transferUid;

    public static GetCustomerRebateTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerRebateTypeRequest self = new GetCustomerRebateTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerRebateTypeRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public GetCustomerRebateTypeRequest setTransferUid(Long transferUid) {
        this.transferUid = transferUid;
        return this;
    }
    public Long getTransferUid() {
        return this.transferUid;
    }

}
