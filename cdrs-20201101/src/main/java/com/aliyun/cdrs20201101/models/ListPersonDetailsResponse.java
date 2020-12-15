// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListPersonDetailsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListPersonDetailsResponseData> data;

    public static ListPersonDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonDetailsResponse self = new ListPersonDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonDetailsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonDetailsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonDetailsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonDetailsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonDetailsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPersonDetailsResponse setData(java.util.List<ListPersonDetailsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonDetailsResponseData> getData() {
        return this.data;
    }

    public static class ListPersonDetailsResponseData extends TeaModel {
        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("Age")
        @Validation(required = true)
        public String age;

        @NameInMap("Profession")
        @Validation(required = true)
        public String profession;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Transportation")
        @Validation(required = true)
        public String transportation;

        @NameInMap("PersonType")
        @Validation(required = true)
        public String personType;

        @NameInMap("HotSpotAddress")
        @Validation(required = true)
        public String hotSpotAddress;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("PreferredColor")
        @Validation(required = true)
        public String preferredColor;

        @NameInMap("FaceSourceImage")
        @Validation(required = true)
        public String faceSourceImage;

        @NameInMap("FaceTargetImage")
        @Validation(required = true)
        public String faceTargetImage;

        @NameInMap("BodySourceImage")
        @Validation(required = true)
        public String bodySourceImage;

        @NameInMap("BodyTargetImage")
        @Validation(required = true)
        public String bodyTargetImage;

        @NameInMap("PrefOutTime")
        @Validation(required = true)
        public String prefOutTime;

        public static ListPersonDetailsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonDetailsResponseData self = new ListPersonDetailsResponseData();
            return TeaModel.build(map, self);
        }

        public ListPersonDetailsResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonDetailsResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListPersonDetailsResponseData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ListPersonDetailsResponseData setProfession(String profession) {
            this.profession = profession;
            return this;
        }
        public String getProfession() {
            return this.profession;
        }

        public ListPersonDetailsResponseData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListPersonDetailsResponseData setTransportation(String transportation) {
            this.transportation = transportation;
            return this;
        }
        public String getTransportation() {
            return this.transportation;
        }

        public ListPersonDetailsResponseData setPersonType(String personType) {
            this.personType = personType;
            return this;
        }
        public String getPersonType() {
            return this.personType;
        }

        public ListPersonDetailsResponseData setHotSpotAddress(String hotSpotAddress) {
            this.hotSpotAddress = hotSpotAddress;
            return this;
        }
        public String getHotSpotAddress() {
            return this.hotSpotAddress;
        }

        public ListPersonDetailsResponseData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListPersonDetailsResponseData setPreferredColor(String preferredColor) {
            this.preferredColor = preferredColor;
            return this;
        }
        public String getPreferredColor() {
            return this.preferredColor;
        }

        public ListPersonDetailsResponseData setFaceSourceImage(String faceSourceImage) {
            this.faceSourceImage = faceSourceImage;
            return this;
        }
        public String getFaceSourceImage() {
            return this.faceSourceImage;
        }

        public ListPersonDetailsResponseData setFaceTargetImage(String faceTargetImage) {
            this.faceTargetImage = faceTargetImage;
            return this;
        }
        public String getFaceTargetImage() {
            return this.faceTargetImage;
        }

        public ListPersonDetailsResponseData setBodySourceImage(String bodySourceImage) {
            this.bodySourceImage = bodySourceImage;
            return this;
        }
        public String getBodySourceImage() {
            return this.bodySourceImage;
        }

        public ListPersonDetailsResponseData setBodyTargetImage(String bodyTargetImage) {
            this.bodyTargetImage = bodyTargetImage;
            return this;
        }
        public String getBodyTargetImage() {
            return this.bodyTargetImage;
        }

        public ListPersonDetailsResponseData setPrefOutTime(String prefOutTime) {
            this.prefOutTime = prefOutTime;
            return this;
        }
        public String getPrefOutTime() {
            return this.prefOutTime;
        }

    }

}
