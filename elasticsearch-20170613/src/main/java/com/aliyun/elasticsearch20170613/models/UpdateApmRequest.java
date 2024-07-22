// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateApmRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APMtest</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>es-cn-i7m2fsfhc001x****</p>
     */
    @NameInMap("outputES")
    public String outputES;

    /**
     * <strong>example:</strong>
     * <p>ESPassword****</p>
     */
    @NameInMap("outputESPassword")
    public String outputESPassword;

    /**
     * <strong>example:</strong>
     * <p>elastic</p>
     */
    @NameInMap("outputESUserName")
    public String outputESUserName;

    /**
     * <strong>example:</strong>
     * <p>AMPPassword****</p>
     */
    @NameInMap("token")
    public String token;

    public static UpdateApmRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApmRequest self = new UpdateApmRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApmRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApmRequest setOutputES(String outputES) {
        this.outputES = outputES;
        return this;
    }
    public String getOutputES() {
        return this.outputES;
    }

    public UpdateApmRequest setOutputESPassword(String outputESPassword) {
        this.outputESPassword = outputESPassword;
        return this;
    }
    public String getOutputESPassword() {
        return this.outputESPassword;
    }

    public UpdateApmRequest setOutputESUserName(String outputESUserName) {
        this.outputESUserName = outputESUserName;
        return this;
    }
    public String getOutputESUserName() {
        return this.outputESUserName;
    }

    public UpdateApmRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
