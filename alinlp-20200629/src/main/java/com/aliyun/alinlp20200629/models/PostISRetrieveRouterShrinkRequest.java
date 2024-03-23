// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostISRetrieveRouterShrinkRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Input")
    public String inputShrink;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("Version")
    public String version;

    public static PostISRetrieveRouterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PostISRetrieveRouterShrinkRequest self = new PostISRetrieveRouterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PostISRetrieveRouterShrinkRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public PostISRetrieveRouterShrinkRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public PostISRetrieveRouterShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public PostISRetrieveRouterShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public PostISRetrieveRouterShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
