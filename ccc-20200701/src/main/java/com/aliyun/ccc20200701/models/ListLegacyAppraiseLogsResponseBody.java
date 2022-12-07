// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyAppraiseLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLegacyAppraiseLogsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLegacyAppraiseLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLegacyAppraiseLogsResponseBody self = new ListLegacyAppraiseLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLegacyAppraiseLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLegacyAppraiseLogsResponseBody setData(ListLegacyAppraiseLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLegacyAppraiseLogsResponseBodyData getData() {
        return this.data;
    }

    public ListLegacyAppraiseLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLegacyAppraiseLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLegacyAppraiseLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLegacyAppraiseLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLegacyAppraiseLogsResponseBodyDataList extends TeaModel {
        @NameInMap("Acid")
        public String acid;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("KeyMarkRelation")
        public String keyMarkRelation;

        @NameInMap("Note")
        public String note;

        @NameInMap("ParentNote")
        public String parentNote;

        @NameInMap("PressKey")
        public String pressKey;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("StatisticDate")
        public String statisticDate;

        @NameInMap("Type")
        public String type;

        public static ListLegacyAppraiseLogsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLegacyAppraiseLogsResponseBodyDataList self = new ListLegacyAppraiseLogsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setKeyMarkRelation(String keyMarkRelation) {
            this.keyMarkRelation = keyMarkRelation;
            return this;
        }
        public String getKeyMarkRelation() {
            return this.keyMarkRelation;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setParentNote(String parentNote) {
            this.parentNote = parentNote;
            return this;
        }
        public String getParentNote() {
            return this.parentNote;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setPressKey(String pressKey) {
            this.pressKey = pressKey;
            return this;
        }
        public String getPressKey() {
            return this.pressKey;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setStatisticDate(String statisticDate) {
            this.statisticDate = statisticDate;
            return this;
        }
        public String getStatisticDate() {
            return this.statisticDate;
        }

        public ListLegacyAppraiseLogsResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLegacyAppraiseLogsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListLegacyAppraiseLogsResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLegacyAppraiseLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLegacyAppraiseLogsResponseBodyData self = new ListLegacyAppraiseLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLegacyAppraiseLogsResponseBodyData setList(java.util.List<ListLegacyAppraiseLogsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLegacyAppraiseLogsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLegacyAppraiseLogsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListLegacyAppraiseLogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListLegacyAppraiseLogsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
