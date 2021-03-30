// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class AddApListToApgroupShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("ApMacList")
    public String apMacListShrink;

    @NameInMap("ApGroupId")
    public String apGroupId;

    public static AddApListToApgroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddApListToApgroupShrinkRequest self = new AddApListToApgroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddApListToApgroupShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddApListToApgroupShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public AddApListToApgroupShrinkRequest setApMacListShrink(String apMacListShrink) {
        this.apMacListShrink = apMacListShrink;
        return this;
    }
    public String getApMacListShrink() {
        return this.apMacListShrink;
    }

    public AddApListToApgroupShrinkRequest setApGroupId(String apGroupId) {
        this.apGroupId = apGroupId;
        return this;
    }
    public String getApGroupId() {
        return this.apGroupId;
    }

}
