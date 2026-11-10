// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class HibernateClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c82e6987e2961451182edacd74faf</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static HibernateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        HibernateClusterRequest self = new HibernateClusterRequest();
        return TeaModel.build(map, self);
    }

    public HibernateClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
