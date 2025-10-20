// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetLoginRedirectApplicationForBrandResponseBody extends TeaModel {
    @NameInMap("BrandLoginRedirectApplication")
    public GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication brandLoginRedirectApplication;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLoginRedirectApplicationForBrandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginRedirectApplicationForBrandResponseBody self = new GetLoginRedirectApplicationForBrandResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginRedirectApplicationForBrandResponseBody setBrandLoginRedirectApplication(GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication brandLoginRedirectApplication) {
        this.brandLoginRedirectApplication = brandLoginRedirectApplication;
        return this;
    }
    public GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication getBrandLoginRedirectApplication() {
        return this.brandLoginRedirectApplication;
    }

    public GetLoginRedirectApplicationForBrandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication extends TeaModel {
        /**
         * <p>应用ID</p>
         * 
         * <strong>example:</strong>
         * <p>app_xxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>品牌ID</p>
         * 
         * <strong>example:</strong>
         * <p>brand_xxxx</p>
         */
        @NameInMap("BrandId")
        public String brandId;

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication build(java.util.Map<String, ?> map) throws Exception {
            GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication self = new GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication();
            return TeaModel.build(map, self);
        }

        public GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }
        public String getBrandId() {
            return this.brandId;
        }

        public GetLoginRedirectApplicationForBrandResponseBodyBrandLoginRedirectApplication setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
