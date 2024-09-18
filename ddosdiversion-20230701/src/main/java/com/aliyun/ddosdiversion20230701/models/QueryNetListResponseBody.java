// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class QueryNetListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>200: The request was successful.</li>
     * <li>Other codes: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The CIDR blocks.</p>
     */
    @NameInMap("Data")
    public QueryNetListResponseBodyData data;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24B652B5-AEFF-3F03-9114-00D053C42277</p>
     */
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

    public QueryNetListResponseBody setData(QueryNetListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryNetListResponseBodyData getData() {
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
         * <p>The traffic scrubbing threshold in Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mbps")
        public Integer mbps;

        /**
         * <p>The traffic scrubbing threshold in packets per second (pps)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
        /**
         * <p>The name of the mitigation policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test_polilciy-xxx</p>
         */
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
        /**
         * <p>The blackhole filtering threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The configuration of traffic scrubbing.</p>
         */
        @NameInMap("CleanTh")
        public QueryNetListResponseBodyDataNetsDDoSDefenseCleanTh cleanTh;

        /**
         * <p>The configuration of the mitigation policy.</p>
         */
        @NameInMap("DjPolicy")
        public QueryNetListResponseBodyDataNetsDDoSDefenseDjPolicy djPolicy;

        /**
         * <p>The configuration of blackhole filtering.</p>
         */
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
        /**
         * <p>Indicates whether the CIDR block is advertised. Valid values:</p>
         * <ul>
         * <li>0: The CIDR block is not advertised.</li>
         * <li>1: The CIDR block is advertised.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Declared")
        public String declared;

        /**
         * <p>The region in which the CIDR block is advertised.</p>
         * 
         * <strong>example:</strong>
         * <p>oe26</p>
         */
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
        /**
         * <p>The DDoS mitigation configuration of the CIDR block.</p>
         */
        @NameInMap("DDoSDefense")
        public QueryNetListResponseBodyDataNetsDDoSDefense DDoSDefense;

        /**
         * <p>The advertising details.</p>
         */
        @NameInMap("Declared")
        public java.util.List<QueryNetListResponseBodyDataNetsDeclared> declared;

        /**
         * <p>The advertising status of the CIDR block. Valid values:</p>
         * <ul>
         * <li>0: The CIDR block is not advertised.</li>
         * <li>1: The CIDR block is advertised.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeclaredState")
        public Integer declaredState;

        /**
         * <p>Indicates whether the forwarding configuration takes effect. Valid values:</p>
         * <ul>
         * <li>0: The forwarding configuration takes effect.</li>
         * <li>1: The forwarding configuration does not take effect.</li>
         * <li>-1: The forwarding configuration is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FwdEffect")
        public Long fwdEffect;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-23 00:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-24 00:00:00</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>The scheduling mode.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The CIDR block of the anti-DDoS diversion instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("Net")
        public String net;

        /**
         * <p>Indicates whether the CIDR block needs to be extended. Valid values:</p>
         * <ul>
         * <li>0: The CIDR block needs to be extended.</li>
         * <li>1: The CIDR block does not need to be extended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetExtend")
        public String netExtend;

        /**
         * <p>The primary CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/22</p>
         */
        @NameInMap("NetMain")
        public String netMain;

        /**
         * <p>The type of the CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("NetType")
        public String netType;

        @NameInMap("Permit")
        public Integer permit;

        /**
         * <p>The ID of the anti-DDoS diversion instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddos_diversion_public_cn-xxxxxxxxxxxxx</p>
         */
        @NameInMap("SaleId")
        public String saleId;

        /**
         * <p>The reinjection type.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_line</p>
         */
        @NameInMap("UpstreamType")
        public String upstreamType;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>177xxxxxxxxxxxxx</p>
         */
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

        public QueryNetListResponseBodyDataNets setNetExtend(String netExtend) {
            this.netExtend = netExtend;
            return this;
        }
        public String getNetExtend() {
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

        public QueryNetListResponseBodyDataNets setPermit(Integer permit) {
            this.permit = permit;
            return this;
        }
        public Integer getPermit() {
            return this.permit;
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
        /**
         * <p>The configuration of the CIDR block.</p>
         */
        @NameInMap("Nets")
        public java.util.List<QueryNetListResponseBodyDataNets> nets;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Num")
        public Long num;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
