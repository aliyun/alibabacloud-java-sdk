// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeSignedUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("ImgUrl")
    public String imgUrl;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSignedUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedUrlResponseBody self = new DescribeSignedUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSignedUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSignedUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSignedUrlResponseBody setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }

    public DescribeSignedUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
