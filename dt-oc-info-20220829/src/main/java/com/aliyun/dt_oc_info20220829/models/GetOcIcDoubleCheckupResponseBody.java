// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcDoubleCheckupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcDoubleCheckupResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcIcDoubleCheckupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcDoubleCheckupResponseBody self = new GetOcIcDoubleCheckupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcDoubleCheckupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcDoubleCheckupResponseBody setData(java.util.List<GetOcIcDoubleCheckupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcDoubleCheckupResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcDoubleCheckupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcDoubleCheckupResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcDoubleCheckupResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcDoubleCheckupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcDoubleCheckupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcDoubleCheckupResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcDoubleCheckupResponseBodyData extends TeaModel {
        @NameInMap("InspectDate")
        public String inspectDate;

        @NameInMap("InspectDepartment")
        public String inspectDepartment;

        @NameInMap("InspectItem")
        public String inspectItem;

        @NameInMap("InspectPlanId")
        public String inspectPlanId;

        @NameInMap("InspectPlanName")
        public String inspectPlanName;

        @NameInMap("InspectResult")
        public String inspectResult;

        @NameInMap("InspectTaskId")
        public String inspectTaskId;

        @NameInMap("InspectTaskName")
        public String inspectTaskName;

        @NameInMap("InspectTypeName")
        public String inspectTypeName;

        public static GetOcIcDoubleCheckupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcDoubleCheckupResponseBodyData self = new GetOcIcDoubleCheckupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectDate(String inspectDate) {
            this.inspectDate = inspectDate;
            return this;
        }
        public String getInspectDate() {
            return this.inspectDate;
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectDepartment(String inspectDepartment) {
            this.inspectDepartment = inspectDepartment;
            return this;
        }
        public String getInspectDepartment() {
            return this.inspectDepartment;
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectItem(String inspectItem) {
            this.inspectItem = inspectItem;
            return this;
        }
        public String getInspectItem() {
            return this.inspectItem;
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectPlanId(String inspectPlanId) {
            this.inspectPlanId = inspectPlanId;
            return this;
        }
        public String getInspectPlanId() {
            return this.inspectPlanId;
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectPlanName(String inspectPlanName) {
            this.inspectPlanName = inspectPlanName;
            return this;
        }
        public String getInspectPlanName() {
            return this.inspectPlanName;
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectResult(String inspectResult) {
            this.inspectResult = inspectResult;
            return this;
        }
        public String getInspectResult() {
            return this.inspectResult;
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectTaskId(String inspectTaskId) {
            this.inspectTaskId = inspectTaskId;
            return this;
        }
        public String getInspectTaskId() {
            return this.inspectTaskId;
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectTaskName(String inspectTaskName) {
            this.inspectTaskName = inspectTaskName;
            return this;
        }
        public String getInspectTaskName() {
            return this.inspectTaskName;
        }

        public GetOcIcDoubleCheckupResponseBodyData setInspectTypeName(String inspectTypeName) {
            this.inspectTypeName = inspectTypeName;
            return this;
        }
        public String getInspectTypeName() {
            return this.inspectTypeName;
        }

    }

}
