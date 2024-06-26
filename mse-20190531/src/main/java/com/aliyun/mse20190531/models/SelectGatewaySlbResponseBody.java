// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class SelectGatewaySlbResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public java.util.List<SelectGatewaySlbResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E00C6D90-A28A-5813-8981-0459AA436F46</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SelectGatewaySlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectGatewaySlbResponseBody self = new SelectGatewaySlbResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectGatewaySlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SelectGatewaySlbResponseBody setData(java.util.List<SelectGatewaySlbResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SelectGatewaySlbResponseBodyData> getData() {
        return this.data;
    }

    public SelectGatewaySlbResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SelectGatewaySlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SelectGatewaySlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectGatewaySlbResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SelectGatewaySlbResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp14lqiw5n96hq2****</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The name of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MseGatewaySlb-gw</p>
         */
        @NameInMap("SlbName")
        public String slbName;

        public static SelectGatewaySlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SelectGatewaySlbResponseBodyData self = new SelectGatewaySlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SelectGatewaySlbResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public SelectGatewaySlbResponseBodyData setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

    }

}
