// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class GetResourceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resource")
    public GetResourceResponseBodyResource resource;

    public static GetResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceResponseBody self = new GetResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceResponseBody setResource(GetResourceResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetResourceResponseBodyResource getResource() {
        return this.resource;
    }

    public static class GetResourceResponseBodyResource extends TeaModel {
        @NameInMap("productCode")
        public String productCode;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("resourceAttributes")
        public String resourceAttributes;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceTypeCode")
        public String resourceTypeCode;

        public static GetResourceResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetResourceResponseBodyResource self = new GetResourceResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetResourceResponseBodyResource setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetResourceResponseBodyResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetResourceResponseBodyResource setResourceAttributes(String resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public String getResourceAttributes() {
            return this.resourceAttributes;
        }

        public GetResourceResponseBodyResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetResourceResponseBodyResource setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

    }

}
