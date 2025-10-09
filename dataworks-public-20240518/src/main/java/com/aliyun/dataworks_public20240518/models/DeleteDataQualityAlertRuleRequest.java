// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityAlertRuleRequest extends TeaModel {
    /**
     * <p>The ID of the data quality rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteDataQualityAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityAlertRuleRequest self = new DeleteDataQualityAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityAlertRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
