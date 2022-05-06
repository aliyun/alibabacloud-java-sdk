// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class CreateRulesRequest extends TeaModel {
    // home
    @NameInMap("Home")
    public CreateRulesRequestHome home;

    public static CreateRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRulesRequest self = new CreateRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateRulesRequest setHome(CreateRulesRequestHome home) {
        this.home = home;
        return this;
    }
    public CreateRulesRequestHome getHome() {
        return this.home;
    }

    public static class CreateRulesRequestHomeAddressLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // lon
        @NameInMap("Lon")
        public Long lon;

        public static CreateRulesRequestHomeAddressLocation build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestHomeAddressLocation self = new CreateRulesRequestHomeAddressLocation();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestHomeAddressLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public CreateRulesRequestHomeAddressLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class CreateRulesRequestHomeAddressT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static CreateRulesRequestHomeAddressT build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestHomeAddressT self = new CreateRulesRequestHomeAddressT();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestHomeAddressT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class CreateRulesRequestHomeAddress extends TeaModel {
        // detail
        @NameInMap("Detail")
        public String detail;

        // asdasd
        @NameInMap("Location")
        public CreateRulesRequestHomeAddressLocation location;

        // t
        @NameInMap("T")
        public CreateRulesRequestHomeAddressT t;

        public static CreateRulesRequestHomeAddress build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestHomeAddress self = new CreateRulesRequestHomeAddress();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestHomeAddress setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public CreateRulesRequestHomeAddress setLocation(CreateRulesRequestHomeAddressLocation location) {
            this.location = location;
            return this;
        }
        public CreateRulesRequestHomeAddressLocation getLocation() {
            return this.location;
        }

        public CreateRulesRequestHomeAddress setT(CreateRulesRequestHomeAddressT t) {
            this.t = t;
            return this;
        }
        public CreateRulesRequestHomeAddressT getT() {
            return this.t;
        }

    }

    public static class CreateRulesRequestHomeLocations extends TeaModel {
        // asdasd
        @NameInMap("Late")
        public Long late;

        // sadasd
        @NameInMap("Lon")
        public Long lon;

        public static CreateRulesRequestHomeLocations build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestHomeLocations self = new CreateRulesRequestHomeLocations();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestHomeLocations setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public CreateRulesRequestHomeLocations setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

    public static class CreateRulesRequestHomeT extends TeaModel {
        // class
        @NameInMap("Class")
        public String _class;

        public static CreateRulesRequestHomeT build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestHomeT self = new CreateRulesRequestHomeT();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestHomeT set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class CreateRulesRequestHome extends TeaModel {
        // asdasd
        @NameInMap("Address")
        public CreateRulesRequestHomeAddress address;

        // dMap
        @NameInMap("DMap")
        public java.util.Map<String, HomeDMapValue> DMap;

        // asdasd
        @NameInMap("Locations")
        public java.util.List<CreateRulesRequestHomeLocations> locations;

        // NameToAge
        @NameInMap("NameToAge")
        public java.util.Map<String, Integer> nameToAge;

        // asdasd
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        // t
        @NameInMap("T")
        public CreateRulesRequestHomeT t;

        public static CreateRulesRequestHome build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesRequestHome self = new CreateRulesRequestHome();
            return TeaModel.build(map, self);
        }

        public CreateRulesRequestHome setAddress(CreateRulesRequestHomeAddress address) {
            this.address = address;
            return this;
        }
        public CreateRulesRequestHomeAddress getAddress() {
            return this.address;
        }

        public CreateRulesRequestHome setDMap(java.util.Map<String, HomeDMapValue> DMap) {
            this.DMap = DMap;
            return this;
        }
        public java.util.Map<String, HomeDMapValue> getDMap() {
            return this.DMap;
        }

        public CreateRulesRequestHome setLocations(java.util.List<CreateRulesRequestHomeLocations> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<CreateRulesRequestHomeLocations> getLocations() {
            return this.locations;
        }

        public CreateRulesRequestHome setNameToAge(java.util.Map<String, Integer> nameToAge) {
            this.nameToAge = nameToAge;
            return this;
        }
        public java.util.Map<String, Integer> getNameToAge() {
            return this.nameToAge;
        }

        public CreateRulesRequestHome setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public CreateRulesRequestHome setT(CreateRulesRequestHomeT t) {
            this.t = t;
            return this;
        }
        public CreateRulesRequestHomeT getT() {
            return this.t;
        }

    }

}
