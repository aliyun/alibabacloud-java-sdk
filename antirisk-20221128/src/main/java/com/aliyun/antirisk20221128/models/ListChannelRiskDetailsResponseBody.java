// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class ListChannelRiskDetailsResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public ListChannelRiskDetailsResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListChannelRiskDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChannelRiskDetailsResponseBody self = new ListChannelRiskDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChannelRiskDetailsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListChannelRiskDetailsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListChannelRiskDetailsResponseBody setData(ListChannelRiskDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChannelRiskDetailsResponseBodyData getData() {
        return this.data;
    }

    public ListChannelRiskDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChannelRiskDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChannelRiskDetailsResponseBodyDataRiskDetails extends TeaModel {
        @NameInMap("an")
        public String an;

        @NameInMap("av")
        public String av;

        @NameInMap("bn")
        public String bn;

        @NameInMap("c")
        public String c;

        @NameInMap("date")
        public String date;

        @NameInMap("fd")
        public String fd;

        @NameInMap("idfa")
        public String idfa;

        @NameInMap("jb")
        public String jb;

        @NameInMap("oaid")
        public String oaid;

        @NameInMap("py")
        public String py;

        @NameInMap("rl")
        public String rl;

        @NameInMap("rs")
        public String rs;

        @NameInMap("zid")
        public String zid;

        public static ListChannelRiskDetailsResponseBodyDataRiskDetails build(java.util.Map<String, ?> map) throws Exception {
            ListChannelRiskDetailsResponseBodyDataRiskDetails self = new ListChannelRiskDetailsResponseBodyDataRiskDetails();
            return TeaModel.build(map, self);
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setAn(String an) {
            this.an = an;
            return this;
        }
        public String getAn() {
            return this.an;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setAv(String av) {
            this.av = av;
            return this;
        }
        public String getAv() {
            return this.av;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setBn(String bn) {
            this.bn = bn;
            return this;
        }
        public String getBn() {
            return this.bn;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setC(String c) {
            this.c = c;
            return this;
        }
        public String getC() {
            return this.c;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setFd(String fd) {
            this.fd = fd;
            return this;
        }
        public String getFd() {
            return this.fd;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setIdfa(String idfa) {
            this.idfa = idfa;
            return this;
        }
        public String getIdfa() {
            return this.idfa;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setJb(String jb) {
            this.jb = jb;
            return this;
        }
        public String getJb() {
            return this.jb;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setOaid(String oaid) {
            this.oaid = oaid;
            return this;
        }
        public String getOaid() {
            return this.oaid;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setPy(String py) {
            this.py = py;
            return this;
        }
        public String getPy() {
            return this.py;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setRl(String rl) {
            this.rl = rl;
            return this;
        }
        public String getRl() {
            return this.rl;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setRs(String rs) {
            this.rs = rs;
            return this;
        }
        public String getRs() {
            return this.rs;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskDetails setZid(String zid) {
            this.zid = zid;
            return this;
        }
        public String getZid() {
            return this.zid;
        }

    }

    public static class ListChannelRiskDetailsResponseBodyDataRiskSumary extends TeaModel {
        @NameInMap("date")
        public String date;

        @NameInMap("riskZidEmuDistinctNew")
        public String riskZidEmuDistinctNew;

        public static ListChannelRiskDetailsResponseBodyDataRiskSumary build(java.util.Map<String, ?> map) throws Exception {
            ListChannelRiskDetailsResponseBodyDataRiskSumary self = new ListChannelRiskDetailsResponseBodyDataRiskSumary();
            return TeaModel.build(map, self);
        }

        public ListChannelRiskDetailsResponseBodyDataRiskSumary setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListChannelRiskDetailsResponseBodyDataRiskSumary setRiskZidEmuDistinctNew(String riskZidEmuDistinctNew) {
            this.riskZidEmuDistinctNew = riskZidEmuDistinctNew;
            return this;
        }
        public String getRiskZidEmuDistinctNew() {
            return this.riskZidEmuDistinctNew;
        }

    }

    public static class ListChannelRiskDetailsResponseBodyData extends TeaModel {
        @NameInMap("riskDetails")
        public java.util.List<ListChannelRiskDetailsResponseBodyDataRiskDetails> riskDetails;

        @NameInMap("riskSumary")
        public java.util.List<ListChannelRiskDetailsResponseBodyDataRiskSumary> riskSumary;

        public static ListChannelRiskDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChannelRiskDetailsResponseBodyData self = new ListChannelRiskDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChannelRiskDetailsResponseBodyData setRiskDetails(java.util.List<ListChannelRiskDetailsResponseBodyDataRiskDetails> riskDetails) {
            this.riskDetails = riskDetails;
            return this;
        }
        public java.util.List<ListChannelRiskDetailsResponseBodyDataRiskDetails> getRiskDetails() {
            return this.riskDetails;
        }

        public ListChannelRiskDetailsResponseBodyData setRiskSumary(java.util.List<ListChannelRiskDetailsResponseBodyDataRiskSumary> riskSumary) {
            this.riskSumary = riskSumary;
            return this;
        }
        public java.util.List<ListChannelRiskDetailsResponseBodyDataRiskSumary> getRiskSumary() {
            return this.riskSumary;
        }

    }

}
