// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateOnlineTestRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>VideoModeration</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxxxx.com/data/data.png">https://xxxxxxxxxx.com/data/data.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static CreateOnlineTestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineTestRequest self = new CreateOnlineTestRequest();
        return TeaModel.build(map, self);
    }

    public CreateOnlineTestRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CreateOnlineTestRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateOnlineTestRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreateOnlineTestRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
