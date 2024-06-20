// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillLevelsOfUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSkillLevelsOfUserResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ListSkillLevelsOfUserResponseBody setData(ListSkillLevelsOfUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSkillLevelsOfUserResponseBodyData getData() {
        return this.data;
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

    public static class ListSkillLevelsOfUserResponseBodyDataList extends TeaModel {
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <strong>example:</strong>
         * <p>skillgroup</p>
         */
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SkillLevel")
        public String skillLevel;

        public static ListSkillLevelsOfUserResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillLevelsOfUserResponseBodyDataList self = new ListSkillLevelsOfUserResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSkillLevelsOfUserResponseBodyDataList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
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

        public ListSkillLevelsOfUserResponseBodyDataList setSkillLevel(String skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public String getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class ListSkillLevelsOfUserResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListSkillLevelsOfUserResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSkillLevelsOfUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillLevelsOfUserResponseBodyData self = new ListSkillLevelsOfUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillLevelsOfUserResponseBodyData setList(java.util.List<ListSkillLevelsOfUserResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListSkillLevelsOfUserResponseBodyDataList> getList() {
            return this.list;
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

    }

}
