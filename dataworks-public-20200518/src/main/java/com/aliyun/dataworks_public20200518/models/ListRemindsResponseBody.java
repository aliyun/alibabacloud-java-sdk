// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsResponseBody extends TeaModel {
    /**
     * <p>The information about custom alert rules returned.</p>
     */
    @NameInMap("Data")
    public ListRemindsResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRemindsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemindsResponseBody self = new ListRemindsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemindsResponseBody setData(ListRemindsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRemindsResponseBodyData getData() {
        return this.data;
    }

    public ListRemindsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRemindsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public ListRemindsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRemindsResponseBodyDataReminds extends TeaModel {
        /**
         * <p>The notification method. Valid values: MAIL, SMS, and PHONE. The value MAIL indicates that the notification is sent by email. The value SMS indicates that the notification is sent by text message. The value PHONE indicates that the notification is sent by call, which is supported only by DataWorks Professional Edition and more advanced editions.</p>
         */
        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        /**
         * <p>The IDs of the Alibaba Cloud accounts that are used to receive alert notifications.</p>
         */
        @NameInMap("AlertTargets")
        public java.util.List<String> alertTargets;

        /**
         * <p>The alert recipient. Valid values: OWNER and OTHER. The value OWNER indicates the node owner. The value OTHER indicates a specified user.</p>
         */
        @NameInMap("AlertUnit")
        public String alertUnit;

        /**
         * <p>The IDs of the baselines to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BASELINE.</p>
         */
        @NameInMap("BaselineIds")
        public java.util.List<Long> baselineIds;

        /**
         * <p>The IDs of the workflows to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BIZPROCESS.</p>
         */
        @NameInMap("BizProcessIds")
        public java.util.List<Long> bizProcessIds;

        /**
         * <p>The end time of the quiet hours. The value is in the hh:mm format. Valid values of hh: 0 to 23. Valid values of mm: 0 to 59.</p>
         */
        @NameInMap("DndEnd")
        public String dndEnd;

        /**
         * <p>The start time of the quiet hours. The value is in the hh:mm format. Valid values of hh: 0 to 23. Valid values of mm: 0 to 59.</p>
         */
        @NameInMap("DndStart")
        public String dndStart;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the custom alert rule.</p>
         */
        @NameInMap("Founder")
        public String founder;

        /**
         * <p>The IDs of the nodes to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is NODE.</p>
         */
        @NameInMap("NodeIds")
        public java.util.List<Long> nodeIds;

        /**
         * <p>The IDs of the workspaces to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is PROJECT.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The ID of the custom alert rule.</p>
         */
        @NameInMap("RemindId")
        public Long remindId;

        /**
         * <p>The name of the custom alert rule.</p>
         */
        @NameInMap("RemindName")
        public String remindName;

        /**
         * <p>The conditions that trigger an alert for the node. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT. The value FINISHED indicates that the node finishes running. The value UNFINISHED indicates that the node is still running at the specified point in time. The value ERROR indicates that an error occurs when the node is running. The value CYCLE_UNFINISHED indicates that the node does not finish running in the specified scheduling cycle. The value TIMEOUT indicates that the node times out.</p>
         */
        @NameInMap("RemindType")
        public String remindType;

        /**
         * <p>The type of the object to which the custom alert rule is applied. Valid values: NODE, BASELINE, PROJECT, and BIZPROCESS. The value NODE indicates that the monitored object is a node. The value BASELINE indicates that the monitored object is a baseline. The value PROJECT indicates that the monitored object is a workspace. The value BIZPROCESS indicates that the monitored object is a workflow.</p>
         */
        @NameInMap("RemindUnit")
        public String remindUnit;

        /**
         * <p>Indicates whether the custom alert rule is enabled. Valid values: true and false.</p>
         */
        @NameInMap("Useflag")
        public Boolean useflag;

        public static ListRemindsResponseBodyDataReminds build(java.util.Map<String, ?> map) throws Exception {
            ListRemindsResponseBodyDataReminds self = new ListRemindsResponseBodyDataReminds();
            return TeaModel.build(map, self);
        }

        public ListRemindsResponseBodyDataReminds setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

        public ListRemindsResponseBodyDataReminds setAlertTargets(java.util.List<String> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public java.util.List<String> getAlertTargets() {
            return this.alertTargets;
        }

        public ListRemindsResponseBodyDataReminds setAlertUnit(String alertUnit) {
            this.alertUnit = alertUnit;
            return this;
        }
        public String getAlertUnit() {
            return this.alertUnit;
        }

        public ListRemindsResponseBodyDataReminds setBaselineIds(java.util.List<Long> baselineIds) {
            this.baselineIds = baselineIds;
            return this;
        }
        public java.util.List<Long> getBaselineIds() {
            return this.baselineIds;
        }

        public ListRemindsResponseBodyDataReminds setBizProcessIds(java.util.List<Long> bizProcessIds) {
            this.bizProcessIds = bizProcessIds;
            return this;
        }
        public java.util.List<Long> getBizProcessIds() {
            return this.bizProcessIds;
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

        public ListRemindsResponseBodyDataReminds setFounder(String founder) {
            this.founder = founder;
            return this;
        }
        public String getFounder() {
            return this.founder;
        }

        public ListRemindsResponseBodyDataReminds setNodeIds(java.util.List<Long> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public java.util.List<Long> getNodeIds() {
            return this.nodeIds;
        }

        public ListRemindsResponseBodyDataReminds setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public ListRemindsResponseBodyDataReminds setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public ListRemindsResponseBodyDataReminds setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public ListRemindsResponseBodyDataReminds setRemindType(String remindType) {
            this.remindType = remindType;
            return this;
        }
        public String getRemindType() {
            return this.remindType;
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

    }

    public static class ListRemindsResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The custom alert rules returned.</p>
         */
        @NameInMap("Reminds")
        public java.util.List<ListRemindsResponseBodyDataReminds> reminds;

        /**
         * <p>The total number of custom alert rules returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

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

        public ListRemindsResponseBodyData setReminds(java.util.List<ListRemindsResponseBodyDataReminds> reminds) {
            this.reminds = reminds;
            return this;
        }
        public java.util.List<ListRemindsResponseBodyDataReminds> getReminds() {
            return this.reminds;
        }

        public ListRemindsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
