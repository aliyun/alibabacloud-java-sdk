// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryAuditResultRequest extends TeaModel {
    @NameInMap("DspId")
    public String dspId;

    @NameInMap("Ids")
    public java.util.List<String> ids;

    public static QueryAuditResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuditResultRequest self = new QueryAuditResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuditResultRequest setDspId(String dspId) {
        this.dspId = dspId;
        return this;
    }
    public String getDspId() {
        return this.dspId;
    }

    public QueryAuditResultRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
