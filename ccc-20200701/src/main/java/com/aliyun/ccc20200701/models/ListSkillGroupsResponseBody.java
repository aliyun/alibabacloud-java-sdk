// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
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
    public ListSkillGroupsResponseBodyData data;

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
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSkillGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupsResponseBody self = new ListSkillGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupsResponseBody setData(ListSkillGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSkillGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListSkillGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSkillGroupsResponseBodyDataList extends TeaModel {
        /**
         * <p>Description of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心的测试技能组。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>测试技能组</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The media type. The default is AUDIO. Other options include CHAT and VIDEO.</p>
         * 
         * <strong>example:</strong>
         * <p>CHAT</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>Quantity of phone numbers associated with the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PhoneNumberCount")
        public Integer phoneNumberCount;

        /**
         * <p>The skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>Name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup</p>
         */
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        /**
         * <p>The number of agents associated with the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        public static ListSkillGroupsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsResponseBodyDataList self = new ListSkillGroupsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillGroupsResponseBodyDataList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSkillGroupsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupsResponseBodyDataList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListSkillGroupsResponseBodyDataList setPhoneNumberCount(Integer phoneNumberCount) {
            this.phoneNumberCount = phoneNumberCount;
            return this;
        }
        public Integer getPhoneNumberCount() {
            return this.phoneNumberCount;
        }

        public ListSkillGroupsResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupsResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupsResponseBodyDataList setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

    public static class ListSkillGroupsResponseBodyData extends TeaModel {
        /**
         * <p>List of skill groups.</p>
         */
        @NameInMap("List")
        public java.util.List<ListSkillGroupsResponseBodyDataList> list;

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

        public static ListSkillGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsResponseBodyData self = new ListSkillGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsResponseBodyData setList(java.util.List<ListSkillGroupsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListSkillGroupsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListSkillGroupsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillGroupsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSkillGroupsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
