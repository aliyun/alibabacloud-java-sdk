// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetServiceExtensionsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ServiceExtensions")
    public GetServiceExtensionsResponseBodyServiceExtensions serviceExtensions;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceExtensionsResponseBody self = new GetServiceExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceExtensionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceExtensionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetServiceExtensionsResponseBody setServiceExtensions(GetServiceExtensionsResponseBodyServiceExtensions serviceExtensions) {
        this.serviceExtensions = serviceExtensions;
        return this;
    }
    public GetServiceExtensionsResponseBodyServiceExtensions getServiceExtensions() {
        return this.serviceExtensions;
    }

    public GetServiceExtensionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceExtensionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("Name")
        public String name;

        public static GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension build(java.util.Map<String, ?> map) throws Exception {
            GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension self = new GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension();
            return TeaModel.build(map, self);
        }

        public GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetServiceExtensionsResponseBodyServiceExtensions extends TeaModel {
        @NameInMap("ServiceExtension")
        public java.util.List<GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension> serviceExtension;

        public static GetServiceExtensionsResponseBodyServiceExtensions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceExtensionsResponseBodyServiceExtensions self = new GetServiceExtensionsResponseBodyServiceExtensions();
            return TeaModel.build(map, self);
        }

        public GetServiceExtensionsResponseBodyServiceExtensions setServiceExtension(java.util.List<GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension> serviceExtension) {
            this.serviceExtension = serviceExtension;
            return this;
        }
        public java.util.List<GetServiceExtensionsResponseBodyServiceExtensionsServiceExtension> getServiceExtension() {
            return this.serviceExtension;
        }

    }

}
