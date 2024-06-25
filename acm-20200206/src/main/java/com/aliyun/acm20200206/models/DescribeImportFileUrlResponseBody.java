// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeImportFileUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImportFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportFileUrlResponseBody self = new DescribeImportFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImportFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImportFileUrlResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public DescribeImportFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImportFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
