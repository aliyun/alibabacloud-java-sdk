// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditEndUserStatusRequest extends TeaModel {
    /**
     * <p>Shutdown Status</br></p>
     * <ul>
     * <li><p>postPayFreeze, the account have been blocked</br></p>
     * </li>
     * <li><p>postPayThaw, the account have been unlocked</br></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>postPayFreeze</p>
     */
    @NameInMap("CreditStatus")
    public String creditStatus;

    /**
     * <p>UID</p>
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
