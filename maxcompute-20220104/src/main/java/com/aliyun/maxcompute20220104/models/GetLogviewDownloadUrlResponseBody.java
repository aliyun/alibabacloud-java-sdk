// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetLogviewDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The presigned OSS download URL for the offline Logview file. The URL is valid for 10 minutes from the time it is generated. The file name extension is .txt and the content is JSON data in UTF-8 encoding. The download URL is determined by useVpcEndpoint. If the link expires, invoke this operation again. The sample URL is desensitized and cannot be used for actual downloads.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/logview/offline/logview_detail_odps_project_20260409110419512gx6ofeaj8fb.txt?OSSAccessKeyId=LTAI5tExample****&Expires=1791777900&Signature=example">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/logview/offline/logview_detail_odps_project_20260409110419512gx6ofeaj8fb.txt?OSSAccessKeyId=LTAI5tExample****&amp;Expires=1791777900&amp;Signature=example</a>****</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code. This field is not assigned a value when this operation is successfully processed. The sample value NO_PERMISSION is used to illustrate a common permission error and must not be combined with the success response example.</p>
     * 
     * <strong>example:</strong>
     * <p>NO_PERMISSION</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This field is not assigned a value when this operation is successfully processed. The sample value Forbidden is used to illustrate a common permission error and must not be combined with the success response example.</p>
     * 
     * <strong>example:</strong>
     * <p>Forbidden</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code field. This field is not assigned a value when this operation is successfully processed. Do not rely solely on whether this field equals 200 to determine success. Process the result based on the actual HTTP response status and returned content. The sample value 200 is used only to illustrate the field format.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID. This ID is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0be3e0aa16667684362147582e038f</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetLogviewDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogviewDownloadUrlResponseBody self = new GetLogviewDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogviewDownloadUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLogviewDownloadUrlResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLogviewDownloadUrlResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLogviewDownloadUrlResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetLogviewDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
