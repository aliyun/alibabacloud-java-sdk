// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListUpdateImageAppRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("ImageUid")
    public String imageUid;

    public static ListUpdateImageAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUpdateImageAppRequest self = new ListUpdateImageAppRequest();
        return TeaModel.build(map, self);
    }

    public ListUpdateImageAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListUpdateImageAppRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public ListUpdateImageAppRequest setImageUid(String imageUid) {
        this.imageUid = imageUid;
        return this;
    }
    public String getImageUid() {
        return this.imageUid;
    }

}
