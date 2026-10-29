// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsDeleteRuleCategoryRequest extends TeaModel {
    /**
     * <p>The policy ID of the current account. This parameter is required. You can obtain the ID from the Id field in the response of CreateSdnsRuleCategory or the list returned by SdnsListRuleCategories. Use a decimal string to prevent precision loss of large integers.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789012345678</p>
     */
    @NameInMap("Id")
    public String id;

    public static SdnsDeleteRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SdnsDeleteRuleCategoryRequest self = new SdnsDeleteRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public SdnsDeleteRuleCategoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
