// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class SubmitAccessorFullDomainsOssListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAccessorFullDomainsOssListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAccessorFullDomainsOssListResponseBody self = new SubmitAccessorFullDomainsOssListResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAccessorFullDomainsOssListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SubmitAccessorFullDomainsOssListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAccessorFullDomainsOssListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
