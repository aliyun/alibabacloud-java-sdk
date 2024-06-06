// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetReductionProposalResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetReductionProposalResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetReductionProposalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReductionProposalResponseBody self = new GetReductionProposalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReductionProposalResponseBody setData(GetReductionProposalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetReductionProposalResponseBodyData getData() {
        return this.data;
    }

    public GetReductionProposalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetReductionProposalResponseBodyData extends TeaModel {
        /**
         * <p>Proactive carbon reduction recommendations and advice.</p>
         */
        @NameInMap("reduction")
        public String reduction;

        /**
         * <p>Active carbon reduction assessment.</p>
         */
        @NameInMap("reductionEvaluation")
        public String reductionEvaluation;

        public static GetReductionProposalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetReductionProposalResponseBodyData self = new GetReductionProposalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetReductionProposalResponseBodyData setReduction(String reduction) {
            this.reduction = reduction;
            return this;
        }
        public String getReduction() {
            return this.reduction;
        }

        public GetReductionProposalResponseBodyData setReductionEvaluation(String reductionEvaluation) {
            this.reductionEvaluation = reductionEvaluation;
            return this;
        }
        public String getReductionEvaluation() {
            return this.reductionEvaluation;
        }

    }

}
