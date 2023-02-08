// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class UpdateAdxCreativeContentRequest extends TeaModel {
    @NameInMap("Ad")
    public java.util.List<UpdateAdxCreativeContentRequestAd> ad;

    @NameInMap("DspId")
    public String dspId;

    public static UpdateAdxCreativeContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdxCreativeContentRequest self = new UpdateAdxCreativeContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAdxCreativeContentRequest setAd(java.util.List<UpdateAdxCreativeContentRequestAd> ad) {
        this.ad = ad;
        return this;
    }
    public java.util.List<UpdateAdxCreativeContentRequestAd> getAd() {
        return this.ad;
    }

    public UpdateAdxCreativeContentRequest setDspId(String dspId) {
        this.dspId = dspId;
        return this;
    }
    public String getDspId() {
        return this.dspId;
    }

    public static class UpdateAdxCreativeContentRequestAdNativead extends TeaModel {
        @NameInMap("Attrname")
        public String attrname;

        @NameInMap("Attrvalue")
        public String attrvalue;

        @NameInMap("H")
        public Integer h;

        @NameInMap("Mime")
        public String mime;

        @NameInMap("W")
        public Integer w;

        public static UpdateAdxCreativeContentRequestAdNativead build(java.util.Map<String, ?> map) throws Exception {
            UpdateAdxCreativeContentRequestAdNativead self = new UpdateAdxCreativeContentRequestAdNativead();
            return TeaModel.build(map, self);
        }

        public UpdateAdxCreativeContentRequestAdNativead setAttrname(String attrname) {
            this.attrname = attrname;
            return this;
        }
        public String getAttrname() {
            return this.attrname;
        }

        public UpdateAdxCreativeContentRequestAdNativead setAttrvalue(String attrvalue) {
            this.attrvalue = attrvalue;
            return this;
        }
        public String getAttrvalue() {
            return this.attrvalue;
        }

        public UpdateAdxCreativeContentRequestAdNativead setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public UpdateAdxCreativeContentRequestAdNativead setMime(String mime) {
            this.mime = mime;
            return this;
        }
        public String getMime() {
            return this.mime;
        }

        public UpdateAdxCreativeContentRequestAdNativead setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

    }

    public static class UpdateAdxCreativeContentRequestAd extends TeaModel {
        @NameInMap("Bundle")
        public java.util.List<String> bundle;

        @NameInMap("Clicks")
        public java.util.List<String> clicks;

        @NameInMap("Crid")
        public String crid;

        @NameInMap("Enddate")
        public String enddate;

        @NameInMap("Imps")
        public java.util.List<String> imps;

        @NameInMap("Interacttype")
        public Integer interacttype;

        @NameInMap("MediaIdList")
        public java.util.List<String> mediaIdList;

        @NameInMap("Nativead")
        public java.util.List<UpdateAdxCreativeContentRequestAdNativead> nativead;

        @NameInMap("Op")
        public Integer op;

        @NameInMap("Ostype")
        public String ostype;

        @NameInMap("Prereview")
        public Boolean prereview;

        @NameInMap("Seat")
        public String seat;

        @NameInMap("Startdate")
        public String startdate;

        @NameInMap("Template")
        public Integer template;

        @NameInMap("Type")
        public Integer type;

        public static UpdateAdxCreativeContentRequestAd build(java.util.Map<String, ?> map) throws Exception {
            UpdateAdxCreativeContentRequestAd self = new UpdateAdxCreativeContentRequestAd();
            return TeaModel.build(map, self);
        }

        public UpdateAdxCreativeContentRequestAd setBundle(java.util.List<String> bundle) {
            this.bundle = bundle;
            return this;
        }
        public java.util.List<String> getBundle() {
            return this.bundle;
        }

        public UpdateAdxCreativeContentRequestAd setClicks(java.util.List<String> clicks) {
            this.clicks = clicks;
            return this;
        }
        public java.util.List<String> getClicks() {
            return this.clicks;
        }

        public UpdateAdxCreativeContentRequestAd setCrid(String crid) {
            this.crid = crid;
            return this;
        }
        public String getCrid() {
            return this.crid;
        }

        public UpdateAdxCreativeContentRequestAd setEnddate(String enddate) {
            this.enddate = enddate;
            return this;
        }
        public String getEnddate() {
            return this.enddate;
        }

        public UpdateAdxCreativeContentRequestAd setImps(java.util.List<String> imps) {
            this.imps = imps;
            return this;
        }
        public java.util.List<String> getImps() {
            return this.imps;
        }

        public UpdateAdxCreativeContentRequestAd setInteracttype(Integer interacttype) {
            this.interacttype = interacttype;
            return this;
        }
        public Integer getInteracttype() {
            return this.interacttype;
        }

        public UpdateAdxCreativeContentRequestAd setMediaIdList(java.util.List<String> mediaIdList) {
            this.mediaIdList = mediaIdList;
            return this;
        }
        public java.util.List<String> getMediaIdList() {
            return this.mediaIdList;
        }

        public UpdateAdxCreativeContentRequestAd setNativead(java.util.List<UpdateAdxCreativeContentRequestAdNativead> nativead) {
            this.nativead = nativead;
            return this;
        }
        public java.util.List<UpdateAdxCreativeContentRequestAdNativead> getNativead() {
            return this.nativead;
        }

        public UpdateAdxCreativeContentRequestAd setOp(Integer op) {
            this.op = op;
            return this;
        }
        public Integer getOp() {
            return this.op;
        }

        public UpdateAdxCreativeContentRequestAd setOstype(String ostype) {
            this.ostype = ostype;
            return this;
        }
        public String getOstype() {
            return this.ostype;
        }

        public UpdateAdxCreativeContentRequestAd setPrereview(Boolean prereview) {
            this.prereview = prereview;
            return this;
        }
        public Boolean getPrereview() {
            return this.prereview;
        }

        public UpdateAdxCreativeContentRequestAd setSeat(String seat) {
            this.seat = seat;
            return this;
        }
        public String getSeat() {
            return this.seat;
        }

        public UpdateAdxCreativeContentRequestAd setStartdate(String startdate) {
            this.startdate = startdate;
            return this;
        }
        public String getStartdate() {
            return this.startdate;
        }

        public UpdateAdxCreativeContentRequestAd setTemplate(Integer template) {
            this.template = template;
            return this;
        }
        public Integer getTemplate() {
            return this.template;
        }

        public UpdateAdxCreativeContentRequestAd setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
