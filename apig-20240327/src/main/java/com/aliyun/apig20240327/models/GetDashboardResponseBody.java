// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDashboardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Integer code;

    @NameInMap("data")
    public GetDashboardResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2F46B9E7-67EF-5C8A-BA52-D38D5B32AF2C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardResponseBody self = new GetDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDashboardResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDashboardResponseBody setData(GetDashboardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDashboardResponseBodyData getData() {
        return this.data;
    }

    public GetDashboardResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDashboardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDashboardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDashboardResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gw-co370icmjeu****</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>PLUGIN</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>APIG Plugin</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://sls.console.aliyun.com/lognext/project/xxxxx">https://sls.console.aliyun.com/lognext/project/xxxxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetDashboardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDashboardResponseBodyData self = new GetDashboardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDashboardResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetDashboardResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDashboardResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetDashboardResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
