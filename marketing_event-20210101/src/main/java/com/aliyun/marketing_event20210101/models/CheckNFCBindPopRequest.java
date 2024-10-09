// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class CheckNFCBindPopRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4546</p>
     */
    @NameInMap("ActivityId")
    public Long activityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdojzopf</p>
     */
    @NameInMap("NfcId")
    public String nfcId;

    public static CheckNFCBindPopRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckNFCBindPopRequest self = new CheckNFCBindPopRequest();
        return TeaModel.build(map, self);
    }

    public CheckNFCBindPopRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public CheckNFCBindPopRequest setNfcId(String nfcId) {
        this.nfcId = nfcId;
        return this;
    }
    public String getNfcId() {
        return this.nfcId;
    }

}
