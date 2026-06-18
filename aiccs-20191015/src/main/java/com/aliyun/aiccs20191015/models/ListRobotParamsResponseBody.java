// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotParamsResponseBody extends TeaModel {
    /**
     * <p>Status code. A value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Parameter information.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListRobotParamsResponseBodyData> data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FF67D4D5-4E90-1DF5-BB8F-060BBFAD72DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API invocation succeeded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRobotParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRobotParamsResponseBody self = new ListRobotParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRobotParamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRobotParamsResponseBody setData(java.util.List<ListRobotParamsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRobotParamsResponseBodyData> getData() {
        return this.data;
    }

    public ListRobotParamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRobotParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRobotParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRobotParamsResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the parameter is required. Valid values:</p>
         * <ul>
         * <li><p>0: Not required.</p>
         * </li>
         * <li><p>1: Required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsEmpty")
        public Integer isEmpty;

        /**
         * <p>Parameter ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParamCode")
        public String paramCode;

        /**
         * <p>Parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        public static ListRobotParamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRobotParamsResponseBodyData self = new ListRobotParamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRobotParamsResponseBodyData setIsEmpty(Integer isEmpty) {
            this.isEmpty = isEmpty;
            return this;
        }
        public Integer getIsEmpty() {
            return this.isEmpty;
        }

        public ListRobotParamsResponseBodyData setParamCode(String paramCode) {
            this.paramCode = paramCode;
            return this;
        }
        public String getParamCode() {
            return this.paramCode;
        }

        public ListRobotParamsResponseBodyData setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

}
