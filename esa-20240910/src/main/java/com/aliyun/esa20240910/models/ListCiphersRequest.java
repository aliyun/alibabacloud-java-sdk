// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCiphersRequest extends TeaModel {
    /**
     * <p>The name of the cipher suite group, which can be: all, strict, custom.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>strict</p>
     */
    @NameInMap("CiphersGroup")
    public String ciphersGroup;

    public static ListCiphersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCiphersRequest self = new ListCiphersRequest();
        return TeaModel.build(map, self);
    }

    public ListCiphersRequest setCiphersGroup(String ciphersGroup) {
        this.ciphersGroup = ciphersGroup;
        return this;
    }
    public String getCiphersGroup() {
        return this.ciphersGroup;
    }

}
