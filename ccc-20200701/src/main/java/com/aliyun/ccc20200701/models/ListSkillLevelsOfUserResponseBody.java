// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillLevelsOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListSkillLevelsOfUserResponseBodyData data;

    public static ListSkillLevelsOfUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillLevelsOfUserResponseBody self = new ListSkillLevelsOfUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillLevelsOfUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillLevelsOfUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillLevelsOfUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillLevelsOfUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillLevelsOfUserResponseBody setData(ListSkillLevelsOfUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSkillLevelsOfUserResponseBodyData getData() {
        return this.data;
    }

    public static class ListSkillLevelsOfUserResponseBodyDataList extends TeaModel {
        @NameInMap("SkillLevel")
        public String skillLevel;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static ListSkillLevelsOfUserResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillLevelsOfUserResponseBodyDataList self = new ListSkillLevelsOfUserResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSkillLevelsOfUserResponseBodyDataList setSkillLevel(String skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public String getSkillLevel() {
            return this.skillLevel;
        }

        public ListSkillLevelsOfUserResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillLevelsOfUserResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

    public static class ListSkillLevelsOfUserResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListSkillLevelsOfUserResponseBodyDataList> list;

        public static ListSkillLevelsOfUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillLevelsOfUserResponseBodyData self = new ListSkillLevelsOfUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillLevelsOfUserResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillLevelsOfUserResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSkillLevelsOfUserResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListSkillLevelsOfUserResponseBodyData setList(java.util.List<ListSkillLevelsOfUserResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListSkillLevelsOfUserResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
