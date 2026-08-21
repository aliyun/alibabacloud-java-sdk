// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryShelfRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ScenicId")
    public Long scenicId;

    public static TicketQueryShelfRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryShelfRequest self = new TicketQueryShelfRequest();
        return TeaModel.build(map, self);
    }

    public TicketQueryShelfRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public TicketQueryShelfRequest setScenicId(Long scenicId) {
        this.scenicId = scenicId;
        return this;
    }
    public Long getScenicId() {
        return this.scenicId;
    }

}
