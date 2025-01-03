// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentPlanTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExperimentPlanTemplatesResponseBody body;

    public static ListExperimentPlanTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlanTemplatesResponse self = new ListExperimentPlanTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlanTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentPlanTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentPlanTemplatesResponse setBody(ListExperimentPlanTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentPlanTemplatesResponseBody getBody() {
        return this.body;
    }

}
