// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class QueryCustomerLabelByConfigGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PK")
    public Long PK;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Token")
    public String token;

    public static QueryCustomerLabelByConfigGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerLabelByConfigGroupRequest self = new QueryCustomerLabelByConfigGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerLabelByConfigGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public QueryCustomerLabelByConfigGroupRequest setPK(Long PK) {
        this.PK = PK;
        return this;
    }
    public Long getPK() {
        return this.PK;
    }

    public QueryCustomerLabelByConfigGroupRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
