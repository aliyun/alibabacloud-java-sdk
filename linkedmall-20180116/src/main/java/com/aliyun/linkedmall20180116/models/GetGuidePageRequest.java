// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetGuidePageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL2***100001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    public static GetGuidePageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGuidePageRequest self = new GetGuidePageRequest();
        return TeaModel.build(map, self);
    }

    public GetGuidePageRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
