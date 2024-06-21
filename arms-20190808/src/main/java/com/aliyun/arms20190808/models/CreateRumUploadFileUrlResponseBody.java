// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRumUploadFileUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p><a href="http://arms-rum-v2.oss-cn-hangzhou.aliyuncs.com/113197164xxxxx28/b590lhguqs%40f93xxxxxbf31d3/1.0.0-robots.txt?Expires=1713847079&OSSAccessKeyId=STS.NT6XvoxkyqA&Signature=6ptYX4OTjLMrsleTlA2t97">http://arms-rum-v2.oss-cn-hangzhou.aliyuncs.com/113197164xxxxx28/b590lhguqs%40f93xxxxxbf31d3/1.0.0-robots.txt?Expires=1713847079&amp;OSSAccessKeyId=STS.NT6XvoxkyqA&amp;Signature=6ptYX4OTjLMrsleTlA2t97</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateRumUploadFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRumUploadFileUrlResponseBody self = new CreateRumUploadFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRumUploadFileUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateRumUploadFileUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateRumUploadFileUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateRumUploadFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRumUploadFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRumUploadFileUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
