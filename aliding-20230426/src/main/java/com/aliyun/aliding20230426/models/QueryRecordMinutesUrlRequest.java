// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryRecordMinutesUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>minutes</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1dddwrqrq</p>
     */
    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("TenantContext")
    public QueryRecordMinutesUrlRequestTenantContext tenantContext;

    public static QueryRecordMinutesUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordMinutesUrlRequest self = new QueryRecordMinutesUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordMinutesUrlRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryRecordMinutesUrlRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public QueryRecordMinutesUrlRequest setTenantContext(QueryRecordMinutesUrlRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryRecordMinutesUrlRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryRecordMinutesUrlRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryRecordMinutesUrlRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordMinutesUrlRequestTenantContext self = new QueryRecordMinutesUrlRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryRecordMinutesUrlRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
