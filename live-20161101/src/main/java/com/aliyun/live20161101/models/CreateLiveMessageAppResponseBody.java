// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveMessageAppResponseBody extends TeaModel {
    /**
     * <p>The application ID. The ID is used in subsequent operations, such as joining a group.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The AppKey for authentication of this application.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The application signature. The signature is required when you use the interactive messaging SDK.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AppSign")
    public String appSign;

    /**
     * <p>The data center in which the interactive messaging application was created.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65EEDBEB-43FE-1E15-976F-3DDD753A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveMessageAppResponseBody self = new CreateLiveMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveMessageAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveMessageAppResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateLiveMessageAppResponseBody setAppSign(String appSign) {
        this.appSign = appSign;
        return this;
    }
    public String getAppSign() {
        return this.appSign;
    }

    public CreateLiveMessageAppResponseBody setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateLiveMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
