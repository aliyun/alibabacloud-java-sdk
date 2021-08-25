// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListResultTokenUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("OssUrls")
    public java.util.List<String> ossUrls;

    public static ListResultTokenUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResultTokenUrlResponseBody self = new ListResultTokenUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResultTokenUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListResultTokenUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListResultTokenUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResultTokenUrlResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListResultTokenUrlResponseBody setOssUrls(java.util.List<String> ossUrls) {
        this.ossUrls = ossUrls;
        return this;
    }
    public java.util.List<String> getOssUrls() {
        return this.ossUrls;
    }

}
