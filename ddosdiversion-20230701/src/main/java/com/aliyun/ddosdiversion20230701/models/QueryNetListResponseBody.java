// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class QueryNetListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<QueryNetListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryNetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNetListResponseBody self = new QueryNetListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNetListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryNetListResponseBody setData(java.util.List<QueryNetListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryNetListResponseBodyData> getData() {
        return this.data;
    }

    public QueryNetListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryNetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh extends TeaModel {
        /**
         * <p>Mbps。</p>
         */
        @NameInMap("Mbps")
        public Integer mbps;

        /**
         * <p>Pps。</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        public static QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh build(java.util.Map<String, ?> map) throws Exception {
            QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh self = new QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh();
            return TeaModel.build(map, self);
        }

        public QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh setMbps(Integer mbps) {
            this.mbps = mbps;
            return this;
        }
        public Integer getMbps() {
            return this.mbps;
        }

        public QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

    }

    public static class QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy extends TeaModel {
        @NameInMap("PolicyName")
        public String policyName;

        public static QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy build(java.util.Map<String, ?> map) throws Exception {
            QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy self = new QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy();
            return TeaModel.build(map, self);
        }

        public QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class QueryNetListResponseBodyDataNetsDDoSDefenseHoleTh extends TeaModel {
        @NameInMap("ThreshMbps")
        public Integer threshMbps;

        public static QueryNetListResponseBodyDataNetsDDoSDefenseHoleTh build(java.util.Map<String, ?> map) throws Exception {
            QueryNetListResponseBodyDataNetsDDoSDefenseHoleTh self = new QueryNetListResponseBodyDataNetsDDoSDefenseHoleTh();
            return TeaModel.build(map, self);
        }

        public QueryNetListResponseBodyDataNetsDDoSDefenseHoleTh setThreshMbps(Integer threshMbps) {
            this.threshMbps = threshMbps;
            return this;
        }
        public Integer getThreshMbps() {
            return this.threshMbps;
        }

    }

    public static class QueryNetListResponseBodyDataNetsDDoSDefense extends TeaModel {
        @NameInMap("CleanTh")
        public QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh cleanTh;

        @NameInMap("DjPolicy")
        public QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy djPolicy;

        @NameInMap("HoleTh")
        public QueryNetListResponseBodyDataNetsDDoSDefenseHoleTh holeTh;

        public static QueryNetListResponseBodyDataNetsDDoSDefense build(java.util.Map<String, ?> map) throws Exception {
            QueryNetListResponseBodyDataNetsDDoSDefense self = new QueryNetListResponseBodyDataNetsDDoSDefense();
            return TeaModel.build(map, self);
        }

        public QueryNetListResponseBodyDataNetsDDoSDefense setCleanTh(QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh cleanTh) {
            this.cleanTh = cleanTh;
            return this;
        }
        public QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh getCleanTh() {
            return this.cleanTh;
        }

        public QueryNetListResponseBodyDataNetsDDoSDefense setDjPolicy(QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy djPolicy) {
            this.djPolicy = djPolicy;
            return this;
        }
        public QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy getDjPolicy() {
            return this.djPolicy;
        }

        public QueryNetListResponseBodyDataNetsDDoSDefense setHoleTh(QueryNetListResponseBodyDataNetsDDoSDefenseHoleTh holeTh) {
            this.holeTh = holeTh;
            return this;
        }
        public QueryNetListResponseBodyDataNetsDDoSDefenseHoleTh getHoleTh() {
            return this.holeTh;
        }

    }

    public static class QueryNetListResponseBodyDataNetsDeclared extends TeaModel {
        @NameInMap("Declared")
        public String declared;

        @NameInMap("Region")
        public String region;

        public static QueryNetListResponseBodyDataNetsDeclared build(java.util.Map<String, ?> map) throws Exception {
            QueryNetListResponseBodyDataNetsDeclared self = new QueryNetListResponseBodyDataNetsDeclared();
            return TeaModel.build(map, self);
        }

        public QueryNetListResponseBodyDataNetsDeclared setDeclared(String declared) {
            this.declared = declared;
            return this;
        }
        public String getDeclared() {
            return this.declared;
        }

        public QueryNetListResponseBodyDataNetsDeclared setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class QueryNetListResponseBodyDataNets extends TeaModel {
        @NameInMap("DDoSDefense")
        public QueryNetListResponseBodyDataNetsDDoSDefense DDoSDefense;

        @NameInMap("Declared")
        public java.util.List<QueryNetListResponseBodyDataNetsDeclared> declared;

        @NameInMap("DeclaredState")
        public Integer declaredState;

        @NameInMap("FwdEffect")
        public Long fwdEffect;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Net")
        public String net;

        @NameInMap("NetExtend")
        public Long netExtend;

        @NameInMap("NetMain")
        public String netMain;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("SaleId")
        public String saleId;

        @NameInMap("UpstreamType")
        public String upstreamType;

        @NameInMap("UserId")
        public String userId;

        public static QueryNetListResponseBodyDataNets build(java.util.Map<String, ?> map) throws Exception {
            QueryNetListResponseBodyDataNets self = new QueryNetListResponseBodyDataNets();
            return TeaModel.build(map, self);
        }

        public QueryNetListResponseBodyDataNets setDDoSDefense(QueryNetListResponseBodyDataNetsDDoSDefense DDoSDefense) {
            this.DDoSDefense = DDoSDefense;
            return this;
        }
        public QueryNetListResponseBodyDataNetsDDoSDefense getDDoSDefense() {
            return this.DDoSDefense;
        }

        public QueryNetListResponseBodyDataNets setDeclared(java.util.List<QueryNetListResponseBodyDataNetsDeclared> declared) {
            this.declared = declared;
            return this;
        }
        public java.util.List<QueryNetListResponseBodyDataNetsDeclared> getDeclared() {
            return this.declared;
        }

        public QueryNetListResponseBodyDataNets setDeclaredState(Integer declaredState) {
            this.declaredState = declaredState;
            return this;
        }
        public Integer getDeclaredState() {
            return this.declaredState;
        }

        public QueryNetListResponseBodyDataNets setFwdEffect(Long fwdEffect) {
            this.fwdEffect = fwdEffect;
            return this;
        }
        public Long getFwdEffect() {
            return this.fwdEffect;
        }

        public QueryNetListResponseBodyDataNets setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryNetListResponseBodyDataNets setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryNetListResponseBodyDataNets setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public QueryNetListResponseBodyDataNets setNet(String net) {
            this.net = net;
            return this;
        }
        public String getNet() {
            return this.net;
        }

        public QueryNetListResponseBodyDataNets setNetExtend(Long netExtend) {
            this.netExtend = netExtend;
            return this;
        }
        public Long getNetExtend() {
            return this.netExtend;
        }

        public QueryNetListResponseBodyDataNets setNetMain(String netMain) {
            this.netMain = netMain;
            return this;
        }
        public String getNetMain() {
            return this.netMain;
        }

        public QueryNetListResponseBodyDataNets setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryNetListResponseBodyDataNets setSaleId(String saleId) {
            this.saleId = saleId;
            return this;
        }
        public String getSaleId() {
            return this.saleId;
        }

        public QueryNetListResponseBodyDataNets setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public QueryNetListResponseBodyDataNets setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryNetListResponseBodyData extends TeaModel {
        @NameInMap("Nets")
        public java.util.List<QueryNetListResponseBodyDataNets> nets;

        @NameInMap("Num")
        public Long num;

        @NameInMap("Page")
        public Long page;

        @NameInMap("Total")
        public Long total;

        public static QueryNetListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryNetListResponseBodyData self = new QueryNetListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryNetListResponseBodyData setNets(java.util.List<QueryNetListResponseBodyDataNets> nets) {
            this.nets = nets;
            return this;
        }
        public java.util.List<QueryNetListResponseBodyDataNets> getNets() {
            return this.nets;
        }

        public QueryNetListResponseBodyData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public QueryNetListResponseBodyData setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryNetListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
