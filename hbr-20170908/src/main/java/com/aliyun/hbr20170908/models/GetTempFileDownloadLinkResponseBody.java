// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetTempFileDownloadLinkResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the request is successful, a value of successful is returned. If the request fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The download URL of the file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://a-hbr-temp-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/job-0007yg2i0m6705wdhgb6_0.csv?Expires=1649406469&OSSAccessKeyId=LTAI************&Signature=26%2BgjegCrRmMDCpS5jzyG4ivKU8%3D">https://a-hbr-temp-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/job-0007yg2i0m6705wdhgb6_0.csv?Expires=1649406469&amp;OSSAccessKeyId=LTAI************&amp;Signature=26%2BgjegCrRmMDCpS5jzyG4ivKU8%3D</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GetTempFileDownloadLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTempFileDownloadLinkResponseBody self = new GetTempFileDownloadLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTempFileDownloadLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTempFileDownloadLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTempFileDownloadLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTempFileDownloadLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTempFileDownloadLinkResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
