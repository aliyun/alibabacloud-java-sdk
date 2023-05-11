// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleActionsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information about error codes, see [Error codes](~~87387~~).</p>
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
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>If the call is successful, all configured data forwarding actions of the specified rule are returned. For more information about the returned data, see the following **RuleActionInfo** parameter.</p>
     */
    @NameInMap("RuleActionList")
    public ListRuleActionsResponseBodyRuleActionList ruleActionList;

    /**
     * <p>Indicates whether the call was successful. </p>
     * <br>
     * <p>- **true**: The call was successful.</p>
     * <p>- **false**: The call failed.</p>
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
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>Indicates whether the data destination is used to receive the error operation data. The error operation data is data that failed to be forwarded two consecutive times.</p>
         * <br>
         * <p>*   **true**: This destination is used to receive error operation data.</p>
         * <p>*   **false**: This destination is not used to receive error operation data.</p>
         */
        @NameInMap("ErrorActionFlag")
        public Boolean errorActionFlag;

        /**
         * <p>The ID of the action in which data is forwarded to the destination.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the rule based on which data is forwarded to the destination.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The status of the data forwarding action. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The action is being configured.</p>
         * <p>*   **NORMAL**: The configuration is complete, and the action can run properly.</p>
         * <p>*   **INVALID**: The configuration data is invalid, and the action fails to run.</p>
         * <p>*   **SHORTCUT**: An exception occurs and the data forwarding action is stopped.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the action in which data is forwarded to a destination. Valid values:</p>
         * <br>
         * <p>*   **REPUBLISH**: Data is forwarded to a topic.</p>
         * <p>*   **OTS**: Data is stored in Tablestore.</p>
         * <p>*   **MNS**: Data is forwarded to Message Service (MNS).</p>
         * <p>*   **ONS**: Data is forwarded to Message Queue for Apache RocketMQ.</p>
         * <p>*   **TSDB**: Data is stored in Time Series Database.</p>
         * <p>*   **FC**: Data is forwarded to Function Compute.</p>
         * <p>*   **RDS**: Data is forwarded to ApsaraDB RDS.</p>
         * <p>*   **AMQP**: Data is forwarded to an Advanced Message Queuing Protocol (AMQP) consumer group.</p>
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
