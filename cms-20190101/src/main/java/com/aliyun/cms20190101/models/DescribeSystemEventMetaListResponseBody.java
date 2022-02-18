// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventMetaListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeSystemEventMetaListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSystemEventMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventMetaListResponseBody self = new DescribeSystemEventMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventMetaListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSystemEventMetaListResponseBody setData(DescribeSystemEventMetaListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSystemEventMetaListResponseBodyData getData() {
        return this.data;
    }

    public DescribeSystemEventMetaListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSystemEventMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemEventMetaListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSystemEventMetaListResponseBodyDataResource extends TeaModel {
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Level")
        public String level;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameDesc")
        public String nameDesc;

        @NameInMap("NameDesc.En")
        public String nameDesc_en;

        @NameInMap("Product")
        public String product;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusDesc")
        public String statusDesc;

        public static DescribeSystemEventMetaListResponseBodyDataResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventMetaListResponseBodyDataResource self = new DescribeSystemEventMetaListResponseBodyDataResource();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setNameDesc(String nameDesc) {
            this.nameDesc = nameDesc;
            return this;
        }
        public String getNameDesc() {
            return this.nameDesc;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setNameDesc_en(String nameDesc_en) {
            this.nameDesc_en = nameDesc_en;
            return this;
        }
        public String getNameDesc_en() {
            return this.nameDesc_en;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSystemEventMetaListResponseBodyDataResource setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

    public static class DescribeSystemEventMetaListResponseBodyData extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeSystemEventMetaListResponseBodyDataResource> resource;

        public static DescribeSystemEventMetaListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventMetaListResponseBodyData self = new DescribeSystemEventMetaListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventMetaListResponseBodyData setResource(java.util.List<DescribeSystemEventMetaListResponseBodyDataResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeSystemEventMetaListResponseBodyDataResource> getResource() {
            return this.resource;
        }

    }

}
