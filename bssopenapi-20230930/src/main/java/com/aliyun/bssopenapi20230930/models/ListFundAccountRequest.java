// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListFundAccountRequest extends TeaModel {
    /**
     * <p>Level-1 marketplace ID. If this parameter is left empty, the ID of the marketplace to which the current user belongs is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2084210001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>Specifies whether to query only the active account list. Default value: false.</p>
     */
    @NameInMap("QueryOnlyInUse")
    public Boolean queryOnlyInUse;

    /**
     * <p>Specifies whether to query only the managed account list. Default value: false.</p>
     */
    @NameInMap("QueryOnlyManage")
    public Boolean queryOnlyManage;

    public static ListFundAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFundAccountRequest self = new ListFundAccountRequest();
        return TeaModel.build(map, self);
    }

    public ListFundAccountRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public ListFundAccountRequest setQueryOnlyInUse(Boolean queryOnlyInUse) {
        this.queryOnlyInUse = queryOnlyInUse;
        return this;
    }
    public Boolean getQueryOnlyInUse() {
        return this.queryOnlyInUse;
    }

    public ListFundAccountRequest setQueryOnlyManage(Boolean queryOnlyManage) {
        this.queryOnlyManage = queryOnlyManage;
        return this;
    }
    public Boolean getQueryOnlyManage() {
        return this.queryOnlyManage;
    }

}
