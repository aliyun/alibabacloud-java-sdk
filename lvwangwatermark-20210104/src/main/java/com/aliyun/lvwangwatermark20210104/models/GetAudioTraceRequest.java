// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioTraceRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("FileUid")
    public String fileUid;

    @NameInMap("userInfoList")
    public String userInfoList;

    public static GetAudioTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioTraceRequest self = new GetAudioTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioTraceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public GetAudioTraceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAudioTraceRequest setFileUid(String fileUid) {
        this.fileUid = fileUid;
        return this;
    }
    public String getFileUid() {
        return this.fileUid;
    }

    public GetAudioTraceRequest setUserInfoList(String userInfoList) {
        this.userInfoList = userInfoList;
        return this;
    }
    public String getUserInfoList() {
        return this.userInfoList;
    }

}
