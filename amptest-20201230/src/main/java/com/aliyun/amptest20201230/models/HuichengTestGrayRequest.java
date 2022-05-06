// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGrayRequestHome home;

    public static HuichengTestGrayRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayRequest self = new HuichengTestGrayRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayRequest setHome(HuichengTestGrayRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGrayRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGrayRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayRequestHomeAddressLocation self = new HuichengTestGrayRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayRequestHomeAddressT self = new HuichengTestGrayRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGrayRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGrayRequestHomeAddressT t;

        public static HuichengTestGrayRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayRequestHomeAddress self = new HuichengTestGrayRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGrayRequestHomeAddress setLocation(HuichengTestGrayRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGrayRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGrayRequestHomeAddress setT(HuichengTestGrayRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGrayRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayRequestHomeLocations self = new HuichengTestGrayRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayRequestHomeT self = new HuichengTestGrayRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGrayRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGrayRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGrayRequestHomeT t;

        public static HuichengTestGrayRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayRequestHome self = new HuichengTestGrayRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayRequestHome setAddress(HuichengTestGrayRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGrayRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGrayRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGrayRequestHome setLocations(java.util.List<HuichengTestGrayRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGrayRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGrayRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGrayRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGrayRequestHome setT(HuichengTestGrayRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayRequestHomeT getT() {
            return this.t;
        }

    }

}
