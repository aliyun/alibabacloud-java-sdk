// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSceneResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAlertSceneResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The display name of the attribute for the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>HOST UUID</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The attribute of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>host_uuid</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The right operand that is displayed by default in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>441862da-a539-4cc0-a00d-47395582****</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The right operands supported by the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;441862da-a539-4cc0-a00d-473955826881&quot;]</p>
         */
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
        /**
         * <p>The name of the alert. The value varies based on the display language (Chinese or English) of the Security Center console.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_ip</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The ID of the alert name.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_ip</p>
         */
        @NameInMap("AlertNameId")
        public String alertNameId;

        /**
         * <p>The title of the alert notification. The value varies based on the display language (Chinese or English) of the Security Center console.</p>
         * 
         * <strong>example:</strong>
         * <p>unusual login-login_common_ip</p>
         */
        @NameInMap("AlertTile")
        public String alertTile;

        /**
         * <p>The ID of the alert title.</p>
         * 
         * <strong>example:</strong>
         * <p>unusual login-login_common_ip</p>
         */
        @NameInMap("AlertTileId")
        public String alertTileId;

        /**
         * <p>The type of the alert. The value varies based on the display language (Chinese or English) of the Security Center console.</p>
         * 
         * <strong>example:</strong>
         * <p>unusual login</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The ID of the alert type.</p>
         * 
         * <strong>example:</strong>
         * <p>unusual login</p>
         */
        @NameInMap("AlertTypeId")
        public String alertTypeId;

        /**
         * <p>The information about the entities for which you need to add the alert to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Type&quot;: &quot;host_uuid&quot;,&quot;Value&quot;: &quot;441862da-a539-4cc0-a00d-473955826881&quot;,&quot;Values&quot;: [&quot;441862da-a539-4cc0-a00d-473955826881&quot;],&quot;Name&quot;: &quot;${aliyun.siem.entity.host_uuid}&quot;}]</p>
         */
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
