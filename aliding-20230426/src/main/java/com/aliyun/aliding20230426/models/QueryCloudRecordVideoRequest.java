// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryCloudRecordVideoRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static QueryCloudRecordVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoRequest self = new QueryCloudRecordVideoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoRequest setTenantContext(QueryCloudRecordVideoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryCloudRecordVideoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryCloudRecordVideoRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class QueryCloudRecordVideoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryCloudRecordVideoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordVideoRequestTenantContext self = new QueryCloudRecordVideoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordVideoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
