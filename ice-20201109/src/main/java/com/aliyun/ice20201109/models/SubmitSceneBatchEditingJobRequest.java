// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneBatchEditingJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;MediaURL&quot;: &quot;<a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://test-bucket.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
     *   &quot;Width&quot;: 1080,
     *   &quot;Height&quot;: 1920
     * }</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****ae91539d46bb9000f74b40b80dd2,****ae91539000f74b40b80dd9d46bb</p>
     */
    @NameInMap("ProjectIds")
    public String projectIds;

    @NameInMap("UserData")
    public String userData;

    public static SubmitSceneBatchEditingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSceneBatchEditingJobRequest self = new SubmitSceneBatchEditingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSceneBatchEditingJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSceneBatchEditingJobRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

    public SubmitSceneBatchEditingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
