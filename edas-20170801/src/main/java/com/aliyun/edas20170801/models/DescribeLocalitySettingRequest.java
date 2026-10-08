// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeLocalitySettingRequest extends TeaModel {
    /**
     * <p>The ID of the application. To obtain the application ID, call the ListApplication operation. For more information, see <a href="https://help.aliyun.com/document_detail/423162.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc190221-22b5-491c-a548-82f5fa1e3e26</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the microservices namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    public static DescribeLocalitySettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalitySettingRequest self = new DescribeLocalitySettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLocalitySettingRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeLocalitySettingRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DescribeLocalitySettingRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
