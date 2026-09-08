// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersResponseBody extends TeaModel {
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
    public ListPhoneNumbersResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPhoneNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersResponseBody self = new ListPhoneNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPhoneNumbersResponseBody setData(ListPhoneNumbersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPhoneNumbersResponseBodyData getData() {
        return this.data;
    }

    public ListPhoneNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPhoneNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhoneNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPhoneNumbersResponseBodyDataListSkillGroups extends TeaModel {
        /**
         * <p>The display name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>测试技能组</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static ListPhoneNumbersResponseBodyDataListSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyDataListSkillGroups self = new ListPhoneNumbersResponseBodyDataListSkillGroups();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyDataListSkillGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListPhoneNumbersResponseBodyDataListSkillGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPhoneNumbersResponseBodyDataListSkillGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPhoneNumbersResponseBodyDataListSkillGroups setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class ListPhoneNumbersResponseBodyDataList extends TeaModel {
        /**
         * <p>Indicates whether the number is active.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The city where the number is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>乐山</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The IVR contact flow ID associated with the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>a3fb6c62-9b49-4942-ae5b-cf2abd4123ek</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <p>Name of the IVR contact flow associated with the number.</p>
         * 
         * <strong>example:</strong>
         * <p>默认联系流</p>
         */
        @NameInMap("ContactFlowName")
        public String contactFlowName;

        /**
         * <p>The number creation time, which is the time when the number was associated with the instance, in Unix timestamp format with millisecond precision.</p>
         * 
         * <strong>example:</strong>
         * <p>1617958538000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Number.</p>
         * 
         * <strong>example:</strong>
         * <p>08330011****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>Number provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>alicom</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The province where the number is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>四川</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The list of skill groups associated with the number.</p>
         */
        @NameInMap("SkillGroups")
        public java.util.List<ListPhoneNumbersResponseBodyDataListSkillGroups> skillGroups;

        /**
         * <p>Business tags for the number, primarily used for labeling and extended business purposes. Ordinary customers do not need to concern themselves with this.</p>
         * 
         * <strong>example:</strong>
         * <p>M1</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The usage of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>Bidirection</p>
         */
        @NameInMap("Usage")
        public String usage;

        /**
         * <p>Agent ID. If this parameter is not empty, the number is dedicated to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListPhoneNumbersResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyDataList self = new ListPhoneNumbersResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyDataList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListPhoneNumbersResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListPhoneNumbersResponseBodyDataList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListPhoneNumbersResponseBodyDataList setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public ListPhoneNumbersResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPhoneNumbersResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPhoneNumbersResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListPhoneNumbersResponseBodyDataList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListPhoneNumbersResponseBodyDataList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListPhoneNumbersResponseBodyDataList setSkillGroups(java.util.List<ListPhoneNumbersResponseBodyDataListSkillGroups> skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public java.util.List<ListPhoneNumbersResponseBodyDataListSkillGroups> getSkillGroups() {
            return this.skillGroups;
        }

        public ListPhoneNumbersResponseBodyDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListPhoneNumbersResponseBodyDataList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListPhoneNumbersResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListPhoneNumbersResponseBodyData extends TeaModel {
        /**
         * <p>The phone number list.</p>
         */
        @NameInMap("List")
        public java.util.List<ListPhoneNumbersResponseBodyDataList> list;

        /**
         * <p>The page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPhoneNumbersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyData self = new ListPhoneNumbersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyData setList(java.util.List<ListPhoneNumbersResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListPhoneNumbersResponseBodyDataList> getList() {
            return this.list;
        }

        public ListPhoneNumbersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPhoneNumbersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPhoneNumbersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
