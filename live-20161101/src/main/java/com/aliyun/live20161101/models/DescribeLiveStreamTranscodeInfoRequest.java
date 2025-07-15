// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeInfoRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainTranscodeName")
    public String domainTranscodeName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLiveStreamTranscodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeInfoRequest self = new DescribeLiveStreamTranscodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamTranscodeInfoRequest setDomainTranscodeName(String domainTranscodeName) {
        this.domainTranscodeName = domainTranscodeName;
        return this;
    }
    public String getDomainTranscodeName() {
        return this.domainTranscodeName;
    }

    public DescribeLiveStreamTranscodeInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamTranscodeInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
