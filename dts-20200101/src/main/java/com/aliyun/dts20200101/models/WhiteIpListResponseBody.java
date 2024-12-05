// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class WhiteIpListResponseBody extends TeaModel {
    /**
     * <p>Target end adaptation to VPCNAT IP whitelist</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("DestIpList")
    public String destIpList;

    /**
     * <p>The dynamic error code. This parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message. This parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>Type</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.151.12.0/24,47.102.181.0/24,47.101.109.0/24,120.55.129.0/24,11.115.103.0/24,47.102.234.0/24</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AD823BD3-1BA6-4117-A536-165CB280****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Source adaptation to VPC NAT IP whitelist</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SrcIpList")
    public String srcIpList;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static WhiteIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WhiteIpListResponseBody self = new WhiteIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public WhiteIpListResponseBody setDestIpList(String destIpList) {
        this.destIpList = destIpList;
        return this;
    }
    public String getDestIpList() {
        return this.destIpList;
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

    public WhiteIpListResponseBody setSrcIpList(String srcIpList) {
        this.srcIpList = srcIpList;
        return this;
    }
    public String getSrcIpList() {
        return this.srcIpList;
    }

    public WhiteIpListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
