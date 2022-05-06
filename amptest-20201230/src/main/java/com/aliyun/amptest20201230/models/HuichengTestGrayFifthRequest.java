// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayFifthRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGrayFifthRequestHome home;

    public static HuichengTestGrayFifthRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayFifthRequest self = new HuichengTestGrayFifthRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayFifthRequest setHome(HuichengTestGrayFifthRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGrayFifthRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGrayFifthRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayFifthRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFifthRequestHomeAddressLocation self = new HuichengTestGrayFifthRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFifthRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayFifthRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayFifthRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayFifthRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFifthRequestHomeAddressT self = new HuichengTestGrayFifthRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFifthRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayFifthRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGrayFifthRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGrayFifthRequestHomeAddressT t;

        public static HuichengTestGrayFifthRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFifthRequestHomeAddress self = new HuichengTestGrayFifthRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFifthRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGrayFifthRequestHomeAddress setLocation(HuichengTestGrayFifthRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGrayFifthRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGrayFifthRequestHomeAddress setT(HuichengTestGrayFifthRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayFifthRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGrayFifthRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayFifthRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFifthRequestHomeLocations self = new HuichengTestGrayFifthRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFifthRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayFifthRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayFifthRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayFifthRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFifthRequestHomeT self = new HuichengTestGrayFifthRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFifthRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayFifthRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGrayFifthRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGrayFifthRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGrayFifthRequestHomeT t;

        public static HuichengTestGrayFifthRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFifthRequestHome self = new HuichengTestGrayFifthRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFifthRequestHome setAddress(HuichengTestGrayFifthRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGrayFifthRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGrayFifthRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGrayFifthRequestHome setLocations(java.util.List<HuichengTestGrayFifthRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGrayFifthRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGrayFifthRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGrayFifthRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGrayFifthRequestHome setT(HuichengTestGrayFifthRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayFifthRequestHomeT getT() {
            return this.t;
        }

    }

}
