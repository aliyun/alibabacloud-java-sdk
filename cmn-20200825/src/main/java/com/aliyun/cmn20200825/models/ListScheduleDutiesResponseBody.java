// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListScheduleDutiesResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 数组，返回示例目录。
    @NameInMap("ScheduleDuties")
    public java.util.List<ListScheduleDutiesResponseBodyScheduleDuties> scheduleDuties;

    public static ListScheduleDutiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleDutiesResponseBody self = new ListScheduleDutiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduleDutiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListScheduleDutiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduleDutiesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListScheduleDutiesResponseBody setScheduleDuties(java.util.List<ListScheduleDutiesResponseBodyScheduleDuties> scheduleDuties) {
        this.scheduleDuties = scheduleDuties;
        return this;
    }
    public java.util.List<ListScheduleDutiesResponseBodyScheduleDuties> getScheduleDuties() {
        return this.scheduleDuties;
    }

    public static class ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList extends TeaModel {
        // 值班表id
        @NameInMap("ScheduleDutyId")
        public String scheduleDutyId;

        // 值班类型Id
        @NameInMap("ScheduleTypeId")
        public String scheduleTypeId;

        // 值班类型名称
        @NameInMap("ScheduleTypeName")
        public String scheduleTypeName;

        // 值班人员名称
        @NameInMap("ScheduleWorkerName")
        public java.util.List<String> scheduleWorkerName;

        public static ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList self = new ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList();
            return TeaModel.build(map, self);
        }

        public ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList setScheduleDutyId(String scheduleDutyId) {
            this.scheduleDutyId = scheduleDutyId;
            return this;
        }
        public String getScheduleDutyId() {
            return this.scheduleDutyId;
        }

        public ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList setScheduleTypeId(String scheduleTypeId) {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }
        public String getScheduleTypeId() {
            return this.scheduleTypeId;
        }

        public ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

        public ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList setScheduleWorkerName(java.util.List<String> scheduleWorkerName) {
            this.scheduleWorkerName = scheduleWorkerName;
            return this;
        }
        public java.util.List<String> getScheduleWorkerName() {
            return this.scheduleWorkerName;
        }

    }

    public static class ListScheduleDutiesResponseBodyScheduleDuties extends TeaModel {
        // 值班表日期
        @NameInMap("ScheduleDutyDate")
        public String scheduleDutyDate;

        // 资源一级ID
        @NameInMap("ScheduleDutyId")
        public String scheduleDutyId;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 是否节假日
        @NameInMap("Holiday")
        public Boolean holiday;

        @NameInMap("TypeWorkerList")
        public java.util.List<ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList> typeWorkerList;

        public static ListScheduleDutiesResponseBodyScheduleDuties build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleDutiesResponseBodyScheduleDuties self = new ListScheduleDutiesResponseBodyScheduleDuties();
            return TeaModel.build(map, self);
        }

        public ListScheduleDutiesResponseBodyScheduleDuties setScheduleDutyDate(String scheduleDutyDate) {
            this.scheduleDutyDate = scheduleDutyDate;
            return this;
        }
        public String getScheduleDutyDate() {
            return this.scheduleDutyDate;
        }

        public ListScheduleDutiesResponseBodyScheduleDuties setScheduleDutyId(String scheduleDutyId) {
            this.scheduleDutyId = scheduleDutyId;
            return this;
        }
        public String getScheduleDutyId() {
            return this.scheduleDutyId;
        }

        public ListScheduleDutiesResponseBodyScheduleDuties setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListScheduleDutiesResponseBodyScheduleDuties setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListScheduleDutiesResponseBodyScheduleDuties setHoliday(Boolean holiday) {
            this.holiday = holiday;
            return this;
        }
        public Boolean getHoliday() {
            return this.holiday;
        }

        public ListScheduleDutiesResponseBodyScheduleDuties setTypeWorkerList(java.util.List<ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList> typeWorkerList) {
            this.typeWorkerList = typeWorkerList;
            return this;
        }
        public java.util.List<ListScheduleDutiesResponseBodyScheduleDutiesTypeWorkerList> getTypeWorkerList() {
            return this.typeWorkerList;
        }

    }

}
