// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketPageQueryScenicResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketPageQueryScenicResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ScenicIdInvalid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>ScenicId不合法</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TicketPageQueryScenicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketPageQueryScenicResponseBody self = new TicketPageQueryScenicResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketPageQueryScenicResponseBody setData(TicketPageQueryScenicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketPageQueryScenicResponseBodyData getData() {
        return this.data;
    }

    public TicketPageQueryScenicResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketPageQueryScenicResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketPageQueryScenicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketPageQueryScenicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketPageQueryScenicResponseBodyDataScenics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>杭州市西湖区龙井路1号</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>杭州市</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>中国</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>国家5A级旅游景区</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://example.com/img1.jpg%22%5D">https://example.com/img1.jpg&quot;]</a></p>
         */
        @NameInMap("Images")
        public java.util.List<String> images;

        /**
         * <strong>example:</strong>
         * <p>31.138026</p>
         */
        @NameInMap("Latitude")
        public Double latitude;

        /**
         * <strong>example:</strong>
         * <p>AAAAA</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>121.658793</p>
         */
        @NameInMap("Longitude")
        public Double longitude;

        /**
         * <strong>example:</strong>
         * <p>西湖风景区</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>08:00-17:30</p>
         */
        @NameInMap("OpeningTime")
        public String openingTime;

        /**
         * <strong>example:</strong>
         * <p>0571-12345678</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;儿童&quot;,&quot;typeDesc&quot;:&quot;3周岁(含)至11周岁(含)享受优惠票&quot;},{&quot;type&quot;:&quot;老年人&quot;,&quot;typeDesc&quot;:&quot;65周岁(含)以上享受优惠票&quot;}]</p>
         */
        @NameInMap("PreferentialPolicy")
        public String preferentialPolicy;

        /**
         * <strong>example:</strong>
         * <p>浙江省</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <strong>example:</strong>
         * <p>1天</p>
         */
        @NameInMap("ResidenceTime")
        public String residenceTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ScenicId")
        public Long scenicId;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        public static TicketPageQueryScenicResponseBodyDataScenics build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryScenicResponseBodyDataScenics self = new TicketPageQueryScenicResponseBodyDataScenics();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryScenicResponseBodyDataScenics setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }
        public Double getLatitude() {
            return this.latitude;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }
        public Double getLongitude() {
            return this.longitude;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setOpeningTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }
        public String getOpeningTime() {
            return this.openingTime;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setPreferentialPolicy(String preferentialPolicy) {
            this.preferentialPolicy = preferentialPolicy;
            return this;
        }
        public String getPreferentialPolicy() {
            return this.preferentialPolicy;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setResidenceTime(String residenceTime) {
            this.residenceTime = residenceTime;
            return this;
        }
        public String getResidenceTime() {
            return this.residenceTime;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setScenicId(Long scenicId) {
            this.scenicId = scenicId;
            return this;
        }
        public Long getScenicId() {
            return this.scenicId;
        }

        public TicketPageQueryScenicResponseBodyDataScenics setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class TicketPageQueryScenicResponseBodyData extends TeaModel {
        @NameInMap("Scenics")
        public java.util.List<TicketPageQueryScenicResponseBodyDataScenics> scenics;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static TicketPageQueryScenicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryScenicResponseBodyData self = new TicketPageQueryScenicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryScenicResponseBodyData setScenics(java.util.List<TicketPageQueryScenicResponseBodyDataScenics> scenics) {
            this.scenics = scenics;
            return this;
        }
        public java.util.List<TicketPageQueryScenicResponseBodyDataScenics> getScenics() {
            return this.scenics;
        }

        public TicketPageQueryScenicResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
