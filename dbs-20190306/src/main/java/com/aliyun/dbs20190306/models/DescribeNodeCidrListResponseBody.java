// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeNodeCidrListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InternetIPs")
    public DescribeNodeCidrListResponseBodyInternetIPs internetIPs;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("IntranetIPs")
    public DescribeNodeCidrListResponseBodyIntranetIPs intranetIPs;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeNodeCidrListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeCidrListResponseBody self = new DescribeNodeCidrListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeCidrListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeCidrListResponseBody setInternetIPs(DescribeNodeCidrListResponseBodyInternetIPs internetIPs) {
        this.internetIPs = internetIPs;
        return this;
    }
    public DescribeNodeCidrListResponseBodyInternetIPs getInternetIPs() {
        return this.internetIPs;
    }

    public DescribeNodeCidrListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeNodeCidrListResponseBody setIntranetIPs(DescribeNodeCidrListResponseBodyIntranetIPs intranetIPs) {
        this.intranetIPs = intranetIPs;
        return this;
    }
    public DescribeNodeCidrListResponseBodyIntranetIPs getIntranetIPs() {
        return this.intranetIPs;
    }

    public DescribeNodeCidrListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeNodeCidrListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNodeCidrListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
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
