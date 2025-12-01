// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeNodeCidrListResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
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
     * <p>The public CIDR blocks.</p>
     */
    @NameInMap("InternetIPs")
    public DescribeNodeCidrListResponseBodyInternetIPs internetIPs;

    /**
     * <p>The internal CIDR blocks.</p>
     */
    @NameInMap("IntranetIPs")
    public DescribeNodeCidrListResponseBodyIntranetIPs intranetIPs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5B352E69-E7B1-4EA7-BB8E-29FFE969C791</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeNodeCidrListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeCidrListResponseBody self = new DescribeNodeCidrListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeCidrListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeNodeCidrListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeNodeCidrListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeNodeCidrListResponseBody setInternetIPs(DescribeNodeCidrListResponseBodyInternetIPs internetIPs) {
        this.internetIPs = internetIPs;
        return this;
    }
    public DescribeNodeCidrListResponseBodyInternetIPs getInternetIPs() {
        return this.internetIPs;
    }

    public DescribeNodeCidrListResponseBody setIntranetIPs(DescribeNodeCidrListResponseBodyIntranetIPs intranetIPs) {
        this.intranetIPs = intranetIPs;
        return this;
    }
    public DescribeNodeCidrListResponseBodyIntranetIPs getIntranetIPs() {
        return this.intranetIPs;
    }

    public DescribeNodeCidrListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeCidrListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeNodeCidrListResponseBodyInternetIPs extends TeaModel {
        @NameInMap("InternetIP")
        public java.util.List<String> internetIP;

        public static DescribeNodeCidrListResponseBodyInternetIPs build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeCidrListResponseBodyInternetIPs self = new DescribeNodeCidrListResponseBodyInternetIPs();
            return TeaModel.build(map, self);
        }

        public DescribeNodeCidrListResponseBodyInternetIPs setInternetIP(java.util.List<String> internetIP) {
            this.internetIP = internetIP;
            return this;
        }
        public java.util.List<String> getInternetIP() {
            return this.internetIP;
        }

    }

    public static class DescribeNodeCidrListResponseBodyIntranetIPs extends TeaModel {
        @NameInMap("IntranetIP")
        public java.util.List<String> intranetIP;

        public static DescribeNodeCidrListResponseBodyIntranetIPs build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeCidrListResponseBodyIntranetIPs self = new DescribeNodeCidrListResponseBodyIntranetIPs();
            return TeaModel.build(map, self);
        }

        public DescribeNodeCidrListResponseBodyIntranetIPs setIntranetIP(java.util.List<String> intranetIP) {
            this.intranetIP = intranetIP;
            return this;
        }
        public java.util.List<String> getIntranetIP() {
            return this.intranetIP;
        }

    }

}
