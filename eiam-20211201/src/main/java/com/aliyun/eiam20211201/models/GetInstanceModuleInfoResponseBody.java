// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceModuleInfoResponseBody extends TeaModel {
    @NameInMap("Module")
    public GetInstanceModuleInfoResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceModuleInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceModuleInfoResponseBody self = new GetInstanceModuleInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceModuleInfoResponseBody setModule(GetInstanceModuleInfoResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetInstanceModuleInfoResponseBodyModule getModule() {
        return this.module;
    }

    public GetInstanceModuleInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceModuleInfoResponseBodyModuleFeatures extends TeaModel {
        /**
         * <p>二级模块标识</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:license:module:application:standard:oidc</p>
         */
        @NameInMap("FeatureKey")
        public String featureKey;

        /**
         * <p>二级模块状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("FeatureStatus")
        public String featureStatus;

        public static GetInstanceModuleInfoResponseBodyModuleFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceModuleInfoResponseBodyModuleFeatures self = new GetInstanceModuleInfoResponseBodyModuleFeatures();
            return TeaModel.build(map, self);
        }

        public GetInstanceModuleInfoResponseBodyModuleFeatures setFeatureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }
        public String getFeatureKey() {
            return this.featureKey;
        }

        public GetInstanceModuleInfoResponseBodyModuleFeatures setFeatureStatus(String featureStatus) {
            this.featureStatus = featureStatus;
            return this;
        }
        public String getFeatureStatus() {
            return this.featureStatus;
        }

    }

    public static class GetInstanceModuleInfoResponseBodyModule extends TeaModel {
        /**
         * <p>二级模块信息</p>
         */
        @NameInMap("Features")
        public java.util.List<GetInstanceModuleInfoResponseBodyModuleFeatures> features;

        /**
         * <p>模块状态</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:license:module:application</p>
         */
        @NameInMap("ModuleKey")
        public String moduleKey;

        /**
         * <p>一级模块状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ModuleStatus")
        public String moduleStatus;

        public static GetInstanceModuleInfoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceModuleInfoResponseBodyModule self = new GetInstanceModuleInfoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetInstanceModuleInfoResponseBodyModule setFeatures(java.util.List<GetInstanceModuleInfoResponseBodyModuleFeatures> features) {
            this.features = features;
            return this;
        }
        public java.util.List<GetInstanceModuleInfoResponseBodyModuleFeatures> getFeatures() {
            return this.features;
        }

        public GetInstanceModuleInfoResponseBodyModule setModuleKey(String moduleKey) {
            this.moduleKey = moduleKey;
            return this;
        }
        public String getModuleKey() {
            return this.moduleKey;
        }

        public GetInstanceModuleInfoResponseBodyModule setModuleStatus(String moduleStatus) {
            this.moduleStatus = moduleStatus;
            return this;
        }
        public String getModuleStatus() {
            return this.moduleStatus;
        }

    }

}
