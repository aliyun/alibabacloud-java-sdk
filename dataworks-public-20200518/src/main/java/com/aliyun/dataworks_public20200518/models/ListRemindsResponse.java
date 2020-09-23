// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListRemindsResponseData data;

    public static ListRemindsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRemindsResponse self = new ListRemindsResponse();
        return TeaModel.build(map, self);
    }

    public ListRemindsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRemindsResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRemindsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRemindsResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRemindsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRemindsResponse setData(ListRemindsResponseData data) {
        this.data = data;
        return this;
    }
    public ListRemindsResponseData getData() {
        return this.data;
    }

    public static class ListRemindsResponseDataReminds extends TeaModel {
        @NameInMap("RemindId")
        @Validation(required = true)
        public Long remindId;

        @NameInMap("RemindName")
        @Validation(required = true)
        public String remindName;

        @NameInMap("DndStart")
        @Validation(required = true)
        public String dndStart;

        @NameInMap("DndEnd")
        @Validation(required = true)
        public String dndEnd;

        @NameInMap("RemindUnit")
        @Validation(required = true)
        public String remindUnit;

        @NameInMap("RemindType")
        @Validation(required = true)
        public String remindType;

        @NameInMap("AlertUnit")
        @Validation(required = true)
        public String alertUnit;

        @NameInMap("Useflag")
        @Validation(required = true)
        public Boolean useflag;

        @NameInMap("Founder")
        @Validation(required = true)
        public String founder;

        @NameInMap("NodeIds")
        @Validation(required = true)
        public java.util.List<Long> nodeIds;

        @NameInMap("BaselineIds")
        @Validation(required = true)
        public java.util.List<Long> baselineIds;

        @NameInMap("ProjectIds")
        @Validation(required = true)
        public java.util.List<Long> projectIds;

        @NameInMap("BizProcessIds")
        @Validation(required = true)
        public java.util.List<Long> bizProcessIds;

        @NameInMap("AlertMethods")
        @Validation(required = true)
        public java.util.List<String> alertMethods;

        @NameInMap("AlertTargets")
        @Validation(required = true)
        public java.util.List<String> alertTargets;

        public static ListRemindsResponseDataReminds build(java.util.Map<String, ?> map) throws Exception {
            ListRemindsResponseDataReminds self = new ListRemindsResponseDataReminds();
            return TeaModel.build(map, self);
        }

        public ListRemindsResponseDataReminds setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public ListRemindsResponseDataReminds setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public ListRemindsResponseDataReminds setDndStart(String dndStart) {
            this.dndStart = dndStart;
            return this;
        }
        public String getDndStart() {
            return this.dndStart;
        }

        public ListRemindsResponseDataReminds setDndEnd(String dndEnd) {
            this.dndEnd = dndEnd;
            return this;
        }
        public String getDndEnd() {
            return this.dndEnd;
        }

        public ListRemindsResponseDataReminds setRemindUnit(String remindUnit) {
            this.remindUnit = remindUnit;
            return this;
        }
        public String getRemindUnit() {
            return this.remindUnit;
        }

        public ListRemindsResponseDataReminds setRemindType(String remindType) {
            this.remindType = remindType;
            return this;
        }
        public String getRemindType() {
            return this.remindType;
        }

        public ListRemindsResponseDataReminds setAlertUnit(String alertUnit) {
            this.alertUnit = alertUnit;
            return this;
        }
        public String getAlertUnit() {
            return this.alertUnit;
        }

        public ListRemindsResponseDataReminds setUseflag(Boolean useflag) {
            this.useflag = useflag;
            return this;
        }
        public Boolean getUseflag() {
            return this.useflag;
        }

        public ListRemindsResponseDataReminds setFounder(String founder) {
            this.founder = founder;
            return this;
        }
        public String getFounder() {
            return this.founder;
        }

        public ListRemindsResponseDataReminds setNodeIds(java.util.List<Long> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public java.util.List<Long> getNodeIds() {
            return this.nodeIds;
        }

        public ListRemindsResponseDataReminds setBaselineIds(java.util.List<Long> baselineIds) {
            this.baselineIds = baselineIds;
            return this;
        }
        public java.util.List<Long> getBaselineIds() {
            return this.baselineIds;
        }

        public ListRemindsResponseDataReminds setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public ListRemindsResponseDataReminds setBizProcessIds(java.util.List<Long> bizProcessIds) {
            this.bizProcessIds = bizProcessIds;
            return this;
        }
        public java.util.List<Long> getBizProcessIds() {
            return this.bizProcessIds;
        }

        public ListRemindsResponseDataReminds setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

        public ListRemindsResponseDataReminds setAlertTargets(java.util.List<String> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public java.util.List<String> getAlertTargets() {
            return this.alertTargets;
        }

    }

    public static class ListRemindsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Reminds")
        @Validation(required = true)
        public java.util.List<ListRemindsResponseDataReminds> reminds;

        public static ListRemindsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListRemindsResponseData self = new ListRemindsResponseData();
            return TeaModel.build(map, self);
        }

        public ListRemindsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRemindsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRemindsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListRemindsResponseData setReminds(java.util.List<ListRemindsResponseDataReminds> reminds) {
            this.reminds = reminds;
            return this;
        }
        public java.util.List<ListRemindsResponseDataReminds> getReminds() {
            return this.reminds;
        }

    }

}
