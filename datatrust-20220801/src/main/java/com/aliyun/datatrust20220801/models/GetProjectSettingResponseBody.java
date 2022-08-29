// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectSettingResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetProjectSettingResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetProjectSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectSettingResponseBody self = new GetProjectSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectSettingResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetProjectSettingResponseBody setData(java.util.List<GetProjectSettingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProjectSettingResponseBodyData> getData() {
        return this.data;
    }

    public GetProjectSettingResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectSettingResponseBodyData extends TeaModel {
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("ModeName")
        public String modeName;

        @NameInMap("ModeType")
        public Integer modeType;

        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("Visible")
        public Boolean visible;

        public static GetProjectSettingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectSettingResponseBodyData self = new GetProjectSettingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectSettingResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetProjectSettingResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetProjectSettingResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public GetProjectSettingResponseBodyData setModeType(Integer modeType) {
            this.modeType = modeType;
            return this;
        }
        public Integer getModeType() {
            return this.modeType;
        }

        public GetProjectSettingResponseBodyData setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public GetProjectSettingResponseBodyData setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

}
