// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySevenRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGraySevenRequestHome home;

    public static HuichengTestGraySevenRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySevenRequest self = new HuichengTestGraySevenRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySevenRequest setHome(HuichengTestGraySevenRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGraySevenRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGraySevenRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGraySevenRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySevenRequestHomeAddressLocation self = new HuichengTestGraySevenRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySevenRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGraySevenRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGraySevenRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGraySevenRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySevenRequestHomeAddressT self = new HuichengTestGraySevenRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySevenRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGraySevenRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGraySevenRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGraySevenRequestHomeAddressT t;

        public static HuichengTestGraySevenRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySevenRequestHomeAddress self = new HuichengTestGraySevenRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySevenRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGraySevenRequestHomeAddress setLocation(HuichengTestGraySevenRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGraySevenRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGraySevenRequestHomeAddress setT(HuichengTestGraySevenRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGraySevenRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGraySevenRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGraySevenRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySevenRequestHomeLocations self = new HuichengTestGraySevenRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySevenRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGraySevenRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGraySevenRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGraySevenRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySevenRequestHomeT self = new HuichengTestGraySevenRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySevenRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGraySevenRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGraySevenRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGraySevenRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGraySevenRequestHomeT t;

        public static HuichengTestGraySevenRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySevenRequestHome self = new HuichengTestGraySevenRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySevenRequestHome setAddress(HuichengTestGraySevenRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGraySevenRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGraySevenRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGraySevenRequestHome setLocations(java.util.List<HuichengTestGraySevenRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGraySevenRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGraySevenRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGraySevenRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGraySevenRequestHome setT(HuichengTestGraySevenRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGraySevenRequestHomeT getT() {
            return this.t;
        }

    }

}
