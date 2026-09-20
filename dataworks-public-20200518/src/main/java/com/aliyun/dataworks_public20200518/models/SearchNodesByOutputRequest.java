// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchNodesByOutputRequest extends TeaModel {
    /**
     * <p>The output strings of the node. You can specify multiple values. Separate multiple values with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaaaa.1231412_out,bbbb.12313123_out</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <p>The environment identifier in Operation Center. Valid values:</p>
     * <ul>
     * <li>PROD: production environment.</li>
     * <li>DEV: development environment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static SearchNodesByOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchNodesByOutputRequest self = new SearchNodesByOutputRequest();
        return TeaModel.build(map, self);
    }

    public SearchNodesByOutputRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public SearchNodesByOutputRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
