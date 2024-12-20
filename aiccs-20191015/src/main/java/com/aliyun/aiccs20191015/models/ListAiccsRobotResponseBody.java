// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAiccsRobotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAiccsRobotResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAiccsRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAiccsRobotResponseBody self = new ListAiccsRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAiccsRobotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAiccsRobotResponseBody setData(java.util.List<ListAiccsRobotResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAiccsRobotResponseBodyData> getData() {
        return this.data;
    }

    public ListAiccsRobotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAiccsRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAiccsRobotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAiccsRobotResponseBodyData extends TeaModel {
        @NameInMap("AtProfession")
        public String atProfession;

        @NameInMap("AtSence")
        public String atSence;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("RobotName")
        public String robotName;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("RobotType")
        public String robotType;

        public static ListAiccsRobotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAiccsRobotResponseBodyData self = new ListAiccsRobotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAiccsRobotResponseBodyData setAtProfession(String atProfession) {
            this.atProfession = atProfession;
            return this;
        }
        public String getAtProfession() {
            return this.atProfession;
        }

        public ListAiccsRobotResponseBodyData setAtSence(String atSence) {
            this.atSence = atSence;
            return this;
        }
        public String getAtSence() {
            return this.atSence;
        }

        public ListAiccsRobotResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAiccsRobotResponseBodyData setRobotName(String robotName) {
            this.robotName = robotName;
            return this;
        }
        public String getRobotName() {
            return this.robotName;
        }

        public ListAiccsRobotResponseBodyData setRobotType(String robotType) {
            this.robotType = robotType;
            return this;
        }
        public String getRobotType() {
            return this.robotType;
        }

    }

}
