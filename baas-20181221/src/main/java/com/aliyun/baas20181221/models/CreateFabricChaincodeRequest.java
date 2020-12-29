// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChaincodeRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssUrl")
    public String ossUrl;

    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    @NameInMap("Location")
    public String location;

    public static CreateFabricChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChaincodeRequest self = new CreateFabricChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateFabricChaincodeRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateFabricChaincodeRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateFabricChaincodeRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreateFabricChaincodeRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public CreateFabricChaincodeRequest setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
        return this;
    }
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public CreateFabricChaincodeRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
