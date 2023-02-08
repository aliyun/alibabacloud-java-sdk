// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class VerifyAdvertisingResponseBody extends TeaModel {
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
    public VerifyAdvertisingResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public VerifyAdvertisingResponseBodyResult result;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static VerifyAdvertisingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyAdvertisingResponseBody self = new VerifyAdvertisingResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyAdvertisingResponseBody setErrorcode(String errorcode) {
        this.errorcode = errorcode;
        return this;
    }
    public String getErrorcode() {
        return this.errorcode;
    }

    public VerifyAdvertisingResponseBody setErrormsg(String errormsg) {
        this.errormsg = errormsg;
        return this;
    }
    public String getErrormsg() {
        return this.errormsg;
    }

    public VerifyAdvertisingResponseBody setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public VerifyAdvertisingResponseBody setHeader(VerifyAdvertisingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public VerifyAdvertisingResponseBodyHeader getHeader() {
        return this.header;
    }

    public VerifyAdvertisingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyAdvertisingResponseBody setResult(VerifyAdvertisingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public VerifyAdvertisingResponseBodyResult getResult() {
        return this.result;
    }

    public VerifyAdvertisingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyAdvertisingResponseBodyHeader extends TeaModel {
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

        public static VerifyAdvertisingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingResponseBodyHeader self = new VerifyAdvertisingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public VerifyAdvertisingResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public VerifyAdvertisingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public VerifyAdvertisingResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class VerifyAdvertisingResponseBodyResultSeatbidBidAdsIcon extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static VerifyAdvertisingResponseBodyResultSeatbidBidAdsIcon build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingResponseBodyResultSeatbidBidAdsIcon self = new VerifyAdvertisingResponseBodyResultSeatbidBidAdsIcon();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsIcon setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Format")
        public String format;

        @NameInMap("Url")
        public String url;

        public static VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages self = new VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class VerifyAdvertisingResponseBodyResultSeatbidBidAdsTrackers extends TeaModel {
        @NameInMap("Imps")
        public java.util.List<String> imps;

        public static VerifyAdvertisingResponseBodyResultSeatbidBidAdsTrackers build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingResponseBodyResultSeatbidBidAdsTrackers self = new VerifyAdvertisingResponseBodyResultSeatbidBidAdsTrackers();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsTrackers setImps(java.util.List<String> imps) {
            this.imps = imps;
            return this;
        }
        public java.util.List<String> getImps() {
            return this.imps;
        }

    }

    public static class VerifyAdvertisingResponseBodyResultSeatbidBidAds extends TeaModel {
        /**
         * <p>crid</p>
         */
        @NameInMap("Crid")
        public String crid;

        @NameInMap("Crurl")
        public String crurl;

        @NameInMap("Icon")
        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsIcon icon;

        @NameInMap("Id")
        public String id;

        @NameInMap("Images")
        public java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages> images;

        /**
         * <p>Interacttype</p>
         */
        @NameInMap("Interacttype")
        public Integer interacttype;

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

        @NameInMap("Style")
        public String style;

        @NameInMap("Title")
        public String title;

        @NameInMap("Trackers")
        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsTrackers trackers;

        @NameInMap("Type")
        public String type;

        public static VerifyAdvertisingResponseBodyResultSeatbidBidAds build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingResponseBodyResultSeatbidBidAds self = new VerifyAdvertisingResponseBodyResultSeatbidBidAds();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setCrid(String crid) {
            this.crid = crid;
            return this;
        }
        public String getCrid() {
            return this.crid;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setCrurl(String crurl) {
            this.crurl = crurl;
            return this;
        }
        public String getCrurl() {
            return this.crurl;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setIcon(VerifyAdvertisingResponseBodyResultSeatbidBidAdsIcon icon) {
            this.icon = icon;
            return this;
        }
        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsIcon getIcon() {
            return this.icon;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setImages(java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBidAdsImages> getImages() {
            return this.images;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setInteracttype(Integer interacttype) {
            this.interacttype = interacttype;
            return this;
        }
        public Integer getInteracttype() {
            return this.interacttype;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setLabeltype(String labeltype) {
            this.labeltype = labeltype;
            return this;
        }
        public String getLabeltype() {
            return this.labeltype;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setLandingurls(java.util.List<String> landingurls) {
            this.landingurls = landingurls;
            return this;
        }
        public java.util.List<String> getLandingurls() {
            return this.landingurls;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setMarketingtype(String marketingtype) {
            this.marketingtype = marketingtype;
            return this;
        }
        public String getMarketingtype() {
            return this.marketingtype;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setObjective(String objective) {
            this.objective = objective;
            return this;
        }
        public String getObjective() {
            return this.objective;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setSeat(String seat) {
            this.seat = seat;
            return this;
        }
        public String getSeat() {
            return this.seat;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setTrackers(VerifyAdvertisingResponseBodyResultSeatbidBidAdsTrackers trackers) {
            this.trackers = trackers;
            return this;
        }
        public VerifyAdvertisingResponseBodyResultSeatbidBidAdsTrackers getTrackers() {
            return this.trackers;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBidAds setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class VerifyAdvertisingResponseBodyResultSeatbidBid extends TeaModel {
        @NameInMap("Ads")
        public java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBidAds> ads;

        /**
         * <p>impId</p>
         */
        @NameInMap("Impid")
        public String impid;

        public static VerifyAdvertisingResponseBodyResultSeatbidBid build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingResponseBodyResultSeatbidBid self = new VerifyAdvertisingResponseBodyResultSeatbidBid();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBid setAds(java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBidAds> ads) {
            this.ads = ads;
            return this;
        }
        public java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBidAds> getAds() {
            return this.ads;
        }

        public VerifyAdvertisingResponseBodyResultSeatbidBid setImpid(String impid) {
            this.impid = impid;
            return this;
        }
        public String getImpid() {
            return this.impid;
        }

    }

    public static class VerifyAdvertisingResponseBodyResultSeatbid extends TeaModel {
        /**
         * <p>bid</p>
         */
        @NameInMap("Bid")
        public java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBid> bid;

        public static VerifyAdvertisingResponseBodyResultSeatbid build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingResponseBodyResultSeatbid self = new VerifyAdvertisingResponseBodyResultSeatbid();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingResponseBodyResultSeatbid setBid(java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBid> bid) {
            this.bid = bid;
            return this;
        }
        public java.util.List<VerifyAdvertisingResponseBodyResultSeatbidBid> getBid() {
            return this.bid;
        }

    }

    public static class VerifyAdvertisingResponseBodyResult extends TeaModel {
        @NameInMap("Bidid")
        public String bidid;

        /**
         * <p>id</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Seatbid")
        public java.util.List<VerifyAdvertisingResponseBodyResultSeatbid> seatbid;

        public static VerifyAdvertisingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingResponseBodyResult self = new VerifyAdvertisingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingResponseBodyResult setBidid(String bidid) {
            this.bidid = bidid;
            return this;
        }
        public String getBidid() {
            return this.bidid;
        }

        public VerifyAdvertisingResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VerifyAdvertisingResponseBodyResult setSeatbid(java.util.List<VerifyAdvertisingResponseBodyResultSeatbid> seatbid) {
            this.seatbid = seatbid;
            return this;
        }
        public java.util.List<VerifyAdvertisingResponseBodyResultSeatbid> getSeatbid() {
            return this.seatbid;
        }

    }

}
