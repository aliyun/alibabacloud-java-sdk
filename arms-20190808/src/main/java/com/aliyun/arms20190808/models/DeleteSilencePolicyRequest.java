// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSilencePolicyRequest extends TeaModel {
    /**
     * <p>The ID of the silence policy.</p>
     * <p>For more information about how to obtain the ID of a silence policy, see <a href="https://help.aliyun.com/document_detail/2612383.html">ListSilencePolicies</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteSilencePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSilencePolicyRequest self = new DeleteSilencePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSilencePolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
