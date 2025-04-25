// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeUserSpnSummaryInfoRequest extends TeaModel {
    @NameInMap("EcIdAccountIds")
    public java.util.List<DescribeUserSpnSummaryInfoRequestEcIdAccountIds> ecIdAccountIds;

    @NameInMap("Nbid")
    public String nbid;

    public static DescribeUserSpnSummaryInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSpnSummaryInfoRequest self = new DescribeUserSpnSummaryInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserSpnSummaryInfoRequest setEcIdAccountIds(java.util.List<DescribeUserSpnSummaryInfoRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<DescribeUserSpnSummaryInfoRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public DescribeUserSpnSummaryInfoRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public static class DescribeUserSpnSummaryInfoRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static DescribeUserSpnSummaryInfoRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserSpnSummaryInfoRequestEcIdAccountIds self = new DescribeUserSpnSummaryInfoRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public DescribeUserSpnSummaryInfoRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public DescribeUserSpnSummaryInfoRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
