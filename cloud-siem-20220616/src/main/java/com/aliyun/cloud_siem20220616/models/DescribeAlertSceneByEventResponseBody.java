// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSceneByEventResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAlertSceneByEventResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertSceneByEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSceneByEventResponseBody self = new DescribeAlertSceneByEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSceneByEventResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertSceneByEventResponseBody setData(java.util.List<DescribeAlertSceneByEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertSceneByEventResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertSceneByEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertSceneByEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertSceneByEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertSceneByEventResponseBodyDataTargets extends TeaModel {
        /**
         * <p>The display name of the entity attribute field that can be added to the whitelist.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The entity attribute field that can be added to the whitelist.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The right operand that is displayed by default in the whitelist rule.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The supported right operands of the whitelist rule.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeAlertSceneByEventResponseBodyDataTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSceneByEventResponseBodyDataTargets self = new DescribeAlertSceneByEventResponseBodyDataTargets();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSceneByEventResponseBodyDataTargets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlertSceneByEventResponseBodyDataTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAlertSceneByEventResponseBodyDataTargets setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAlertSceneByEventResponseBodyDataTargets setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeAlertSceneByEventResponseBodyData extends TeaModel {
        /**
         * <p>The alert name. The display name of the alert name varies based on the language of the system, such as Chinese and English.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The ID of the alert name.</p>
         */
        @NameInMap("AlertNameId")
        public String alertNameId;

        /**
         * <p>The alert title. The display name of the alert title varies based on the language of the system, such as Chinese and English.</p>
         */
        @NameInMap("AlertTile")
        public String alertTile;

        /**
         * <p>The ID of the alert title.</p>
         */
        @NameInMap("AlertTileId")
        public String alertTileId;

        /**
         * <p>The alert type. The display name of the alert type varies based on the language of the system, such as Chinese and English.</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The ID of the alert type.</p>
         */
        @NameInMap("AlertTypeId")
        public String alertTypeId;

        /**
         * <p>The objects that can be added to the whitelist.</p>
         */
        @NameInMap("Targets")
        public java.util.List<DescribeAlertSceneByEventResponseBodyDataTargets> targets;

        public static DescribeAlertSceneByEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSceneByEventResponseBodyData self = new DescribeAlertSceneByEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSceneByEventResponseBodyData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlertSceneByEventResponseBodyData setAlertNameId(String alertNameId) {
            this.alertNameId = alertNameId;
            return this;
        }
        public String getAlertNameId() {
            return this.alertNameId;
        }

        public DescribeAlertSceneByEventResponseBodyData setAlertTile(String alertTile) {
            this.alertTile = alertTile;
            return this;
        }
        public String getAlertTile() {
            return this.alertTile;
        }

        public DescribeAlertSceneByEventResponseBodyData setAlertTileId(String alertTileId) {
            this.alertTileId = alertTileId;
            return this;
        }
        public String getAlertTileId() {
            return this.alertTileId;
        }

        public DescribeAlertSceneByEventResponseBodyData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeAlertSceneByEventResponseBodyData setAlertTypeId(String alertTypeId) {
            this.alertTypeId = alertTypeId;
            return this;
        }
        public String getAlertTypeId() {
            return this.alertTypeId;
        }

        public DescribeAlertSceneByEventResponseBodyData setTargets(java.util.List<DescribeAlertSceneByEventResponseBodyDataTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<DescribeAlertSceneByEventResponseBodyDataTargets> getTargets() {
            return this.targets;
        }

    }

}
