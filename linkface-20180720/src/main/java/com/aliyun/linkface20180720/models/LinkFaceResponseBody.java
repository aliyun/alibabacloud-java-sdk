// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class LinkFaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16104</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>can not find this face</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0F02DAFA-2DCF-49CD-90FC-311E31866AB7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static LinkFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LinkFaceResponseBody self = new LinkFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public LinkFaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public LinkFaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LinkFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LinkFaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
