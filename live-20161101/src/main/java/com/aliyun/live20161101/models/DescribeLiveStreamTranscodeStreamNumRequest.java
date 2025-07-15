// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeStreamNumRequest extends TeaModel {
    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The grouping method.</p>
     * <ul>
     * <li>Domain name (default)</li>
     * <li>Template</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>domain</li>
     * <li>template</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("SplitType")
    public String splitType;

    public static DescribeLiveStreamTranscodeStreamNumRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeStreamNumRequest self = new DescribeLiveStreamTranscodeStreamNumRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeStreamNumRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamTranscodeStreamNumRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamTranscodeStreamNumRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamTranscodeStreamNumRequest setSplitType(String splitType) {
        this.splitType = splitType;
        return this;
    }
    public String getSplitType() {
        return this.splitType;
    }

}
