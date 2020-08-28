// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("Resources")
    @Validation(required = true)
    public DescribeProjectMetaResponseResources resources;

    public static DescribeProjectMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaResponse self = new DescribeProjectMetaResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeProjectMetaResponseResourcesResource extends TeaModel {
        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Labels")
        @Validation(required = true)
        public String labels;

        public static DescribeProjectMetaResponseResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectMetaResponseResourcesResource self = new DescribeProjectMetaResponseResourcesResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeProjectMetaResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeProjectMetaResponseResourcesResource> resource;

        public static DescribeProjectMetaResponseResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectMetaResponseResources self = new DescribeProjectMetaResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
