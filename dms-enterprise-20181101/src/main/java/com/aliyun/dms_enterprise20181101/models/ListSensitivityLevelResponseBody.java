// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitivityLevelResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SensitivityLevelList")
    public java.util.List<ListSensitivityLevelResponseBodySensitivityLevelList> sensitivityLevelList;

    @NameInMap("Success")
    public Boolean success;

    public static ListSensitivityLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSensitivityLevelResponseBody self = new ListSensitivityLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSensitivityLevelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSensitivityLevelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSensitivityLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSensitivityLevelResponseBody setSensitivityLevelList(java.util.List<ListSensitivityLevelResponseBodySensitivityLevelList> sensitivityLevelList) {
        this.sensitivityLevelList = sensitivityLevelList;
        return this;
    }
    public java.util.List<ListSensitivityLevelResponseBodySensitivityLevelList> getSensitivityLevelList() {
        return this.sensitivityLevelList;
    }

    public ListSensitivityLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSensitivityLevelResponseBodySensitivityLevelList extends TeaModel {
        @NameInMap("IsPlain")
        public Boolean isPlain;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateType")
        public String templateType;

        public static ListSensitivityLevelResponseBodySensitivityLevelList build(java.util.Map<String, ?> map) throws Exception {
            ListSensitivityLevelResponseBodySensitivityLevelList self = new ListSensitivityLevelResponseBodySensitivityLevelList();
            return TeaModel.build(map, self);
        }

        public ListSensitivityLevelResponseBodySensitivityLevelList setIsPlain(Boolean isPlain) {
            this.isPlain = isPlain;
            return this;
        }
        public Boolean getIsPlain() {
            return this.isPlain;
        }

        public ListSensitivityLevelResponseBodySensitivityLevelList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSensitivityLevelResponseBodySensitivityLevelList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListSensitivityLevelResponseBodySensitivityLevelList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
