// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GenerateSceneKeyResponseBody extends TeaModel {
    /**
     * <p>The Agent Gateway endpoint, which includes the cluster offset mapping port. This parameter is returned only for desktop scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-agent-cn-hangzhou.wuyinggw.com:18008</p>
     */
    @NameInMap("BaseUrl")
    public String baseUrl;

    /**
     * <p>The expiration time of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-13T12:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The scenario access key.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scenario access URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://gw-example.cn-hangzhou.aigclinks.com:18008">https://gw-example.cn-hangzhou.aigclinks.com:18008</a></p>
     */
    @NameInMap("SceneUrl")
    public String sceneUrl;

    public static GenerateSceneKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateSceneKeyResponseBody self = new GenerateSceneKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateSceneKeyResponseBody setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public GenerateSceneKeyResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GenerateSceneKeyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GenerateSceneKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateSceneKeyResponseBody setSceneUrl(String sceneUrl) {
        this.sceneUrl = sceneUrl;
        return this;
    }
    public String getSceneUrl() {
        return this.sceneUrl;
    }

}
