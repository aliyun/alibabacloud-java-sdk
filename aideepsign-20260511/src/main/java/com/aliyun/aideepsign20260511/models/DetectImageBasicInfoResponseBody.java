// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class DetectImageBasicInfoResponseBody extends TeaModel {
    /**
     * <p>The business error code. &quot;OK&quot; is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The image resolution (width × height), such as 1920 × 1080. This value is empty if the resolution cannot be identified.</p>
     * 
     * <strong>example:</strong>
     * <p>2048 * 2048</p>
     */
    @NameInMap("Dpi")
    public String dpi;

    /**
     * <p>The HTTP status code. 200 is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information. &quot;success&quot; is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>photo.jpg</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The file size in a human-readable format, such as 1.5 MB or 256 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>2.3 MB</p>
     */
    @NameInMap("Size")
    public String size;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The image format, such as JPEG, PNG, GIF, or WEBP. UNKNOWN is returned if the format cannot be identified.</p>
     * 
     * <strong>example:</strong>
     * <p>PNG</p>
     */
    @NameInMap("Type")
    public String type;

    public static DetectImageBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBasicInfoResponseBody self = new DetectImageBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageBasicInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetectImageBasicInfoResponseBody setDpi(String dpi) {
        this.dpi = dpi;
        return this;
    }
    public String getDpi() {
        return this.dpi;
    }

    public DetectImageBasicInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DetectImageBasicInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectImageBasicInfoResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetectImageBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageBasicInfoResponseBody setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public DetectImageBasicInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetectImageBasicInfoResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
