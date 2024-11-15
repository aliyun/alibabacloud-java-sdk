// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetImageSceneLabelConfResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetImageSceneLabelConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageSceneLabelConfResponseBody self = new GetImageSceneLabelConfResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageSceneLabelConfResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetImageSceneLabelConfResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public GetImageSceneLabelConfResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetImageSceneLabelConfResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetImageSceneLabelConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageSceneLabelConfResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
