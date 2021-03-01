// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListCSBGatewayResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListCSBGatewayResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    public static ListCSBGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCSBGatewayResponseBody self = new ListCSBGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCSBGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCSBGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCSBGatewayResponseBody setData(java.util.List<ListCSBGatewayResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCSBGatewayResponseBodyData> getData() {
        return this.data;
    }

    public ListCSBGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListCSBGatewayResponseBodyData extends TeaModel {
        @NameInMap("GatewayType")
        public String gatewayType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static ListCSBGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCSBGatewayResponseBodyData self = new ListCSBGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCSBGatewayResponseBodyData setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListCSBGatewayResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCSBGatewayResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
