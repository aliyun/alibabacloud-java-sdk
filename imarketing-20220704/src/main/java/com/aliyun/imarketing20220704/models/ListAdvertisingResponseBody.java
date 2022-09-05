// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListAdvertisingResponseBody extends TeaModel {
    @NameInMap("Errorcode")
    public String errorcode;

    @NameInMap("Errormsg")
    public String errormsg;

    @NameInMap("Ext")
    public java.util.Map<String, String> ext;

    @NameInMap("Header")
    public ListAdvertisingResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListAdvertisingResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ListAdvertisingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdvertisingResponseBody self = new ListAdvertisingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdvertisingResponseBody setErrorcode(String errorcode) {
        this.errorcode = errorcode;
        return this;
    }
    public String getErrorcode() {
        return this.errorcode;
    }

    public ListAdvertisingResponseBody setErrormsg(String errormsg) {
        this.errormsg = errormsg;
        return this;
    }
    public String getErrormsg() {
        return this.errormsg;
    }

    public ListAdvertisingResponseBody setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public ListAdvertisingResponseBody setHeader(ListAdvertisingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public ListAdvertisingResponseBodyHeader getHeader() {
        return this.header;
    }

    public ListAdvertisingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdvertisingResponseBody setResult(ListAdvertisingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAdvertisingResponseBodyResult getResult() {
        return this.result;
    }

    public ListAdvertisingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAdvertisingResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static ListAdvertisingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingResponseBodyHeader self = new ListAdvertisingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public ListAdvertisingResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public ListAdvertisingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public ListAdvertisingResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAdvertisingResponseBodyResultSeatbidBidAdsIcon extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static ListAdvertisingResponseBodyResultSeatbidBidAdsIcon build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingResponseBodyResultSeatbidBidAdsIcon self = new ListAdvertisingResponseBodyResultSeatbidBidAdsIcon();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAdsIcon setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAdvertisingResponseBodyResultSeatbidBidAdsImages extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Format")
        public String format;

        @NameInMap("Url")
        public String url;

        public static ListAdvertisingResponseBodyResultSeatbidBidAdsImages build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingResponseBodyResultSeatbidBidAdsImages self = new ListAdvertisingResponseBodyResultSeatbidBidAdsImages();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAdsImages setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAdsImages setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAdsImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAdvertisingResponseBodyResultSeatbidBidAdsTrackers extends TeaModel {
        @NameInMap("Imps")
        public java.util.List<String> imps;

        public static ListAdvertisingResponseBodyResultSeatbidBidAdsTrackers build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingResponseBodyResultSeatbidBidAdsTrackers self = new ListAdvertisingResponseBodyResultSeatbidBidAdsTrackers();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAdsTrackers setImps(java.util.List<String> imps) {
            this.imps = imps;
            return this;
        }
        public java.util.List<String> getImps() {
            return this.imps;
        }

    }

    public static class ListAdvertisingResponseBodyResultSeatbidBidAds extends TeaModel {
        @NameInMap("Crid")
        public String crid;

        @NameInMap("Crurl")
        public String crurl;

        @NameInMap("Icon")
        public ListAdvertisingResponseBodyResultSeatbidBidAdsIcon icon;

        @NameInMap("Id")
        public String id;

        @NameInMap("Images")
        public java.util.List<ListAdvertisingResponseBodyResultSeatbidBidAdsImages> images;

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

        @NameInMap("Seat")
        public String seat;

        @NameInMap("Style")
        public String style;

        @NameInMap("Title")
        public String title;

        @NameInMap("Trackers")
        public ListAdvertisingResponseBodyResultSeatbidBidAdsTrackers trackers;

        @NameInMap("Type")
        public String type;

        public static ListAdvertisingResponseBodyResultSeatbidBidAds build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingResponseBodyResultSeatbidBidAds self = new ListAdvertisingResponseBodyResultSeatbidBidAds();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setCrid(String crid) {
            this.crid = crid;
            return this;
        }
        public String getCrid() {
            return this.crid;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setCrurl(String crurl) {
            this.crurl = crurl;
            return this;
        }
        public String getCrurl() {
            return this.crurl;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setIcon(ListAdvertisingResponseBodyResultSeatbidBidAdsIcon icon) {
            this.icon = icon;
            return this;
        }
        public ListAdvertisingResponseBodyResultSeatbidBidAdsIcon getIcon() {
            return this.icon;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setImages(java.util.List<ListAdvertisingResponseBodyResultSeatbidBidAdsImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<ListAdvertisingResponseBodyResultSeatbidBidAdsImages> getImages() {
            return this.images;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setInteracttype(Integer interacttype) {
            this.interacttype = interacttype;
            return this;
        }
        public Integer getInteracttype() {
            return this.interacttype;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setLabeltype(String labeltype) {
            this.labeltype = labeltype;
            return this;
        }
        public String getLabeltype() {
            return this.labeltype;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setLandingurls(java.util.List<String> landingurls) {
            this.landingurls = landingurls;
            return this;
        }
        public java.util.List<String> getLandingurls() {
            return this.landingurls;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setMarketingtype(String marketingtype) {
            this.marketingtype = marketingtype;
            return this;
        }
        public String getMarketingtype() {
            return this.marketingtype;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setObjective(String objective) {
            this.objective = objective;
            return this;
        }
        public String getObjective() {
            return this.objective;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setSeat(String seat) {
            this.seat = seat;
            return this;
        }
        public String getSeat() {
            return this.seat;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setTrackers(ListAdvertisingResponseBodyResultSeatbidBidAdsTrackers trackers) {
            this.trackers = trackers;
            return this;
        }
        public ListAdvertisingResponseBodyResultSeatbidBidAdsTrackers getTrackers() {
            return this.trackers;
        }

        public ListAdvertisingResponseBodyResultSeatbidBidAds setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAdvertisingResponseBodyResultSeatbidBid extends TeaModel {
        @NameInMap("Ads")
        public java.util.List<ListAdvertisingResponseBodyResultSeatbidBidAds> ads;

        @NameInMap("Impid")
        public String impid;

        public static ListAdvertisingResponseBodyResultSeatbidBid build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingResponseBodyResultSeatbidBid self = new ListAdvertisingResponseBodyResultSeatbidBid();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingResponseBodyResultSeatbidBid setAds(java.util.List<ListAdvertisingResponseBodyResultSeatbidBidAds> ads) {
            this.ads = ads;
            return this;
        }
        public java.util.List<ListAdvertisingResponseBodyResultSeatbidBidAds> getAds() {
            return this.ads;
        }

        public ListAdvertisingResponseBodyResultSeatbidBid setImpid(String impid) {
            this.impid = impid;
            return this;
        }
        public String getImpid() {
            return this.impid;
        }

    }

    public static class ListAdvertisingResponseBodyResultSeatbid extends TeaModel {
        @NameInMap("Bid")
        public java.util.List<ListAdvertisingResponseBodyResultSeatbidBid> bid;

        public static ListAdvertisingResponseBodyResultSeatbid build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingResponseBodyResultSeatbid self = new ListAdvertisingResponseBodyResultSeatbid();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingResponseBodyResultSeatbid setBid(java.util.List<ListAdvertisingResponseBodyResultSeatbidBid> bid) {
            this.bid = bid;
            return this;
        }
        public java.util.List<ListAdvertisingResponseBodyResultSeatbidBid> getBid() {
            return this.bid;
        }

    }

    public static class ListAdvertisingResponseBodyResult extends TeaModel {
        @NameInMap("Bidid")
        public String bidid;

        @NameInMap("Id")
        public String id;

        @NameInMap("Seatbid")
        public java.util.List<ListAdvertisingResponseBodyResultSeatbid> seatbid;

        public static ListAdvertisingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingResponseBodyResult self = new ListAdvertisingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingResponseBodyResult setBidid(String bidid) {
            this.bidid = bidid;
            return this;
        }
        public String getBidid() {
            return this.bidid;
        }

        public ListAdvertisingResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAdvertisingResponseBodyResult setSeatbid(java.util.List<ListAdvertisingResponseBodyResultSeatbid> seatbid) {
            this.seatbid = seatbid;
            return this;
        }
        public java.util.List<ListAdvertisingResponseBodyResultSeatbid> getSeatbid() {
            return this.seatbid;
        }

    }

}
