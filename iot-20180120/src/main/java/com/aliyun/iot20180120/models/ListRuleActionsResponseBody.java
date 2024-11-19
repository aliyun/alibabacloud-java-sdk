// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleActionsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information about error codes, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>22254BDB-3DC1-4643-8D1B-EE0437EF09A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>If the call is successful, all configured data forwarding actions of the specified rule are returned. For more information about the returned data, see the following <strong>RuleActionInfo</strong> parameter.</p>
     */
    @NameInMap("RuleActionList")
    public ListRuleActionsResponseBodyRuleActionList ruleActionList;

    /**
     * <p>Indicates whether the call was successful. </p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRuleActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleActionsResponseBody self = new ListRuleActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleActionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleActionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRuleActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleActionsResponseBody setRuleActionList(ListRuleActionsResponseBodyRuleActionList ruleActionList) {
        this.ruleActionList = ruleActionList;
        return this;
    }
    public ListRuleActionsResponseBodyRuleActionList getRuleActionList() {
        return this.ruleActionList;
    }

    public ListRuleActionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRuleActionsResponseBodyRuleActionListRuleActionInfo extends TeaModel {
        /**
         * <p>The configurations of the data destination.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;endPoint\&quot;:\&quot;<a href="http://ShanghaiRegion.cn-shanghai.ots.aliyuncs.com%5C%5C%22,%5C%5C%22instanceName%5C%5C%22:%5C%5C%22ShanghaiRegion%5C%5C%22,%5C%5C%22primaryKeys%5C%5C%22:%5B%7B%5C%5C%22columnName%5C%5C%22:%5C%5C%22temperature%5C%5C%22,%5C%5C%22columnType%5C%5C%22:%5C%5C%22INTEGER%5C%5C%22,%5C%5C%22columnValue%5C%5C%22:%5C%5C%22$%7BdeviceName%7D%5C%5C%22%7D%5D,%5C%5C%22regionName%5C%5C%22:%5C%5C%22cn-shanghai%5C%5C%22,%5C%5C%22role%5C%5C%22:%7B%5C%5C%22roleArn%5C%5C%22:%5C%5C%22acs:ram::1231579085******:role/aliyuniotaccessingotsrole%5C%5C%22,%5C%5C%22roleName%5C%5C%22:%5C%5C%22AliyunIOTAccessingOTSRole%5C%5C%22%7D,%5C%5C%22tableName%5C%5C%22:%5C%5C%22iottest%5C%5C%22,%5C%5C%22uid%5C%5C%22:%5C%5C%221231579085******%5C%5C%22%7D">http://ShanghaiRegion.cn-shanghai.ots.aliyuncs.com\\&quot;,\\&quot;instanceName\\&quot;:\\&quot;ShanghaiRegion\\&quot;,\\&quot;primaryKeys\\&quot;:[{\\&quot;columnName\\&quot;:\\&quot;temperature\\&quot;,\\&quot;columnType\\&quot;:\\&quot;INTEGER\\&quot;,\\&quot;columnValue\\&quot;:\\&quot;${deviceName}\\&quot;}],\\&quot;regionName\\&quot;:\\&quot;cn-shanghai\\&quot;,\\&quot;role\\&quot;:{\\&quot;roleArn\\&quot;:\\&quot;acs:ram::1231579085******:role/aliyuniotaccessingotsrole\\&quot;,\\&quot;roleName\\&quot;:\\&quot;AliyunIOTAccessingOTSRole\\&quot;},\\&quot;tableName\\&quot;:\\&quot;iottest\\&quot;,\\&quot;uid\\&quot;:\\&quot;1231579085******\\&quot;}</a></p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>Indicates whether the data destination is used to receive the error operation data. The error operation data is data that failed to be forwarded two consecutive times.</p>
         * <ul>
         * <li><strong>true</strong>: This destination is used to receive error operation data.</li>
         * <li><strong>false</strong>: This destination is not used to receive error operation data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ErrorActionFlag")
        public Boolean errorActionFlag;

        /**
         * <p>The ID of the action in which data is forwarded to the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>139099</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the rule based on which data is forwarded to the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The status of the data forwarding action. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The action is being configured.</li>
         * <li><strong>NORMAL</strong>: The configuration is complete, and the action can run properly.</li>
         * <li><strong>INVALID</strong>: The configuration data is invalid, and the action fails to run.</li>
         * <li><strong>SHORTCUT</strong>: An exception occurs and the data forwarding action is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the action in which data is forwarded to a destination. Valid values:</p>
         * <ul>
         * <li><strong>REPUBLISH</strong>: Data is forwarded to a topic.</li>
         * <li><strong>OTS</strong>: Data is stored in Tablestore.</li>
         * <li><strong>MNS</strong>: Data is forwarded to Message Service (MNS).</li>
         * <li><strong>ONS</strong>: Data is forwarded to Message Queue for Apache RocketMQ.</li>
         * <li><strong>TSDB</strong>: Data is stored in Time Series Database.</li>
         * <li><strong>FC</strong>: Data is forwarded to Function Compute.</li>
         * <li><strong>RDS</strong>: Data is forwarded to ApsaraDB RDS.</li>
         * <li><strong>AMQP</strong>: Data is forwarded to an Advanced Message Queuing Protocol (AMQP) consumer group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OTS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListRuleActionsResponseBodyRuleActionListRuleActionInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRuleActionsResponseBodyRuleActionListRuleActionInfo self = new ListRuleActionsResponseBodyRuleActionListRuleActionInfo();
            return TeaModel.build(map, self);
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setErrorActionFlag(Boolean errorActionFlag) {
            this.errorActionFlag = errorActionFlag;
            return this;
        }
        public Boolean getErrorActionFlag() {
            return this.errorActionFlag;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListRuleActionsResponseBodyRuleActionList extends TeaModel {
        @NameInMap("RuleActionInfo")
        public java.util.List<ListRuleActionsResponseBodyRuleActionListRuleActionInfo> ruleActionInfo;

        public static ListRuleActionsResponseBodyRuleActionList build(java.util.Map<String, ?> map) throws Exception {
            ListRuleActionsResponseBodyRuleActionList self = new ListRuleActionsResponseBodyRuleActionList();
            return TeaModel.build(map, self);
        }

        public ListRuleActionsResponseBodyRuleActionList setRuleActionInfo(java.util.List<ListRuleActionsResponseBodyRuleActionListRuleActionInfo> ruleActionInfo) {
            this.ruleActionInfo = ruleActionInfo;
            return this;
        }
        public java.util.List<ListRuleActionsResponseBodyRuleActionListRuleActionInfo> getRuleActionInfo() {
            return this.ruleActionInfo;
        }

    }

}
