// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewApgroupConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParentApgroupId")
    public String parentApgroupId;

    public static NewApgroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        NewApgroupConfigRequest self = new NewApgroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public NewApgroupConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public NewApgroupConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public NewApgroupConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NewApgroupConfigRequest setParentApgroupId(String parentApgroupId) {
        this.parentApgroupId = parentApgroupId;
        return this;
    }
    public String getParentApgroupId() {
        return this.parentApgroupId;
    }

}
