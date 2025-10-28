// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateContainerRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e83acea6-****-47e1-96ae-c0e953772cdc</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The build package number of EDAS Container. You can obtain the build package number in the Build package number column in the EDAS Container release notes table. For more information, see <a href="https://help.aliyun.com/document_detail/92614.html">Release notes for EDAS Container</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("BuildPackId")
    public Integer buildPackId;

    public static UpdateContainerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerRequest self = new UpdateContainerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateContainerRequest setBuildPackId(Integer buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public Integer getBuildPackId() {
        return this.buildPackId;
    }

}
