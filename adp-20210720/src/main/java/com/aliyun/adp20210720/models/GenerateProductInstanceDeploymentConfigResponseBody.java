// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GenerateProductInstanceDeploymentConfigResponseBody extends TeaModel {
    @NameInMap("data")
    public GenerateProductInstanceDeploymentConfigResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static GenerateProductInstanceDeploymentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateProductInstanceDeploymentConfigResponseBody self = new GenerateProductInstanceDeploymentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateProductInstanceDeploymentConfigResponseBody setData(GenerateProductInstanceDeploymentConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateProductInstanceDeploymentConfigResponseBodyData getData() {
        return this.data;
    }

    public GenerateProductInstanceDeploymentConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateProductInstanceDeploymentConfigResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GenerateProductInstanceDeploymentConfigResponseBodyData extends TeaModel {
        @NameInMap("packageConfig")
        public String packageConfig;

        public static GenerateProductInstanceDeploymentConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateProductInstanceDeploymentConfigResponseBodyData self = new GenerateProductInstanceDeploymentConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateProductInstanceDeploymentConfigResponseBodyData setPackageConfig(String packageConfig) {
            this.packageConfig = packageConfig;
            return this;
        }
        public String getPackageConfig() {
            return this.packageConfig;
        }

    }

}
