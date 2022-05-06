// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayNineRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public HuichengTestGrayNineRequestHome home;

    public static HuichengTestGrayNineRequest build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayNineRequest self = new HuichengTestGrayNineRequest();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayNineRequest setHome(HuichengTestGrayNineRequestHome home) {
        this.home = home;
        return this;
    }
    public HuichengTestGrayNineRequestHome getHome() {
        return this.home;
    }

    public static class HuichengTestGrayNineRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayNineRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayNineRequestHomeAddressLocation self = new HuichengTestGrayNineRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayNineRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayNineRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayNineRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayNineRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayNineRequestHomeAddressT self = new HuichengTestGrayNineRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayNineRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayNineRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public HuichengTestGrayNineRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public HuichengTestGrayNineRequestHomeAddressT t;

        public static HuichengTestGrayNineRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayNineRequestHomeAddress self = new HuichengTestGrayNineRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayNineRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public HuichengTestGrayNineRequestHomeAddress setLocation(HuichengTestGrayNineRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public HuichengTestGrayNineRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public HuichengTestGrayNineRequestHomeAddress setT(HuichengTestGrayNineRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayNineRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class HuichengTestGrayNineRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static HuichengTestGrayNineRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayNineRequestHomeLocations self = new HuichengTestGrayNineRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayNineRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HuichengTestGrayNineRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class HuichengTestGrayNineRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static HuichengTestGrayNineRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayNineRequestHomeT self = new HuichengTestGrayNineRequestHomeT();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayNineRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class HuichengTestGrayNineRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public HuichengTestGrayNineRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<HuichengTestGrayNineRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public HuichengTestGrayNineRequestHomeT t;

        public static HuichengTestGrayNineRequestHome build(java.util.Map<String, ?> map) throws Exception {
            HuichengTestGrayNineRequestHome self = new HuichengTestGrayNineRequestHome();
            return TeaModel.build(map, self);
        }

        public HuichengTestGrayNineRequestHome setAddress(HuichengTestGrayNineRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public HuichengTestGrayNineRequestHomeAddress getAddress() {
            return this.address;
        }

        public HuichengTestGrayNineRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public HuichengTestGrayNineRequestHome setLocations(java.util.List<HuichengTestGrayNineRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<HuichengTestGrayNineRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public HuichengTestGrayNineRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public HuichengTestGrayNineRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public HuichengTestGrayNineRequestHome setT(HuichengTestGrayNineRequestHomeT t) {
            this.t = t;
            return this;
        }
        public HuichengTestGrayNineRequestHomeT getT() {
            return this.t;
        }

    }

}
