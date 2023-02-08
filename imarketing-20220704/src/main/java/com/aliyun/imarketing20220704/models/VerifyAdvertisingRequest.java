// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class VerifyAdvertisingRequest extends TeaModel {
    /**
     * <p>app</p>
     */
    @NameInMap("App")
    public VerifyAdvertisingRequestApp app;

    @NameInMap("Dealtype")
    public Integer dealtype;

    /**
     * <p>device</p>
     */
    @NameInMap("Device")
    public VerifyAdvertisingRequestDevice device;

    /**
     * <p>ext</p>
     */
    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    /**
     * <p>id</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>imp</p>
     */
    @NameInMap("Imp")
    public java.util.List<VerifyAdvertisingRequestImp> imp;

    /**
     * <p>test</p>
     */
    @NameInMap("Test")
    public Integer test;

    /**
     * <p>user</p>
     */
    @NameInMap("User")
    public VerifyAdvertisingRequestUser user;

    @NameInMap("Verifyad")
    public java.util.List<VerifyAdvertisingRequestVerifyad> verifyad;

    public static VerifyAdvertisingRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAdvertisingRequest self = new VerifyAdvertisingRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAdvertisingRequest setApp(VerifyAdvertisingRequestApp app) {
        this.app = app;
        return this;
    }
    public VerifyAdvertisingRequestApp getApp() {
        return this.app;
    }

    public VerifyAdvertisingRequest setDealtype(Integer dealtype) {
        this.dealtype = dealtype;
        return this;
    }
    public Integer getDealtype() {
        return this.dealtype;
    }

    public VerifyAdvertisingRequest setDevice(VerifyAdvertisingRequestDevice device) {
        this.device = device;
        return this;
    }
    public VerifyAdvertisingRequestDevice getDevice() {
        return this.device;
    }

    public VerifyAdvertisingRequest setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public VerifyAdvertisingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public VerifyAdvertisingRequest setImp(java.util.List<VerifyAdvertisingRequestImp> imp) {
        this.imp = imp;
        return this;
    }
    public java.util.List<VerifyAdvertisingRequestImp> getImp() {
        return this.imp;
    }

    public VerifyAdvertisingRequest setTest(Integer test) {
        this.test = test;
        return this;
    }
    public Integer getTest() {
        return this.test;
    }

    public VerifyAdvertisingRequest setUser(VerifyAdvertisingRequestUser user) {
        this.user = user;
        return this;
    }
    public VerifyAdvertisingRequestUser getUser() {
        return this.user;
    }

    public VerifyAdvertisingRequest setVerifyad(java.util.List<VerifyAdvertisingRequestVerifyad> verifyad) {
        this.verifyad = verifyad;
        return this;
    }
    public java.util.List<VerifyAdvertisingRequestVerifyad> getVerifyad() {
        return this.verifyad;
    }

    public static class VerifyAdvertisingRequestApp extends TeaModel {
        /**
         * <p>ext</p>
         */
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        /**
         * <p>mediaid</p>
         */
        @NameInMap("Mediaid")
        public String mediaid;

        /**
         * <p>sn</p>
         */
        @NameInMap("Sn")
        public String sn;

        public static VerifyAdvertisingRequestApp build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingRequestApp self = new VerifyAdvertisingRequestApp();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingRequestApp setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public VerifyAdvertisingRequestApp setMediaid(String mediaid) {
            this.mediaid = mediaid;
            return this;
        }
        public String getMediaid() {
            return this.mediaid;
        }

        public VerifyAdvertisingRequestApp setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

    public static class VerifyAdvertisingRequestDeviceGeo extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("District")
        public String district;

        /**
         * <p>lat</p>
         */
        @NameInMap("Lat")
        public Double lat;

        /**
         * <p>lon</p>
         */
        @NameInMap("Lon")
        public Double lon;

        @NameInMap("Province")
        public String province;

        public static VerifyAdvertisingRequestDeviceGeo build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingRequestDeviceGeo self = new VerifyAdvertisingRequestDeviceGeo();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingRequestDeviceGeo setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public VerifyAdvertisingRequestDeviceGeo setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public VerifyAdvertisingRequestDeviceGeo setLat(Double lat) {
            this.lat = lat;
            return this;
        }
        public Double getLat() {
            return this.lat;
        }

        public VerifyAdvertisingRequestDeviceGeo setLon(Double lon) {
            this.lon = lon;
            return this;
        }
        public Double getLon() {
            return this.lon;
        }

        public VerifyAdvertisingRequestDeviceGeo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class VerifyAdvertisingRequestDevice extends TeaModel {
        /**
         * <p>androidid</p>
         */
        @NameInMap("Androidid")
        public String androidid;

        /**
         * <p>androidmd5</p>
         */
        @NameInMap("Androidmd5")
        public String androidmd5;

        /**
         * <p>Caid</p>
         */
        @NameInMap("Caid")
        public String caid;

        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Connectiontype")
        public Integer connectiontype;

        /**
         * <p>deviceType</p>
         */
        @NameInMap("Devicetype")
        public Integer devicetype;

        @NameInMap("Geo")
        public VerifyAdvertisingRequestDeviceGeo geo;

        /**
         * <p>Idfa</p>
         */
        @NameInMap("Idfa")
        public String idfa;

        /**
         * <p>imei</p>
         */
        @NameInMap("Imei")
        public String imei;

        /**
         * <p>imeimd5</p>
         */
        @NameInMap("Imeimd5")
        public String imeimd5;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Language")
        public String language;

        @NameInMap("Mac")
        public String mac;

        /**
         * <p>Macmd5</p>
         */
        @NameInMap("Macmd5")
        public String macmd5;

        /**
         * <p>make</p>
         */
        @NameInMap("Make")
        public String make;

        /**
         * <p>model</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>oaid</p>
         */
        @NameInMap("Oaid")
        public String oaid;

        /**
         * <p>os</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>osv</p>
         */
        @NameInMap("Osv")
        public String osv;

        /**
         * <p>ua</p>
         */
        @NameInMap("Ua")
        public String ua;

        /**
         * <p>Utdid</p>
         */
        @NameInMap("Utdid")
        public String utdid;

        public static VerifyAdvertisingRequestDevice build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingRequestDevice self = new VerifyAdvertisingRequestDevice();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingRequestDevice setAndroidid(String androidid) {
            this.androidid = androidid;
            return this;
        }
        public String getAndroidid() {
            return this.androidid;
        }

        public VerifyAdvertisingRequestDevice setAndroidmd5(String androidmd5) {
            this.androidmd5 = androidmd5;
            return this;
        }
        public String getAndroidmd5() {
            return this.androidmd5;
        }

        public VerifyAdvertisingRequestDevice setCaid(String caid) {
            this.caid = caid;
            return this;
        }
        public String getCaid() {
            return this.caid;
        }

        public VerifyAdvertisingRequestDevice setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public VerifyAdvertisingRequestDevice setConnectiontype(Integer connectiontype) {
            this.connectiontype = connectiontype;
            return this;
        }
        public Integer getConnectiontype() {
            return this.connectiontype;
        }

        public VerifyAdvertisingRequestDevice setDevicetype(Integer devicetype) {
            this.devicetype = devicetype;
            return this;
        }
        public Integer getDevicetype() {
            return this.devicetype;
        }

        public VerifyAdvertisingRequestDevice setGeo(VerifyAdvertisingRequestDeviceGeo geo) {
            this.geo = geo;
            return this;
        }
        public VerifyAdvertisingRequestDeviceGeo getGeo() {
            return this.geo;
        }

        public VerifyAdvertisingRequestDevice setIdfa(String idfa) {
            this.idfa = idfa;
            return this;
        }
        public String getIdfa() {
            return this.idfa;
        }

        public VerifyAdvertisingRequestDevice setImei(String imei) {
            this.imei = imei;
            return this;
        }
        public String getImei() {
            return this.imei;
        }

        public VerifyAdvertisingRequestDevice setImeimd5(String imeimd5) {
            this.imeimd5 = imeimd5;
            return this;
        }
        public String getImeimd5() {
            return this.imeimd5;
        }

        public VerifyAdvertisingRequestDevice setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public VerifyAdvertisingRequestDevice setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public VerifyAdvertisingRequestDevice setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public VerifyAdvertisingRequestDevice setMacmd5(String macmd5) {
            this.macmd5 = macmd5;
            return this;
        }
        public String getMacmd5() {
            return this.macmd5;
        }

        public VerifyAdvertisingRequestDevice setMake(String make) {
            this.make = make;
            return this;
        }
        public String getMake() {
            return this.make;
        }

        public VerifyAdvertisingRequestDevice setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public VerifyAdvertisingRequestDevice setOaid(String oaid) {
            this.oaid = oaid;
            return this;
        }
        public String getOaid() {
            return this.oaid;
        }

        public VerifyAdvertisingRequestDevice setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public VerifyAdvertisingRequestDevice setOsv(String osv) {
            this.osv = osv;
            return this;
        }
        public String getOsv() {
            return this.osv;
        }

        public VerifyAdvertisingRequestDevice setUa(String ua) {
            this.ua = ua;
            return this;
        }
        public String getUa() {
            return this.ua;
        }

        public VerifyAdvertisingRequestDevice setUtdid(String utdid) {
            this.utdid = utdid;
            return this;
        }
        public String getUtdid() {
            return this.utdid;
        }

    }

    public static class VerifyAdvertisingRequestImp extends TeaModel {
        /**
         * <p>id</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>tagid</p>
         */
        @NameInMap("Tagid")
        public String tagid;

        public static VerifyAdvertisingRequestImp build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingRequestImp self = new VerifyAdvertisingRequestImp();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingRequestImp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VerifyAdvertisingRequestImp setTagid(String tagid) {
            this.tagid = tagid;
            return this;
        }
        public String getTagid() {
            return this.tagid;
        }

    }

    public static class VerifyAdvertisingRequestUser extends TeaModel {
        /**
         * <p>uid</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>uidtype</p>
         */
        @NameInMap("Usertype")
        public String usertype;

        public static VerifyAdvertisingRequestUser build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingRequestUser self = new VerifyAdvertisingRequestUser();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingRequestUser setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VerifyAdvertisingRequestUser setUsertype(String usertype) {
            this.usertype = usertype;
            return this;
        }
        public String getUsertype() {
            return this.usertype;
        }

    }

    public static class VerifyAdvertisingRequestVerifyad extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Seat")
        public Long seat;

        public static VerifyAdvertisingRequestVerifyad build(java.util.Map<String, ?> map) throws Exception {
            VerifyAdvertisingRequestVerifyad self = new VerifyAdvertisingRequestVerifyad();
            return TeaModel.build(map, self);
        }

        public VerifyAdvertisingRequestVerifyad setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public VerifyAdvertisingRequestVerifyad setSeat(Long seat) {
            this.seat = seat;
            return this;
        }
        public Long getSeat() {
            return this.seat;
        }

    }

}
