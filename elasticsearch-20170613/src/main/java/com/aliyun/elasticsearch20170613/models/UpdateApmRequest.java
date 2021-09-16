// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateApmRequest extends TeaModel {
    @NameInMap("outputES")
    public String outputES;

    @NameInMap("outputESUserName")
    public String outputESUserName;

    @NameInMap("outputESPassword")
    public String outputESPassword;

    @NameInMap("token")
    public String token;

    @NameInMap("yml")
    public String yml;

    public static UpdateApmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApmRequest self = new UpdateApmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApmRequest setOutputES(String outputES) {
        this.outputES = outputES;
        return this;
    }
    public String getOutputES() {
        return this.outputES;
    }

    public UpdateApmRequest setOutputESUserName(String outputESUserName) {
        this.outputESUserName = outputESUserName;
        return this;
    }
    public String getOutputESUserName() {
        return this.outputESUserName;
    }

    public UpdateApmRequest setOutputESPassword(String outputESPassword) {
        this.outputESPassword = outputESPassword;
        return this;
    }
    public String getOutputESPassword() {
        return this.outputESPassword;
    }

    public UpdateApmRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UpdateApmRequest setYml(String yml) {
        this.yml = yml;
        return this;
    }
    public String getYml() {
        return this.yml;
    }

}
