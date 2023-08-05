// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushCommondToClientRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Arg1")
    public String arg1;

    @NameInMap("Arg2")
    public String arg2;

    @NameInMap("Arg3")
    public String arg3;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("Uuid")
    public String uuid;

    public static PushCommondToClientRequest build(java.util.Map<String, ?> map) throws Exception {
        PushCommondToClientRequest self = new PushCommondToClientRequest();
        return TeaModel.build(map, self);
    }

    public PushCommondToClientRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PushCommondToClientRequest setArg1(String arg1) {
        this.arg1 = arg1;
        return this;
    }
    public String getArg1() {
        return this.arg1;
    }

    public PushCommondToClientRequest setArg2(String arg2) {
        this.arg2 = arg2;
        return this;
    }
    public String getArg2() {
        return this.arg2;
    }

    public PushCommondToClientRequest setArg3(String arg3) {
        this.arg3 = arg3;
        return this;
    }
    public String getArg3() {
        return this.arg3;
    }

    public PushCommondToClientRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public PushCommondToClientRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
