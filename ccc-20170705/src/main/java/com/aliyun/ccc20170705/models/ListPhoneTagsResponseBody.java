// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListPhoneTagsResponseBody extends TeaModel {
    @NameInMap("PhoneNumbers")
    public ListPhoneTagsResponseBodyPhoneNumbers phoneNumbers;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListPhoneTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneTagsResponseBody self = new ListPhoneTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhoneTagsResponseBody setPhoneNumbers(ListPhoneTagsResponseBodyPhoneNumbers phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public ListPhoneTagsResponseBodyPhoneNumbers getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public ListPhoneTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhoneTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPhoneTagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPhoneTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPhoneTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPhoneTagsResponseBodyPhoneNumbersList extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("ServiceTag")
        public String serviceTag;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("City")
        public String city;

        @NameInMap("SkillGroupIdList")
        public java.util.List<String> skillGroupIdList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("Number")
        public String number;

        @NameInMap("PhoneNumberDescription")
        public String phoneNumberDescription;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("Province")
        public String province;

        @NameInMap("Concurrency")
        public Integer concurrency;

        public static ListPhoneTagsResponseBodyPhoneNumbersList build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneTagsResponseBodyPhoneNumbersList self = new ListPhoneTagsResponseBodyPhoneNumbersList();
            return TeaModel.build(map, self);
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setServiceTag(String serviceTag) {
            this.serviceTag = serviceTag;
            return this;
        }
        public String getServiceTag() {
            return this.serviceTag;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setSkillGroupIdList(java.util.List<String> skillGroupIdList) {
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }
        public java.util.List<String> getSkillGroupIdList() {
            return this.skillGroupIdList;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setPhoneNumberDescription(String phoneNumberDescription) {
            this.phoneNumberDescription = phoneNumberDescription;
            return this;
        }
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListPhoneTagsResponseBodyPhoneNumbersList setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

    }

    public static class ListPhoneTagsResponseBodyPhoneNumbers extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListPhoneTagsResponseBodyPhoneNumbersList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPhoneTagsResponseBodyPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneTagsResponseBodyPhoneNumbers self = new ListPhoneTagsResponseBodyPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public ListPhoneTagsResponseBodyPhoneNumbers setList(java.util.List<ListPhoneTagsResponseBodyPhoneNumbersList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListPhoneTagsResponseBodyPhoneNumbersList> getList() {
            return this.list;
        }

        public ListPhoneTagsResponseBodyPhoneNumbers setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPhoneTagsResponseBodyPhoneNumbers setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPhoneTagsResponseBodyPhoneNumbers setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
