// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StartPipelineRunRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;branchModeBranchs&quot;:[         &quot;branch1&quot;,         &quot;branch2&quot;     ],     &quot;envs&quot;:{         &quot;k1&quot;:&quot;v1&quot;,         &quot;k2&quot;:&quot;v2&quot;,         &quot;k3&quot;:&quot;v3&quot;     },     &quot;runningBranchs&quot;:{         &quot;<a href="https://codeup.aliyun.com/60c1abb32c5969c370c5fcd0/Codeup-Demo.git%22:%22master1">https://codeup.aliyun.com/60c1abb32c5969c370c5fcd0/Codeup-Demo.git&quot;:&quot;master1</a>&quot;     },     &quot;runningTags&quot;:{         &quot;<a href="https://codeup.aliyun.com/60c1abb32c5969c370c5fcd0/Codeup-Demo.git%22:%221.0">https://codeup.aliyun.com/60c1abb32c5969c370c5fcd0/Codeup-Demo.git&quot;:&quot;1.0</a>&quot;     } }</p>
     */
    @NameInMap("params")
    public String params;

    public static StartPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPipelineRunRequest self = new StartPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public StartPipelineRunRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
