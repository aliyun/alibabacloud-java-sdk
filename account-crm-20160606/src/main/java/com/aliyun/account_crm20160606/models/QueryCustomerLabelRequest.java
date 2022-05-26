// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryCustomerLabelRequest extends TeaModel {
    @NameInMap("LabelSeries")
    public String labelSeries;

    @NameInMap("PK")
    public Long PK;

    @NameInMap("Token")
    public String token;

    public static QueryCustomerLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerLabelRequest self = new QueryCustomerLabelRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerLabelRequest setLabelSeries(String labelSeries) {
        this.labelSeries = labelSeries;
        return this;
    }
    public String getLabelSeries() {
        return this.labelSeries;
    }

    public QueryCustomerLabelRequest setPK(Long PK) {
        this.PK = PK;
        return this;
    }
    public Long getPK() {
        return this.PK;
    }

    public QueryCustomerLabelRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
