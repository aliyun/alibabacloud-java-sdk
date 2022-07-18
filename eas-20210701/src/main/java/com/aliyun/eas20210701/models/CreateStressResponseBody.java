// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateStressResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateStressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStressResponseBody self = new CreateStressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateStressResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateStressResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateStressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
