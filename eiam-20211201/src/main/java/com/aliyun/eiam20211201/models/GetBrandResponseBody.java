// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetBrandResponseBody extends TeaModel {
    @NameInMap("Brand")
    public GetBrandResponseBodyBrand brand;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBrandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBrandResponseBody self = new GetBrandResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBrandResponseBody setBrand(GetBrandResponseBodyBrand brand) {
        this.brand = brand;
        return this;
    }
    public GetBrandResponseBodyBrand getBrand() {
        return this.brand;
    }

    public GetBrandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBrandResponseBodyBrand extends TeaModel {
        /**
         * <p>品牌ID</p>
         * 
         * <strong>example:</strong>
         * <p>brand_xxxx</p>
         */
        @NameInMap("BrandId")
        public String brandId;

        /**
         * <p>品牌名称</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Brand</p>
         */
        @NameInMap("BrandName")
        public String brandName;

        /**
         * <p>品牌类型</p>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("BrandType")
        public String brandType;

        /**
         * <p>实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>品牌状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetBrandResponseBodyBrand build(java.util.Map<String, ?> map) throws Exception {
            GetBrandResponseBodyBrand self = new GetBrandResponseBodyBrand();
            return TeaModel.build(map, self);
        }

        public GetBrandResponseBodyBrand setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }
        public String getBrandId() {
            return this.brandId;
        }

        public GetBrandResponseBodyBrand setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public GetBrandResponseBodyBrand setBrandType(String brandType) {
            this.brandType = brandType;
            return this;
        }
        public String getBrandType() {
            return this.brandType;
        }

        public GetBrandResponseBodyBrand setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetBrandResponseBodyBrand setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
