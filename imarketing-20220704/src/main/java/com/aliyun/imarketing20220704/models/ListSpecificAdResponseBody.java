// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListSpecificAdResponseBody extends TeaModel {
    /**
     * <p>errorCode</p>
     */
    @NameInMap("Errorcode")
    public String errorcode;

    /**
     * <p>errorMsg</p>
     */
    @NameInMap("Errormsg")
    public String errormsg;

    /**
     * <p>ext</p>
     */
    @NameInMap("Ext")
    public java.util.Map<String, String> ext;

    /**
     * <p>header</p>
     */
    @NameInMap("Header")
    public ListSpecificAdResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListSpecificAdResponseBodyResult result;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSpecificAdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpecificAdResponseBody self = new ListSpecificAdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpecificAdResponseBody setErrorcode(String errorcode) {
        this.errorcode = errorcode;
        return this;
    }
    public String getErrorcode() {
        return this.errorcode;
    }

    public ListSpecificAdResponseBody setErrormsg(String errormsg) {
        this.errormsg = errormsg;
        return this;
    }
    public String getErrormsg() {
        return this.errormsg;
    }

    public ListSpecificAdResponseBody setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public ListSpecificAdResponseBody setHeader(ListSpecificAdResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public ListSpecificAdResponseBodyHeader getHeader() {
        return this.header;
    }

    public ListSpecificAdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSpecificAdResponseBody setResult(ListSpecificAdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSpecificAdResponseBodyResult getResult() {
        return this.result;
    }

    public ListSpecificAdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSpecificAdResponseBodyHeader extends TeaModel {
        /**
         * <p>costTime</p>
         */
        @NameInMap("CostTime")
        public Long costTime;

        /**
         * <p>rpcId</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        /**
         * <p>traceId</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>version</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListSpecificAdResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdResponseBodyHeader self = new ListSpecificAdResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public ListSpecificAdResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public ListSpecificAdResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ListSpecificAdResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListSpecificAdResponseBodyResultSeatbidBidAdsIcon extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static ListSpecificAdResponseBodyResultSeatbidBidAdsIcon build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdResponseBodyResultSeatbidBidAdsIcon self = new ListSpecificAdResponseBodyResultSeatbidBidAdsIcon();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAdsIcon setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListSpecificAdResponseBodyResultSeatbidBidAdsTrackers extends TeaModel {
        @NameInMap("Imps")
        public java.util.List<String> imps;

        public static ListSpecificAdResponseBodyResultSeatbidBidAdsTrackers build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdResponseBodyResultSeatbidBidAdsTrackers self = new ListSpecificAdResponseBodyResultSeatbidBidAdsTrackers();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAdsTrackers setImps(java.util.List<String> imps) {
            this.imps = imps;
            return this;
        }
        public java.util.List<String> getImps() {
            return this.imps;
        }

    }

    public static class ListSpecificAdResponseBodyResultSeatbidBidAds extends TeaModel {
        /**
         * <p>crid</p>
         */
        @NameInMap("Crid")
        public String crid;

        @NameInMap("Crurl")
        public String crurl;

        @NameInMap("Icon")
        public ListSpecificAdResponseBodyResultSeatbidBidAdsIcon icon;

        @NameInMap("Id")
        public String id;

        /**
         * <p>Interacttype</p>
         */
        @NameInMap("Interacttype")
        public Integer interacttype;

        @NameInMap("Itemid")
        public String itemid;

        @NameInMap("Labeltype")
        public String labeltype;

        @NameInMap("Landingurls")
        public java.util.List<String> landingurls;

        @NameInMap("Marketingtype")
        public String marketingtype;

        @NameInMap("Objective")
        public String objective;

        @NameInMap("Price")
        public String price;

        /**
         * <p>seat</p>
         */
        @NameInMap("Seat")
        public String seat;

        @NameInMap("Title")
        public String title;

        @NameInMap("Trackers")
        public ListSpecificAdResponseBodyResultSeatbidBidAdsTrackers trackers;

        public static ListSpecificAdResponseBodyResultSeatbidBidAds build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdResponseBodyResultSeatbidBidAds self = new ListSpecificAdResponseBodyResultSeatbidBidAds();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setCrid(String crid) {
            this.crid = crid;
            return this;
        }
        public String getCrid() {
            return this.crid;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setCrurl(String crurl) {
            this.crurl = crurl;
            return this;
        }
        public String getCrurl() {
            return this.crurl;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setIcon(ListSpecificAdResponseBodyResultSeatbidBidAdsIcon icon) {
            this.icon = icon;
            return this;
        }
        public ListSpecificAdResponseBodyResultSeatbidBidAdsIcon getIcon() {
            return this.icon;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setInteracttype(Integer interacttype) {
            this.interacttype = interacttype;
            return this;
        }
        public Integer getInteracttype() {
            return this.interacttype;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setItemid(String itemid) {
            this.itemid = itemid;
            return this;
        }
        public String getItemid() {
            return this.itemid;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setLabeltype(String labeltype) {
            this.labeltype = labeltype;
            return this;
        }
        public String getLabeltype() {
            return this.labeltype;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setLandingurls(java.util.List<String> landingurls) {
            this.landingurls = landingurls;
            return this;
        }
        public java.util.List<String> getLandingurls() {
            return this.landingurls;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setMarketingtype(String marketingtype) {
            this.marketingtype = marketingtype;
            return this;
        }
        public String getMarketingtype() {
            return this.marketingtype;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setObjective(String objective) {
            this.objective = objective;
            return this;
        }
        public String getObjective() {
            return this.objective;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setSeat(String seat) {
            this.seat = seat;
            return this;
        }
        public String getSeat() {
            return this.seat;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListSpecificAdResponseBodyResultSeatbidBidAds setTrackers(ListSpecificAdResponseBodyResultSeatbidBidAdsTrackers trackers) {
            this.trackers = trackers;
            return this;
        }
        public ListSpecificAdResponseBodyResultSeatbidBidAdsTrackers getTrackers() {
            return this.trackers;
        }

    }

    public static class ListSpecificAdResponseBodyResultSeatbidBid extends TeaModel {
        /**
         * <p>ad</p>
         */
        @NameInMap("Ads")
        public java.util.List<ListSpecificAdResponseBodyResultSeatbidBidAds> ads;

        /**
         * <p>impId</p>
         */
        @NameInMap("Impid")
        public String impid;

        public static ListSpecificAdResponseBodyResultSeatbidBid build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdResponseBodyResultSeatbidBid self = new ListSpecificAdResponseBodyResultSeatbidBid();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdResponseBodyResultSeatbidBid setAds(java.util.List<ListSpecificAdResponseBodyResultSeatbidBidAds> ads) {
            this.ads = ads;
            return this;
        }
        public java.util.List<ListSpecificAdResponseBodyResultSeatbidBidAds> getAds() {
            return this.ads;
        }

        public ListSpecificAdResponseBodyResultSeatbidBid setImpid(String impid) {
            this.impid = impid;
            return this;
        }
        public String getImpid() {
            return this.impid;
        }

    }

    public static class ListSpecificAdResponseBodyResultSeatbid extends TeaModel {
        /**
         * <p>Bid</p>
         */
        @NameInMap("Bid")
        public java.util.List<ListSpecificAdResponseBodyResultSeatbidBid> bid;

        public static ListSpecificAdResponseBodyResultSeatbid build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdResponseBodyResultSeatbid self = new ListSpecificAdResponseBodyResultSeatbid();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdResponseBodyResultSeatbid setBid(java.util.List<ListSpecificAdResponseBodyResultSeatbidBid> bid) {
            this.bid = bid;
            return this;
        }
        public java.util.List<ListSpecificAdResponseBodyResultSeatbidBid> getBid() {
            return this.bid;
        }

    }

    public static class ListSpecificAdResponseBodyResult extends TeaModel {
        @NameInMap("Bidid")
        public String bidid;

        /**
         * <p>id</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>seat</p>
         */
        @NameInMap("Seatbid")
        public java.util.List<ListSpecificAdResponseBodyResultSeatbid> seatbid;

        public static ListSpecificAdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificAdResponseBodyResult self = new ListSpecificAdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSpecificAdResponseBodyResult setBidid(String bidid) {
            this.bidid = bidid;
            return this;
        }
        public String getBidid() {
            return this.bidid;
        }

        public ListSpecificAdResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSpecificAdResponseBodyResult setSeatbid(java.util.List<ListSpecificAdResponseBodyResultSeatbid> seatbid) {
            this.seatbid = seatbid;
            return this;
        }
        public java.util.List<ListSpecificAdResponseBodyResultSeatbid> getSeatbid() {
            return this.seatbid;
        }

    }

}
