// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateOnlineTestRequest extends TeaModel {
    /**
     * <p>The data ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f27b8cc7c4544cb90b41882a5b36326</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The resource type. Valid values: voice (audio), image (image), file (document), text (text), and video (video).</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The service code. Specify a valid service code. The valid service code for online video testing is videoDetection. VideoModeration is not a valid value and returns a 406 online.test.failed error.</p>
     * 
     * <strong>example:</strong>
     * <p>videoDetection</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The detection URL.</p>
     * 
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
