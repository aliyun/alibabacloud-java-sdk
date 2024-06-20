// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryMinutesRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static QueryMinutesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesRequest self = new QueryMinutesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMinutesRequest setTenantContext(QueryMinutesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryMinutesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryMinutesRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class QueryMinutesRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryMinutesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesRequestTenantContext self = new QueryMinutesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryMinutesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
