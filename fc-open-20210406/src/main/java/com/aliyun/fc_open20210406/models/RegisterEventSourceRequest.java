// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RegisterEventSourceRequest extends TeaModel {
    /**
     * <p>{"name":"RegisterEventSource","product":"FC-Open","version":"2021-04-06","path":"/2021-04-06/services/{serviceName}/functions/{functionName}/event-sources","deprecated":0,"method":"POST","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"serviceName\",\"position\":\"Path\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"The name of the service.\",\"description\":\"The name of the service. \",\"example\":\"demo-service\"},{\"name\":\"functionName\",\"position\":\"Path\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"The name of the function.\",\"description\":\"The name of the function. \",\"example\":\"demo-function\"},{\"name\":\"qualifier\",\"position\":\"Query\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"The version or alias of the service.\",\"description\":\"The version or alias of the service. \",\"example\":\"LATEST\"},{\"name\":\"body\",\"position\":\"Body\",\"style\":\"json\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Object\",\"params\":[{\"name\":\"sourceArn\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"The Alibaba Cloud Resource Name (ARN) of the event source.\",\"description\":\"The Alibaba Cloud Resource Name (ARN) of the event source.\",\"example\":\"acs:eventbridge:cn-shanghai:123456:eventbus/mns-test/rule/fc-test1/target/abc\"}],\"description\":\"The body of the request. \"},{\"name\":\"X-Fc-Account-Id\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The ID of your Alibaba Cloud account. \",\"example\":\"188077086902****\"},{\"name\":\"X-Fc-Date\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The time when Function Compute API is called. \",\"example\":\"Sat, 14 Jul 2017 07:02:38 GMT\"},{\"name\":\"X-Fc-Trace-Id\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The trace ID of the invocation request of Function Compute. \",\"example\":\"asdf****\"}]","response_headers":"[]","response":"{\"type\":\"Object\",\"children\":[{\"name\":\"sourceArn\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"The Alibaba Cloud Resource Name (ARN) of the event source.\",\"description\":\"The ARN of the event source. \",\"example\":\"acs:eventbridge:cn-shanghai:123456:eventbus/mns-test/rule/fc-test1/target/abc\"},{\"name\":\"createdTime\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"The creation time.\",\"description\":\"The time when the event source was created. \",\"example\":\"2016-08-15T16:06:05.000+0000\"}],\"title\":\"Schema of Response\",\"description\":\"The returned data. \"}","body_style":"json","errors":"{}"}</p>
     */
    @NameInMap("sourceArn")
    public String sourceArn;

    /**
     * <p>asdf****</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static RegisterEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterEventSourceRequest self = new RegisterEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterEventSourceRequest setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public RegisterEventSourceRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
