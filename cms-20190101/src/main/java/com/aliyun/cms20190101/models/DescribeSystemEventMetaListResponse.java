// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventMetaListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeSystemEventMetaListResponseData data;

    public static DescribeSystemEventMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventMetaListResponse self = new DescribeSystemEventMetaListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSystemEventMetaListResponseDataResource extends TeaModel {
        @NameInMap("Product")
        @Validation(required = true)
        public String product;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("NameDesc")
        @Validation(required = true)
        public String nameDesc;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusDesc")
        @Validation(required = true)
        public String statusDesc;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        public static DescribeSystemEventMetaListResponseDataResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventMetaListResponseDataResource self = new DescribeSystemEventMetaListResponseDataResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSystemEventMetaListResponseData extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeSystemEventMetaListResponseDataResource> resource;

        public static DescribeSystemEventMetaListResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventMetaListResponseData self = new DescribeSystemEventMetaListResponseData();
            return TeaModel.build(map, self);
        }

    }

}
