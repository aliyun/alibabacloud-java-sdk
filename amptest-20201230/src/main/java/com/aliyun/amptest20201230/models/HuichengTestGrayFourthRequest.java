// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayFourthRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGrayFourthRequestHome home;

    public static HuichengTestGrayFourthRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayFourthRequest self = new HuichengTestGrayFourthRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayFourthRequest setHome(HuichengTestGrayFourthRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGrayFourthRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGrayFourthRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayFourthRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFourthRequestHomeAddressLocation self = new HuichengTestGrayFourthRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFourthRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayFourthRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayFourthRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayFourthRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFourthRequestHomeAddressT self = new HuichengTestGrayFourthRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFourthRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayFourthRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGrayFourthRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGrayFourthRequestHomeAddressT t;

        public static HuichengTestGrayFourthRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFourthRequestHomeAddress self = new HuichengTestGrayFourthRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFourthRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGrayFourthRequestHomeAddress setLocation(HuichengTestGrayFourthRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGrayFourthRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGrayFourthRequestHomeAddress setT(HuichengTestGrayFourthRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayFourthRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGrayFourthRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayFourthRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFourthRequestHomeLocations self = new HuichengTestGrayFourthRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFourthRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayFourthRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayFourthRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayFourthRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFourthRequestHomeT self = new HuichengTestGrayFourthRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFourthRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayFourthRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGrayFourthRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGrayFourthRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGrayFourthRequestHomeT t;

        public static HuichengTestGrayFourthRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayFourthRequestHome self = new HuichengTestGrayFourthRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayFourthRequestHome setAddress(HuichengTestGrayFourthRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGrayFourthRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGrayFourthRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGrayFourthRequestHome setLocations(java.util.List<HuichengTestGrayFourthRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGrayFourthRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGrayFourthRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGrayFourthRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGrayFourthRequestHome setT(HuichengTestGrayFourthRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayFourthRequestHomeT getT() {
            return this.t;
        }

    }

}
