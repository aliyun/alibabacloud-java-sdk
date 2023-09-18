// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListAdvertisingRequest extends TeaModel {
    @NameInMap("App")
    public ListAdvertisingRequestApp app;

    @NameInMap("Dealtype")
    public Integer dealtype;

    @NameInMap("Device")
    public ListAdvertisingRequestDevice device;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Id")
    public String id;

    @NameInMap("Imp")
    public java.util.List<ListAdvertisingRequestImp> imp;

    @NameInMap("Test")
    public Integer test;

    @NameInMap("User")
    public ListAdvertisingRequestUser user;

    public static ListAdvertisingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdvertisingRequest self = new ListAdvertisingRequest();
        return TeaModel.build(map, self);
    }

    public ListAdvertisingRequest setApp(ListAdvertisingRequestApp app) {
        this.app = app;
        return this;
    }
    public ListAdvertisingRequestApp getApp() {
        return this.app;
    }

    public ListAdvertisingRequest setDealtype(Integer dealtype) {
        this.dealtype = dealtype;
        return this;
    }
    public Integer getDealtype() {
        return this.dealtype;
    }

    public ListAdvertisingRequest setDevice(ListAdvertisingRequestDevice device) {
        this.device = device;
        return this;
    }
    public ListAdvertisingRequestDevice getDevice() {
        return this.device;
    }

    public ListAdvertisingRequest setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public ListAdvertisingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAdvertisingRequest setImp(java.util.List<ListAdvertisingRequestImp> imp) {
        this.imp = imp;
        return this;
    }
    public java.util.List<ListAdvertisingRequestImp> getImp() {
        return this.imp;
    }

    public ListAdvertisingRequest setTest(Integer test) {
        this.test = test;
        return this;
    }
    public Integer getTest() {
        return this.test;
    }

    public ListAdvertisingRequest setUser(ListAdvertisingRequestUser user) {
        this.user = user;
        return this;
    }
    public ListAdvertisingRequestUser getUser() {
        return this.user;
    }

    public static class ListAdvertisingRequestApp extends TeaModel {
        @NameInMap("Appid")
        public String appid;

        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("Mediaid")
        public String mediaid;

        @NameInMap("Sn")
        public String sn;

        public static ListAdvertisingRequestApp build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingRequestApp self = new ListAdvertisingRequestApp();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingRequestApp setAppid(String appid) {
            this.appid = appid;
            return this;
        }
        public String getAppid() {
            return this.appid;
        }

        public ListAdvertisingRequestApp setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public ListAdvertisingRequestApp setMediaid(String mediaid) {
            this.mediaid = mediaid;
            return this;
        }
        public String getMediaid() {
            return this.mediaid;
        }

        public ListAdvertisingRequestApp setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

    public static class ListAdvertisingRequestDeviceGeo extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("District")
        public String district;

        @NameInMap("Lat")
        public Double lat;

        @NameInMap("Lon")
        public Double lon;

        @NameInMap("Province")
        public String province;

        public static ListAdvertisingRequestDeviceGeo build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingRequestDeviceGeo self = new ListAdvertisingRequestDeviceGeo();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingRequestDeviceGeo setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListAdvertisingRequestDeviceGeo setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public ListAdvertisingRequestDeviceGeo setLat(Double lat) {
            this.lat = lat;
            return this;
        }
        public Double getLat() {
            return this.lat;
        }

        public ListAdvertisingRequestDeviceGeo setLon(Double lon) {
            this.lon = lon;
            return this;
        }
        public Double getLon() {
            return this.lon;
        }

        public ListAdvertisingRequestDeviceGeo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class ListAdvertisingRequestDevice extends TeaModel {
        @NameInMap("Androidid")
        public String androidid;

        @NameInMap("Androidmd5")
        public String androidmd5;

        @NameInMap("Caid")
        public String caid;

        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Connectiontype")
        public Integer connectiontype;

        @NameInMap("Devicetype")
        public Integer devicetype;

        @NameInMap("Geo")
        public ListAdvertisingRequestDeviceGeo geo;

        @NameInMap("Idfa")
        public String idfa;

        @NameInMap("Imei")
        public String imei;

        @NameInMap("Imeimd5")
        public String imeimd5;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Language")
        public String language;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Macmd5")
        public String macmd5;

        @NameInMap("Make")
        public String make;

        @NameInMap("Model")
        public String model;

        @NameInMap("Oaid")
        public String oaid;

        @NameInMap("Os")
        public String os;

        @NameInMap("Osv")
        public String osv;

        @NameInMap("Ua")
        public String ua;

        @NameInMap("Utdid")
        public String utdid;

        public static ListAdvertisingRequestDevice build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingRequestDevice self = new ListAdvertisingRequestDevice();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingRequestDevice setAndroidid(String androidid) {
            this.androidid = androidid;
            return this;
        }
        public String getAndroidid() {
            return this.androidid;
        }

        public ListAdvertisingRequestDevice setAndroidmd5(String androidmd5) {
            this.androidmd5 = androidmd5;
            return this;
        }
        public String getAndroidmd5() {
            return this.androidmd5;
        }

        public ListAdvertisingRequestDevice setCaid(String caid) {
            this.caid = caid;
            return this;
        }
        public String getCaid() {
            return this.caid;
        }

        public ListAdvertisingRequestDevice setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public ListAdvertisingRequestDevice setConnectiontype(Integer connectiontype) {
            this.connectiontype = connectiontype;
            return this;
        }
        public Integer getConnectiontype() {
            return this.connectiontype;
        }

        public ListAdvertisingRequestDevice setDevicetype(Integer devicetype) {
            this.devicetype = devicetype;
            return this;
        }
        public Integer getDevicetype() {
            return this.devicetype;
        }

        public ListAdvertisingRequestDevice setGeo(ListAdvertisingRequestDeviceGeo geo) {
            this.geo = geo;
            return this;
        }
        public ListAdvertisingRequestDeviceGeo getGeo() {
            return this.geo;
        }

        public ListAdvertisingRequestDevice setIdfa(String idfa) {
            this.idfa = idfa;
            return this;
        }
        public String getIdfa() {
            return this.idfa;
        }

        public ListAdvertisingRequestDevice setImei(String imei) {
            this.imei = imei;
            return this;
        }
        public String getImei() {
            return this.imei;
        }

        public ListAdvertisingRequestDevice setImeimd5(String imeimd5) {
            this.imeimd5 = imeimd5;
            return this;
        }
        public String getImeimd5() {
            return this.imeimd5;
        }

        public ListAdvertisingRequestDevice setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListAdvertisingRequestDevice setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListAdvertisingRequestDevice setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListAdvertisingRequestDevice setMacmd5(String macmd5) {
            this.macmd5 = macmd5;
            return this;
        }
        public String getMacmd5() {
            return this.macmd5;
        }

        public ListAdvertisingRequestDevice setMake(String make) {
            this.make = make;
            return this;
        }
        public String getMake() {
            return this.make;
        }

        public ListAdvertisingRequestDevice setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListAdvertisingRequestDevice setOaid(String oaid) {
            this.oaid = oaid;
            return this;
        }
        public String getOaid() {
            return this.oaid;
        }

        public ListAdvertisingRequestDevice setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAdvertisingRequestDevice setOsv(String osv) {
            this.osv = osv;
            return this;
        }
        public String getOsv() {
            return this.osv;
        }

        public ListAdvertisingRequestDevice setUa(String ua) {
            this.ua = ua;
            return this;
        }
        public String getUa() {
            return this.ua;
        }

        public ListAdvertisingRequestDevice setUtdid(String utdid) {
            this.utdid = utdid;
            return this;
        }
        public String getUtdid() {
            return this.utdid;
        }

    }

    public static class ListAdvertisingRequestImp extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Tagid")
        public String tagid;

        public static ListAdvertisingRequestImp build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingRequestImp self = new ListAdvertisingRequestImp();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingRequestImp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAdvertisingRequestImp setTagid(String tagid) {
            this.tagid = tagid;
            return this;
        }
        public String getTagid() {
            return this.tagid;
        }

    }

    public static class ListAdvertisingRequestUser extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Usertype")
        public String usertype;

        public static ListAdvertisingRequestUser build(java.util.Map<String, ?> map) throws Exception {
            ListAdvertisingRequestUser self = new ListAdvertisingRequestUser();
            return TeaModel.build(map, self);
        }

        public ListAdvertisingRequestUser setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAdvertisingRequestUser setUsertype(String usertype) {
            this.usertype = usertype;
            return this;
        }
        public String getUsertype() {
            return this.usertype;
        }

    }

}
