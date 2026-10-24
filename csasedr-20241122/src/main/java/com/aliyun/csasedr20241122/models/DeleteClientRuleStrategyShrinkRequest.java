// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DeleteClientRuleStrategyShrinkRequest extends TeaModel {
    /**
     * <p>The list of IDs of the policies to delete. Use the policy IDs returned by the create operation or obtained from the policy list or details operations.</p>
     */
    @NameInMap("IdList")
    public String idListShrink;

    public static DeleteClientRuleStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientRuleStrategyShrinkRequest self = new DeleteClientRuleStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientRuleStrategyShrinkRequest setIdListShrink(String idListShrink) {
        this.idListShrink = idListShrink;
        return this;
    }
    public String getIdListShrink() {
        return this.idListShrink;
    }

}
