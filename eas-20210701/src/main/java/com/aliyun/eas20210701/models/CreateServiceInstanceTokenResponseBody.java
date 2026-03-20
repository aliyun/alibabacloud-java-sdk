// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceInstanceTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("StreamlogUrl")
    public String streamlogUrl;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("WorkbenchUrl")
    public String workbenchUrl;

    public static CreateServiceInstanceTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceInstanceTokenResponseBody self = new CreateServiceInstanceTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceInstanceTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceInstanceTokenResponseBody setStreamlogUrl(String streamlogUrl) {
        this.streamlogUrl = streamlogUrl;
        return this;
    }
    public String getStreamlogUrl() {
        return this.streamlogUrl;
    }

    public CreateServiceInstanceTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateServiceInstanceTokenResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateServiceInstanceTokenResponseBody setWorkbenchUrl(String workbenchUrl) {
        this.workbenchUrl = workbenchUrl;
        return this;
    }
    public String getWorkbenchUrl() {
        return this.workbenchUrl;
    }

}
