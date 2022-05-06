// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySixRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGraySixRequestHome home;

    public static HuichengTestGraySixRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySixRequest self = new HuichengTestGraySixRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySixRequest setHome(HuichengTestGraySixRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGraySixRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGraySixRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGraySixRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySixRequestHomeAddressLocation self = new HuichengTestGraySixRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySixRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGraySixRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGraySixRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGraySixRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySixRequestHomeAddressT self = new HuichengTestGraySixRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySixRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGraySixRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGraySixRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGraySixRequestHomeAddressT t;

        public static HuichengTestGraySixRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySixRequestHomeAddress self = new HuichengTestGraySixRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySixRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGraySixRequestHomeAddress setLocation(HuichengTestGraySixRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGraySixRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGraySixRequestHomeAddress setT(HuichengTestGraySixRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGraySixRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGraySixRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGraySixRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySixRequestHomeLocations self = new HuichengTestGraySixRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySixRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGraySixRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGraySixRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGraySixRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySixRequestHomeT self = new HuichengTestGraySixRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySixRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGraySixRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGraySixRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGraySixRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGraySixRequestHomeT t;

        public static HuichengTestGraySixRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGraySixRequestHome self = new HuichengTestGraySixRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGraySixRequestHome setAddress(HuichengTestGraySixRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGraySixRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGraySixRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGraySixRequestHome setLocations(java.util.List<HuichengTestGraySixRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGraySixRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGraySixRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGraySixRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGraySixRequestHome setT(HuichengTestGraySixRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGraySixRequestHomeT getT() {
            return this.t;
        }

    }

}
