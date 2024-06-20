// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetNumberLocationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetNumberLocationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>584AA2E3-9AC4-561B-BC8D-C74BA11B1387</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNumberLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNumberLocationResponseBody self = new GetNumberLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNumberLocationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNumberLocationResponseBody setData(GetNumberLocationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNumberLocationResponseBodyData getData() {
        return this.data;
    }

    public GetNumberLocationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNumberLocationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNumberLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNumberLocationResponseBodyData extends TeaModel {
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>1312121****</p>
         */
        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        public static GetNumberLocationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNumberLocationResponseBodyData self = new GetNumberLocationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNumberLocationResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetNumberLocationResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetNumberLocationResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
