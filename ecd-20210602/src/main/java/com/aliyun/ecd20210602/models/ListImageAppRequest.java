// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListImageAppRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("ImageUid")
    public String imageUid;

    public static ListImageAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageAppRequest self = new ListImageAppRequest();
        return TeaModel.build(map, self);
    }

    public ListImageAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListImageAppRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public ListImageAppRequest setImageUid(String imageUid) {
        this.imageUid = imageUid;
        return this;
    }
    public String getImageUid() {
        return this.imageUid;
    }

}
