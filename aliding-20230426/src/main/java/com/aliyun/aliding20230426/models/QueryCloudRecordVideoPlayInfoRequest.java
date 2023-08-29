// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoPlayInfoRequest extends TeaModel {
    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TenantContext")
    public QueryCloudRecordVideoPlayInfoRequestTenantContext tenantContext;

    public static QueryCloudRecordVideoPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoPlayInfoRequest self = new QueryCloudRecordVideoPlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoPlayInfoRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public QueryCloudRecordVideoPlayInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public QueryCloudRecordVideoPlayInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryCloudRecordVideoPlayInfoRequest setTenantContext(QueryCloudRecordVideoPlayInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryCloudRecordVideoPlayInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryCloudRecordVideoPlayInfoRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryCloudRecordVideoPlayInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordVideoPlayInfoRequestTenantContext self = new QueryCloudRecordVideoPlayInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordVideoPlayInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
