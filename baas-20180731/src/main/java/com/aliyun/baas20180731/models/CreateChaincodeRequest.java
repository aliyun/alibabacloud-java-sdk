// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateChaincodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chan-first-channel-1w55v3u39x2xz</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>consortium-aaaaaa-akpcsjjac2jd</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <strong>example:</strong>
     * <p>OR (\&quot;aaaaaa1MSP.peer\&quot;)</p>
     */
    @NameInMap("EndorsePolicy")
    public String endorsePolicy;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa1-1oxw31d046jtl</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://chaincode.oss-cn-beijing.aliyuncs.com">https://chaincode.oss-cn-beijing.aliyuncs.com</a></p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaaaaa1/a0cf8729-7d47-44c9-9ed5-6d2fdfc8dc2c/sacc.cc</p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    public static CreateChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChaincodeRequest self = new CreateChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateChaincodeRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateChaincodeRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateChaincodeRequest setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
        return this;
    }
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public CreateChaincodeRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateChaincodeRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreateChaincodeRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

}
