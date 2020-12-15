// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListPersonResultResponse extends TeaModel {
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
    public java.util.List<ListPersonResultResponseData> data;

    public static ListPersonResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonResultResponse self = new ListPersonResultResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonResultResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonResultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonResultResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonResultResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonResultResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPersonResultResponse setData(java.util.List<ListPersonResultResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonResultResponseData> getData() {
        return this.data;
    }

    public static class ListPersonResultResponseData extends TeaModel {
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

        public static ListPersonResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonResultResponseData self = new ListPersonResultResponseData();
            return TeaModel.build(map, self);
        }

        public ListPersonResultResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonResultResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListPersonResultResponseData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ListPersonResultResponseData setProfession(String profession) {
            this.profession = profession;
            return this;
        }
        public String getProfession() {
            return this.profession;
        }

        public ListPersonResultResponseData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListPersonResultResponseData setTransportation(String transportation) {
            this.transportation = transportation;
            return this;
        }
        public String getTransportation() {
            return this.transportation;
        }

        public ListPersonResultResponseData setPersonType(String personType) {
            this.personType = personType;
            return this;
        }
        public String getPersonType() {
            return this.personType;
        }

        public ListPersonResultResponseData setHotSpotAddress(String hotSpotAddress) {
            this.hotSpotAddress = hotSpotAddress;
            return this;
        }
        public String getHotSpotAddress() {
            return this.hotSpotAddress;
        }

        public ListPersonResultResponseData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
