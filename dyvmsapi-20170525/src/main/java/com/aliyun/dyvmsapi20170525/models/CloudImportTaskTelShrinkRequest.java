// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudImportTaskTelShrinkRequest extends TeaModel {
    /**
     * <p>座席接听时自动在双侧播放开场白语音，指定语音变量值；企业语音库里的语音变量值</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("BridgeVoicePath")
    public String bridgeVoicePath;

    /**
     * <p>座席接听时自动在双侧播放开场白语音类型；1. 公共语音库；2. 企业语音库，静态话术； 3. 企业语音库，动态话术（座席号），传bridgeVoicePath后生效，默认为3</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BridgeVoiceType")
    public Long bridgeVoiceType;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>批次Id；传此值表示在批次中增加号码</p>
     * 
     * <strong>example:</strong>
     * <p>666</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>是否自动启动任务；0:不自动启动 1:自动启动，默认为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ImportTelAutoStart")
    public Long importTelAutoStart;

    /**
     * <p>是否排重；0.不排重 1.任务内排重 2.导入号码排重 3.批次内排重，默认为1。注：任务内排重与批次内排重不能同时支持，如果中途切换，则从本次切换开始进行排重。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsRepeat")
    public Long isRepeat;

    /**
     * <p>批次名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>优先级；默认0，值越大越优先，最大999999</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Long priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>任务Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>任务号码列表；CtiLinkTaskTel中只有Tel是必选字段，长度大小不超过8MB 注：获取导入失败明细，需配置<a href="../%E5%AD%97%E6%AE%B5%E5%AE%9A%E4%B9%89/%E6%8E%A8%E9%80%81%E5%8F%98%E9%87%8F%E5%92%8C%E5%80%BC/%E9%A2%84%E6%B5%8B%E5%A4%96%E5%91%BC%E5%AF%BC%E5%85%A5%E5%8F%B7%E7%A0%81%E5%A4%B1%E8%B4%A5%E6%8E%A8%E9%80%81%E5%8F%98%E9%87%8F.md">事件推送</a></p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskTelList")
    public String taskTelListShrink;

    public static CloudImportTaskTelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudImportTaskTelShrinkRequest self = new CloudImportTaskTelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloudImportTaskTelShrinkRequest setBridgeVoicePath(String bridgeVoicePath) {
        this.bridgeVoicePath = bridgeVoicePath;
        return this;
    }
    public String getBridgeVoicePath() {
        return this.bridgeVoicePath;
    }

    public CloudImportTaskTelShrinkRequest setBridgeVoiceType(Long bridgeVoiceType) {
        this.bridgeVoiceType = bridgeVoiceType;
        return this;
    }
    public Long getBridgeVoiceType() {
        return this.bridgeVoiceType;
    }

    public CloudImportTaskTelShrinkRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudImportTaskTelShrinkRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public CloudImportTaskTelShrinkRequest setImportTelAutoStart(Long importTelAutoStart) {
        this.importTelAutoStart = importTelAutoStart;
        return this;
    }
    public Long getImportTelAutoStart() {
        return this.importTelAutoStart;
    }

    public CloudImportTaskTelShrinkRequest setIsRepeat(Long isRepeat) {
        this.isRepeat = isRepeat;
        return this;
    }
    public Long getIsRepeat() {
        return this.isRepeat;
    }

    public CloudImportTaskTelShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloudImportTaskTelShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudImportTaskTelShrinkRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CloudImportTaskTelShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudImportTaskTelShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudImportTaskTelShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CloudImportTaskTelShrinkRequest setTaskTelListShrink(String taskTelListShrink) {
        this.taskTelListShrink = taskTelListShrink;
        return this;
    }
    public String getTaskTelListShrink() {
        return this.taskTelListShrink;
    }

}
