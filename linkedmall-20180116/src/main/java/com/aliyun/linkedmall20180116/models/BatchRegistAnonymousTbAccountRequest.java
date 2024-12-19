// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class BatchRegistAnonymousTbAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20210802****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idJsonList&quot;: &quot;[\&quot;id1\&quot;, \&quot;id2\&quot;]</p>
     */
    @NameInMap("IdJsonList")
    public String idJsonList;

    public static BatchRegistAnonymousTbAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRegistAnonymousTbAccountRequest self = new BatchRegistAnonymousTbAccountRequest();
        return TeaModel.build(map, self);
    }

    public BatchRegistAnonymousTbAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BatchRegistAnonymousTbAccountRequest setIdJsonList(String idJsonList) {
        this.idJsonList = idJsonList;
        return this;
    }
    public String getIdJsonList() {
        return this.idJsonList;
    }

}
