// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockDetailRequest extends TeaModel {
    /**
     * <p>The ID of the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1u5mas9exx7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>Required for PolarDB for MySQL cluster instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp16v3824rt73****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The source of the analysis task:</p>
     * <ul>
     * <li><p><strong>MANUAL</strong> or <strong>not specified</strong>: queries the recent deadlock analysis task.</p>
     * </li>
     * <li><p><strong>AUTO</strong>: queries the full deadlock analysis task.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the deadlock text. This value is returned from the GetDeadLockHistory operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a0e390cd5aca9ae964448f040153****</p>
     */
    @NameInMap("TextId")
    public String textId;

    public static GetDeadLockDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeadLockDetailRequest self = new GetDeadLockDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDeadLockDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDeadLockDetailRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetDeadLockDetailRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetDeadLockDetailRequest setTextId(String textId) {
        this.textId = textId;
        return this;
    }
    public String getTextId() {
        return this.textId;
    }

}
