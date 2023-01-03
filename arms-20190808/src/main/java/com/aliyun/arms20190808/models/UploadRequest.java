// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UploadRequest extends TeaModel {
    // The version of the SourceMap file.
    @NameInMap("Edition")
    public String edition;

    // The content of the SourceMap file.
    @NameInMap("File")
    public String file;

    // The name of the SourceMap file.
    @NameInMap("FileName")
    public String fileName;

    // The ID of the application.
    // 
    // Log on to the **ARMS console**. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d\*\*\*\*, you must replace %40 with @ to obtain eb4zdose6v@9781be0f44d\*\*\*\*.
    @NameInMap("Pid")
    public String pid;

    // The ID of the region to which the SourceMap file is uploaded.
    @NameInMap("RegionId")
    public String regionId;

    // We recommend that you do not specify this parameter.
    @NameInMap("Version")
    public String version;

    public static UploadRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRequest self = new UploadRequest();
        return TeaModel.build(map, self);
    }

    public UploadRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public UploadRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public UploadRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public UploadRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UploadRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
