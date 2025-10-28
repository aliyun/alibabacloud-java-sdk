// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListDeployGroupRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListDeployGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeployGroupRequest self = new ListDeployGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListDeployGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
