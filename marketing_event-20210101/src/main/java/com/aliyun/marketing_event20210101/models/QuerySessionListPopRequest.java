// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySessionListPopRequest extends TeaModel {
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

    public static QuerySessionListPopRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionListPopRequest self = new QuerySessionListPopRequest();
        return TeaModel.build(map, self);
    }

    public QuerySessionListPopRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public QuerySessionListPopRequest setNfcId(String nfcId) {
        this.nfcId = nfcId;
        return this;
    }
    public String getNfcId() {
        return this.nfcId;
    }

}
