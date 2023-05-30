// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteVpcBindingHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>Deletes a bound VPC.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>{"name":"DeleteVpcBinding","product":"FC-Open","version":"2021-04-06","path":"/2021-04-06/services/{serviceName}/bindings/{vpcId}","deprecated":0,"method":"DELETE","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"serviceName\",\"position\":\"Path\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The name of the service. \",\"example\":\"demoService\"},{\"name\":\"vpcId\",\"position\":\"Path\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The ID of the VPC to be unbound. \",\"example\":\"vpc-xxxx\"},{\"name\":\"X-Fc-Account-Id\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The ID of your Alibaba Cloud account. \",\"example\":\"188077086902****\"},{\"name\":\"X-Fc-Date\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The time when Function Compute API is called. Specify the time in the yyyy-mm-ddhh:mm:ss format. \",\"example\":\"2022-01-0112:00:00\"},{\"name\":\"X-Fc-Trace-Id\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The custom request ID. \",\"example\":\"asdf****\"}]","response_headers":"[]","response":"{}","errors":"{}"}</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static DeleteVpcBindingHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcBindingHeaders self = new DeleteVpcBindingHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteVpcBindingHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteVpcBindingHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public DeleteVpcBindingHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public DeleteVpcBindingHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
