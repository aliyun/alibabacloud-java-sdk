// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4384****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>end_game</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>2022-04-06 02:00:00</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2022-04-06 02:00:00</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>47d0bd4d-8815-48a2-b783-6cbba89d****</p>
     */
    @NameInMap("StreamingAppId")
    public String streamingAppId;

    /**
     * <strong>example:</strong>
     * <p>self-have-streaming</p>
     */
    @NameInMap("StreamingSolution")
    public String streamingSolution;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VersionAdaptNum")
    public Long versionAdaptNum;

    /**
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("VersionTotalNum")
    public Long versionTotalNum;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppResponseBody setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetAppResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetAppResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setStreamingAppId(String streamingAppId) {
        this.streamingAppId = streamingAppId;
        return this;
    }
    public String getStreamingAppId() {
        return this.streamingAppId;
    }

    public GetAppResponseBody setStreamingSolution(String streamingSolution) {
        this.streamingSolution = streamingSolution;
        return this;
    }
    public String getStreamingSolution() {
        return this.streamingSolution;
    }

    public GetAppResponseBody setVersionAdaptNum(Long versionAdaptNum) {
        this.versionAdaptNum = versionAdaptNum;
        return this;
    }
    public Long getVersionAdaptNum() {
        return this.versionAdaptNum;
    }

    public GetAppResponseBody setVersionTotalNum(Long versionTotalNum) {
        this.versionTotalNum = versionTotalNum;
        return this;
    }
    public Long getVersionTotalNum() {
        return this.versionTotalNum;
    }

}
