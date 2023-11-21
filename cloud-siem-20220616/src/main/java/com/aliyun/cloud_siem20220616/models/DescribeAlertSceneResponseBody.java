// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAlertSceneResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSceneResponseBody self = new DescribeAlertSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSceneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertSceneResponseBody setData(java.util.List<DescribeAlertSceneResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertSceneResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertSceneResponseBodyDataTargets extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeAlertSceneResponseBodyDataTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSceneResponseBodyDataTargets self = new DescribeAlertSceneResponseBodyDataTargets();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSceneResponseBodyDataTargets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlertSceneResponseBodyDataTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAlertSceneResponseBodyDataTargets setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAlertSceneResponseBodyDataTargets setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeAlertSceneResponseBodyData extends TeaModel {
        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("AlertNameId")
        public String alertNameId;

        @NameInMap("AlertTile")
        public String alertTile;

        @NameInMap("AlertTileId")
        public String alertTileId;

        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("AlertTypeId")
        public String alertTypeId;

        @NameInMap("Targets")
        public java.util.List<DescribeAlertSceneResponseBodyDataTargets> targets;

        public static DescribeAlertSceneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSceneResponseBodyData self = new DescribeAlertSceneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSceneResponseBodyData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlertSceneResponseBodyData setAlertNameId(String alertNameId) {
            this.alertNameId = alertNameId;
            return this;
        }
        public String getAlertNameId() {
            return this.alertNameId;
        }

        public DescribeAlertSceneResponseBodyData setAlertTile(String alertTile) {
            this.alertTile = alertTile;
            return this;
        }
        public String getAlertTile() {
            return this.alertTile;
        }

        public DescribeAlertSceneResponseBodyData setAlertTileId(String alertTileId) {
            this.alertTileId = alertTileId;
            return this;
        }
        public String getAlertTileId() {
            return this.alertTileId;
        }

        public DescribeAlertSceneResponseBodyData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeAlertSceneResponseBodyData setAlertTypeId(String alertTypeId) {
            this.alertTypeId = alertTypeId;
            return this;
        }
        public String getAlertTypeId() {
            return this.alertTypeId;
        }

        public DescribeAlertSceneResponseBodyData setTargets(java.util.List<DescribeAlertSceneResponseBodyDataTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<DescribeAlertSceneResponseBodyDataTargets> getTargets() {
            return this.targets;
        }

    }

}
