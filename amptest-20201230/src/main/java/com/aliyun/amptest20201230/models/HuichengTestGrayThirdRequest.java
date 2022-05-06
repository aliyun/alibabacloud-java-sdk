// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayThirdRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGrayThirdRequestHome home;

    public static HuichengTestGrayThirdRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayThirdRequest self = new HuichengTestGrayThirdRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayThirdRequest setHome(HuichengTestGrayThirdRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGrayThirdRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGrayThirdRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayThirdRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayThirdRequestHomeAddressLocation self = new HuichengTestGrayThirdRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayThirdRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayThirdRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayThirdRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayThirdRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayThirdRequestHomeAddressT self = new HuichengTestGrayThirdRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayThirdRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayThirdRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGrayThirdRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGrayThirdRequestHomeAddressT t;

        public static HuichengTestGrayThirdRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayThirdRequestHomeAddress self = new HuichengTestGrayThirdRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayThirdRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGrayThirdRequestHomeAddress setLocation(HuichengTestGrayThirdRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGrayThirdRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGrayThirdRequestHomeAddress setT(HuichengTestGrayThirdRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayThirdRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGrayThirdRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayThirdRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayThirdRequestHomeLocations self = new HuichengTestGrayThirdRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayThirdRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayThirdRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayThirdRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayThirdRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayThirdRequestHomeT self = new HuichengTestGrayThirdRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayThirdRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayThirdRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGrayThirdRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGrayThirdRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGrayThirdRequestHomeT t;

        public static HuichengTestGrayThirdRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayThirdRequestHome self = new HuichengTestGrayThirdRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayThirdRequestHome setAddress(HuichengTestGrayThirdRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGrayThirdRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGrayThirdRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGrayThirdRequestHome setLocations(java.util.List<HuichengTestGrayThirdRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGrayThirdRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGrayThirdRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGrayThirdRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGrayThirdRequestHome setT(HuichengTestGrayThirdRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayThirdRequestHomeT getT() {
            return this.t;
        }

    }

}
