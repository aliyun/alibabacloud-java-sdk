// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizMetricByNameRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizMetricByNameQuery")
    public GetBizMetricByNameRequestBizMetricByNameQuery bizMetricByNameQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetBizMetricByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBizMetricByNameRequest self = new GetBizMetricByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetBizMetricByNameRequest setBizMetricByNameQuery(GetBizMetricByNameRequestBizMetricByNameQuery bizMetricByNameQuery) {
        this.bizMetricByNameQuery = bizMetricByNameQuery;
        return this;
    }
    public GetBizMetricByNameRequestBizMetricByNameQuery getBizMetricByNameQuery() {
        return this.bizMetricByNameQuery;
    }

    public GetBizMetricByNameRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetBizMetricByNameRequestBizMetricByNameQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Draft")
        public Boolean draft;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric1</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetBizMetricByNameRequestBizMetricByNameQuery build(java.util.Map<String, ?> map) throws Exception {
            GetBizMetricByNameRequestBizMetricByNameQuery self = new GetBizMetricByNameRequestBizMetricByNameQuery();
            return TeaModel.build(map, self);
        }

        public GetBizMetricByNameRequestBizMetricByNameQuery setDraft(Boolean draft) {
            this.draft = draft;
            return this;
        }
        public Boolean getDraft() {
            return this.draft;
        }

        public GetBizMetricByNameRequestBizMetricByNameQuery setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
