// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class AuthenticateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AuthenticateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AuthenticateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthenticateResponseBody self = new AuthenticateResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthenticateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AuthenticateResponseBody setData(AuthenticateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AuthenticateResponseBodyData getData() {
        return this.data;
    }

    public AuthenticateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthenticateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthenticateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ExpandContent")
        public String expandContent;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("FieldVid")
        public String fieldVid;

        public static AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO build(java.util.Map<String, ?> map) throws Exception {
            AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO self = new AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO();
            return TeaModel.build(map, self);
        }

        public AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO setExpandContent(String expandContent) {
            this.expandContent = expandContent;
            return this;
        }
        public String getExpandContent() {
            return this.expandContent;
        }

        public AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO setFieldVid(String fieldVid) {
            this.fieldVid = fieldVid;
            return this;
        }
        public String getFieldVid() {
            return this.fieldVid;
        }

    }

    public static class AuthenticateResponseBodyDataUserInputList extends TeaModel {
        @NameInMap("QueryAuthRSDTO")
        public java.util.List<AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO> queryAuthRSDTO;

        public static AuthenticateResponseBodyDataUserInputList build(java.util.Map<String, ?> map) throws Exception {
            AuthenticateResponseBodyDataUserInputList self = new AuthenticateResponseBodyDataUserInputList();
            return TeaModel.build(map, self);
        }

        public AuthenticateResponseBodyDataUserInputList setQueryAuthRSDTO(java.util.List<AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO> queryAuthRSDTO) {
            this.queryAuthRSDTO = queryAuthRSDTO;
            return this;
        }
        public java.util.List<AuthenticateResponseBodyDataUserInputListQueryAuthRSDTO> getQueryAuthRSDTO() {
            return this.queryAuthRSDTO;
        }

    }

    public static class AuthenticateResponseBodyData extends TeaModel {
        @NameInMap("Authorized")
        public Boolean authorized;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OperateCode")
        public String operateCode;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("RecordVid")
        public String recordVid;

        @NameInMap("UserInputList")
        public AuthenticateResponseBodyDataUserInputList userInputList;

        public static AuthenticateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AuthenticateResponseBodyData self = new AuthenticateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AuthenticateResponseBodyData setAuthorized(Boolean authorized) {
            this.authorized = authorized;
            return this;
        }
        public Boolean getAuthorized() {
            return this.authorized;
        }

        public AuthenticateResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AuthenticateResponseBodyData setOperateCode(String operateCode) {
            this.operateCode = operateCode;
            return this;
        }
        public String getOperateCode() {
            return this.operateCode;
        }

        public AuthenticateResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public AuthenticateResponseBodyData setRecordVid(String recordVid) {
            this.recordVid = recordVid;
            return this;
        }
        public String getRecordVid() {
            return this.recordVid;
        }

        public AuthenticateResponseBodyData setUserInputList(AuthenticateResponseBodyDataUserInputList userInputList) {
            this.userInputList = userInputList;
            return this;
        }
        public AuthenticateResponseBodyDataUserInputList getUserInputList() {
            return this.userInputList;
        }

    }

}
