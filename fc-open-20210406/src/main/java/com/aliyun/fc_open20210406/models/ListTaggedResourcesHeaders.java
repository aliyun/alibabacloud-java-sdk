// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>Queries all tagged services.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>{"name":"ListTaggedResources","product":"FC-Open","version":"2021-04-06","path":"/2021-04-06/tags","deprecated":0,"method":"GET","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"nextToken\",\"position\":\"Query\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The token used to obtain more results. You do not need to provide this parameter in the first call. The tokens for subsequent queries are obtained from the returned results. \",\"example\":\"a-service\"},{\"name\":\"limit\",\"position\":\"Query\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Integer\",\"description\":\"The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned resources is less than or equal to the specified number. \",\"example\":\"20\"},{\"name\":\"X-Fc-Account-Id\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The ID of your Alibaba Cloud account. \",\"example\":\"188077086902****\"},{\"name\":\"X-Fc-Date\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The time when Function Compute API is called. Specify the time in the yyyy-mm-ddhh:mm:ss format. \",\"example\":\"2022-01-01 12:00:00\"},{\"name\":\"X-Fc-Trace-Id\",\"position\":\"Header\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The custom request ID. \",\"example\":\"my-test-trace-id\"}]","response_headers":"[]","response":"{\"type\":\"Object\",\"children\":[{\"name\":\"nextToken\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"The token used to obtain more results. You do not need to provide this parameter in the first call. The tokens for subsequent queries are obtained from the returned results. \",\"example\":\"a-service\"},{\"name\":\"resources\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Array\",\"subType\":\"Object\",\"children\":[{\"name\":\"resourceArn\",\"required\":false,\"checkBlank\":false,\"visibility\":\"public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"resourceArn\",\"description\":\"The Alibaba Cloud Resource Name (ARN). \\n> You can use the value of this parameter to query the information about the resource, such as the account, service, and region information of the resource. You can manage tags only for services for top level resources. \",\"example\":\"acs:fc:cn-shanghai:188077086902****:services/demo\"},{\"name\":\"tags\",\"required\":false,\"checkBlank\":false,\"visibility\":\"public\",\"deprecated\":false,\"type\":\"Map\",\"keyType\":\"String\",\"value\":{\"type\":\"String\",\"required\":false,\"checkBlank\":false,\"visibility\":\"public\",\"deprecated\":false,\"description\":\"The tag dictionary. A tag consists of the following parameters:\\n  - **key**: the key of the tag. \\n  - **value**: the value of the tag. \",\"example\":\"{\\\"k1\\\":\\\"v1\\\" , \\\"k2\\\":\\\"v2\\\"}\"},\"title\":\"tags\",\"description\":\"The tag dictionary. \"}],\"description\":\"The information about tagged services.\"}],\"title\":\"Schema of Response\",\"description\":\"Schema of Response\"}","errors":"{}"}</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>147258</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static ListTaggedResourcesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListTaggedResourcesHeaders self = new ListTaggedResourcesHeaders();
        return TeaModel.build(map, self);
    }

    public ListTaggedResourcesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListTaggedResourcesHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public ListTaggedResourcesHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public ListTaggedResourcesHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
