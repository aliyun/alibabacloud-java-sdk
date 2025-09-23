// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationVariables4FailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetApplicationVariables4FailResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BFB7F5C8-FE7A-06CA-9F87-ABBF6B848F0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationVariables4FailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationVariables4FailResponseBody self = new GetApplicationVariables4FailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationVariables4FailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApplicationVariables4FailResponseBody setData(java.util.List<GetApplicationVariables4FailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetApplicationVariables4FailResponseBodyData> getData() {
        return this.data;
    }

    public GetApplicationVariables4FailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationVariables4FailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationVariables4FailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>instance_name</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>cadt-app-01</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>${name}</p>
         */
        @NameInMap("PlaceHolder")
        public String placeHolder;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>cadt-app-01</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>${name}</p>
         */
        @NameInMap("Variable")
        public String variable;

        public static GetApplicationVariables4FailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationVariables4FailResponseBodyData self = new GetApplicationVariables4FailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationVariables4FailResponseBodyData setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public GetApplicationVariables4FailResponseBodyData setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetApplicationVariables4FailResponseBodyData setPlaceHolder(String placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public GetApplicationVariables4FailResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetApplicationVariables4FailResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetApplicationVariables4FailResponseBodyData setVariable(String variable) {
            this.variable = variable;
            return this;
        }
        public String getVariable() {
            return this.variable;
        }

    }

}
