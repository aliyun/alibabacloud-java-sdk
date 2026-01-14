// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentImportNumberRequest extends TeaModel {
    /**
     * <p>坐席ID，可以为空，但agentId与agentTag必须其中1个有值。用于查询对应的坐席信息</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <p>坐席唯一标识（创建坐席时的用户唯一标识），可以为空，但agentId与agentTag必须其中1个有值。用于查询对应的坐席信息</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("AgentTag")
    public String agentTag;

    /**
     * <p>外呼类型 可选项：1001：坐席-人工外呼，1002：坐席-AI外呼-不转人工，1003：坐席-AI外呼-接通转人工，1004：坐席-AI外呼-智能转人工&quot;</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79</p>
     */
    @NameInMap("CallType")
    public Long callType;

    /**
     * <p>具体用户信息，如手机号、姓名等，需根据具体任务参数要求传输。注：当callType为1001时，只会导入第1条数据</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Customers")
    public java.util.List<AgentImportNumberRequestCustomers> customers;

    /**
     * <p>坐席-人工外呼选择的外呼线路，只针对callType=1001生效，其他callType不生效。如callType=1001，且gatewayId不传值，默认按系统的线路配置外呼</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>请求id，具有唯一性，用来做请求幂等处理，一个请求id有效期10分钟。不传则不做幂等处理</p>
     * 
     * <strong>example:</strong>
     * <p>1asgfh</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>AI话术ID 客户已制作并已发布/平台授权的AI话术ID，如callType=1001可不填；如callType=1002,1003或1004 ，必填。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static AgentImportNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        AgentImportNumberRequest self = new AgentImportNumberRequest();
        return TeaModel.build(map, self);
    }

    public AgentImportNumberRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public AgentImportNumberRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public AgentImportNumberRequest setCallType(Long callType) {
        this.callType = callType;
        return this;
    }
    public Long getCallType() {
        return this.callType;
    }

    public AgentImportNumberRequest setCustomers(java.util.List<AgentImportNumberRequestCustomers> customers) {
        this.customers = customers;
        return this;
    }
    public java.util.List<AgentImportNumberRequestCustomers> getCustomers() {
        return this.customers;
    }

    public AgentImportNumberRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public AgentImportNumberRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public AgentImportNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AgentImportNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AgentImportNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AgentImportNumberRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public static class AgentImportNumberRequestCustomers extends TeaModel {
        /**
         * <p>客户详情URL,用于展示客户用户在客户业务系统的详细信息，做多80个字符</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("ClientUrl")
        public String clientUrl;

        /**
         * <p>号码，如手机号等</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>用户电话号码MD5，和number两者必传一个</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("NumberMD5")
        public String numberMD5;

        /**
         * <p>用户具体信息。如AI话术模板没变量要求或为人工外呼，可为空(总长度500个字符，多余的会被剔除)</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;:&quot;234&quot;}</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>用户自定义标签,最多50个字符</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static AgentImportNumberRequestCustomers build(java.util.Map<String, ?> map) throws Exception {
            AgentImportNumberRequestCustomers self = new AgentImportNumberRequestCustomers();
            return TeaModel.build(map, self);
        }

        public AgentImportNumberRequestCustomers setClientUrl(String clientUrl) {
            this.clientUrl = clientUrl;
            return this;
        }
        public String getClientUrl() {
            return this.clientUrl;
        }

        public AgentImportNumberRequestCustomers setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public AgentImportNumberRequestCustomers setNumberMD5(String numberMD5) {
            this.numberMD5 = numberMD5;
            return this;
        }
        public String getNumberMD5() {
            return this.numberMD5;
        }

        public AgentImportNumberRequestCustomers setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public AgentImportNumberRequestCustomers setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
