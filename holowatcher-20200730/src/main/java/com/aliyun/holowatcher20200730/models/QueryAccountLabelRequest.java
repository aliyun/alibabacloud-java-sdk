// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class QueryAccountLabelRequest extends TeaModel {
    @NameInMap("PK")
    public Long PK;

    @NameInMap("LabelSeries")
    public String labelSeries;

    @NameInMap("Token")
    public String token;

    public static QueryAccountLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountLabelRequest self = new QueryAccountLabelRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountLabelRequest setPK(Long PK) {
        this.PK = PK;
        return this;
    }
    public Long getPK() {
        return this.PK;
    }

    public QueryAccountLabelRequest setLabelSeries(String labelSeries) {
        this.labelSeries = labelSeries;
        return this;
    }
    public String getLabelSeries() {
        return this.labelSeries;
    }

    public QueryAccountLabelRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
