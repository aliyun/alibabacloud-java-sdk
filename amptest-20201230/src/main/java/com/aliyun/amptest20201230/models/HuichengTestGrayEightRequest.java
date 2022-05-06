// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayEightRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGrayEightRequestHome home;

    public static HuichengTestGrayEightRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayEightRequest self = new HuichengTestGrayEightRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayEightRequest setHome(HuichengTestGrayEightRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGrayEightRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGrayEightRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayEightRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayEightRequestHomeAddressLocation self = new HuichengTestGrayEightRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayEightRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayEightRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayEightRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayEightRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayEightRequestHomeAddressT self = new HuichengTestGrayEightRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayEightRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayEightRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGrayEightRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGrayEightRequestHomeAddressT t;

        public static HuichengTestGrayEightRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayEightRequestHomeAddress self = new HuichengTestGrayEightRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayEightRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGrayEightRequestHomeAddress setLocation(HuichengTestGrayEightRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGrayEightRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGrayEightRequestHomeAddress setT(HuichengTestGrayEightRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayEightRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGrayEightRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayEightRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayEightRequestHomeLocations self = new HuichengTestGrayEightRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayEightRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayEightRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayEightRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayEightRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayEightRequestHomeT self = new HuichengTestGrayEightRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayEightRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayEightRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGrayEightRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGrayEightRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGrayEightRequestHomeT t;

        public static HuichengTestGrayEightRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayEightRequestHome self = new HuichengTestGrayEightRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayEightRequestHome setAddress(HuichengTestGrayEightRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGrayEightRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGrayEightRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGrayEightRequestHome setLocations(java.util.List<HuichengTestGrayEightRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGrayEightRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGrayEightRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGrayEightRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGrayEightRequestHome setT(HuichengTestGrayEightRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayEightRequestHomeT getT() {
            return this.t;
        }

    }

}
