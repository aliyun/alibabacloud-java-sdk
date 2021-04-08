// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoTraceRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("FileUid")
    public String fileUid;

    @NameInMap("userInfoList")
    public String userInfoList;

    @NameInMap("FileType")
    public String fileType;

    public static GetVideoTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTraceRequest self = new GetVideoTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoTraceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetVideoTraceRequest setFileUid(String fileUid) {
        this.fileUid = fileUid;
        return this;
    }
    public String getFileUid() {
        return this.fileUid;
    }

    public GetVideoTraceRequest setUserInfoList(String userInfoList) {
        this.userInfoList = userInfoList;
        return this;
    }
    public String getUserInfoList() {
        return this.userInfoList;
    }

    public GetVideoTraceRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
