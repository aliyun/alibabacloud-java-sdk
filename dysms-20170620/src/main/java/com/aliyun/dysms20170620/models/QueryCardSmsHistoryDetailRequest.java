// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsHistoryDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("Id")
    public String id;

    public static QueryCardSmsHistoryDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsHistoryDetailRequest self = new QueryCardSmsHistoryDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsHistoryDetailRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryCardSmsHistoryDetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
