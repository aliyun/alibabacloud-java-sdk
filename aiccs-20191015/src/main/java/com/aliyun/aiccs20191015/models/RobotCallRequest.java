// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RobotCallRequest extends TeaModel {
    /**
     * <p>Called number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>131****2204</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>Outbound caller number. View it in the Voice Service <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Real Number Management</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>132****0849</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>Whether to enable the number status detection identity. Valid values:  </p>
     * <ul>
     * <li><strong>false</strong> (Default Value): Disable.  </li>
     * <li><strong>true</strong>: Enable.  <blockquote>
     * <p>When enabled, the reason for unanswered calls will be recorded.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    /**
     * <p>An ID reserved for the caller. This ID will be returned to the caller through the receipt message. It must be 1 to 15 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Parameter list for the robot, in JSON format. The total length must not exceed 512 bytes. You can view the parameters in <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> &gt; <strong>Details</strong> &gt; <strong>Input Parameters</strong>, or by using the <a href="https://help.aliyun.com/document_detail/2717999.html">ListRobotParams</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;name&quot;: &quot;张三&quot;,
     *   &quot;age&quot;: &quot;25&quot;
     * }</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>Whether to record the call. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Do not record.</li>
     * <li><strong>true</strong>: Record.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecordFlag")
    public Boolean recordFlag;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Robot ID, which is the script ID. View the reviewed and approved script ID in the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000035******</p>
     */
    @NameInMap("RobotId")
    public Long robotId;

    public static RobotCallRequest build(java.util.Map<String, ?> map) throws Exception {
        RobotCallRequest self = new RobotCallRequest();
        return TeaModel.build(map, self);
    }

    public RobotCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public RobotCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public RobotCallRequest setEarlyMediaAsr(Boolean earlyMediaAsr) {
        this.earlyMediaAsr = earlyMediaAsr;
        return this;
    }
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    public RobotCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public RobotCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RobotCallRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public RobotCallRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
    }

    public RobotCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RobotCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RobotCallRequest setRobotId(Long robotId) {
        this.robotId = robotId;
        return this;
    }
    public Long getRobotId() {
        return this.robotId;
    }

}
