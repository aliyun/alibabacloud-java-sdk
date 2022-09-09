// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRabbitmqPublisherResponseBody extends TeaModel {
    @NameInMap("publisherId")
    public String publisherId;

    @NameInMap("requestId")
    public String requestId;

    public static CreateRabbitmqPublisherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRabbitmqPublisherResponseBody self = new CreateRabbitmqPublisherResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRabbitmqPublisherResponseBody setPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }
    public String getPublisherId() {
        return this.publisherId;
    }

    public CreateRabbitmqPublisherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
