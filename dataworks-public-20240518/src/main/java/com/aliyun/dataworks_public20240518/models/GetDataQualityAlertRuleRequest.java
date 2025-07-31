// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityAlertRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>113642</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetDataQualityAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityAlertRuleRequest self = new GetDataQualityAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityAlertRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
