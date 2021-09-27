// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductEnvironmentsRequest extends TeaModel {
    @NameInMap("envType")
    public String envType;

    // 兼容版本产品版本id
    @NameInMap("compatibleProductVersionUID")
    public String compatibleProductVersionUID;

    @NameInMap("platforms")
    public java.util.List<ListProductEnvironmentsRequestPlatforms> platforms;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static ListProductEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvironmentsRequest self = new ListProductEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductEnvironmentsRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListProductEnvironmentsRequest setCompatibleProductVersionUID(String compatibleProductVersionUID) {
        this.compatibleProductVersionUID = compatibleProductVersionUID;
        return this;
    }
    public String getCompatibleProductVersionUID() {
        return this.compatibleProductVersionUID;
    }

    public ListProductEnvironmentsRequest setPlatforms(java.util.List<ListProductEnvironmentsRequestPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<ListProductEnvironmentsRequestPlatforms> getPlatforms() {
        return this.platforms;
    }

    public ListProductEnvironmentsRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static class ListProductEnvironmentsRequestPlatforms extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static ListProductEnvironmentsRequestPlatforms build(java.util.Map<String, ?> map) throws Exception {
            ListProductEnvironmentsRequestPlatforms self = new ListProductEnvironmentsRequestPlatforms();
            return TeaModel.build(map, self);
        }

        public ListProductEnvironmentsRequestPlatforms setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListProductEnvironmentsRequestPlatforms setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

}
