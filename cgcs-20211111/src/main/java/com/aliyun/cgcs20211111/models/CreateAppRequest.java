// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppType")
    public String appType;

    @NameInMap("StreamingAppId")
    public String streamingAppId;

    @NameInMap("StreamingSolution")
    public String streamingSolution;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateAppRequest setStreamingAppId(String streamingAppId) {
        this.streamingAppId = streamingAppId;
        return this;
    }
    public String getStreamingAppId() {
        return this.streamingAppId;
    }

    public CreateAppRequest setStreamingSolution(String streamingSolution) {
        this.streamingSolution = streamingSolution;
        return this;
    }
    public String getStreamingSolution() {
        return this.streamingSolution;
    }

}
