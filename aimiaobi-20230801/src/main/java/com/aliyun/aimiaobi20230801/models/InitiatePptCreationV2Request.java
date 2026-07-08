// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InitiatePptCreationV2Request extends TeaModel {
    /**
     * <p>The unique ID of the external user.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <p>Specifies whether the request originates from a mobile client.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMobile")
    public Boolean isMobile;

    /**
     * <p>The presentation outline, formatted in Markdown.</p>
     * 
     * <strong>example:</strong>
     * <h1>中国传统文化艺术的魅力</h1>
     * <h2>1. 传统文化艺术的源远流长</h2>
     * <h3>1.1 中国古代艺术发展历程</h3>
     * <h4>1.1.1 古代绘画艺术的演变</h4>
     * <ul>
     * <li>从新石器时代的彩陶绘画到东汉时期帛画的出现，绘画形式不断丰富，展现了古人对美的独特追求。唐代绘画风格多样，吴道子的《送子天王图》线条流畅，色彩绚丽，体现了唐代绘画的高超技艺。</li>
     * </ul>
     * <h4>1.1.2 书法艺术的传承与创新</h4>
     * <ul>
     * <li>书法从甲骨文到楷书、行书、草书，历经数千年演变，承载着中华文化的深厚内涵。王羲之的《兰亭序》被誉为“天下第一行书”，其笔法精妙，结构严谨，展现了书法艺术的巅峰。</li>
     * </ul>
     */
    @NameInMap("Outline")
    public String outline;

    /**
     * <p>The ID of the PPT template.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PptTemplateId")
    public Integer pptTemplateId;

    /**
     * <p>The template type. The default value is <code>1</code>. Valid values: <code>1</code> (system template) and <code>2</code> (enterprise template).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PptTemplateType")
    public Integer pptTemplateType;

    /**
     * <strong>example:</strong>
     * <p>中国传统文化艺术的魅力</p>
     */
    @NameInMap("PptTitle")
    public String pptTitle;

    /**
     * <p>The type of process to initiate. Valid values:<br>
     * <code>0</code>: Generates only a signature to initialize the front-end SDK for the full creation process.<br>
     * <code>1</code>: Generates a signature and a process ID. Use this option if you have a custom front-end page for templates before you initialize the SDK.<br>
     * <code>2</code>: Generates an artifact ID, which allows for direct editing of the artifact.<br>
     * <code>3</code>: Generates an export task ID. You can poll this ID to retrieve the export result.<br><br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProcessType")
    public Integer processType;

    /**
     * <p>The ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8a7dfece-f204-4380-a7d0-a13d37de3924</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static InitiatePptCreationV2Request build(java.util.Map<String, ?> map) throws Exception {
        InitiatePptCreationV2Request self = new InitiatePptCreationV2Request();
        return TeaModel.build(map, self);
    }

    public InitiatePptCreationV2Request setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public InitiatePptCreationV2Request setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
        return this;
    }
    public Boolean getIsMobile() {
        return this.isMobile;
    }

    public InitiatePptCreationV2Request setOutline(String outline) {
        this.outline = outline;
        return this;
    }
    public String getOutline() {
        return this.outline;
    }

    public InitiatePptCreationV2Request setPptTemplateId(Integer pptTemplateId) {
        this.pptTemplateId = pptTemplateId;
        return this;
    }
    public Integer getPptTemplateId() {
        return this.pptTemplateId;
    }

    public InitiatePptCreationV2Request setPptTemplateType(Integer pptTemplateType) {
        this.pptTemplateType = pptTemplateType;
        return this;
    }
    public Integer getPptTemplateType() {
        return this.pptTemplateType;
    }

    public InitiatePptCreationV2Request setPptTitle(String pptTitle) {
        this.pptTitle = pptTitle;
        return this;
    }
    public String getPptTitle() {
        return this.pptTitle;
    }

    public InitiatePptCreationV2Request setProcessType(Integer processType) {
        this.processType = processType;
        return this;
    }
    public Integer getProcessType() {
        return this.processType;
    }

    public InitiatePptCreationV2Request setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public InitiatePptCreationV2Request setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
