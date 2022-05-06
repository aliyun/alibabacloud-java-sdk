// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySecondRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGraySecondRequestHome home;

    public static HuichengTestGraySecondRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySecondRequest self = new HuichengTestGraySecondRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySecondRequest setHome(HuichengTestGraySecondRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGraySecondRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGraySecondRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGraySecondRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySecondRequestHomeAddressLocation self = new HuichengTestGraySecondRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySecondRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGraySecondRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGraySecondRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGraySecondRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySecondRequestHomeAddressT self = new HuichengTestGraySecondRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySecondRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGraySecondRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGraySecondRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGraySecondRequestHomeAddressT t;

        public static HuichengTestGraySecondRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySecondRequestHomeAddress self = new HuichengTestGraySecondRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySecondRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGraySecondRequestHomeAddress setLocation(HuichengTestGraySecondRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGraySecondRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGraySecondRequestHomeAddress setT(HuichengTestGraySecondRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGraySecondRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGraySecondRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGraySecondRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySecondRequestHomeLocations self = new HuichengTestGraySecondRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySecondRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGraySecondRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGraySecondRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGraySecondRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySecondRequestHomeT self = new HuichengTestGraySecondRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySecondRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGraySecondRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGraySecondRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGraySecondRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGraySecondRequestHomeT t;

        public static HuichengTestGraySecondRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySecondRequestHome self = new HuichengTestGraySecondRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySecondRequestHome setAddress(HuichengTestGraySecondRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGraySecondRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGraySecondRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGraySecondRequestHome setLocations(java.util.List<HuichengTestGraySecondRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGraySecondRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGraySecondRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGraySecondRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGraySecondRequestHome setT(HuichengTestGraySecondRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGraySecondRequestHomeT getT() {
            return this.t;
        }

    }

}
