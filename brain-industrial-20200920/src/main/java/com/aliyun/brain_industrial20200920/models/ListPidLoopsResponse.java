// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidLoopsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PidLoopList")
    @Validation(required = true)
    public java.util.List<ListPidLoopsResponsePidLoopList> pidLoopList;

    public static ListPidLoopsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPidLoopsResponse self = new ListPidLoopsResponse();
        return TeaModel.build(map, self);
    }

    public ListPidLoopsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPidLoopsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPidLoopsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPidLoopsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPidLoopsResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPidLoopsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPidLoopsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPidLoopsResponse setPidLoopList(java.util.List<ListPidLoopsResponsePidLoopList> pidLoopList) {
        this.pidLoopList = pidLoopList;
        return this;
    }
    public java.util.List<ListPidLoopsResponsePidLoopList> getPidLoopList() {
        return this.pidLoopList;
    }

    public static class ListPidLoopsResponsePidLoopList extends TeaModel {
        @NameInMap("PidLoopId")
        @Validation(required = true)
        public String pidLoopId;

        @NameInMap("PidLoopName")
        @Validation(required = true)
        public String pidLoopName;

        @NameInMap("Crucial")
        @Validation(required = true)
        public Boolean crucial;

        @NameInMap("PidPublishStatus")
        @Validation(required = true)
        public String pidPublishStatus;

        @NameInMap("ParameterTunningId")
        @Validation(required = true)
        public String parameterTunningId;

        @NameInMap("PidLoopDcsType")
        @Validation(required = true)
        public String pidLoopDcsType;

        @NameInMap("PidLoopType")
        @Validation(required = true)
        public String pidLoopType;

        @NameInMap("PidLoopProgress")
        @Validation(required = true)
        public String pidLoopProgress;

        @NameInMap("PidLoopReportProgress")
        @Validation(required = true)
        public String pidLoopReportProgress;

        @NameInMap("PidLoopDataProgress")
        @Validation(required = true)
        public String pidLoopDataProgress;

        @NameInMap("ParameterTunningIdList")
        @Validation(required = true)
        public java.util.List<String> parameterTunningIdList;

        public static ListPidLoopsResponsePidLoopList build(java.util.Map<String, ?> map) throws Exception {
            ListPidLoopsResponsePidLoopList self = new ListPidLoopsResponsePidLoopList();
            return TeaModel.build(map, self);
        }

        public ListPidLoopsResponsePidLoopList setPidLoopId(String pidLoopId) {
            this.pidLoopId = pidLoopId;
            return this;
        }
        public String getPidLoopId() {
            return this.pidLoopId;
        }

        public ListPidLoopsResponsePidLoopList setPidLoopName(String pidLoopName) {
            this.pidLoopName = pidLoopName;
            return this;
        }
        public String getPidLoopName() {
            return this.pidLoopName;
        }

        public ListPidLoopsResponsePidLoopList setCrucial(Boolean crucial) {
            this.crucial = crucial;
            return this;
        }
        public Boolean getCrucial() {
            return this.crucial;
        }

        public ListPidLoopsResponsePidLoopList setPidPublishStatus(String pidPublishStatus) {
            this.pidPublishStatus = pidPublishStatus;
            return this;
        }
        public String getPidPublishStatus() {
            return this.pidPublishStatus;
        }

        public ListPidLoopsResponsePidLoopList setParameterTunningId(String parameterTunningId) {
            this.parameterTunningId = parameterTunningId;
            return this;
        }
        public String getParameterTunningId() {
            return this.parameterTunningId;
        }

        public ListPidLoopsResponsePidLoopList setPidLoopDcsType(String pidLoopDcsType) {
            this.pidLoopDcsType = pidLoopDcsType;
            return this;
        }
        public String getPidLoopDcsType() {
            return this.pidLoopDcsType;
        }

        public ListPidLoopsResponsePidLoopList setPidLoopType(String pidLoopType) {
            this.pidLoopType = pidLoopType;
            return this;
        }
        public String getPidLoopType() {
            return this.pidLoopType;
        }

        public ListPidLoopsResponsePidLoopList setPidLoopProgress(String pidLoopProgress) {
            this.pidLoopProgress = pidLoopProgress;
            return this;
        }
        public String getPidLoopProgress() {
            return this.pidLoopProgress;
        }

        public ListPidLoopsResponsePidLoopList setPidLoopReportProgress(String pidLoopReportProgress) {
            this.pidLoopReportProgress = pidLoopReportProgress;
            return this;
        }
        public String getPidLoopReportProgress() {
            return this.pidLoopReportProgress;
        }

        public ListPidLoopsResponsePidLoopList setPidLoopDataProgress(String pidLoopDataProgress) {
            this.pidLoopDataProgress = pidLoopDataProgress;
            return this;
        }
        public String getPidLoopDataProgress() {
            return this.pidLoopDataProgress;
        }

        public ListPidLoopsResponsePidLoopList setParameterTunningIdList(java.util.List<String> parameterTunningIdList) {
            this.parameterTunningIdList = parameterTunningIdList;
            return this;
        }
        public java.util.List<String> getParameterTunningIdList() {
            return this.parameterTunningIdList;
        }

    }

}
