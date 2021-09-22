// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpaceClientConfigResponseBody extends TeaModel {
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("FileUploadEndpoint")
    public String fileUploadEndpoint;

    @NameInMap("Name")
    public String name;

    public static DescribeSpaceClientConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpaceClientConfigResponseBody self = new DescribeSpaceClientConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpaceClientConfigResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeSpaceClientConfigResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeSpaceClientConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpaceClientConfigResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public DescribeSpaceClientConfigResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DescribeSpaceClientConfigResponseBody setFileUploadEndpoint(String fileUploadEndpoint) {
        this.fileUploadEndpoint = fileUploadEndpoint;
        return this;
    }
    public String getFileUploadEndpoint() {
        return this.fileUploadEndpoint;
    }

    public DescribeSpaceClientConfigResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
