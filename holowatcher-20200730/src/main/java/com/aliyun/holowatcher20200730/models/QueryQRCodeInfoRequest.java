// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class QueryQRCodeInfoRequest extends TeaModel {
    // sId
    @NameInMap("SId")
    public String SId;

    public static QueryQRCodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQRCodeInfoRequest self = new QueryQRCodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryQRCodeInfoRequest setSId(String SId) {
        this.SId = SId;
        return this;
    }
    public String getSId() {
        return this.SId;
    }

}
