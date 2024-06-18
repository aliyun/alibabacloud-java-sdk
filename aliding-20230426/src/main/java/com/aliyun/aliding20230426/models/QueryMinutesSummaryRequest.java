// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesSummaryRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryMinutesSummaryRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    @NameInMap("summaryTypeList")
    public java.util.List<String> summaryTypeList;

    public static QueryMinutesSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesSummaryRequest self = new QueryMinutesSummaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryMinutesSummaryRequest setTenantContext(QueryMinutesSummaryRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryMinutesSummaryRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryMinutesSummaryRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public QueryMinutesSummaryRequest setSummaryTypeList(java.util.List<String> summaryTypeList) {
        this.summaryTypeList = summaryTypeList;
        return this;
    }
    public java.util.List<String> getSummaryTypeList() {
        return this.summaryTypeList;
    }

    public static class QueryMinutesSummaryRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryMinutesSummaryRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesSummaryRequestTenantContext self = new QueryMinutesSummaryRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryMinutesSummaryRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
