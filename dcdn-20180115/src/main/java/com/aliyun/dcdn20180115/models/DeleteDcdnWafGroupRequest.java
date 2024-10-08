// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafGroupRequest extends TeaModel {
    /**
     * <p>The ID of the custom WAF rule group.</p>
     * 
     * <strong>example:</strong>
     * <p>30000135</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteDcdnWafGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnWafGroupRequest self = new DeleteDcdnWafGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnWafGroupRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
