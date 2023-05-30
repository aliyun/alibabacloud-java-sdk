// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteAliasHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>{"name":"DeleteAlias","product":"FC-Open","version":"2021-04-06","path":"/2021-04-06/services/{serviceName}/aliases/{aliasName}","deprecated":0,"method":"DELETE","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"serviceName\",\"position\":\"Path\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"The name of the service.\",\"description\":\"The name of the service.\",\"example\":\"demo-service\"},{\"name\":\"aliasName\",\"position\":\"Path\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"The name of the alias.\",\"description\":\"The name of the alias.\",\"example\":\"test\"},{\"name\":\"If-Match\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"If the ETag specified in the request matches the ETag value of the object, OSS transmits the object and returns 200 OK. If the ETag specified in the request does not match the ETag value of the object, OSS returns 412 Precondition Failed. \\nThe ETag value of a resource is used to check whether the resource has changed. You can check data integrity by using the ETag value. \\nDefault value: null\",\"example\":\"e19d5cd5af0378da05f63f891c7467af\"},{\"name\":\"X-Fc-Account-Id\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The ID of your Alibaba Cloud account. \",\"example\":\"188077086902****\"},{\"name\":\"X-Fc-Date\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The time when Function Compute API is called. \",\"example\":\"2020-12-1210:00:00\"},{\"name\":\"X-Fc-Trace-Id\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The trace ID of the invocation request of Function Compute. \",\"example\":\"r9s89isisi****\"}]","response_headers":"[]","response":"{}","errors":"{}"}</p>
     */
    @NameInMap("If-Match")
    public String ifMatch;

    /**
     * <p>139490</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>Xiaoqi</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static DeleteAliasHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteAliasHeaders self = new DeleteAliasHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteAliasHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteAliasHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public DeleteAliasHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public DeleteAliasHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public DeleteAliasHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
