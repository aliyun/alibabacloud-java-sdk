// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetConnectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[\&quot;field1\&quot;,\&quot;field2\&quot;]</p>
     */
    @NameInMap("ColumnFields")
    public String columnFields;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;TimestampUnit\&quot;:\&quot;MICROSECOND\&quot;,\&quot;PartitionConfig\&quot;:{\&quot;hh\&quot;:\&quot;%H\&quot;,\&quot;mm\&quot;:\&quot;%M\&quot;,\&quot;ds\&quot;:\&quot;%Y%m%d\&quot;},\&quot;Project\&quot;:\&quot;xxx\&quot;,\&quot;TimeRange\&quot;:15,\&quot;TimeZone\&quot;:\&quot;Asia/Shanghai\&quot;,\&quot;Table\&quot;:\&quot;xxx\&quot;,\&quot;OdpsEndpoint\&quot;:\&quot;xxx\&quot;,\&quot;AccessId\&quot;:\&quot;xxx\&quot;,\&quot;PartitionMode\&quot;:\&quot;SYSTEM_TIME\&quot;,\&quot;AuthMode\&quot;:\&quot;ak\&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>c5e07a96-5069-4486-87c3-0d281951f772</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <strong>example:</strong>
     * <p>1724041098000</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>270523390948438349</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>2025-06-06 15:45:00</p>
     */
    @NameInMap("DoneTime")
    public String doneTime;

    /**
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>A20A7093-8FE0-058C-BE0C-3C8057D5F1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>1764123132492KO88A</p>
     */
    @NameInMap("SubscriptionId")
    public String subscriptionId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>test_topic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    /**
     * <strong>example:</strong>
     * <p>SINK_ODPS</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>1724041098000</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectorResponseBody self = new GetConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectorResponseBody setColumnFields(String columnFields) {
        this.columnFields = columnFields;
        return this;
    }
    public String getColumnFields() {
        return this.columnFields;
    }

    public GetConnectorResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetConnectorResponseBody setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public GetConnectorResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetConnectorResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetConnectorResponseBody setDoneTime(String doneTime) {
        this.doneTime = doneTime;
        return this;
    }
    public String getDoneTime() {
        return this.doneTime;
    }

    public GetConnectorResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectorResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetConnectorResponseBody setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public GetConnectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetConnectorResponseBody setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public GetConnectorResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetConnectorResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
