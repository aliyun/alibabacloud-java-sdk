// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateImageBuildResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>build-****ks92</p>
     */
    @NameInMap("ImageBuildId")
    public String imageBuildId;

    /**
     * <strong>example:</strong>
     * <p>dlc-****ks92</p>
     */
    @NameInMap("ImageBuildJobId")
    public String imageBuildJobId;

    public static CreateImageBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageBuildResponseBody self = new CreateImageBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageBuildResponseBody setImageBuildId(String imageBuildId) {
        this.imageBuildId = imageBuildId;
        return this;
    }
    public String getImageBuildId() {
        return this.imageBuildId;
    }

    public CreateImageBuildResponseBody setImageBuildJobId(String imageBuildJobId) {
        this.imageBuildJobId = imageBuildJobId;
        return this;
    }
    public String getImageBuildJobId() {
        return this.imageBuildJobId;
    }

}
