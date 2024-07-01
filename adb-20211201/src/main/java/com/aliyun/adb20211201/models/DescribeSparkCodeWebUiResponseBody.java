// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkCodeWebUiResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request was successful, <strong>SUCCESS</strong> is returned.</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>774DDC37-1908-58F6-B9CA-99E3E45965A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The URL of the web UI for the Spark application.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://adb-subuser-cn-hangzhou-1358535755648527-100000648.oss-cn-hangzhou.aliyuncs.com/%3Facl?Expires=1681295967&OSSAccessKeyId=LTAI5tB7NAkm25oiGASu****&Signature=hKAZ1vgvhJ%2FD8hNHTuX%2FOOBWht">https://adb-subuser-cn-hangzhou-1358535755648527-100000648.oss-cn-hangzhou.aliyuncs.com/%3Facl?Expires=1681295967&amp;OSSAccessKeyId=LTAI5tB7NAkm25oiGASu****&amp;Signature=hKAZ1vgvhJ%2FD8hNHTuX%2FOOBWht</a>****</p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeSparkCodeWebUiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkCodeWebUiResponseBody self = new DescribeSparkCodeWebUiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSparkCodeWebUiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSparkCodeWebUiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSparkCodeWebUiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSparkCodeWebUiResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
