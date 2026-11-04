// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdatePictureSearchAppRequest extends TeaModel {
    /**
     * <p>Instance ID of the image search application instance. You can call the <a href="206608">QueryPictureSearchApps</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e429560124b44b685095df81a27****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The description of the image search application instance.</p>
     * <p>The description can contain Chinese characters, uppercase and lowercase letters, digits, underscores (_), and hyphens (-). It can be up to 1,024 characters in length, and each Chinese character counts as two characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>以图搜图Demo2</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the image search application instance. </p>
     * <p>The name can contain Chinese characters, uppercase and lowercase letters, digits, underscores (_), and hyphens (-). It can be up to 64 characters in length, and each Chinese character counts as two characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>新以图搜图</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdatePictureSearchAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePictureSearchAppRequest self = new UpdatePictureSearchAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePictureSearchAppRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public UpdatePictureSearchAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePictureSearchAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
