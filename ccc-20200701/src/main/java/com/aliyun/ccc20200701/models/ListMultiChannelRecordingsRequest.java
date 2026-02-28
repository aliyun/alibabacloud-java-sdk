// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListMultiChannelRecordingsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ch-user-<strong><strong>-</strong></strong>-1772180844645-job-******</p>
     */
    @NameInMap("AgentChannelId")
    public String agentChannelId;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-25920271311543****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMultiChannelRecordingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiChannelRecordingsRequest self = new ListMultiChannelRecordingsRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiChannelRecordingsRequest setAgentChannelId(String agentChannelId) {
        this.agentChannelId = agentChannelId;
        return this;
    }
    public String getAgentChannelId() {
        return this.agentChannelId;
    }

    public ListMultiChannelRecordingsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListMultiChannelRecordingsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListMultiChannelRecordingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
