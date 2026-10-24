// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DeleteClientRuleStrategyRequest extends TeaModel {
    /**
     * <p>The list of IDs of the policies to delete. Use the policy IDs returned by the create operation or obtained from the policy list or details operations.</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    public static DeleteClientRuleStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientRuleStrategyRequest self = new DeleteClientRuleStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientRuleStrategyRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

}
