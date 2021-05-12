// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductEnvironmentsRequest extends TeaModel {
    @NameInMap("productUID")
    public String productUID;

    @NameInMap("envType")
    public String envType;

    @NameInMap("platforms")
    public java.util.List<GetProductEnvironmentsRequestPlatforms> platforms;

    public static GetProductEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductEnvironmentsRequest self = new GetProductEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public GetProductEnvironmentsRequest setProductUID(String productUID) {
        this.productUID = productUID;
        return this;
    }
    public String getProductUID() {
        return this.productUID;
    }

    public GetProductEnvironmentsRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public GetProductEnvironmentsRequest setPlatforms(java.util.List<GetProductEnvironmentsRequestPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<GetProductEnvironmentsRequestPlatforms> getPlatforms() {
        return this.platforms;
    }

    public static class GetProductEnvironmentsRequestPlatforms extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static GetProductEnvironmentsRequestPlatforms build(java.util.Map<String, ?> map) throws Exception {
            GetProductEnvironmentsRequestPlatforms self = new GetProductEnvironmentsRequestPlatforms();
            return TeaModel.build(map, self);
        }

        public GetProductEnvironmentsRequestPlatforms setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetProductEnvironmentsRequestPlatforms setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

}
