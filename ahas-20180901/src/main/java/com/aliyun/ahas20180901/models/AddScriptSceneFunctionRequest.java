// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddScriptSceneFunctionRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static AddScriptSceneFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddScriptSceneFunctionRequest self = new AddScriptSceneFunctionRequest();
        return TeaModel.build(map, self);
    }

    public AddScriptSceneFunctionRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public AddScriptSceneFunctionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddScriptSceneFunctionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
