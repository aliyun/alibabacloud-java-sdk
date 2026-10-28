// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditEndUserStatusRequest extends TeaModel {
    /**
     * <h3>Shutdown status</h3>
     * <ul>
     * <li>postPayFreeze: pay-as-you-go resource suspension</li>
     * <li>postPayThaw: pay-as-you-go resource resumption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>postPayFreeze</p>
     */
    @NameInMap("CreditStatus")
    public String creditStatus;

    /**
     * <p>The UID of the customer to be processed.</p>
     * 
     * <strong>example:</strong>
     * <p>1792155717328010</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static EditEndUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        EditEndUserStatusRequest self = new EditEndUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public EditEndUserStatusRequest setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public EditEndUserStatusRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
