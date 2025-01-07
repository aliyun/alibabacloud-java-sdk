// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryCorpDetailInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>btripxxxxxx</p>
     */
    @NameInMap("target_corp_id")
    public String targetCorpId;

    public static QueryCorpDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpDetailInfoRequest self = new QueryCorpDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCorpDetailInfoRequest setTargetCorpId(String targetCorpId) {
        this.targetCorpId = targetCorpId;
        return this;
    }
    public String getTargetCorpId() {
        return this.targetCorpId;
    }

}
