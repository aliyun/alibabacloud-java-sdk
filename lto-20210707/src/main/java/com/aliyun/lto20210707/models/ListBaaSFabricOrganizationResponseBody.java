// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricOrganizationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBaaSFabricOrganizationResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBaaSFabricOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricOrganizationResponseBody self = new ListBaaSFabricOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricOrganizationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBaaSFabricOrganizationResponseBody setData(java.util.List<ListBaaSFabricOrganizationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBaaSFabricOrganizationResponseBodyData> getData() {
        return this.data;
    }

    public ListBaaSFabricOrganizationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaaSFabricOrganizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBaaSFabricOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaaSFabricOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaaSFabricOrganizationResponseBodyData extends TeaModel {
        @NameInMap("BaaSFabricOrganizationId")
        public String baaSFabricOrganizationId;

        @NameInMap("BaaSFabricOrganizationName")
        public String baaSFabricOrganizationName;

        public static ListBaaSFabricOrganizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaaSFabricOrganizationResponseBodyData self = new ListBaaSFabricOrganizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaaSFabricOrganizationResponseBodyData setBaaSFabricOrganizationId(String baaSFabricOrganizationId) {
            this.baaSFabricOrganizationId = baaSFabricOrganizationId;
            return this;
        }
        public String getBaaSFabricOrganizationId() {
            return this.baaSFabricOrganizationId;
        }

        public ListBaaSFabricOrganizationResponseBodyData setBaaSFabricOrganizationName(String baaSFabricOrganizationName) {
            this.baaSFabricOrganizationName = baaSFabricOrganizationName;
            return this;
        }
        public String getBaaSFabricOrganizationName() {
            return this.baaSFabricOrganizationName;
        }

    }

}
