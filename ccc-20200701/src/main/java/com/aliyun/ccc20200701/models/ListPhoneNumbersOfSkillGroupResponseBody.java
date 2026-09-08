// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersOfSkillGroupResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListPhoneNumbersOfSkillGroupResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPhoneNumbersOfSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersOfSkillGroupResponseBody self = new ListPhoneNumbersOfSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersOfSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPhoneNumbersOfSkillGroupResponseBody setData(ListPhoneNumbersOfSkillGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPhoneNumbersOfSkillGroupResponseBodyData getData() {
        return this.data;
    }

    public ListPhoneNumbersOfSkillGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPhoneNumbersOfSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhoneNumbersOfSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPhoneNumbersOfSkillGroupResponseBodyDataList extends TeaModel {
        /**
         * <p>Whether the phone number is active.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>City where the phone number is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>乐山</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>IVR contact flow ID associated with the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>a3fb6c62-9b49-4942-ae5b-cf2abd4123ek</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>08330011****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>Province where the phone number is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>四川</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>Usage of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>Bidirection</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static ListPhoneNumbersOfSkillGroupResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersOfSkillGroupResponseBodyDataList self = new ListPhoneNumbersOfSkillGroupResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyDataList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyDataList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyDataList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyDataList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class ListPhoneNumbersOfSkillGroupResponseBodyData extends TeaModel {
        /**
         * <p>List of phone numbers.</p>
         */
        @NameInMap("List")
        public java.util.List<ListPhoneNumbersOfSkillGroupResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPhoneNumbersOfSkillGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersOfSkillGroupResponseBodyData self = new ListPhoneNumbersOfSkillGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyData setList(java.util.List<ListPhoneNumbersOfSkillGroupResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListPhoneNumbersOfSkillGroupResponseBodyDataList> getList() {
            return this.list;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPhoneNumbersOfSkillGroupResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
