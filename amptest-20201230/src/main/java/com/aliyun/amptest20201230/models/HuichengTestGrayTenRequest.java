// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayTenRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGrayTenRequestHome home;

    public static HuichengTestGrayTenRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayTenRequest self = new HuichengTestGrayTenRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayTenRequest setHome(HuichengTestGrayTenRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGrayTenRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGrayTenRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayTenRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayTenRequestHomeAddressLocation self = new HuichengTestGrayTenRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayTenRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayTenRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayTenRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayTenRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayTenRequestHomeAddressT self = new HuichengTestGrayTenRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayTenRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayTenRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGrayTenRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGrayTenRequestHomeAddressT t;

        public static HuichengTestGrayTenRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayTenRequestHomeAddress self = new HuichengTestGrayTenRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayTenRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGrayTenRequestHomeAddress setLocation(HuichengTestGrayTenRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGrayTenRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGrayTenRequestHomeAddress setT(HuichengTestGrayTenRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayTenRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGrayTenRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayTenRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayTenRequestHomeLocations self = new HuichengTestGrayTenRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayTenRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayTenRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayTenRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayTenRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayTenRequestHomeT self = new HuichengTestGrayTenRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayTenRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayTenRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGrayTenRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGrayTenRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGrayTenRequestHomeT t;

        public static HuichengTestGrayTenRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayTenRequestHome self = new HuichengTestGrayTenRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayTenRequestHome setAddress(HuichengTestGrayTenRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGrayTenRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGrayTenRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGrayTenRequestHome setLocations(java.util.List<HuichengTestGrayTenRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGrayTenRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGrayTenRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGrayTenRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGrayTenRequestHome setT(HuichengTestGrayTenRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayTenRequestHomeT getT() {
            return this.t;
        }

    }

}
