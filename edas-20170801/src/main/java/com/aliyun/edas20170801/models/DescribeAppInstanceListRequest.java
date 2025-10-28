// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeAppInstanceListRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the ID of the application. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93fdd228-*****-ed2ae98de18d</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to return the information about the node in which the pod resides.</p>
     * <ul>
     * <li><code>true</code>: returns the information about the node in which the pod resides</li>
     * <li><code>false</code>: does not return the information about the node in which the pod resides</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithNodeInfo")
    public Boolean withNodeInfo;

    public static DescribeAppInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstanceListRequest self = new DescribeAppInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstanceListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppInstanceListRequest setWithNodeInfo(Boolean withNodeInfo) {
        this.withNodeInfo = withNodeInfo;
        return this;
    }
    public Boolean getWithNodeInfo() {
        return this.withNodeInfo;
    }

}
