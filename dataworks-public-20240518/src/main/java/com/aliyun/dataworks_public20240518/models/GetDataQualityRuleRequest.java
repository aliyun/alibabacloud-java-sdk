// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>19715</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetDataQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityRuleRequest self = new GetDataQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
