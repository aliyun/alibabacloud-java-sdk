// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class UploadCommodityFileResponseBody extends TeaModel {
    @NameInMap("Data")
    public UploadCommodityFileResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UploadCommodityFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCommodityFileResponseBody self = new UploadCommodityFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCommodityFileResponseBody setData(UploadCommodityFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadCommodityFileResponseBodyData getData() {
        return this.data;
    }

    public UploadCommodityFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadCommodityFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadCommodityFileResponseBodyData extends TeaModel {
        @NameInMap("Resource")
        public String resource;

        @NameInMap("ResourceType")
        public String resourceType;

        public static UploadCommodityFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadCommodityFileResponseBodyData self = new UploadCommodityFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadCommodityFileResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public UploadCommodityFileResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
