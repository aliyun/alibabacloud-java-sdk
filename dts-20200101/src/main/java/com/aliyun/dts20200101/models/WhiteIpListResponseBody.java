// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class WhiteIpListResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error code. This parameter will be removed in the future.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The CIDR blocks of DTS servers. Multiple CIDR blocks are separated by commas (,).</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace **%s** in the **ErrMessage** parameter.</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static WhiteIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WhiteIpListResponseBody self = new WhiteIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public WhiteIpListResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public WhiteIpListResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public WhiteIpListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public WhiteIpListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public WhiteIpListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public WhiteIpListResponseBody setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public WhiteIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WhiteIpListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
