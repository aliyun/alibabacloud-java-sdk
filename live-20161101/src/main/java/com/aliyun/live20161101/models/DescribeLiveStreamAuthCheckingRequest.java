// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamAuthCheckingRequest extends TeaModel {
    /**
     * <p>The ingest domain or streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The complete ingest URL or streaming URL. You can use the <a href="https://help.aliyun.com/document_detail/197400.html">URL generator</a> to generate a URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/live/test.flv?auth_key=1664248">http://example.com/live/test.flv?auth_key=1664248</a>******</p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeLiveStreamAuthCheckingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamAuthCheckingRequest self = new DescribeLiveStreamAuthCheckingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamAuthCheckingRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamAuthCheckingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamAuthCheckingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamAuthCheckingRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
