// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostISRetrieveRouterRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Input")
    public java.util.Map<String, ?> input;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("Version")
    public String version;

    public static PostISRetrieveRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        PostISRetrieveRouterRequest self = new PostISRetrieveRouterRequest();
        return TeaModel.build(map, self);
    }

    public PostISRetrieveRouterRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public PostISRetrieveRouterRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public PostISRetrieveRouterRequest setInput(java.util.Map<String, ?> input) {
        this.input = input;
        return this;
    }
    public java.util.Map<String, ?> getInput() {
        return this.input;
    }

    public PostISRetrieveRouterRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public PostISRetrieveRouterRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
