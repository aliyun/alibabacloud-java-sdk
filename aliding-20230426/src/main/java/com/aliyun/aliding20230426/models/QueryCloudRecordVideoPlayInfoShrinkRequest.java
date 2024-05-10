// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoPlayInfoShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConferenceId")
    public String conferenceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryCloudRecordVideoPlayInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoPlayInfoShrinkRequest self = new QueryCloudRecordVideoPlayInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoPlayInfoShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public QueryCloudRecordVideoPlayInfoShrinkRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public QueryCloudRecordVideoPlayInfoShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryCloudRecordVideoPlayInfoShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
