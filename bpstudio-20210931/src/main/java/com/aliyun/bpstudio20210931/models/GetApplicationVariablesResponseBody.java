// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationVariablesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetApplicationVariablesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7036DDBE-0ABA-52D7-A39D-75E511970F07</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationVariablesResponseBody self = new GetApplicationVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationVariablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApplicationVariablesResponseBody setData(java.util.List<GetApplicationVariablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetApplicationVariablesResponseBodyData> getData() {
        return this.data;
    }

    public GetApplicationVariablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationVariablesResponseBodyDataVariableList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ecs.c6.4xlarge</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>${instance_type}</p>
         */
        @NameInMap("Variable")
        public String variable;

        public static GetApplicationVariablesResponseBodyDataVariableList build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationVariablesResponseBodyDataVariableList self = new GetApplicationVariablesResponseBodyDataVariableList();
            return TeaModel.build(map, self);
        }

        public GetApplicationVariablesResponseBodyDataVariableList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetApplicationVariablesResponseBodyDataVariableList setVariable(String variable) {
            this.variable = variable;
            return this;
        }
        public String getVariable() {
            return this.variable;
        }

    }

    public static class GetApplicationVariablesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ob5epf79uv****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("VariableList")
        public java.util.List<GetApplicationVariablesResponseBodyDataVariableList> variableList;

        public static GetApplicationVariablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationVariablesResponseBodyData self = new GetApplicationVariablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationVariablesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetApplicationVariablesResponseBodyData setVariableList(java.util.List<GetApplicationVariablesResponseBodyDataVariableList> variableList) {
            this.variableList = variableList;
            return this;
        }
        public java.util.List<GetApplicationVariablesResponseBodyDataVariableList> getVariableList() {
            return this.variableList;
        }

    }

}
