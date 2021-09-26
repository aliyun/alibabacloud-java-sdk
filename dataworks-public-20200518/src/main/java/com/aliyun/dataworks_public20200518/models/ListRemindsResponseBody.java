// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ListRemindsResponseBodyData data;

    public static ListRemindsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemindsResponseBody self = new ListRemindsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemindsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRemindsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRemindsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRemindsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRemindsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRemindsResponseBody setData(ListRemindsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRemindsResponseBodyData getData() {
        return this.data;
    }

    public static class ListRemindsResponseBodyDataReminds extends TeaModel {
        @NameInMap("Founder")
        public String founder;

        @NameInMap("RemindId")
        public Long remindId;

        @NameInMap("AlertUnit")
        public String alertUnit;

        @NameInMap("RemindType")
        public String remindType;

        @NameInMap("DndEnd")
        public String dndEnd;

        @NameInMap("DndStart")
        public String dndStart;

        @NameInMap("RemindUnit")
        public String remindUnit;

        @NameInMap("Useflag")
        public Boolean useflag;

        @NameInMap("RemindName")
        public String remindName;

        @NameInMap("AlertTargets")
        public java.util.List<String> alertTargets;

        @NameInMap("NodeIds")
        public java.util.List<Long> nodeIds;

        @NameInMap("BizProcessIds")
        public java.util.List<Long> bizProcessIds;

        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        @NameInMap("BaselineIds")
        public java.util.List<Long> baselineIds;

        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        public static ListRemindsResponseBodyDataReminds build(java.util.Map<String, ?> map) throws Exception {
            ListRemindsResponseBodyDataReminds self = new ListRemindsResponseBodyDataReminds();
            return TeaModel.build(map, self);
        }

        public ListRemindsResponseBodyDataReminds setFounder(String founder) {
            this.founder = founder;
            return this;
        }
        public String getFounder() {
            return this.founder;
        }

        public ListRemindsResponseBodyDataReminds setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public ListRemindsResponseBodyDataReminds setAlertUnit(String alertUnit) {
            this.alertUnit = alertUnit;
            return this;
        }
        public String getAlertUnit() {
            return this.alertUnit;
        }

        public ListRemindsResponseBodyDataReminds setRemindType(String remindType) {
            this.remindType = remindType;
            return this;
        }
        public String getRemindType() {
            return this.remindType;
        }

        public ListRemindsResponseBodyDataReminds setDndEnd(String dndEnd) {
            this.dndEnd = dndEnd;
            return this;
        }
        public String getDndEnd() {
            return this.dndEnd;
        }

        public ListRemindsResponseBodyDataReminds setDndStart(String dndStart) {
            this.dndStart = dndStart;
            return this;
        }
        public String getDndStart() {
            return this.dndStart;
        }

        public ListRemindsResponseBodyDataReminds setRemindUnit(String remindUnit) {
            this.remindUnit = remindUnit;
            return this;
        }
        public String getRemindUnit() {
            return this.remindUnit;
        }

        public ListRemindsResponseBodyDataReminds setUseflag(Boolean useflag) {
            this.useflag = useflag;
            return this;
        }
        public Boolean getUseflag() {
            return this.useflag;
        }

        public ListRemindsResponseBodyDataReminds setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public ListRemindsResponseBodyDataReminds setAlertTargets(java.util.List<String> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public java.util.List<String> getAlertTargets() {
            return this.alertTargets;
        }

        public ListRemindsResponseBodyDataReminds setNodeIds(java.util.List<Long> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public java.util.List<Long> getNodeIds() {
            return this.nodeIds;
        }

        public ListRemindsResponseBodyDataReminds setBizProcessIds(java.util.List<Long> bizProcessIds) {
            this.bizProcessIds = bizProcessIds;
            return this;
        }
        public java.util.List<Long> getBizProcessIds() {
            return this.bizProcessIds;
        }

        public ListRemindsResponseBodyDataReminds setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public ListRemindsResponseBodyDataReminds setBaselineIds(java.util.List<Long> baselineIds) {
            this.baselineIds = baselineIds;
            return this;
        }
        public java.util.List<Long> getBaselineIds() {
            return this.baselineIds;
        }

        public ListRemindsResponseBodyDataReminds setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

    }

    public static class ListRemindsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Reminds")
        public java.util.List<ListRemindsResponseBodyDataReminds> reminds;

        public static ListRemindsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRemindsResponseBodyData self = new ListRemindsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRemindsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRemindsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRemindsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListRemindsResponseBodyData setReminds(java.util.List<ListRemindsResponseBodyDataReminds> reminds) {
            this.reminds = reminds;
            return this;
        }
        public java.util.List<ListRemindsResponseBodyDataReminds> getReminds() {
            return this.reminds;
        }

    }

}
