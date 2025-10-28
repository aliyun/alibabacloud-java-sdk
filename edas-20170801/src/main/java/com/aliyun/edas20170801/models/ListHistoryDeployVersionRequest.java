// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListHistoryDeployVersionRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListHistoryDeployVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryDeployVersionRequest self = new ListHistoryDeployVersionRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoryDeployVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
